package com.zyliu.controllers;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2018/5/2.
 */
@RestController
@Configuration
public class ShopperBehaviorController {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @GetMapping("/shopper/routine")
    @HystrixCommand(fallbackMethod = "hiError")
    public String routine() {
        RestTemplate restTemplate = getRestTemplate();
        String json = restTemplate.getForObject("http://first-server-provider/petinfo/findpet", String.class);
        return json;
    }

    public String hiError() {
        return "hi,sorry,error!";
    }
}