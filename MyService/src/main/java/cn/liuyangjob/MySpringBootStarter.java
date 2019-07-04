package cn.liuyangjob;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan(basePackages = "cn.liuyangjob")
@SpringBootApplication
public class MySpringBootStarter {
    public static void main(String args[]){
        SpringApplication.run(MySpringBootStarter.class);
    }
}
