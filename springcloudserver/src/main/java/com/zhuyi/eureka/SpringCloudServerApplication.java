package com.zhuyi.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by hutaoying on 2020/4/15
 */

@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
public class SpringCloudServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudServerApplication.class,args);
    }
}
