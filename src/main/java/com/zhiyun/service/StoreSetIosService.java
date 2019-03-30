package com.zhiyun.service;

import com.zhiyun.entity.second.StoreSetIos;
import com.zhiyun.mapper.second.StoreSetIosMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Title: StoreSetIosService
 * @ProjectName: springbootmybatils
 * @Description: TODO
 * @author: jiangxing
 * @date 2019/3/2914:01
 */
@Component
@Slf4j
public class StoreSetIosService {

    @Resource
    private StoreSetIosMapper storeSetIosMapper;

    public List<StoreSetIos> findAll() {
        return storeSetIosMapper.selectByExample(null);
    }

}
