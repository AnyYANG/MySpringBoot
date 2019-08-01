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
     *
     * @return
     */
	@Bean
	@LoadBalanced
    public RestTemplate restTemplate(){
		return new RestTemplate();
	}

	@Bean
    @Scope("prototype")
    public Feign.Builder  feginBuilder(){
	    return Feign.builder();
    }

}
