package cn.liuyangjob;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by  liuyang
 * 2019/8/5    17:24
 * cn.liuyangjob
 * All Right Reserved by liuyang.
 **/
@SpringBootApplication
@EnableAdminServer
public class SpringAdminApplication {
    public static void main(String args[]) {
        SpringApplication.run(SpringAdminApplication.class, args);
    }
}
