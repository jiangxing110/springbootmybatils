package com.zhiyun.service;

import com.zhiyun.entity.master.PoSite;
import com.zhiyun.mapper.master.PoSiteMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Title: PoSiteService
 * @ProjectName: springbootmybatils
 * @Description: TODO
 * @author: jiangxing
 * @date 2019/3/2914:01
 */

@Component
@Slf4j
public class PoSiteService {
    @Autowired
    private PoSiteMapper poSiteMapper;

    public List<PoSite> findAll() {
        return poSiteMapper.selectByExample(null);
    }
    

}
