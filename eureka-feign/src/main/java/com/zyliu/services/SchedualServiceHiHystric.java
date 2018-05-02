package com.zyliu.services;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2018/5/2.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
