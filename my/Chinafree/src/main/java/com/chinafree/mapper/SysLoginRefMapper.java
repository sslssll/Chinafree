package com.chinafree.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chinafree.auth.model.po.SysLoginRef;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface SysLoginRefMapper extends BaseMapper<SysLoginRef> {

}