package cn.appsys.dao;

import cn.appsys.pojo.Version;

public interface VersionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Version record);

    int insertSelective(Version record);

    Version selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Version record);

    int updateByPrimaryKey(Version record);
}