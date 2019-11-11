package pers.henglin.demo.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by linheng on 11/11/2019.
 */

@EnableEurekaClient
@SpringBootApplication
public class DemoClientApplication {
    public static void main(String[] args){
        SpringApplication.run(DemoClientApplication.class, args);
    }
}
