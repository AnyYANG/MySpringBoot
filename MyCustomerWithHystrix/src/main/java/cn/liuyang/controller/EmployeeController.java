package cn.liuyang.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.sun.org.apache.xpath.internal.SourceTree;
import jdk.management.resource.internal.inst.SocketOutputStreamRMHooks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Random;

/**
 * Created by  liuyang
 * 2019/7/5    17:53
 * cn.liuyang.controller
 * All Right Reserved by liuyang.
 **/
@RestController
public class EmployeeController {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 豪猪熔断后  会降级执行fallbackMethod
     *
     *    @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "30000")
     *    配置了改方法的请求超时时间 30s  如果超过30s 请求未成功，则服务进行降级
     *    全局默认的豪猪超时时间是1s，可以使用这个配置文件
     *    hystrix.command.default.execution.isolation.thread.timeoutInMilliseconds
     *    在yml中进行配置
     * @param id
     * @return
     */
    @RequestMapping("/getuser/{id}")
    @HystrixCommand(fallbackMethod = "requstFallBack" ,

            commandProperties = {
            //请求熔断超时时间3s
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "3000"),
            //请求失败三次熔断  则触发熔断
            @HystrixProperty(name="circuitBreaker.requestVolumeThreshold",value="3"),
            //上面请求累计失败三次后进行熔断20s
            @HystrixProperty(name="circuitBreaker.sleepWindowInMilliseconds",value="20000")
    })
    public Object getEmploybyid(@PathVariable long id) {
        Object result = getObject(id);
        return result;
    }

    /**
     * 采用yml配置中默认的请求超时时间进行的配置
     * @param id
     * @return
     */
    @RequestMapping("/getuserdefault/{id}")
    @HystrixCommand(fallbackMethod = "requstFallBack" ,
            groupKey = "usergroup",
            threadPoolKey = "usergourpthreadpool",
            threadPoolProperties = {
                    @HystrixProperty(name ="coreSize",value = "5"),
                    @HystrixProperty(name ="maximumSize",value = "5"),
                    @HystrixProperty(name ="maxQueueSize",value = "5"),
                    @HystrixProperty(name ="queueSizeRejectionThreshold",value = "5")
            },
            commandProperties = {


    })
    public Object getEmploybyiddefault(@PathVariable long id) {
        Object result = getObject(id);
        return result;
    }



    public  Object requstFallBack(long id){
        return "requestfallback"+id;
    }


    @RequestMapping("/getinfor")
    public String getServiceInfor() {
        String url = "http://microservice-user/getinfo";
        String result = restTemplate.getForObject(url, String.class);

        return result;
    }

    @RequestMapping("/port")

    public String getMicroServicePort(){
        String url = "http://microservice-user/getport" ;
        String result = restTemplate.getForObject(url,String.class);
        return result;
    }

    /**
     * 获取用户信息
     * @param id
     * @return
     */
    private Object getObject(long id) {
        int x = new Random().nextInt(1000);
        System.out.println("sleep time"+x);
        String url = "http://microservice-user/get/" + id;
        if(id == 1000){
            throw new RuntimeException();
        }
        try {
            Thread.sleep(x);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long i = System.currentTimeMillis();
        Object result = restTemplate.getForEntity(url, Object.class);
        System.out.println("Time"+ (System.currentTimeMillis()-i));
        return result;
    }

}
