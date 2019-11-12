package pers.henglin.demo.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created by linheng on 11/11/2019.
 */

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"pres.henglin"})
public class DemoClientApplication {
    public static void main(String[] args){
        SpringApplication.run(DemoClientApplication.class, args);
    }
}
