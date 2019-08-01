package cn.liuyang.FeignClient;

import cn.liuyang.bean.User;
import org.springframework.stereotype.Component;

/**
 * 服务降级处理类 通过方法重载，如果 feign调用失败后。直接执行feign接口实现类中降级方法
 */
@Component
public class FeginClientFallback implements UserFeignClient {
    @Override
    public User findById(Long id) {
        User user = new User();
        user.setFirstname("aaa");
        user.setLastname("bbb");
        return null;
    }

    @Override
    public String getPort() {

        return "请求服务超时，服务被降级";
    }
}
