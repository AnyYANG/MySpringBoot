package cn.liuyang.FeignClient;

import cn.liuyang.bean.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by  liuyang
 * 2019/7/23    20:05
 * cn.liuyang
 * All Right Reserved by liuyang.
 **/
@FeignClient(name = "microservice-user",fallback = FeignClientFallback.class)
public interface UserFeignClient {
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public User findById(@PathVariable("id") Long id);

    @RequestMapping("/getport")
    public String getPort();

}


@Component
class  FeignClientFallback implements UserFeignClient {

    @Override
    public User findById(Long id) {
        return new User();
    }

    @Override
    public String getPort() {
        return "xxx";
    }
}