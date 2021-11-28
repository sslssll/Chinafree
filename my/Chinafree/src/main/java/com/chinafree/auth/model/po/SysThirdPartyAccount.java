package com.chinafree.auth.model.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class SysThirdPartyAccount {
    @TableId(type = IdType.AUTO)
    private Long id;

    private String loginId;

    private String openId;

    private String thirdPartyAccountType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id ;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId == null ? null : loginId.trim();
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public String getThirdPartyAccountType() {
        return thirdPartyAccountType;
    }

    public void setThirdPartyAccountType(String thirdPartyAccountType) {
        this.thirdPartyAccountType = thirdPartyAccountType == null ? null : thirdPartyAccountType.trim();
    }
}