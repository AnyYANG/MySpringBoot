package cn.liuyang.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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

    @RequestMapping("/getuser/{id}")
    @HystrixCommand(fallbackMethod = "requstFallBack")
    public Object getEmploybyid(@PathVariable long id) {
        String url = "http://microservice-user/get/" + id;
        if(id==1000){
            throw  new RuntimeException();
        }
        long i = System.currentTimeMillis();
        Object result = restTemplate.getForEntity(url, Object.class);
        System.out.println("Time"+ (System.currentTimeMillis()-i));
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
}
