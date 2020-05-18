package com.yaao.ps10.base.model;

import java.util.ArrayList;
import java.util.List;

public class SiteTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SiteTableExample() {
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

        public Criteria andSiteNameIsNull() {
            addCriterion("SITE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSiteNameIsNotNull() {
            addCriterion("SITE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSiteNameEqualTo(String value) {
            addCriterion("SITE_NAME =", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameNotEqualTo(String value) {
            addCriterion("SITE_NAME <>", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameGreaterThan(String value) {
            addCriterion("SITE_NAME >", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameGreaterThanOrEqualTo(String value) {
            addCriterion("SITE_NAME >=", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameLessThan(String value) {
            addCriterion("SITE_NAME <", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameLessThanOrEqualTo(String value) {
            addCriterion("SITE_NAME <=", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameLike(String value) {
            addCriterion("SITE_NAME like", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameNotLike(String value) {
            addCriterion("SITE_NAME not like", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameIn(List<String> values) {
            addCriterion("SITE_NAME in", values, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameNotIn(List<String> values) {
            addCriterion("SITE_NAME not in", values, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameBetween(String value1, String value2) {
            addCriterion("SITE_NAME between", value1, value2, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameNotBetween(String value1, String value2) {
            addCriterion("SITE_NAME not between", value1, value2, "siteName");
            return (Criteria) this;
        }

        public Criteria andSpellabbreviationIsNull() {
            addCriterion("SPELLABBREVIATION is null");
            return (Criteria) this;
        }

        public Criteria andSpellabbreviationIsNotNull() {
            addCriterion("SPELLABBREVIATION is not null");
            return (Criteria) this;
        }

        public Criteria andSpellabbreviationEqualTo(String value) {
            addCriterion("SPELLABBREVIATION =", value, "spellabbreviation");
            return (Criteria) this;
        }

        public Criteria andSpellabbreviationNotEqualTo(String value) {
            addCriterion("SPELLABBREVIATION <>", value, "spellabbreviation");
            return (Criteria) this;
        }

        public Criteria andSpellabbreviationGreaterThan(String value) {
            addCriterion("SPELLABBREVIATION >", value, "spellabbreviation");
            return (Criteria) this;
        }

        public Criteria andSpellabbreviationGreaterThanOrEqualTo(String value) {
            addCriterion("SPELLABBREVIATION >=", value, "spellabbreviation");
            return (Criteria) this;
        }

        public Criteria andSpellabbreviationLessThan(String value) {
            addCriterion("SPELLABBREVIATION <", value, "spellabbreviation");
            return (Criteria) this;
        }

        public Criteria andSpellabbreviationLessThanOrEqualTo(String value) {
            addCriterion("SPELLABBREVIATION <=", value, "spellabbreviation");
            return (Criteria) this;
        }

        public Criteria andSpellabbreviationLike(String value) {
            addCriterion("SPELLABBREVIATION like", value, "spellabbreviation");
            return (Criteria) this;
        }

        public Criteria andSpellabbreviationNotLike(String value) {
            addCriterion("SPELLABBREVIATION not like", value, "spellabbreviation");
            return (Criteria) this;
        }

        public Criteria andSpellabbreviationIn(List<String> values) {
            addCriterion("SPELLABBREVIATION in", values, "spellabbreviation");
            return (Criteria) this;
        }

        public Criteria andSpellabbreviationNotIn(List<String> values) {
            addCriterion("SPELLABBREVIATION not in", values, "spellabbreviation");
            return (Criteria) this;
        }

        public Criteria andSpellabbreviationBetween(String value1, String value2) {
            addCriterion("SPELLABBREVIATION between", value1, value2, "spellabbreviation");
            return (Criteria) this;
        }

        public Criteria andSpellabbreviationNotBetween(String value1, String value2) {
            addCriterion("SPELLABBREVIATION not between", value1, value2, "spellabbreviation");
            return (Criteria) this;
        }

        public Criteria andSiteAliasIsNull() {
            addCriterion("SITE_ALIAS is null");
            return (Criteria) this;
        }

        public Criteria andSiteAliasIsNotNull() {
            addCriterion("SITE_ALIAS is not null");
            return (Criteria) this;
        }

        public Criteria andSiteAliasEqualTo(String value) {
            addCriterion("SITE_ALIAS =", value, "siteAlias");
            return (Criteria) this;
        }

        public Criteria andSiteAliasNotEqualTo(String value) {
            addCriterion("SITE_ALIAS <>", value, "siteAlias");
            return (Criteria) this;
        }

        public Criteria andSiteAliasGreaterThan(String value) {
            addCriterion("SITE_ALIAS >", value, "siteAlias");
            return (Criteria) this;
        }

        public Criteria andSiteAliasGreaterThanOrEqualTo(String value) {
            addCriterion("SITE_ALIAS >=", value, "siteAlias");
            return (Criteria) this;
        }

        public Criteria andSiteAliasLessThan(String value) {
            addCriterion("SITE_ALIAS <", value, "siteAlias");
            return (Criteria) this;
        }

        public Criteria andSiteAliasLessThanOrEqualTo(String value) {
            addCriterion("SITE_ALIAS <=", value, "siteAlias");
            return (Criteria) this;
        }

        public Criteria andSiteAliasLike(String value) {
            addCriterion("SITE_ALIAS like", value, "siteAlias");
            return (Criteria) this;
        }

        public Criteria andSiteAliasNotLike(String value) {
            addCriterion("SITE_ALIAS not like", value, "siteAlias");
            return (Criteria) this;
        }

        public Criteria andSiteAliasIn(List<String> values) {
            addCriterion("SITE_ALIAS in", values, "siteAlias");
            return (Criteria) this;
        }

        public Criteria andSiteAliasNotIn(List<String> values) {
            addCriterion("SITE_ALIAS not in", values, "siteAlias");
            return (Criteria) this;
        }

        public Criteria andSiteAliasBetween(String value1, String value2) {
            addCriterion("SITE_ALIAS between", value1, value2, "siteAlias");
            return (Criteria) this;
        }

        public Criteria andSiteAliasNotBetween(String value1, String value2) {
            addCriterion("SITE_ALIAS not between", value1, value2, "siteAlias");
            return (Criteria) this;
        }

        public Criteria andSitecodingIsNull() {
            addCriterion("SITECODING is null");
            return (Criteria) this;
        }

        public Criteria andSitecodingIsNotNull() {
            addCriterion("SITECODING is not null");
            return (Criteria) this;
        }

        public Criteria andSitecodingEqualTo(String value) {
            addCriterion("SITECODING =", value, "sitecoding");
            return (Criteria) this;
        }

        public Criteria andSitecodingNotEqualTo(String value) {
            addCriterion("SITECODING <>", value, "sitecoding");
            return (Criteria) this;
        }

        public Criteria andSitecodingGreaterThan(String value) {
            addCriterion("SITECODING >", value, "sitecoding");
            return (Criteria) this;
        }

        public Criteria andSitecodingGreaterThanOrEqualTo(String value) {
            addCriterion("SITECODING >=", value, "sitecoding");
            return (Criteria) this;
        }

        public Criteria andSitecodingLessThan(String value) {
            addCriterion("SITECODING <", value, "sitecoding");
            return (Criteria) this;
        }

        public Criteria andSitecodingLessThanOrEqualTo(String value) {
            addCriterion("SITECODING <=", value, "sitecoding");
            return (Criteria) this;
        }

        public Criteria andSitecodingLike(String value) {
            addCriterion("SITECODING like", value, "sitecoding");
            return (Criteria) this;
        }

        public Criteria andSitecodingNotLike(String value) {
            addCriterion("SITECODING not like", value, "sitecoding");
            return (Criteria) this;
        }

        public Criteria andSitecodingIn(List<String> values) {
            addCriterion("SITECODING in", values, "sitecoding");
            return (Criteria) this;
        }

        public Criteria andSitecodingNotIn(List<String> values) {
            addCriterion("SITECODING not in", values, "sitecoding");
            return (Criteria) this;
        }

        public Criteria andSitecodingBetween(String value1, String value2) {
            addCriterion("SITECODING between", value1, value2, "sitecoding");
            return (Criteria) this;
        }

        public Criteria andSitecodingNotBetween(String value1, String value2) {
            addCriterion("SITECODING not between", value1, value2, "sitecoding");
            return (Criteria) this;
        }

        public Criteria andSiteTypeIsNull() {
            addCriterion("SITE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSiteTypeIsNotNull() {
            addCriterion("SITE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSiteTypeEqualTo(Integer value) {
            addCriterion("SITE_TYPE =", value, "siteType");
            return (Criteria) this;
        }

        public Criteria andSiteTypeNotEqualTo(Integer value) {
            addCriterion("SITE_TYPE <>", value, "siteType");
            return (Criteria) this;
        }

        public Criteria andSiteTypeGreaterThan(Integer value) {
            addCriterion("SITE_TYPE >", value, "siteType");
            return (Criteria) this;
        }

        public Criteria andSiteTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("SITE_TYPE >=", value, "siteType");
            return (Criteria) this;
        }

        public Criteria andSiteTypeLessThan(Integer value) {
            addCriterion("SITE_TYPE <", value, "siteType");
            return (Criteria) this;
        }

        public Criteria andSiteTypeLessThanOrEqualTo(Integer value) {
            addCriterion("SITE_TYPE <=", value, "siteType");
            return (Criteria) this;
        }

        public Criteria andSiteTypeIn(List<Integer> values) {
            addCriterion("SITE_TYPE in", values, "siteType");
            return (Criteria) this;
        }

        public Criteria andSiteTypeNotIn(List<Integer> values) {
            addCriterion("SITE_TYPE not in", values, "siteType");
            return (Criteria) this;
        }

        public Criteria andSiteTypeBetween(Integer value1, Integer value2) {
            addCriterion("SITE_TYPE between", value1, value2, "siteType");
            return (Criteria) this;
        }

        public Criteria andSiteTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("SITE_TYPE not between", value1, value2, "siteType");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNull() {
            addCriterion("AREA_ID is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("AREA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(Integer value) {
            addCriterion("AREA_ID =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(Integer value) {
            addCriterion("AREA_ID <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(Integer value) {
            addCriterion("AREA_ID >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("AREA_ID >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(Integer value) {
            addCriterion("AREA_ID <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(Integer value) {
            addCriterion("AREA_ID <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<Integer> values) {
            addCriterion("AREA_ID in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<Integer> values) {
            addCriterion("AREA_ID not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(Integer value1, Integer value2) {
            addCriterion("AREA_ID between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("AREA_ID not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("LONGITUDE is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("LONGITUDE is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(Double value) {
            addCriterion("LONGITUDE =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(Double value) {
            addCriterion("LONGITUDE <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(Double value) {
            addCriterion("LONGITUDE >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("LONGITUDE >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(Double value) {
            addCriterion("LONGITUDE <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(Double value) {
            addCriterion("LONGITUDE <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<Double> values) {
            addCriterion("LONGITUDE in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<Double> values) {
            addCriterion("LONGITUDE not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(Double value1, Double value2) {
            addCriterion("LONGITUDE between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(Double value1, Double value2) {
            addCriterion("LONGITUDE not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("LATITUDE is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("LATITUDE is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(Double value) {
            addCriterion("LATITUDE =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(Double value) {
            addCriterion("LATITUDE <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(Double value) {
            addCriterion("LATITUDE >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(Double value) {
            addCriterion("LATITUDE >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(Double value) {
            addCriterion("LATITUDE <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(Double value) {
            addCriterion("LATITUDE <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<Double> values) {
            addCriterion("LATITUDE in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<Double> values) {
            addCriterion("LATITUDE not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(Double value1, Double value2) {
            addCriterion("LATITUDE between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(Double value1, Double value2) {
            addCriterion("LATITUDE not between", value1, value2, "latitude");
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

        public Criteria andFloorCountIsNull() {
            addCriterion("FLOOR_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andFloorCountIsNotNull() {
            addCriterion("FLOOR_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andFloorCountEqualTo(Integer value) {
            addCriterion("FLOOR_COUNT =", value, "floorCount");
            return (Criteria) this;
        }

        public Criteria andFloorCountNotEqualTo(Integer value) {
            addCriterion("FLOOR_COUNT <>", value, "floorCount");
            return (Criteria) this;
        }

        public Criteria andFloorCountGreaterThan(Integer value) {
            addCriterion("FLOOR_COUNT >", value, "floorCount");
            return (Criteria) this;
        }

        public Criteria andFloorCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("FLOOR_COUNT >=", value, "floorCount");
            return (Criteria) this;
        }

        public Criteria andFloorCountLessThan(Integer value) {
            addCriterion("FLOOR_COUNT <", value, "floorCount");
            return (Criteria) this;
        }

        public Criteria andFloorCountLessThanOrEqualTo(Integer value) {
            addCriterion("FLOOR_COUNT <=", value, "floorCount");
            return (Criteria) this;
        }

        public Criteria andFloorCountIn(List<Integer> values) {
            addCriterion("FLOOR_COUNT in", values, "floorCount");
            return (Criteria) this;
        }

        public Criteria andFloorCountNotIn(List<Integer> values) {
            addCriterion("FLOOR_COUNT not in", values, "floorCount");
            return (Criteria) this;
        }

        public Criteria andFloorCountBetween(Integer value1, Integer value2) {
            addCriterion("FLOOR_COUNT between", value1, value2, "floorCount");
            return (Criteria) this;
        }

        public Criteria andFloorCountNotBetween(Integer value1, Integer value2) {
            addCriterion("FLOOR_COUNT not between", value1, value2, "floorCount");
            return (Criteria) this;
        }

        public Criteria andStandflagIsNull() {
            addCriterion("StandFlag is null");
            return (Criteria) this;
        }

        public Criteria andStandflagIsNotNull() {
            addCriterion("StandFlag is not null");
            return (Criteria) this;
        }

        public Criteria andStandflagEqualTo(Integer value) {
            addCriterion("StandFlag =", value, "standflag");
            return (Criteria) this;
        }

        public Criteria andStandflagNotEqualTo(Integer value) {
            addCriterion("StandFlag <>", value, "standflag");
            return (Criteria) this;
        }

        public Criteria andStandflagGreaterThan(Integer value) {
            addCriterion("StandFlag >", value, "standflag");
            return (Criteria) this;
        }

        public Criteria andStandflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("StandFlag >=", value, "standflag");
            return (Criteria) this;
        }

        public Criteria andStandflagLessThan(Integer value) {
            addCriterion("StandFlag <", value, "standflag");
            return (Criteria) this;
        }

        public Criteria andStandflagLessThanOrEqualTo(Integer value) {
            addCriterion("StandFlag <=", value, "standflag");
            return (Criteria) this;
        }

        public Criteria andStandflagIn(List<Integer> values) {
            addCriterion("StandFlag in", values, "standflag");
            return (Criteria) this;
        }

        public Criteria andStandflagNotIn(List<Integer> values) {
            addCriterion("StandFlag not in", values, "standflag");
            return (Criteria) this;
        }

        public Criteria andStandflagBetween(Integer value1, Integer value2) {
            addCriterion("StandFlag between", value1, value2, "standflag");
            return (Criteria) this;
        }

        public Criteria andStandflagNotBetween(Integer value1, Integer value2) {
            addCriterion("StandFlag not between", value1, value2, "standflag");
            return (Criteria) this;
        }

        public Criteria andSaveflagIsNull() {
            addCriterion("SaveFlag is null");
            return (Criteria) this;
        }

        public Criteria andSaveflagIsNotNull() {
            addCriterion("SaveFlag is not null");
            return (Criteria) this;
        }

        public Criteria andSaveflagEqualTo(Integer value) {
            addCriterion("SaveFlag =", value, "saveflag");
            return (Criteria) this;
        }

        public Criteria andSaveflagNotEqualTo(Integer value) {
            addCriterion("SaveFlag <>", value, "saveflag");
            return (Criteria) this;
        }

        public Criteria andSaveflagGreaterThan(Integer value) {
            addCriterion("SaveFlag >", value, "saveflag");
            return (Criteria) this;
        }

        public Criteria andSaveflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("SaveFlag >=", value, "saveflag");
            return (Criteria) this;
        }

        public Criteria andSaveflagLessThan(Integer value) {
            addCriterion("SaveFlag <", value, "saveflag");
            return (Criteria) this;
        }

        public Criteria andSaveflagLessThanOrEqualTo(Integer value) {
            addCriterion("SaveFlag <=", value, "saveflag");
            return (Criteria) this;
        }

        public Criteria andSaveflagIn(List<Integer> values) {
            addCriterion("SaveFlag in", values, "saveflag");
            return (Criteria) this;
        }

        public Criteria andSaveflagNotIn(List<Integer> values) {
            addCriterion("SaveFlag not in", values, "saveflag");
            return (Criteria) this;
        }

        public Criteria andSaveflagBetween(Integer value1, Integer value2) {
            addCriterion("SaveFlag between", value1, value2, "saveflag");
            return (Criteria) this;
        }

        public Criteria andSaveflagNotBetween(Integer value1, Integer value2) {
            addCriterion("SaveFlag not between", value1, value2, "saveflag");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
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