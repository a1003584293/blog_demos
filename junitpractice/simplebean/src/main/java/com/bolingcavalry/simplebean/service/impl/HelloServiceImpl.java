package com.bolingcavalry.simplebean.service.impl;

import com.bolingcavalry.simplebean.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @Description: (这里用一句话描述这个类的作用)
 * @author: willzhao E-mail: zq2599@gmail.com
 * @date: 2020/9/20 16:08
 */
@Service("helloService")
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        return "Hello " + name;
    }
}