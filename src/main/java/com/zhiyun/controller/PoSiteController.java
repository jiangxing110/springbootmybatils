package com.zhiyun.controller;/**
 * @Title: PoSiteController
 * @ProjectName: springbootmybatils
 * @Description: TODO
 * @author: jiangxing
 * @date 2019/3/2911:30
 */

import com.zhiyun.base.BaseResult;
import com.zhiyun.entity.master.PoSite;
import com.zhiyun.entity.second.StoreSetIos;
import com.zhiyun.service.PoSiteService;
import com.zhiyun.service.StoreSetIosService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Classname PoSiteController
 * @Description TODO
 * @Date 2019/3/29 11:30
 * @Created by jiangxing
 */
@RestController
@RequestMapping("/poSite")
@Slf4j
public class PoSiteController {
    @Autowired
    private PoSiteService poSiteService;
    @Resource
    private StoreSetIosService storeSetIosService;

    @GetMapping("/findAll")
    public BaseResult<List<PoSite>> findAll() {
        BaseResult<List<PoSite>> baseResult = new BaseResult<List<PoSite>>();
        baseResult.setData(poSiteService.findAll());
        baseResult.setMessage("查询节点信息成功");
        baseResult.setResult(true);
        return baseResult;
    }

    @GetMapping("/findAllStore")
    public BaseResult<List<StoreSetIos>> findAllStore() {
        BaseResult<List<StoreSetIos>> baseResult = new BaseResult<List<StoreSetIos>>();
        List<StoreSetIos> a=storeSetIosService.findAll();
        baseResult.setData(a);
        baseResult.setMessage("查询节点信息成功");
        baseResult.setResult(true);
        return baseResult;
    }
}
