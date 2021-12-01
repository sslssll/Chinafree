package com.chinafree.auth.controller;

import com.chinafree.auth.service.RegisterService;
import com.chinafree.common.model.enumeration.ResponseCodeEnum;
import com.chinafree.common.model.response.BaseResponse;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

@RestController
@Api(produces = "application/json", tags = "RegisterController", description = "注册接口")
public class RegisterController {

    @Autowired
    private RegisterService registerService;
    @Autowired
    private RedisTemplate redisTemplate;

    final static String REGISTER_VERIFICATION_CODE = "REGISTER_VERIFICATION_CODE_";
    final static String REGISTER_VERIFICATION_TIMES = "REGISTER_VERIFICATION_TIMES_";


    BaseResponse sendRegisterVerificationCode(@RequestParam("phoneNumber") String phoneNumber) {
        if (redisTemplate.hasKey(REGISTER_VERIFICATION_CODE + phoneNumber)) {
            return new BaseResponse(ResponseCodeEnum.SUCCESS, "上次验证码发送,还没超过1min");
        }

        if (redisTemplate.hasKey(REGISTER_VERIFICATION_TIMES + phoneNumber) && (Integer)redisTemplate.opsForValue().get(REGISTER_VERIFICATION_TIMES + phoneNumber)>=3) {
            return new BaseResponse(ResponseCodeEnum.SUCCESS, "验证码发送次数超过3次，请两个小时之后才试");
        }

        //随机验证码
        String s = Integer.valueOf((int) Math.random() * 1000000).toString();
        //发送短信
        redisTemplate.opsForValue().set(REGISTER_VERIFICATION_CODE + phoneNumber,s,1, TimeUnit.MINUTES);

        //将验证码放在缓存里
        redisTemplate.opsForValue().setIfAbsent(REGISTER_VERIFICATION_TIMES+phoneNumber,0);
        Integer time = (Integer)redisTemplate.opsForValue().get(REGISTER_VERIFICATION_TIMES + phoneNumber);
        redisTemplate.opsForValue().set(REGISTER_VERIFICATION_TIMES + phoneNumber,time,2,TimeUnit.HOURS);

        return new BaseResponse(ResponseCodeEnum.SUCCESS, "已发送验证码");
    }

}
