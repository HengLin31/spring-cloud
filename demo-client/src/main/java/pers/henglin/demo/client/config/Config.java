package pers.henglin.demo.client.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by linheng on 11/11/2019.
 */

@Configuration
public class Config {

    @LoadBalanced
    @Bean
    public RestTemplate getTestTemplate(){
        return new RestTemplate();
    }
}
