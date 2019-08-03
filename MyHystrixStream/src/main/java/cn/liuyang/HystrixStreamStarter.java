package cn.liuyang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;


/**
 * Created by  liuyang
 * 2019/8/1    15:21
 * cn.liuyang
 * All Right Reserved by liuyang.
 **/
@EnableCircuitBreaker
@SpringBootApplication
@EnableEurekaClient
public class HystrixStreamStarter {
    public static void main(String args[]) {
        SpringApplication.run(HystrixStreamStarter.class,args);
    }
}
