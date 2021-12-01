package com.chinafree.entity;

public class sysThirdPartyAccount {
    private Long id;

    private Long loginId;

    private String openId;

    private String thirdPartyAccountType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLoginId() {
        return loginId;
    }

    public void setLoginId(Long loginId) {
        this.loginId = loginId;
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