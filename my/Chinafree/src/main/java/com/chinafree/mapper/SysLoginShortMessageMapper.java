package com.chinafree.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chinafree.auth.model.po.SysLoginShortMessage;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface SysLoginShortMessageMapper extends BaseMapper<SysLoginShortMessage> {
    int deleteByPrimaryKey(String id);

    int insert(SysLoginShortMessage record);

    int insertSelective(SysLoginShortMessage record);

    SysLoginShortMessage selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysLoginShortMessage record);

    int updateByPrimaryKey(SysLoginShortMessage record);
}