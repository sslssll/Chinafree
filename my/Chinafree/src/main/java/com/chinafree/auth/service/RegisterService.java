package com.chinafree.auth.service;

import org.springframework.stereotype.Service;

@Service
public interface RegisterService {


    void sendRegisterVerificationCode(String phoneNumber);

}
