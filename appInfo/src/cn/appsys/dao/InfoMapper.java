package cn.appsys.dao;

import cn.appsys.pojo.Info;

public interface InfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Info record);

    int insertSelective(Info record);

    Info selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Info record);

    int updateByPrimaryKey(Info record);
}