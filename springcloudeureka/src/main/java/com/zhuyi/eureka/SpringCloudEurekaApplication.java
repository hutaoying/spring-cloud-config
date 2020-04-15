package com.zhuyi.eureka;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * Created by hutaoying on 2020/4/15
 */

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurekaApplication {
//    @Bean
//    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
//
//        PropertySourcesPlaceholderConfigurer c = new PropertySourcesPlaceholderConfigurer();
//
//        c.setIgnoreUnresolvablePlaceholders(true);
//
//        return c;
//
//    }

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaApplication.class,args);
    }
}
