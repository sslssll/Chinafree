package com.chinafree.auth.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.chinafree.auth.model.bo.LoginUserBo;
import com.chinafree.auth.model.enumeration.Column;
import com.chinafree.auth.model.po.SysLoginRef;
import com.chinafree.auth.model.po.SysLoginUser;
import com.chinafree.auth.model.po.SysThirdPartAccount;
import com.chinafree.auth.model.result.ThirdPartAccountResult;
import com.chinafree.auth.service.LoginUserService;
import com.chinafree.mapper.SysLoginRefMapper;
import com.chinafree.mapper.SysLoginUserMapper;
import com.chinafree.mapper.SysThirdPartAccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.chinafree.auth.mapping.LoginUserMapping;

import java.util.List;

@Service
public class LoginUserServiceImpl implements LoginUserService {

    @Autowired
    private SysLoginUserMapper userMapper;
    @Autowired
    private SysLoginRefMapper loginRefMapper;
    @Autowired
    private SysThirdPartAccountMapper thirdPartAccountMapper;

    @Override
    public LoginUserBo getLoginUserByLoginMail(String loginMail) {
        QueryWrapper<SysLoginUser> loginUserQueryWrapper = new QueryWrapper<>();
//        loginUserQueryWrapper.isNotNull("login_name").isNotNull("login_mail").eq("id", "1L");
//        userMapper.selectList(loginUserQueryWrapper);
        QueryWrapper<SysLoginUser> eq = loginUserQueryWrapper.eq(Column.LOGIN_MAIL.getColumn(), loginMail);
        SysLoginUser sysLoginUser = userMapper.selectOne(eq);
        return initLoginUserRef(sysLoginUser);
    }


    @Override
    public LoginUserBo getLoginUserByLoginMobile(String loginMail) {
        QueryWrapper<SysLoginUser> loginUserQueryWrapper = new QueryWrapper<>();
        loginUserQueryWrapper.eq(Column.LOGIN_MOBILE.getColumn(), loginMail);
        final SysLoginUser sysLoginUser = userMapper.selectOne(loginUserQueryWrapper);
        return initLoginUserRef(sysLoginUser);
    }

    @Override
    public List<ThirdPartAccountResult> getThirdPartAccountByLoginId(Long loginId) {
        List<SysThirdPartAccount> sysThirdPartAccounts = thirdPartAccountMapper.selectList(new QueryWrapper<SysThirdPartAccount>().eq(Column.LOGIN_ID.getColumn(), loginId));
        return LoginUserMapping.loginUserMapping.thirdPartAccountsToResult(sysThirdPartAccounts);
    }

    /**
     * 初始化用户映射信息
     * @param loginUser
     */
    private LoginUserBo initLoginUserRef(SysLoginUser loginUser) {
        if (loginUser == null) {
            return null;
        }
        LoginUserBo loginUserBo = LoginUserMapping.loginUserMapping.sysLoginUserToBo(loginUser);
        Long loginId = loginUser.getId();
        SysLoginRef loginRef = loginRefMapper.selectOne(new QueryWrapper<SysLoginRef>().eq("login_id", loginId));
        loginUserBo.setSysLoginRef(loginRef);
        return loginUserBo;
    }

}
