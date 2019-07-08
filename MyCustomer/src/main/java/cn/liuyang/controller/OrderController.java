package cn.liuyang.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
public class OrderController {
	private final Logger logger = LoggerFactory.getLogger(OrderController.class);
	
	@Autowired
	private RestTemplate restTemplate;
	

    @RequestMapping("/user/getByIdEureka")
    public Object getUserByIdEureka(String userId) {
    	String url = "http://microservice-user/user/getById?id=" + userId;
    	Object result = restTemplate.getForEntity(url, Object.class);
        return result;
    }
    
    
}