package com.chinafree.auth.service.impl;

import com.chinafree.auth.model.param.LoginParam;
import com.chinafree.auth.model.result.LoginResult;
import com.chinafree.auth.service.LoginService;
import com.chinafree.auth.service.NormalLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private NormalLoginService normalLoginService;

    @Override
    public LoginResult loginByUsernameAndPwd(LoginParam normalLoginParam) {
        String loginName = normalLoginParam.getUsername();
        String password = normalLoginParam.getPassword();
        LoginResult result = normalLoginService.login(loginName, password);
        return result;
    }






}
