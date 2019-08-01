package cn.liuyang.config;

import feign.Feign;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.client.RestTemplate;

@Configuration
public class CommonConfig {
    /**
     *  使用了RestTemplate并且开启了客户端负载均衡功能，开启负载均衡很简单，
     *只需要在RestTemplate的bean上再添加一个@LoadBalanced注解即可.
	 * @LoadBalanced Annotation to mark a RestTemplate bean to be configured to use a LoadBalancerClient
	 * @LoadBalancerClient
     * @return
     */
	@Bean
	@LoadBalanced
    public RestTemplate restTemplate(){
		return new RestTemplate();
	}

	/**
	 * prototype  容器中存在多个Bean对象，每次访问容器获取对象，都会生成一个新对象，即每次调用getBean都会获取一个新的对象
	 * 为Feign禁用 Hystrix
	 * 默认Feign 会为所有feign客户端所有方法开启hystrix  虽然方便，但是有些场景不需要该功能
	 * 所以需要在FeignClient 中加上configuartion属性配置
	 * @FeignClient(name = "mircoservice-order",configuartion = commonfig.class)
	 *
	 * @return  每次加载都会返回一个新的对象
 	 */
	@Bean
    @Scope("prototype")
    public Feign.Builder  feginBuilder(){
	    return Feign.builder();
    }

}
