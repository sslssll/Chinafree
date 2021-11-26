package com.chinafree.auth.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chinafree.auth.model.po.LoginUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserMapper extends BaseMapper<LoginUser> {


    @Select("Select SELECT id, login_name, login_mobile, login_mail, password, login_status, last_login_time, last_login_id, last_login_device, register, login_user_type\n" +
            "FROM login_user\n" +
            "WHERE login_mail=#{loginMail};\n")
    LoginUser selectByMail(@Param("loginMail") String loginMail);
}
