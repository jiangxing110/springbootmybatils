package com.zhiyun.entity.master;

import java.util.ArrayList;
import java.util.List;

public class PoSiteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PoSiteExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBoxIsEmptyIsNull() {
            addCriterion("box_is_empty is null");
            return (Criteria) this;
        }

        public Criteria andBoxIsEmptyIsNotNull() {
            addCriterion("box_is_empty is not null");
            return (Criteria) this;
        }

        public Criteria andBoxIsEmptyEqualTo(Boolean value) {
            addCriterion("box_is_empty =", value, "boxIsEmpty");
            return (Criteria) this;
        }

        public Criteria andBoxIsEmptyNotEqualTo(Boolean value) {
            addCriterion("box_is_empty <>", value, "boxIsEmpty");
            return (Criteria) this;
        }

        public Criteria andBoxIsEmptyGreaterThan(Boolean value) {
            addCriterion("box_is_empty >", value, "boxIsEmpty");
            return (Criteria) this;
        }

        public Criteria andBoxIsEmptyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("box_is_empty >=", value, "boxIsEmpty");
            return (Criteria) this;
        }

        public Criteria andBoxIsEmptyLessThan(Boolean value) {
            addCriterion("box_is_empty <", value, "boxIsEmpty");
            return (Criteria) this;
        }

        public Criteria andBoxIsEmptyLessThanOrEqualTo(Boolean value) {
            addCriterion("box_is_empty <=", value, "boxIsEmpty");
            return (Criteria) this;
        }

        public Criteria andBoxIsEmptyIn(List<Boolean> values) {
            addCriterion("box_is_empty in", values, "boxIsEmpty");
            return (Criteria) this;
        }

        public Criteria andBoxIsEmptyNotIn(List<Boolean> values) {
            addCriterion("box_is_empty not in", values, "boxIsEmpty");
            return (Criteria) this;
        }

        public Criteria andBoxIsEmptyBetween(Boolean value1, Boolean value2) {
            addCriterion("box_is_empty between", value1, value2, "boxIsEmpty");
            return (Criteria) this;
        }

        public Criteria andBoxIsEmptyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("box_is_empty not between", value1, value2, "boxIsEmpty");
            return (Criteria) this;
        }

        public Criteria andBoxProductIdIsNull() {
            addCriterion("box_product_id is null");
            return (Criteria) this;
        }

        public Criteria andBoxProductIdIsNotNull() {
            addCriterion("box_product_id is not null");
            return (Criteria) this;
        }

        public Criteria andBoxProductIdEqualTo(Long value) {
            addCriterion("box_product_id =", value, "boxProductId");
            return (Criteria) this;
        }

        public Criteria andBoxProductIdNotEqualTo(Long value) {
            addCriterion("box_product_id <>", value, "boxProductId");
            return (Criteria) this;
        }

        public Criteria andBoxProductIdGreaterThan(Long value) {
            addCriterion("box_product_id >", value, "boxProductId");
            return (Criteria) this;
        }

        public Criteria andBoxProductIdGreaterThanOrEqualTo(Long value) {
            addCriterion("box_product_id >=", value, "boxProductId");
            return (Criteria) this;
        }

        public Criteria andBoxProductIdLessThan(Long value) {
            addCriterion("box_product_id <", value, "boxProductId");
            return (Criteria) this;
        }

        public Criteria andBoxProductIdLessThanOrEqualTo(Long value) {
            addCriterion("box_product_id <=", value, "boxProductId");
            return (Criteria) this;
        }

        public Criteria andBoxProductIdIn(List<Long> values) {
            addCriterion("box_product_id in", values, "boxProductId");
            return (Criteria) this;
        }

        public Criteria andBoxProductIdNotIn(List<Long> values) {
            addCriterion("box_product_id not in", values, "boxProductId");
            return (Criteria) this;
        }

        public Criteria andBoxProductIdBetween(Long value1, Long value2) {
            addCriterion("box_product_id between", value1, value2, "boxProductId");
            return (Criteria) this;
        }

        public Criteria andBoxProductIdNotBetween(Long value1, Long value2) {
            addCriterion("box_product_id not between", value1, value2, "boxProductId");
            return (Criteria) this;
        }

        public Criteria andGroupTypeIsNull() {
            addCriterion("group_type is null");
            return (Criteria) this;
        }

        public Criteria andGroupTypeIsNotNull() {
            addCriterion("group_type is not null");
            return (Criteria) this;
        }

        public Criteria andGroupTypeEqualTo(Integer value) {
            addCriterion("group_type =", value, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeNotEqualTo(Integer value) {
            addCriterion("group_type <>", value, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeGreaterThan(Integer value) {
            addCriterion("group_type >", value, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("group_type >=", value, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeLessThan(Integer value) {
            addCriterion("group_type <", value, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeLessThanOrEqualTo(Integer value) {
            addCriterion("group_type <=", value, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeIn(List<Integer> values) {
            addCriterion("group_type in", values, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeNotIn(List<Integer> values) {
            addCriterion("group_type not in", values, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeBetween(Integer value1, Integer value2) {
            addCriterion("group_type between", value1, value2, "groupType");
            return (Criteria) this;
        }

        public Criteria andGroupTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("group_type not between", value1, value2, "groupType");
            return (Criteria) this;
        }

        public Criteria andHaveBoxIsNull() {
            addCriterion("have_box is null");
            return (Criteria) this;
        }

        public Criteria andHaveBoxIsNotNull() {
            addCriterion("have_box is not null");
            return (Criteria) this;
        }

        public Criteria andHaveBoxEqualTo(Boolean value) {
            addCriterion("have_box =", value, "haveBox");
            return (Criteria) this;
        }

        public Criteria andHaveBoxNotEqualTo(Boolean value) {
            addCriterion("have_box <>", value, "haveBox");
            return (Criteria) this;
        }

        public Criteria andHaveBoxGreaterThan(Boolean value) {
            addCriterion("have_box >", value, "haveBox");
            return (Criteria) this;
        }

        public Criteria andHaveBoxGreaterThanOrEqualTo(Boolean value) {
            addCriterion("have_box >=", value, "haveBox");
            return (Criteria) this;
        }

        public Criteria andHaveBoxLessThan(Boolean value) {
            addCriterion("have_box <", value, "haveBox");
            return (Criteria) this;
        }

        public Criteria andHaveBoxLessThanOrEqualTo(Boolean value) {
            addCriterion("have_box <=", value, "haveBox");
            return (Criteria) this;
        }

        public Criteria andHaveBoxIn(List<Boolean> values) {
            addCriterion("have_box in", values, "haveBox");
            return (Criteria) this;
        }

        public Criteria andHaveBoxNotIn(List<Boolean> values) {
            addCriterion("have_box not in", values, "haveBox");
            return (Criteria) this;
        }

        public Criteria andHaveBoxBetween(Boolean value1, Boolean value2) {
            addCriterion("have_box between", value1, value2, "haveBox");
            return (Criteria) this;
        }

        public Criteria andHaveBoxNotBetween(Boolean value1, Boolean value2) {
            addCriterion("have_box not between", value1, value2, "haveBox");
            return (Criteria) this;
        }

        public Criteria andPagePositionIdIsNull() {
            addCriterion("page_position_id is null");
            return (Criteria) this;
        }

        public Criteria andPagePositionIdIsNotNull() {
            addCriterion("page_position_id is not null");
            return (Criteria) this;
        }

        public Criteria andPagePositionIdEqualTo(Integer value) {
            addCriterion("page_position_id =", value, "pagePositionId");
            return (Criteria) this;
        }

        public Criteria andPagePositionIdNotEqualTo(Integer value) {
            addCriterion("page_position_id <>", value, "pagePositionId");
            return (Criteria) this;
        }

        public Criteria andPagePositionIdGreaterThan(Integer value) {
            addCriterion("page_position_id >", value, "pagePositionId");
            return (Criteria) this;
        }

        public Criteria andPagePositionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("page_position_id >=", value, "pagePositionId");
            return (Criteria) this;
        }

        public Criteria andPagePositionIdLessThan(Integer value) {
            addCriterion("page_position_id <", value, "pagePositionId");
            return (Criteria) this;
        }

        public Criteria andPagePositionIdLessThanOrEqualTo(Integer value) {
            addCriterion("page_position_id <=", value, "pagePositionId");
            return (Criteria) this;
        }

        public Criteria andPagePositionIdIn(List<Integer> values) {
            addCriterion("page_position_id in", values, "pagePositionId");
            return (Criteria) this;
        }

        public Criteria andPagePositionIdNotIn(List<Integer> values) {
            addCriterion("page_position_id not in", values, "pagePositionId");
            return (Criteria) this;
        }

        public Criteria andPagePositionIdBetween(Integer value1, Integer value2) {
            addCriterion("page_position_id between", value1, value2, "pagePositionId");
            return (Criteria) this;
        }

        public Criteria andPagePositionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("page_position_id not between", value1, value2, "pagePositionId");
            return (Criteria) this;
        }

        public Criteria andPositionxIsNull() {
            addCriterion("positionx is null");
            return (Criteria) this;
        }

        public Criteria andPositionxIsNotNull() {
            addCriterion("positionx is not null");
            return (Criteria) this;
        }

        public Criteria andPositionxEqualTo(Integer value) {
            addCriterion("positionx =", value, "positionx");
            return (Criteria) this;
        }

        public Criteria andPositionxNotEqualTo(Integer value) {
            addCriterion("positionx <>", value, "positionx");
            return (Criteria) this;
        }

        public Criteria andPositionxGreaterThan(Integer value) {
            addCriterion("positionx >", value, "positionx");
            return (Criteria) this;
        }

        public Criteria andPositionxGreaterThanOrEqualTo(Integer value) {
            addCriterion("positionx >=", value, "positionx");
            return (Criteria) this;
        }

        public Criteria andPositionxLessThan(Integer value) {
            addCriterion("positionx <", value, "positionx");
            return (Criteria) this;
        }

        public Criteria andPositionxLessThanOrEqualTo(Integer value) {
            addCriterion("positionx <=", value, "positionx");
            return (Criteria) this;
        }

        public Criteria andPositionxIn(List<Integer> values) {
            addCriterion("positionx in", values, "positionx");
            return (Criteria) this;
        }

        public Criteria andPositionxNotIn(List<Integer> values) {
            addCriterion("positionx not in", values, "positionx");
            return (Criteria) this;
        }

        public Criteria andPositionxBetween(Integer value1, Integer value2) {
            addCriterion("positionx between", value1, value2, "positionx");
            return (Criteria) this;
        }

        public Criteria andPositionxNotBetween(Integer value1, Integer value2) {
            addCriterion("positionx not between", value1, value2, "positionx");
            return (Criteria) this;
        }

        public Criteria andPositionyIsNull() {
            addCriterion("positiony is null");
            return (Criteria) this;
        }

        public Criteria andPositionyIsNotNull() {
            addCriterion("positiony is not null");
            return (Criteria) this;
        }

        public Criteria andPositionyEqualTo(Integer value) {
            addCriterion("positiony =", value, "positiony");
            return (Criteria) this;
        }

        public Criteria andPositionyNotEqualTo(Integer value) {
            addCriterion("positiony <>", value, "positiony");
            return (Criteria) this;
        }

        public Criteria andPositionyGreaterThan(Integer value) {
            addCriterion("positiony >", value, "positiony");
            return (Criteria) this;
        }

        public Criteria andPositionyGreaterThanOrEqualTo(Integer value) {
            addCriterion("positiony >=", value, "positiony");
            return (Criteria) this;
        }

        public Criteria andPositionyLessThan(Integer value) {
            addCriterion("positiony <", value, "positiony");
            return (Criteria) this;
        }

        public Criteria andPositionyLessThanOrEqualTo(Integer value) {
            addCriterion("positiony <=", value, "positiony");
            return (Criteria) this;
        }

        public Criteria andPositionyIn(List<Integer> values) {
            addCriterion("positiony in", values, "positiony");
            return (Criteria) this;
        }

        public Criteria andPositionyNotIn(List<Integer> values) {
            addCriterion("positiony not in", values, "positiony");
            return (Criteria) this;
        }

        public Criteria andPositionyBetween(Integer value1, Integer value2) {
            addCriterion("positiony between", value1, value2, "positiony");
            return (Criteria) this;
        }

        public Criteria andPositionyNotBetween(Integer value1, Integer value2) {
            addCriterion("positiony not between", value1, value2, "positiony");
            return (Criteria) this;
        }

        public Criteria andSideIsNull() {
            addCriterion("side is null");
            return (Criteria) this;
        }

        public Criteria andSideIsNotNull() {
            addCriterion("side is not null");
            return (Criteria) this;
        }

        public Criteria andSideEqualTo(Integer value) {
            addCriterion("side =", value, "side");
            return (Criteria) this;
        }

        public Criteria andSideNotEqualTo(Integer value) {
            addCriterion("side <>", value, "side");
            return (Criteria) this;
        }

        public Criteria andSideGreaterThan(Integer value) {
            addCriterion("side >", value, "side");
            return (Criteria) this;
        }

        public Criteria andSideGreaterThanOrEqualTo(Integer value) {
            addCriterion("side >=", value, "side");
            return (Criteria) this;
        }

        public Criteria andSideLessThan(Integer value) {
            addCriterion("side <", value, "side");
            return (Criteria) this;
        }

        public Criteria andSideLessThanOrEqualTo(Integer value) {
            addCriterion("side <=", value, "side");
            return (Criteria) this;
        }

        public Criteria andSideIn(List<Integer> values) {
            addCriterion("side in", values, "side");
            return (Criteria) this;
        }

        public Criteria andSideNotIn(List<Integer> values) {
            addCriterion("side not in", values, "side");
            return (Criteria) this;
        }

        public Criteria andSideBetween(Integer value1, Integer value2) {
            addCriterion("side between", value1, value2, "side");
            return (Criteria) this;
        }

        public Criteria andSideNotBetween(Integer value1, Integer value2) {
            addCriterion("side not between", value1, value2, "side");
            return (Criteria) this;
        }

        public Criteria andSiteNameIsNull() {
            addCriterion("site_name is null");
            return (Criteria) this;
        }

        public Criteria andSiteNameIsNotNull() {
            addCriterion("site_name is not null");
            return (Criteria) this;
        }

        public Criteria andSiteNameEqualTo(String value) {
            addCriterion("site_name =", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameNotEqualTo(String value) {
            addCriterion("site_name <>", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameGreaterThan(String value) {
            addCriterion("site_name >", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameGreaterThanOrEqualTo(String value) {
            addCriterion("site_name >=", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameLessThan(String value) {
            addCriterion("site_name <", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameLessThanOrEqualTo(String value) {
            addCriterion("site_name <=", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameLike(String value) {
            addCriterion("site_name like", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameNotLike(String value) {
            addCriterion("site_name not like", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameIn(List<String> values) {
            addCriterion("site_name in", values, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameNotIn(List<String> values) {
            addCriterion("site_name not in", values, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameBetween(String value1, String value2) {
            addCriterion("site_name between", value1, value2, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameNotBetween(String value1, String value2) {
            addCriterion("site_name not between", value1, value2, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteTypeIsNull() {
            addCriterion("site_type is null");
            return (Criteria) this;
        }

        public Criteria andSiteTypeIsNotNull() {
            addCriterion("site_type is not null");
            return (Criteria) this;
        }

        public Criteria andSiteTypeEqualTo(Integer value) {
            addCriterion("site_type =", value, "siteType");
            return (Criteria) this;
        }

        public Criteria andSiteTypeNotEqualTo(Integer value) {
            addCriterion("site_type <>", value, "siteType");
            return (Criteria) this;
        }

        public Criteria andSiteTypeGreaterThan(Integer value) {
            addCriterion("site_type >", value, "siteType");
            return (Criteria) this;
        }

        public Criteria andSiteTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("site_type >=", value, "siteType");
            return (Criteria) this;
        }

        public Criteria andSiteTypeLessThan(Integer value) {
            addCriterion("site_type <", value, "siteType");
            return (Criteria) this;
        }

        public Criteria andSiteTypeLessThanOrEqualTo(Integer value) {
            addCriterion("site_type <=", value, "siteType");
            return (Criteria) this;
        }

        public Criteria andSiteTypeIn(List<Integer> values) {
            addCriterion("site_type in", values, "siteType");
            return (Criteria) this;
        }

        public Criteria andSiteTypeNotIn(List<Integer> values) {
            addCriterion("site_type not in", values, "siteType");
            return (Criteria) this;
        }

        public Criteria andSiteTypeBetween(Integer value1, Integer value2) {
            addCriterion("site_type between", value1, value2, "siteType");
            return (Criteria) this;
        }

        public Criteria andSiteTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("site_type not between", value1, value2, "siteType");
            return (Criteria) this;
        }

        public Criteria andTransportCarIdIsNull() {
            addCriterion("transport_car_id is null");
            return (Criteria) this;
        }

        public Criteria andTransportCarIdIsNotNull() {
            addCriterion("transport_car_id is not null");
            return (Criteria) this;
        }

        public Criteria andTransportCarIdEqualTo(Long value) {
            addCriterion("transport_car_id =", value, "transportCarId");
            return (Criteria) this;
        }

        public Criteria andTransportCarIdNotEqualTo(Long value) {
            addCriterion("transport_car_id <>", value, "transportCarId");
            return (Criteria) this;
        }

        public Criteria andTransportCarIdGreaterThan(Long value) {
            addCriterion("transport_car_id >", value, "transportCarId");
            return (Criteria) this;
        }

        public Criteria andTransportCarIdGreaterThanOrEqualTo(Long value) {
            addCriterion("transport_car_id >=", value, "transportCarId");
            return (Criteria) this;
        }

        public Criteria andTransportCarIdLessThan(Long value) {
            addCriterion("transport_car_id <", value, "transportCarId");
            return (Criteria) this;
        }

        public Criteria andTransportCarIdLessThanOrEqualTo(Long value) {
            addCriterion("transport_car_id <=", value, "transportCarId");
            return (Criteria) this;
        }

        public Criteria andTransportCarIdIn(List<Long> values) {
            addCriterion("transport_car_id in", values, "transportCarId");
            return (Criteria) this;
        }

        public Criteria andTransportCarIdNotIn(List<Long> values) {
            addCriterion("transport_car_id not in", values, "transportCarId");
            return (Criteria) this;
        }

        public Criteria andTransportCarIdBetween(Long value1, Long value2) {
            addCriterion("transport_car_id between", value1, value2, "transportCarId");
            return (Criteria) this;
        }

        public Criteria andTransportCarIdNotBetween(Long value1, Long value2) {
            addCriterion("transport_car_id not between", value1, value2, "transportCarId");
            return (Criteria) this;
        }

        public Criteria andProductionStatusIsNull() {
            addCriterion("production_status is null");
            return (Criteria) this;
        }

        public Criteria andProductionStatusIsNotNull() {
            addCriterion("production_status is not null");
            return (Criteria) this;
        }

        public Criteria andProductionStatusEqualTo(Boolean value) {
            addCriterion("production_status =", value, "productionStatus");
            return (Criteria) this;
        }

        public Criteria andProductionStatusNotEqualTo(Boolean value) {
            addCriterion("production_status <>", value, "productionStatus");
            return (Criteria) this;
        }

        public Criteria andProductionStatusGreaterThan(Boolean value) {
            addCriterion("production_status >", value, "productionStatus");
            return (Criteria) this;
        }

        public Criteria andProductionStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("production_status >=", value, "productionStatus");
            return (Criteria) this;
        }

        public Criteria andProductionStatusLessThan(Boolean value) {
            addCriterion("production_status <", value, "productionStatus");
            return (Criteria) this;
        }

        public Criteria andProductionStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("production_status <=", value, "productionStatus");
            return (Criteria) this;
        }

        public Criteria andProductionStatusIn(List<Boolean> values) {
            addCriterion("production_status in", values, "productionStatus");
            return (Criteria) this;
        }

        public Criteria andProductionStatusNotIn(List<Boolean> values) {
            addCriterion("production_status not in", values, "productionStatus");
            return (Criteria) this;
        }

        public Criteria andProductionStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("production_status between", value1, value2, "productionStatus");
            return (Criteria) this;
        }

        public Criteria andProductionStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("production_status not between", value1, value2, "productionStatus");
            return (Criteria) this;
        }

        public Criteria andSiteStatusIsNull() {
            addCriterion("site_status is null");
            return (Criteria) this;
        }

        public Criteria andSiteStatusIsNotNull() {
            addCriterion("site_status is not null");
            return (Criteria) this;
        }

        public Criteria andSiteStatusEqualTo(String value) {
            addCriterion("site_status =", value, "siteStatus");
            return (Criteria) this;
        }

        public Criteria andSiteStatusNotEqualTo(String value) {
            addCriterion("site_status <>", value, "siteStatus");
            return (Criteria) this;
        }

        public Criteria andSiteStatusGreaterThan(String value) {
            addCriterion("site_status >", value, "siteStatus");
            return (Criteria) this;
        }

        public Criteria andSiteStatusGreaterThanOrEqualTo(String value) {
            addCriterion("site_status >=", value, "siteStatus");
            return (Criteria) this;
        }

        public Criteria andSiteStatusLessThan(String value) {
            addCriterion("site_status <", value, "siteStatus");
            return (Criteria) this;
        }

        public Criteria andSiteStatusLessThanOrEqualTo(String value) {
            addCriterion("site_status <=", value, "siteStatus");
            return (Criteria) this;
        }

        public Criteria andSiteStatusLike(String value) {
            addCriterion("site_status like", value, "siteStatus");
            return (Criteria) this;
        }

        public Criteria andSiteStatusNotLike(String value) {
            addCriterion("site_status not like", value, "siteStatus");
            return (Criteria) this;
        }

        public Criteria andSiteStatusIn(List<String> values) {
            addCriterion("site_status in", values, "siteStatus");
            return (Criteria) this;
        }

        public Criteria andSiteStatusNotIn(List<String> values) {
            addCriterion("site_status not in", values, "siteStatus");
            return (Criteria) this;
        }

        public Criteria andSiteStatusBetween(String value1, String value2) {
            addCriterion("site_status between", value1, value2, "siteStatus");
            return (Criteria) this;
        }

        public Criteria andSiteStatusNotBetween(String value1, String value2) {
            addCriterion("site_status not between", value1, value2, "siteStatus");
            return (Criteria) this;
        }

        public Criteria andPageNameIsNull() {
            addCriterion("page_name is null");
            return (Criteria) this;
        }

        public Criteria andPageNameIsNotNull() {
            addCriterion("page_name is not null");
            return (Criteria) this;
        }

        public Criteria andPageNameEqualTo(String value) {
            addCriterion("page_name =", value, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameNotEqualTo(String value) {
            addCriterion("page_name <>", value, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameGreaterThan(String value) {
            addCriterion("page_name >", value, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameGreaterThanOrEqualTo(String value) {
            addCriterion("page_name >=", value, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameLessThan(String value) {
            addCriterion("page_name <", value, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameLessThanOrEqualTo(String value) {
            addCriterion("page_name <=", value, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameLike(String value) {
            addCriterion("page_name like", value, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameNotLike(String value) {
            addCriterion("page_name not like", value, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameIn(List<String> values) {
            addCriterion("page_name in", values, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameNotIn(List<String> values) {
            addCriterion("page_name not in", values, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameBetween(String value1, String value2) {
            addCriterion("page_name between", value1, value2, "pageName");
            return (Criteria) this;
        }

        public Criteria andPageNameNotBetween(String value1, String value2) {
            addCriterion("page_name not between", value1, value2, "pageName");
            return (Criteria) this;
        }

        public Criteria andOrdersIsNull() {
            addCriterion("orders is null");
            return (Criteria) this;
        }

        public Criteria andOrdersIsNotNull() {
            addCriterion("orders is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersEqualTo(Integer value) {
            addCriterion("orders =", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersNotEqualTo(Integer value) {
            addCriterion("orders <>", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersGreaterThan(Integer value) {
            addCriterion("orders >", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersGreaterThanOrEqualTo(Integer value) {
            addCriterion("orders >=", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersLessThan(Integer value) {
            addCriterion("orders <", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersLessThanOrEqualTo(Integer value) {
            addCriterion("orders <=", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersIn(List<Integer> values) {
            addCriterion("orders in", values, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersNotIn(List<Integer> values) {
            addCriterion("orders not in", values, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersBetween(Integer value1, Integer value2) {
            addCriterion("orders between", value1, value2, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersNotBetween(Integer value1, Integer value2) {
            addCriterion("orders not between", value1, value2, "orders");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}