package com.zhiyun.entity.master;



public class PoSite {
    private Long id;

    private Boolean boxIsEmpty;

    private Long boxProductId;

    private Integer groupType;

    private Boolean haveBox;

    private Integer pagePositionId;

    private Integer positionx;

    private Integer positiony;

    private Integer side;

    private String siteName;

    private Integer siteType;

    private Long transportCarId;

    private Boolean productionStatus;

    private String siteStatus;

    private String pageName;

    private Integer orders;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getBoxIsEmpty() {
        return boxIsEmpty;
    }

    public void setBoxIsEmpty(Boolean boxIsEmpty) {
        this.boxIsEmpty = boxIsEmpty;
    }

    public Long getBoxProductId() {
        return boxProductId;
    }

    public void setBoxProductId(Long boxProductId) {
        this.boxProductId = boxProductId;
    }

    public Integer getGroupType() {
        return groupType;
    }

    public void setGroupType(Integer groupType) {
        this.groupType = groupType;
    }

    public Boolean getHaveBox() {
        return haveBox;
    }

    public void setHaveBox(Boolean haveBox) {
        this.haveBox = haveBox;
    }

    public Integer getPagePositionId() {
        return pagePositionId;
    }

    public void setPagePositionId(Integer pagePositionId) {
        this.pagePositionId = pagePositionId;
    }

    public Integer getPositionx() {
        return positionx;
    }

    public void setPositionx(Integer positionx) {
        this.positionx = positionx;
    }

    public Integer getPositiony() {
        return positiony;
    }

    public void setPositiony(Integer positiony) {
        this.positiony = positiony;
    }

    public Integer getSide() {
        return side;
    }

    public void setSide(Integer side) {
        this.side = side;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName == null ? null : siteName.trim();
    }

    public Integer getSiteType() {
        return siteType;
    }

    public void setSiteType(Integer siteType) {
        this.siteType = siteType;
    }

    public Long getTransportCarId() {
        return transportCarId;
    }

    public void setTransportCarId(Long transportCarId) {
        this.transportCarId = transportCarId;
    }

    public Boolean getProductionStatus() {
        return productionStatus;
    }

    public void setProductionStatus(Boolean productionStatus) {
        this.productionStatus = productionStatus;
    }

    public String getSiteStatus() {
        return siteStatus;
    }

    public void setSiteStatus(String siteStatus) {
        this.siteStatus = siteStatus == null ? null : siteStatus.trim();
    }

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName == null ? null : pageName.trim();
    }

    public Integer getOrders() {
        return orders;
    }

    public void setOrders(Integer orders) {
        this.orders = orders;
    }
}