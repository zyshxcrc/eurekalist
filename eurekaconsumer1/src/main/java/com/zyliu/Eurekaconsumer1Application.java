package com.zyliu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
@ComponentScan(basePackages = { "com.zyliu.controllers" })
public class Eurekaconsumer1Application {

	public static void main(String[] args) {
		SpringApplication.run(Eurekaconsumer1Application.class, args);
	}
}
