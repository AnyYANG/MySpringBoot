package cn.liuyang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
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
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
//@EnableEurekaClient
@EnableDiscoveryClient
public class MyCustomApplicationBoot {
    public static void main(String args[]) {
        SpringApplication.run(MyCustomApplicationBoot.class);
    }
}
