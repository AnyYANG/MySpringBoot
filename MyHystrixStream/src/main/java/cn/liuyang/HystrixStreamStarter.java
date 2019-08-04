package cn.liuyang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;


/**
 * Created by  liuyang
 * 2019/8/1    15:21
 * cn.liuyang
 * All Right Reserved by liuyang.
 **/
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixStreamStarter {
    public static void main(String args[]) {
        SpringApplication.run(HystrixStreamStarter.class,args);
    }
}
