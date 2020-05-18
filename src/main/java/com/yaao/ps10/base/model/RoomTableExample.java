package com.yaao.ps10.base.model;

import java.util.ArrayList;
import java.util.List;

public class RoomTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RoomTableExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRoomNameIsNull() {
            addCriterion("ROOM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRoomNameIsNotNull() {
            addCriterion("ROOM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRoomNameEqualTo(String value) {
            addCriterion("ROOM_NAME =", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameNotEqualTo(String value) {
            addCriterion("ROOM_NAME <>", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameGreaterThan(String value) {
            addCriterion("ROOM_NAME >", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameGreaterThanOrEqualTo(String value) {
            addCriterion("ROOM_NAME >=", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameLessThan(String value) {
            addCriterion("ROOM_NAME <", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameLessThanOrEqualTo(String value) {
            addCriterion("ROOM_NAME <=", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameLike(String value) {
            addCriterion("ROOM_NAME like", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameNotLike(String value) {
            addCriterion("ROOM_NAME not like", value, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameIn(List<String> values) {
            addCriterion("ROOM_NAME in", values, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameNotIn(List<String> values) {
            addCriterion("ROOM_NAME not in", values, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameBetween(String value1, String value2) {
            addCriterion("ROOM_NAME between", value1, value2, "roomName");
            return (Criteria) this;
        }

        public Criteria andRoomNameNotBetween(String value1, String value2) {
            addCriterion("ROOM_NAME not between", value1, value2, "roomName");
            return (Criteria) this;
        }

        public Criteria andAbbreviationIsNull() {
            addCriterion("ABBREVIATION is null");
            return (Criteria) this;
        }

        public Criteria andAbbreviationIsNotNull() {
            addCriterion("ABBREVIATION is not null");
            return (Criteria) this;
        }

        public Criteria andAbbreviationEqualTo(String value) {
            addCriterion("ABBREVIATION =", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationNotEqualTo(String value) {
            addCriterion("ABBREVIATION <>", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationGreaterThan(String value) {
            addCriterion("ABBREVIATION >", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationGreaterThanOrEqualTo(String value) {
            addCriterion("ABBREVIATION >=", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationLessThan(String value) {
            addCriterion("ABBREVIATION <", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationLessThanOrEqualTo(String value) {
            addCriterion("ABBREVIATION <=", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationLike(String value) {
            addCriterion("ABBREVIATION like", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationNotLike(String value) {
            addCriterion("ABBREVIATION not like", value, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationIn(List<String> values) {
            addCriterion("ABBREVIATION in", values, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationNotIn(List<String> values) {
            addCriterion("ABBREVIATION not in", values, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationBetween(String value1, String value2) {
            addCriterion("ABBREVIATION between", value1, value2, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andAbbreviationNotBetween(String value1, String value2) {
            addCriterion("ABBREVIATION not between", value1, value2, "abbreviation");
            return (Criteria) this;
        }

        public Criteria andRoomAliasIsNull() {
            addCriterion("ROOM_ALIAS is null");
            return (Criteria) this;
        }

        public Criteria andRoomAliasIsNotNull() {
            addCriterion("ROOM_ALIAS is not null");
            return (Criteria) this;
        }

        public Criteria andRoomAliasEqualTo(String value) {
            addCriterion("ROOM_ALIAS =", value, "roomAlias");
            return (Criteria) this;
        }

        public Criteria andRoomAliasNotEqualTo(String value) {
            addCriterion("ROOM_ALIAS <>", value, "roomAlias");
            return (Criteria) this;
        }

        public Criteria andRoomAliasGreaterThan(String value) {
            addCriterion("ROOM_ALIAS >", value, "roomAlias");
            return (Criteria) this;
        }

        public Criteria andRoomAliasGreaterThanOrEqualTo(String value) {
            addCriterion("ROOM_ALIAS >=", value, "roomAlias");
            return (Criteria) this;
        }

        public Criteria andRoomAliasLessThan(String value) {
            addCriterion("ROOM_ALIAS <", value, "roomAlias");
            return (Criteria) this;
        }

        public Criteria andRoomAliasLessThanOrEqualTo(String value) {
            addCriterion("ROOM_ALIAS <=", value, "roomAlias");
            return (Criteria) this;
        }

        public Criteria andRoomAliasLike(String value) {
            addCriterion("ROOM_ALIAS like", value, "roomAlias");
            return (Criteria) this;
        }

        public Criteria andRoomAliasNotLike(String value) {
            addCriterion("ROOM_ALIAS not like", value, "roomAlias");
            return (Criteria) this;
        }

        public Criteria andRoomAliasIn(List<String> values) {
            addCriterion("ROOM_ALIAS in", values, "roomAlias");
            return (Criteria) this;
        }

        public Criteria andRoomAliasNotIn(List<String> values) {
            addCriterion("ROOM_ALIAS not in", values, "roomAlias");
            return (Criteria) this;
        }

        public Criteria andRoomAliasBetween(String value1, String value2) {
            addCriterion("ROOM_ALIAS between", value1, value2, "roomAlias");
            return (Criteria) this;
        }

        public Criteria andRoomAliasNotBetween(String value1, String value2) {
            addCriterion("ROOM_ALIAS not between", value1, value2, "roomAlias");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIsNull() {
            addCriterion("ROOM_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIsNotNull() {
            addCriterion("ROOM_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeEqualTo(Integer value) {
            addCriterion("ROOM_TYPE =", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotEqualTo(Integer value) {
            addCriterion("ROOM_TYPE <>", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeGreaterThan(Integer value) {
            addCriterion("ROOM_TYPE >", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ROOM_TYPE >=", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeLessThan(Integer value) {
            addCriterion("ROOM_TYPE <", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeLessThanOrEqualTo(Integer value) {
            addCriterion("ROOM_TYPE <=", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIn(List<Integer> values) {
            addCriterion("ROOM_TYPE in", values, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotIn(List<Integer> values) {
            addCriterion("ROOM_TYPE not in", values, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeBetween(Integer value1, Integer value2) {
            addCriterion("ROOM_TYPE between", value1, value2, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("ROOM_TYPE not between", value1, value2, "roomType");
            return (Criteria) this;
        }

        public Criteria andServiceLevelTypeIsNull() {
            addCriterion("SERVICE_LEVEL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andServiceLevelTypeIsNotNull() {
            addCriterion("SERVICE_LEVEL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andServiceLevelTypeEqualTo(Integer value) {
            addCriterion("SERVICE_LEVEL_TYPE =", value, "serviceLevelType");
            return (Criteria) this;
        }

        public Criteria andServiceLevelTypeNotEqualTo(Integer value) {
            addCriterion("SERVICE_LEVEL_TYPE <>", value, "serviceLevelType");
            return (Criteria) this;
        }

        public Criteria andServiceLevelTypeGreaterThan(Integer value) {
            addCriterion("SERVICE_LEVEL_TYPE >", value, "serviceLevelType");
            return (Criteria) this;
        }

        public Criteria andServiceLevelTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("SERVICE_LEVEL_TYPE >=", value, "serviceLevelType");
            return (Criteria) this;
        }

        public Criteria andServiceLevelTypeLessThan(Integer value) {
            addCriterion("SERVICE_LEVEL_TYPE <", value, "serviceLevelType");
            return (Criteria) this;
        }

        public Criteria andServiceLevelTypeLessThanOrEqualTo(Integer value) {
            addCriterion("SERVICE_LEVEL_TYPE <=", value, "serviceLevelType");
            return (Criteria) this;
        }

        public Criteria andServiceLevelTypeIn(List<Integer> values) {
            addCriterion("SERVICE_LEVEL_TYPE in", values, "serviceLevelType");
            return (Criteria) this;
        }

        public Criteria andServiceLevelTypeNotIn(List<Integer> values) {
            addCriterion("SERVICE_LEVEL_TYPE not in", values, "serviceLevelType");
            return (Criteria) this;
        }

        public Criteria andServiceLevelTypeBetween(Integer value1, Integer value2) {
            addCriterion("SERVICE_LEVEL_TYPE between", value1, value2, "serviceLevelType");
            return (Criteria) this;
        }

        public Criteria andServiceLevelTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("SERVICE_LEVEL_TYPE not between", value1, value2, "serviceLevelType");
            return (Criteria) this;
        }

        public Criteria andSiteIdIsNull() {
            addCriterion("SITE_ID is null");
            return (Criteria) this;
        }

        public Criteria andSiteIdIsNotNull() {
            addCriterion("SITE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSiteIdEqualTo(Integer value) {
            addCriterion("SITE_ID =", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotEqualTo(Integer value) {
            addCriterion("SITE_ID <>", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdGreaterThan(Integer value) {
            addCriterion("SITE_ID >", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SITE_ID >=", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLessThan(Integer value) {
            addCriterion("SITE_ID <", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLessThanOrEqualTo(Integer value) {
            addCriterion("SITE_ID <=", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdIn(List<Integer> values) {
            addCriterion("SITE_ID in", values, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotIn(List<Integer> values) {
            addCriterion("SITE_ID not in", values, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdBetween(Integer value1, Integer value2) {
            addCriterion("SITE_ID between", value1, value2, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SITE_ID not between", value1, value2, "siteId");
            return (Criteria) this;
        }

        public Criteria andFloorNumberIsNull() {
            addCriterion("FLOOR_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andFloorNumberIsNotNull() {
            addCriterion("FLOOR_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andFloorNumberEqualTo(Integer value) {
            addCriterion("FLOOR_NUMBER =", value, "floorNumber");
            return (Criteria) this;
        }

        public Criteria andFloorNumberNotEqualTo(Integer value) {
            addCriterion("FLOOR_NUMBER <>", value, "floorNumber");
            return (Criteria) this;
        }

        public Criteria andFloorNumberGreaterThan(Integer value) {
            addCriterion("FLOOR_NUMBER >", value, "floorNumber");
            return (Criteria) this;
        }

        public Criteria andFloorNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("FLOOR_NUMBER >=", value, "floorNumber");
            return (Criteria) this;
        }

        public Criteria andFloorNumberLessThan(Integer value) {
            addCriterion("FLOOR_NUMBER <", value, "floorNumber");
            return (Criteria) this;
        }

        public Criteria andFloorNumberLessThanOrEqualTo(Integer value) {
            addCriterion("FLOOR_NUMBER <=", value, "floorNumber");
            return (Criteria) this;
        }

        public Criteria andFloorNumberIn(List<Integer> values) {
            addCriterion("FLOOR_NUMBER in", values, "floorNumber");
            return (Criteria) this;
        }

        public Criteria andFloorNumberNotIn(List<Integer> values) {
            addCriterion("FLOOR_NUMBER not in", values, "floorNumber");
            return (Criteria) this;
        }

        public Criteria andFloorNumberBetween(Integer value1, Integer value2) {
            addCriterion("FLOOR_NUMBER between", value1, value2, "floorNumber");
            return (Criteria) this;
        }

        public Criteria andFloorNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("FLOOR_NUMBER not between", value1, value2, "floorNumber");
            return (Criteria) this;
        }

        public Criteria andRoomLengthIsNull() {
            addCriterion("ROOM_LENGTH is null");
            return (Criteria) this;
        }

        public Criteria andRoomLengthIsNotNull() {
            addCriterion("ROOM_LENGTH is not null");
            return (Criteria) this;
        }

        public Criteria andRoomLengthEqualTo(Float value) {
            addCriterion("ROOM_LENGTH =", value, "roomLength");
            return (Criteria) this;
        }

        public Criteria andRoomLengthNotEqualTo(Float value) {
            addCriterion("ROOM_LENGTH <>", value, "roomLength");
            return (Criteria) this;
        }

        public Criteria andRoomLengthGreaterThan(Float value) {
            addCriterion("ROOM_LENGTH >", value, "roomLength");
            return (Criteria) this;
        }

        public Criteria andRoomLengthGreaterThanOrEqualTo(Float value) {
            addCriterion("ROOM_LENGTH >=", value, "roomLength");
            return (Criteria) this;
        }

        public Criteria andRoomLengthLessThan(Float value) {
            addCriterion("ROOM_LENGTH <", value, "roomLength");
            return (Criteria) this;
        }

        public Criteria andRoomLengthLessThanOrEqualTo(Float value) {
            addCriterion("ROOM_LENGTH <=", value, "roomLength");
            return (Criteria) this;
        }

        public Criteria andRoomLengthIn(List<Float> values) {
            addCriterion("ROOM_LENGTH in", values, "roomLength");
            return (Criteria) this;
        }

        public Criteria andRoomLengthNotIn(List<Float> values) {
            addCriterion("ROOM_LENGTH not in", values, "roomLength");
            return (Criteria) this;
        }

        public Criteria andRoomLengthBetween(Float value1, Float value2) {
            addCriterion("ROOM_LENGTH between", value1, value2, "roomLength");
            return (Criteria) this;
        }

        public Criteria andRoomLengthNotBetween(Float value1, Float value2) {
            addCriterion("ROOM_LENGTH not between", value1, value2, "roomLength");
            return (Criteria) this;
        }

        public Criteria andRoomHeightIsNull() {
            addCriterion("ROOM_HEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andRoomHeightIsNotNull() {
            addCriterion("ROOM_HEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andRoomHeightEqualTo(Float value) {
            addCriterion("ROOM_HEIGHT =", value, "roomHeight");
            return (Criteria) this;
        }

        public Criteria andRoomHeightNotEqualTo(Float value) {
            addCriterion("ROOM_HEIGHT <>", value, "roomHeight");
            return (Criteria) this;
        }

        public Criteria andRoomHeightGreaterThan(Float value) {
            addCriterion("ROOM_HEIGHT >", value, "roomHeight");
            return (Criteria) this;
        }

        public Criteria andRoomHeightGreaterThanOrEqualTo(Float value) {
            addCriterion("ROOM_HEIGHT >=", value, "roomHeight");
            return (Criteria) this;
        }

        public Criteria andRoomHeightLessThan(Float value) {
            addCriterion("ROOM_HEIGHT <", value, "roomHeight");
            return (Criteria) this;
        }

        public Criteria andRoomHeightLessThanOrEqualTo(Float value) {
            addCriterion("ROOM_HEIGHT <=", value, "roomHeight");
            return (Criteria) this;
        }

        public Criteria andRoomHeightIn(List<Float> values) {
            addCriterion("ROOM_HEIGHT in", values, "roomHeight");
            return (Criteria) this;
        }

        public Criteria andRoomHeightNotIn(List<Float> values) {
            addCriterion("ROOM_HEIGHT not in", values, "roomHeight");
            return (Criteria) this;
        }

        public Criteria andRoomHeightBetween(Float value1, Float value2) {
            addCriterion("ROOM_HEIGHT between", value1, value2, "roomHeight");
            return (Criteria) this;
        }

        public Criteria andRoomHeightNotBetween(Float value1, Float value2) {
            addCriterion("ROOM_HEIGHT not between", value1, value2, "roomHeight");
            return (Criteria) this;
        }

        public Criteria andRoomWidthIsNull() {
            addCriterion("ROOM_WIDTH is null");
            return (Criteria) this;
        }

        public Criteria andRoomWidthIsNotNull() {
            addCriterion("ROOM_WIDTH is not null");
            return (Criteria) this;
        }

        public Criteria andRoomWidthEqualTo(Float value) {
            addCriterion("ROOM_WIDTH =", value, "roomWidth");
            return (Criteria) this;
        }

        public Criteria andRoomWidthNotEqualTo(Float value) {
            addCriterion("ROOM_WIDTH <>", value, "roomWidth");
            return (Criteria) this;
        }

        public Criteria andRoomWidthGreaterThan(Float value) {
            addCriterion("ROOM_WIDTH >", value, "roomWidth");
            return (Criteria) this;
        }

        public Criteria andRoomWidthGreaterThanOrEqualTo(Float value) {
            addCriterion("ROOM_WIDTH >=", value, "roomWidth");
            return (Criteria) this;
        }

        public Criteria andRoomWidthLessThan(Float value) {
            addCriterion("ROOM_WIDTH <", value, "roomWidth");
            return (Criteria) this;
        }

        public Criteria andRoomWidthLessThanOrEqualTo(Float value) {
            addCriterion("ROOM_WIDTH <=", value, "roomWidth");
            return (Criteria) this;
        }

        public Criteria andRoomWidthIn(List<Float> values) {
            addCriterion("ROOM_WIDTH in", values, "roomWidth");
            return (Criteria) this;
        }

        public Criteria andRoomWidthNotIn(List<Float> values) {
            addCriterion("ROOM_WIDTH not in", values, "roomWidth");
            return (Criteria) this;
        }

        public Criteria andRoomWidthBetween(Float value1, Float value2) {
            addCriterion("ROOM_WIDTH between", value1, value2, "roomWidth");
            return (Criteria) this;
        }

        public Criteria andRoomWidthNotBetween(Float value1, Float value2) {
            addCriterion("ROOM_WIDTH not between", value1, value2, "roomWidth");
            return (Criteria) this;
        }

        public Criteria andRowStartNumIsNull() {
            addCriterion("ROW_START_NUM is null");
            return (Criteria) this;
        }

        public Criteria andRowStartNumIsNotNull() {
            addCriterion("ROW_START_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andRowStartNumEqualTo(Integer value) {
            addCriterion("ROW_START_NUM =", value, "rowStartNum");
            return (Criteria) this;
        }

        public Criteria andRowStartNumNotEqualTo(Integer value) {
            addCriterion("ROW_START_NUM <>", value, "rowStartNum");
            return (Criteria) this;
        }

        public Criteria andRowStartNumGreaterThan(Integer value) {
            addCriterion("ROW_START_NUM >", value, "rowStartNum");
            return (Criteria) this;
        }

        public Criteria andRowStartNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("ROW_START_NUM >=", value, "rowStartNum");
            return (Criteria) this;
        }

        public Criteria andRowStartNumLessThan(Integer value) {
            addCriterion("ROW_START_NUM <", value, "rowStartNum");
            return (Criteria) this;
        }

        public Criteria andRowStartNumLessThanOrEqualTo(Integer value) {
            addCriterion("ROW_START_NUM <=", value, "rowStartNum");
            return (Criteria) this;
        }

        public Criteria andRowStartNumIn(List<Integer> values) {
            addCriterion("ROW_START_NUM in", values, "rowStartNum");
            return (Criteria) this;
        }

        public Criteria andRowStartNumNotIn(List<Integer> values) {
            addCriterion("ROW_START_NUM not in", values, "rowStartNum");
            return (Criteria) this;
        }

        public Criteria andRowStartNumBetween(Integer value1, Integer value2) {
            addCriterion("ROW_START_NUM between", value1, value2, "rowStartNum");
            return (Criteria) this;
        }

        public Criteria andRowStartNumNotBetween(Integer value1, Integer value2) {
            addCriterion("ROW_START_NUM not between", value1, value2, "rowStartNum");
            return (Criteria) this;
        }

        public Criteria andRowEndNumIsNull() {
            addCriterion("ROW_END_NUM is null");
            return (Criteria) this;
        }

        public Criteria andRowEndNumIsNotNull() {
            addCriterion("ROW_END_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andRowEndNumEqualTo(Integer value) {
            addCriterion("ROW_END_NUM =", value, "rowEndNum");
            return (Criteria) this;
        }

        public Criteria andRowEndNumNotEqualTo(Integer value) {
            addCriterion("ROW_END_NUM <>", value, "rowEndNum");
            return (Criteria) this;
        }

        public Criteria andRowEndNumGreaterThan(Integer value) {
            addCriterion("ROW_END_NUM >", value, "rowEndNum");
            return (Criteria) this;
        }

        public Criteria andRowEndNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("ROW_END_NUM >=", value, "rowEndNum");
            return (Criteria) this;
        }

        public Criteria andRowEndNumLessThan(Integer value) {
            addCriterion("ROW_END_NUM <", value, "rowEndNum");
            return (Criteria) this;
        }

        public Criteria andRowEndNumLessThanOrEqualTo(Integer value) {
            addCriterion("ROW_END_NUM <=", value, "rowEndNum");
            return (Criteria) this;
        }

        public Criteria andRowEndNumIn(List<Integer> values) {
            addCriterion("ROW_END_NUM in", values, "rowEndNum");
            return (Criteria) this;
        }

        public Criteria andRowEndNumNotIn(List<Integer> values) {
            addCriterion("ROW_END_NUM not in", values, "rowEndNum");
            return (Criteria) this;
        }

        public Criteria andRowEndNumBetween(Integer value1, Integer value2) {
            addCriterion("ROW_END_NUM between", value1, value2, "rowEndNum");
            return (Criteria) this;
        }

        public Criteria andRowEndNumNotBetween(Integer value1, Integer value2) {
            addCriterion("ROW_END_NUM not between", value1, value2, "rowEndNum");
            return (Criteria) this;
        }

        public Criteria andColStartNumIsNull() {
            addCriterion("COL_START_NUM is null");
            return (Criteria) this;
        }

        public Criteria andColStartNumIsNotNull() {
            addCriterion("COL_START_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andColStartNumEqualTo(Integer value) {
            addCriterion("COL_START_NUM =", value, "colStartNum");
            return (Criteria) this;
        }

        public Criteria andColStartNumNotEqualTo(Integer value) {
            addCriterion("COL_START_NUM <>", value, "colStartNum");
            return (Criteria) this;
        }

        public Criteria andColStartNumGreaterThan(Integer value) {
            addCriterion("COL_START_NUM >", value, "colStartNum");
            return (Criteria) this;
        }

        public Criteria andColStartNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("COL_START_NUM >=", value, "colStartNum");
            return (Criteria) this;
        }

        public Criteria andColStartNumLessThan(Integer value) {
            addCriterion("COL_START_NUM <", value, "colStartNum");
            return (Criteria) this;
        }

        public Criteria andColStartNumLessThanOrEqualTo(Integer value) {
            addCriterion("COL_START_NUM <=", value, "colStartNum");
            return (Criteria) this;
        }

        public Criteria andColStartNumIn(List<Integer> values) {
            addCriterion("COL_START_NUM in", values, "colStartNum");
            return (Criteria) this;
        }

        public Criteria andColStartNumNotIn(List<Integer> values) {
            addCriterion("COL_START_NUM not in", values, "colStartNum");
            return (Criteria) this;
        }

        public Criteria andColStartNumBetween(Integer value1, Integer value2) {
            addCriterion("COL_START_NUM between", value1, value2, "colStartNum");
            return (Criteria) this;
        }

        public Criteria andColStartNumNotBetween(Integer value1, Integer value2) {
            addCriterion("COL_START_NUM not between", value1, value2, "colStartNum");
            return (Criteria) this;
        }

        public Criteria andColEndNumIsNull() {
            addCriterion("COL_END_NUM is null");
            return (Criteria) this;
        }

        public Criteria andColEndNumIsNotNull() {
            addCriterion("COL_END_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andColEndNumEqualTo(Integer value) {
            addCriterion("COL_END_NUM =", value, "colEndNum");
            return (Criteria) this;
        }

        public Criteria andColEndNumNotEqualTo(Integer value) {
            addCriterion("COL_END_NUM <>", value, "colEndNum");
            return (Criteria) this;
        }

        public Criteria andColEndNumGreaterThan(Integer value) {
            addCriterion("COL_END_NUM >", value, "colEndNum");
            return (Criteria) this;
        }

        public Criteria andColEndNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("COL_END_NUM >=", value, "colEndNum");
            return (Criteria) this;
        }

        public Criteria andColEndNumLessThan(Integer value) {
            addCriterion("COL_END_NUM <", value, "colEndNum");
            return (Criteria) this;
        }

        public Criteria andColEndNumLessThanOrEqualTo(Integer value) {
            addCriterion("COL_END_NUM <=", value, "colEndNum");
            return (Criteria) this;
        }

        public Criteria andColEndNumIn(List<Integer> values) {
            addCriterion("COL_END_NUM in", values, "colEndNum");
            return (Criteria) this;
        }

        public Criteria andColEndNumNotIn(List<Integer> values) {
            addCriterion("COL_END_NUM not in", values, "colEndNum");
            return (Criteria) this;
        }

        public Criteria andColEndNumBetween(Integer value1, Integer value2) {
            addCriterion("COL_END_NUM between", value1, value2, "colEndNum");
            return (Criteria) this;
        }

        public Criteria andColEndNumNotBetween(Integer value1, Integer value2) {
            addCriterion("COL_END_NUM not between", value1, value2, "colEndNum");
            return (Criteria) this;
        }

        public Criteria andRowDirectionIsNull() {
            addCriterion("ROW_DIRECTION is null");
            return (Criteria) this;
        }

        public Criteria andRowDirectionIsNotNull() {
            addCriterion("ROW_DIRECTION is not null");
            return (Criteria) this;
        }

        public Criteria andRowDirectionEqualTo(Integer value) {
            addCriterion("ROW_DIRECTION =", value, "rowDirection");
            return (Criteria) this;
        }

        public Criteria andRowDirectionNotEqualTo(Integer value) {
            addCriterion("ROW_DIRECTION <>", value, "rowDirection");
            return (Criteria) this;
        }

        public Criteria andRowDirectionGreaterThan(Integer value) {
            addCriterion("ROW_DIRECTION >", value, "rowDirection");
            return (Criteria) this;
        }

        public Criteria andRowDirectionGreaterThanOrEqualTo(Integer value) {
            addCriterion("ROW_DIRECTION >=", value, "rowDirection");
            return (Criteria) this;
        }

        public Criteria andRowDirectionLessThan(Integer value) {
            addCriterion("ROW_DIRECTION <", value, "rowDirection");
            return (Criteria) this;
        }

        public Criteria andRowDirectionLessThanOrEqualTo(Integer value) {
            addCriterion("ROW_DIRECTION <=", value, "rowDirection");
            return (Criteria) this;
        }

        public Criteria andRowDirectionIn(List<Integer> values) {
            addCriterion("ROW_DIRECTION in", values, "rowDirection");
            return (Criteria) this;
        }

        public Criteria andRowDirectionNotIn(List<Integer> values) {
            addCriterion("ROW_DIRECTION not in", values, "rowDirection");
            return (Criteria) this;
        }

        public Criteria andRowDirectionBetween(Integer value1, Integer value2) {
            addCriterion("ROW_DIRECTION between", value1, value2, "rowDirection");
            return (Criteria) this;
        }

        public Criteria andRowDirectionNotBetween(Integer value1, Integer value2) {
            addCriterion("ROW_DIRECTION not between", value1, value2, "rowDirection");
            return (Criteria) this;
        }

        public Criteria andColDirectionIsNull() {
            addCriterion("COL_DIRECTION is null");
            return (Criteria) this;
        }

        public Criteria andColDirectionIsNotNull() {
            addCriterion("COL_DIRECTION is not null");
            return (Criteria) this;
        }

        public Criteria andColDirectionEqualTo(Integer value) {
            addCriterion("COL_DIRECTION =", value, "colDirection");
            return (Criteria) this;
        }

        public Criteria andColDirectionNotEqualTo(Integer value) {
            addCriterion("COL_DIRECTION <>", value, "colDirection");
            return (Criteria) this;
        }

        public Criteria andColDirectionGreaterThan(Integer value) {
            addCriterion("COL_DIRECTION >", value, "colDirection");
            return (Criteria) this;
        }

        public Criteria andColDirectionGreaterThanOrEqualTo(Integer value) {
            addCriterion("COL_DIRECTION >=", value, "colDirection");
            return (Criteria) this;
        }

        public Criteria andColDirectionLessThan(Integer value) {
            addCriterion("COL_DIRECTION <", value, "colDirection");
            return (Criteria) this;
        }

        public Criteria andColDirectionLessThanOrEqualTo(Integer value) {
            addCriterion("COL_DIRECTION <=", value, "colDirection");
            return (Criteria) this;
        }

        public Criteria andColDirectionIn(List<Integer> values) {
            addCriterion("COL_DIRECTION in", values, "colDirection");
            return (Criteria) this;
        }

        public Criteria andColDirectionNotIn(List<Integer> values) {
            addCriterion("COL_DIRECTION not in", values, "colDirection");
            return (Criteria) this;
        }

        public Criteria andColDirectionBetween(Integer value1, Integer value2) {
            addCriterion("COL_DIRECTION between", value1, value2, "colDirection");
            return (Criteria) this;
        }

        public Criteria andColDirectionNotBetween(Integer value1, Integer value2) {
            addCriterion("COL_DIRECTION not between", value1, value2, "colDirection");
            return (Criteria) this;
        }

        public Criteria andIsAltogetherIsNull() {
            addCriterion("IS_ALTOGETHER is null");
            return (Criteria) this;
        }

        public Criteria andIsAltogetherIsNotNull() {
            addCriterion("IS_ALTOGETHER is not null");
            return (Criteria) this;
        }

        public Criteria andIsAltogetherEqualTo(Boolean value) {
            addCriterion("IS_ALTOGETHER =", value, "isAltogether");
            return (Criteria) this;
        }

        public Criteria andIsAltogetherNotEqualTo(Boolean value) {
            addCriterion("IS_ALTOGETHER <>", value, "isAltogether");
            return (Criteria) this;
        }

        public Criteria andIsAltogetherGreaterThan(Boolean value) {
            addCriterion("IS_ALTOGETHER >", value, "isAltogether");
            return (Criteria) this;
        }

        public Criteria andIsAltogetherGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IS_ALTOGETHER >=", value, "isAltogether");
            return (Criteria) this;
        }

        public Criteria andIsAltogetherLessThan(Boolean value) {
            addCriterion("IS_ALTOGETHER <", value, "isAltogether");
            return (Criteria) this;
        }

        public Criteria andIsAltogetherLessThanOrEqualTo(Boolean value) {
            addCriterion("IS_ALTOGETHER <=", value, "isAltogether");
            return (Criteria) this;
        }

        public Criteria andIsAltogetherIn(List<Boolean> values) {
            addCriterion("IS_ALTOGETHER in", values, "isAltogether");
            return (Criteria) this;
        }

        public Criteria andIsAltogetherNotIn(List<Boolean> values) {
            addCriterion("IS_ALTOGETHER not in", values, "isAltogether");
            return (Criteria) this;
        }

        public Criteria andIsAltogetherBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_ALTOGETHER between", value1, value2, "isAltogether");
            return (Criteria) this;
        }

        public Criteria andIsAltogetherNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_ALTOGETHER not between", value1, value2, "isAltogether");
            return (Criteria) this;
        }

        public Criteria andAltogetherUnitIsNull() {
            addCriterion("ALTOGETHER_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andAltogetherUnitIsNotNull() {
            addCriterion("ALTOGETHER_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andAltogetherUnitEqualTo(String value) {
            addCriterion("ALTOGETHER_UNIT =", value, "altogetherUnit");
            return (Criteria) this;
        }

        public Criteria andAltogetherUnitNotEqualTo(String value) {
            addCriterion("ALTOGETHER_UNIT <>", value, "altogetherUnit");
            return (Criteria) this;
        }

        public Criteria andAltogetherUnitGreaterThan(String value) {
            addCriterion("ALTOGETHER_UNIT >", value, "altogetherUnit");
            return (Criteria) this;
        }

        public Criteria andAltogetherUnitGreaterThanOrEqualTo(String value) {
            addCriterion("ALTOGETHER_UNIT >=", value, "altogetherUnit");
            return (Criteria) this;
        }

        public Criteria andAltogetherUnitLessThan(String value) {
            addCriterion("ALTOGETHER_UNIT <", value, "altogetherUnit");
            return (Criteria) this;
        }

        public Criteria andAltogetherUnitLessThanOrEqualTo(String value) {
            addCriterion("ALTOGETHER_UNIT <=", value, "altogetherUnit");
            return (Criteria) this;
        }

        public Criteria andAltogetherUnitLike(String value) {
            addCriterion("ALTOGETHER_UNIT like", value, "altogetherUnit");
            return (Criteria) this;
        }

        public Criteria andAltogetherUnitNotLike(String value) {
            addCriterion("ALTOGETHER_UNIT not like", value, "altogetherUnit");
            return (Criteria) this;
        }

        public Criteria andAltogetherUnitIn(List<String> values) {
            addCriterion("ALTOGETHER_UNIT in", values, "altogetherUnit");
            return (Criteria) this;
        }

        public Criteria andAltogetherUnitNotIn(List<String> values) {
            addCriterion("ALTOGETHER_UNIT not in", values, "altogetherUnit");
            return (Criteria) this;
        }

        public Criteria andAltogetherUnitBetween(String value1, String value2) {
            addCriterion("ALTOGETHER_UNIT between", value1, value2, "altogetherUnit");
            return (Criteria) this;
        }

        public Criteria andAltogetherUnitNotBetween(String value1, String value2) {
            addCriterion("ALTOGETHER_UNIT not between", value1, value2, "altogetherUnit");
            return (Criteria) this;
        }

        public Criteria andIsSharingIsNull() {
            addCriterion("IS_SHARING is null");
            return (Criteria) this;
        }

        public Criteria andIsSharingIsNotNull() {
            addCriterion("IS_SHARING is not null");
            return (Criteria) this;
        }

        public Criteria andIsSharingEqualTo(Boolean value) {
            addCriterion("IS_SHARING =", value, "isSharing");
            return (Criteria) this;
        }

        public Criteria andIsSharingNotEqualTo(Boolean value) {
            addCriterion("IS_SHARING <>", value, "isSharing");
            return (Criteria) this;
        }

        public Criteria andIsSharingGreaterThan(Boolean value) {
            addCriterion("IS_SHARING >", value, "isSharing");
            return (Criteria) this;
        }

        public Criteria andIsSharingGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IS_SHARING >=", value, "isSharing");
            return (Criteria) this;
        }

        public Criteria andIsSharingLessThan(Boolean value) {
            addCriterion("IS_SHARING <", value, "isSharing");
            return (Criteria) this;
        }

        public Criteria andIsSharingLessThanOrEqualTo(Boolean value) {
            addCriterion("IS_SHARING <=", value, "isSharing");
            return (Criteria) this;
        }

        public Criteria andIsSharingIn(List<Boolean> values) {
            addCriterion("IS_SHARING in", values, "isSharing");
            return (Criteria) this;
        }

        public Criteria andIsSharingNotIn(List<Boolean> values) {
            addCriterion("IS_SHARING not in", values, "isSharing");
            return (Criteria) this;
        }

        public Criteria andIsSharingBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_SHARING between", value1, value2, "isSharing");
            return (Criteria) this;
        }

        public Criteria andIsSharingNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_SHARING not between", value1, value2, "isSharing");
            return (Criteria) this;
        }

        public Criteria andSharingUnitIsNull() {
            addCriterion("SHARING_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andSharingUnitIsNotNull() {
            addCriterion("SHARING_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andSharingUnitEqualTo(String value) {
            addCriterion("SHARING_UNIT =", value, "sharingUnit");
            return (Criteria) this;
        }

        public Criteria andSharingUnitNotEqualTo(String value) {
            addCriterion("SHARING_UNIT <>", value, "sharingUnit");
            return (Criteria) this;
        }

        public Criteria andSharingUnitGreaterThan(String value) {
            addCriterion("SHARING_UNIT >", value, "sharingUnit");
            return (Criteria) this;
        }

        public Criteria andSharingUnitGreaterThanOrEqualTo(String value) {
            addCriterion("SHARING_UNIT >=", value, "sharingUnit");
            return (Criteria) this;
        }

        public Criteria andSharingUnitLessThan(String value) {
            addCriterion("SHARING_UNIT <", value, "sharingUnit");
            return (Criteria) this;
        }

        public Criteria andSharingUnitLessThanOrEqualTo(String value) {
            addCriterion("SHARING_UNIT <=", value, "sharingUnit");
            return (Criteria) this;
        }

        public Criteria andSharingUnitLike(String value) {
            addCriterion("SHARING_UNIT like", value, "sharingUnit");
            return (Criteria) this;
        }

        public Criteria andSharingUnitNotLike(String value) {
            addCriterion("SHARING_UNIT not like", value, "sharingUnit");
            return (Criteria) this;
        }

        public Criteria andSharingUnitIn(List<String> values) {
            addCriterion("SHARING_UNIT in", values, "sharingUnit");
            return (Criteria) this;
        }

        public Criteria andSharingUnitNotIn(List<String> values) {
            addCriterion("SHARING_UNIT not in", values, "sharingUnit");
            return (Criteria) this;
        }

        public Criteria andSharingUnitBetween(String value1, String value2) {
            addCriterion("SHARING_UNIT between", value1, value2, "sharingUnit");
            return (Criteria) this;
        }

        public Criteria andSharingUnitNotBetween(String value1, String value2) {
            addCriterion("SHARING_UNIT not between", value1, value2, "sharingUnit");
            return (Criteria) this;
        }

        public Criteria andRoomNoteIsNull() {
            addCriterion("ROOM_NOTE is null");
            return (Criteria) this;
        }

        public Criteria andRoomNoteIsNotNull() {
            addCriterion("ROOM_NOTE is not null");
            return (Criteria) this;
        }

        public Criteria andRoomNoteEqualTo(String value) {
            addCriterion("ROOM_NOTE =", value, "roomNote");
            return (Criteria) this;
        }

        public Criteria andRoomNoteNotEqualTo(String value) {
            addCriterion("ROOM_NOTE <>", value, "roomNote");
            return (Criteria) this;
        }

        public Criteria andRoomNoteGreaterThan(String value) {
            addCriterion("ROOM_NOTE >", value, "roomNote");
            return (Criteria) this;
        }

        public Criteria andRoomNoteGreaterThanOrEqualTo(String value) {
            addCriterion("ROOM_NOTE >=", value, "roomNote");
            return (Criteria) this;
        }

        public Criteria andRoomNoteLessThan(String value) {
            addCriterion("ROOM_NOTE <", value, "roomNote");
            return (Criteria) this;
        }

        public Criteria andRoomNoteLessThanOrEqualTo(String value) {
            addCriterion("ROOM_NOTE <=", value, "roomNote");
            return (Criteria) this;
        }

        public Criteria andRoomNoteLike(String value) {
            addCriterion("ROOM_NOTE like", value, "roomNote");
            return (Criteria) this;
        }

        public Criteria andRoomNoteNotLike(String value) {
            addCriterion("ROOM_NOTE not like", value, "roomNote");
            return (Criteria) this;
        }

        public Criteria andRoomNoteIn(List<String> values) {
            addCriterion("ROOM_NOTE in", values, "roomNote");
            return (Criteria) this;
        }

        public Criteria andRoomNoteNotIn(List<String> values) {
            addCriterion("ROOM_NOTE not in", values, "roomNote");
            return (Criteria) this;
        }

        public Criteria andRoomNoteBetween(String value1, String value2) {
            addCriterion("ROOM_NOTE between", value1, value2, "roomNote");
            return (Criteria) this;
        }

        public Criteria andRoomNoteNotBetween(String value1, String value2) {
            addCriterion("ROOM_NOTE not between", value1, value2, "roomNote");
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