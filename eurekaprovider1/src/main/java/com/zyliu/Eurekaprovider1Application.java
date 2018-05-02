package com.zyliu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@ComponentScan(basePackages = { "com.zyliu.controllers" })
public class Eurekaprovider1Application {

	public static void main(String[] args) {
		SpringApplication.run(Eurekaprovider1Application.class, args);
	}
}
