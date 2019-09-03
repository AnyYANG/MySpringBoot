package cn.liuyang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;


/**
 * Created by  liuyang
 * 2019/7/5    17:49
 * cn.liuyang
 * All Right Reserved by liuyang.
 **/
//@ComponentScan(basePackages = "cn.liuyang")
//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
//@EnableDiscoveryClient
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients   //feigin客户端
@EnableCircuitBreaker //引入hystrix断路保护器
public class MyCustomFeignApplicationBoot {

    public static void main(String args[]) {
        SpringApplication.run(MyCustomFeignApplicationBoot.class,args);
    }


}
