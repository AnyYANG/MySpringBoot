package cn.liuyangjob;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author liuyang
 */
@SpringBootApplication
@EnableConfigServer
public class MyConfigServerStarter {
    public static void main(String args[]) {
        SpringApplication.run(MyConfigServerStarter.class,args);
    }
}
