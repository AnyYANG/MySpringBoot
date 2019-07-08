package cn.liuyang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;


/**
 * Created by  liuyang
 * 2019/7/5    17:49
 * cn.liuyang
 * All Right Reserved by liuyang.
 **/
@ComponentScan(basePackages = "cn.liuyang")
@SpringBootApplication
@EnableAutoConfiguration
@EnableEurekaClient
public class CustomApplicationBoot {
    public static void main(String args[]) {
        SpringApplication.run(CustomApplicationBoot.class);
    }
}
