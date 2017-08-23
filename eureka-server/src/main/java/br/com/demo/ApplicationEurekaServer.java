package br.com.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
@EnableDiscoveryClient
public class ApplicationEurekaServer {
	
    public static void main(String[] args) {
        new SpringApplicationBuilder(ApplicationEurekaServer.class)
        	.web(true)
        	.run(args);
    }
    

}
