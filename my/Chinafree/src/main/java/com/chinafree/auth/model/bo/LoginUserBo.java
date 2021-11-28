package com.chinafree.auth.model.bo;


import com.chinafree.auth.model.po.SysLoginRef;
import com.chinafree.auth.model.po.SysloginRef;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;

@Builder
@Getter
@Setter
@NoArgsConstructor
@Slf4j
@ToString
public class LoginUserBo {
    private Long id;

    private String loginName;
    private String loginMobile;
    private String loginMail;
    private String password;
    private String loginStatus;
    private LocalDateTime lastLoginTime;
    private String lastLoginIp;
    private String lastLoginDevice;
    private String loginUserType;

    private SysLoginRef sysLoginRef;

}
