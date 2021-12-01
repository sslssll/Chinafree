package com.chinafree.auth.service;

import com.chinafree.auth.model.param.LoginParam;
import com.chinafree.auth.model.result.LoginUserRegisterResult;

public interface RegisterService {

    LoginUserRegisterResult registerByMail(LoginParam loginParam);
}
