package com.chinafree.auth.model.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SysLoginLog {

    @TableId(type = IdType.AUTO)
    private Long id;

    private String loginName;

    private String loginType;

    private String loginPlatform;

    private String loginIp;

    private String loginDateTime;

    private String loginFlag;

}