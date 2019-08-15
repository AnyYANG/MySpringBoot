package cn.liuyangjob;

import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author liuyang
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class MyConfigServerStarter {
    public static void main(String args[]) {
        SpringApplication.run(MyConfigServerStarter.class,args);
    }
}
