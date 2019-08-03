package cn.liuyang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * Created by  liuyang
 * 2019/8/1    15:21
 * cn.liuyang
 * All Right Reserved by liuyang.
 **/
@EnableCircuitBreaker
@SpringBootApplication
public class MyTurbineStarter {
    public static void main(String args[]) {
        SpringApplication.run(MyTurbineStarter.class);
    }
}
