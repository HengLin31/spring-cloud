package pers.henglin.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by linheng on 09/11/2019.
 */

@EnableEurekaClient
@SpringBootApplication
public class DemoServerApplication {
    public static void main(String[] args){
        SpringApplication.run(DemoServerApplication.class, args);
    }
}
