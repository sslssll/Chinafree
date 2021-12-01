package com.chinafree.auth.controller;

import com.chinafree.auth.model.param.LoginParam;
import com.chinafree.auth.model.result.LoginUserRegisterResult;
import com.chinafree.auth.service.RegisterService;
import com.chinafree.common.model.enumeration.ResponseCodeEnum;
import com.chinafree.common.model.request.RequestParameter;
import com.chinafree.common.model.response.EntityResponse;
import io.swagger.annotations.Api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(produces = "application/json", tags = "LoginUserRestController", description = "注册接口")
public class RegisterController{

       @Autowired
       RegisterService registerService;

       EntityResponse<LoginUserRegisterResult> registerByMail(RequestParameter<LoginParam> loginParamRequestParameter) {
              LoginParam loginParam = loginParamRequestParameter.getBody();
              LoginUserRegisterResult loginUserRegisterResult = registerService.registerByMail(loginParam);
              return new EntityResponse<>(ResponseCodeEnum.SUCCESS,"注册成功",loginUserRegisterResult);

       }


}
