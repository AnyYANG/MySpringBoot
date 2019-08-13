package cn.liuyangjob.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by  liuyang
 * 2019/8/12    17:09
 * cn.liuyangjob.controller
 * All Right Reserved by liuyang.us
 **/

@RestController
public class GatewayController {
    @Autowired
    private RestTemplate restTemplate;

    @ResponseBody
    @GetMapping("/user/{id}")
    public Map<String, Object> findbyId(@PathVariable long id)
    {
        Map<String, Object> map = new HashMap<>();
        Object user = restTemplate.getForObject("http://microservice-user/get/"+id,Object.class);
        map.put("user",user);
        Object port = restTemplate.getForObject("http://microservice-user/getport",Object.class);
        map.put("port",port);
        return map;
    }
}
