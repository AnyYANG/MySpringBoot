package cn.liuyang.FeignClient;

import cn.liuyang.bean.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by  liuyang
 * 2019/7/23    20:05
 * cn.liuyang
 * All Right Reserved by liuyang.
 **/
@FeignClient(name = "microservice-user")
public interface UserFeignClient {
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public User findById(@PathVariable("id") Long id);
    @RequestMapping("/getport")
    public String getPort();
}
