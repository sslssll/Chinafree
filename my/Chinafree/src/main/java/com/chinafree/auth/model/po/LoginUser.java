package com.chinafree.auth.model.po;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;


@Builder
@TableName("sys_login_user")
@Data
@AllArgsConstructor
public class LoginUser {

    @TableId(type = IdType.AUTO)
    private Long id;
    private String loginName;
    private String loginMobile;
    private String loginMail;
    private String password;
    private String loginStatus;
    private LocalDateTime lastLoginTime;
    private String lastLoginIp;
    private String lastLoginDevice;
    @Version
    private Integer version;

    @TableLogic
    private Integer deleted;

    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    private String loginUserType;

    @TableField(value = "update_time", fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;
//    private String userId;
//    private LoginRef loginRef;
//    private List<ThirdPartAccount> thirdPartAccountList;


}
