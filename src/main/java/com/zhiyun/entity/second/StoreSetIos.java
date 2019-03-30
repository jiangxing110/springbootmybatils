package com.zhiyun.entity.second;

import java.util.Date;

public class StoreSetIos {
    private Long id;

    private String storeName;

    private Long factorySetId;

    private String stoProtery;

    private Integer rackAmount;

    private String storeType;

    private String countType;

    private String status;

    private String remark;

    private String deleted;

    private Long companyId;

    private Date createTime;

    private String createBy;

    private Date modifyTime;

    private String modifyBy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    public Long getFactorySetId() {
        return factorySetId;
    }

    public void setFactorySetId(Long factorySetId) {
        this.factorySetId = factorySetId;
    }

    public String getStoProtery() {
        return stoProtery;
    }

    public void setStoProtery(String stoProtery) {
        this.stoProtery = stoProtery == null ? null : stoProtery.trim();
    }

    public Integer getRackAmount() {
        return rackAmount;
    }

    public void setRackAmount(Integer rackAmount) {
        this.rackAmount = rackAmount;
    }

    public String getStoreType() {
        return storeType;
    }

    public void setStoreType(String storeType) {
        this.storeType = storeType == null ? null : storeType.trim();
    }

    public String getCountType() {
        return countType;
    }

    public void setCountType(String countType) {
        this.countType = countType == null ? null : countType.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted == null ? null : deleted.trim();
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy == null ? null : modifyBy.trim();
    }
}