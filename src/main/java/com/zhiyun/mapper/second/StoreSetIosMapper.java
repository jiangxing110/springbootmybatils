package com.zhiyun.mapper.second;

import com.zhiyun.entity.second.StoreSetIos;
import com.zhiyun.entity.second.StoreSetIosExample;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface StoreSetIosMapper {
    long countByExample(StoreSetIosExample example);

    int insert(StoreSetIos record);

    int insertSelective(StoreSetIos record);

    List<StoreSetIos> selectByExample(StoreSetIosExample example);
}