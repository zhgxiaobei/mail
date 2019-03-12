package com.example.maildemo.redis;

import com.example.maildemo.utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("redis")
public class test {

    @Autowired
    private RedisUtils redisUtils;


    @RequestMapping("set")
    public String set (String name){

        redisUtils.set("name",name);
        return redisUtils.get("name");
    }

    @RequestMapping("get")
    public String get (String name){

        return redisUtils.get("name");
    }
}
