package com.zhiyun.mapper.master;

import com.zhiyun.entity.master.PoSite;
import com.zhiyun.entity.master.PoSiteExample;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface PoSiteMapper {
    long countByExample(PoSiteExample example);

    int insert(PoSite record);

    int insertSelective(PoSite record);

    List<PoSite> selectByExample(PoSiteExample example);
}