package com.wowlog.dao;

import com.wowlog.pojo.Classification;

public interface ClassificationMapper {
    int deleteByPrimaryKey(Long classificationId);

    int insert(Classification record);

    int insertSelective(Classification record);

    Classification selectByPrimaryKey(Long classificationId);

    int updateByPrimaryKeySelective(Classification record);

    int updateByPrimaryKey(Classification record);
}