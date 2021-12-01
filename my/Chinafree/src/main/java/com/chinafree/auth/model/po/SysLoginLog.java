package com.chinafree.auth.model.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Setter
@Getter
public class SysLoginLog {

    @TableId(type = IdType.AUTO)
    private Long id;

    private String loginName;

    private Integer loginType;

    private Integer loginPlatform;

    private Integer loginIp;

    private Date loginDateTime;

    private Integer loginFlag;

}