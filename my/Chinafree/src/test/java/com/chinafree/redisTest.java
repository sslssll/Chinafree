package com.chinafree;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.chinafree.auth.mapper.UserMapper;
import com.chinafree.auth.model.po.LoginUser;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@SpringBootTest
public class redisTest {

    @Autowired
    private RedisTemplate redisTemplate;
    @Test
    void contextLoads() {
        ValueOperations valueOperations = redisTemplate.opsForValue();
//        valueOperations.set("name2","a2");
        String name = (String) redisTemplate.opsForValue().get("name1");
        System.out.println(name);

    }
}
