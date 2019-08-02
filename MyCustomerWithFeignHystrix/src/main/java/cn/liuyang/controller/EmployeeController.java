package cn.liuyang.controller;

import cn.liuyang.FeignClient.UserFeignClient;
import cn.liuyang.bean.User;
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
    private UserFeignClient userFeignClient;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/getuser/{id}")
    public Object getEmploybyid(@PathVariable long id) {
        User user = userFeignClient.findById(id);
        return user;
    }


 /*   @RequestMapping("/getinfor")
    public String getServiceInfor() {
        String url = "http://microservice-user/getinfo";
        String result = restTemplate.getForObject(url, String.class);

        return result;
    }*/

    @RequestMapping("/port")
    public String getMicroServicePort(){
        return userFeignClient.getPort();
    }
}
