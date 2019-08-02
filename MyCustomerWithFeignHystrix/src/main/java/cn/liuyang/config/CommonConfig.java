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

}
