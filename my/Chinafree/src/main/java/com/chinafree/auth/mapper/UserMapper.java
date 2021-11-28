package com.chinafree.auth.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chinafree.auth.model.po.LoginUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper extends BaseMapper<LoginUser> {

}
