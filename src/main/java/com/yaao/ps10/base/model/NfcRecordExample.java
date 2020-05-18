package com.yaao.ps10.base.model;

import java.util.ArrayList;
import java.util.List;

public class NfcRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NfcRecordExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCardnumberIsNull() {
            addCriterion("cardNumber is null");
            return (Criteria) this;
        }

        public Criteria andCardnumberIsNotNull() {
            addCriterion("cardNumber is not null");
            return (Criteria) this;
        }

        public Criteria andCardnumberEqualTo(String value) {
            addCriterion("cardNumber =", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberNotEqualTo(String value) {
            addCriterion("cardNumber <>", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberGreaterThan(String value) {
            addCriterion("cardNumber >", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberGreaterThanOrEqualTo(String value) {
            addCriterion("cardNumber >=", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberLessThan(String value) {
            addCriterion("cardNumber <", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberLessThanOrEqualTo(String value) {
            addCriterion("cardNumber <=", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberLike(String value) {
            addCriterion("cardNumber like", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberNotLike(String value) {
            addCriterion("cardNumber not like", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberIn(List<String> values) {
            addCriterion("cardNumber in", values, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberNotIn(List<String> values) {
            addCriterion("cardNumber not in", values, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberBetween(String value1, String value2) {
            addCriterion("cardNumber between", value1, value2, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberNotBetween(String value1, String value2) {
            addCriterion("cardNumber not between", value1, value2, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("location is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("location is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("location =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("location >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("location <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("location like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("location not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("location in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("location not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andMachineroomidIsNull() {
            addCriterion("machineRoomID is null");
            return (Criteria) this;
        }

        public Criteria andMachineroomidIsNotNull() {
            addCriterion("machineRoomID is not null");
            return (Criteria) this;
        }

        public Criteria andMachineroomidEqualTo(Integer value) {
            addCriterion("machineRoomID =", value, "machineroomid");
            return (Criteria) this;
        }

        public Criteria andMachineroomidNotEqualTo(Integer value) {
            addCriterion("machineRoomID <>", value, "machineroomid");
            return (Criteria) this;
        }

        public Criteria andMachineroomidGreaterThan(Integer value) {
            addCriterion("machineRoomID >", value, "machineroomid");
            return (Criteria) this;
        }

        public Criteria andMachineroomidGreaterThanOrEqualTo(Integer value) {
            addCriterion("machineRoomID >=", value, "machineroomid");
            return (Criteria) this;
        }

        public Criteria andMachineroomidLessThan(Integer value) {
            addCriterion("machineRoomID <", value, "machineroomid");
            return (Criteria) this;
        }

        public Criteria andMachineroomidLessThanOrEqualTo(Integer value) {
            addCriterion("machineRoomID <=", value, "machineroomid");
            return (Criteria) this;
        }

        public Criteria andMachineroomidIn(List<Integer> values) {
            addCriterion("machineRoomID in", values, "machineroomid");
            return (Criteria) this;
        }

        public Criteria andMachineroomidNotIn(List<Integer> values) {
            addCriterion("machineRoomID not in", values, "machineroomid");
            return (Criteria) this;
        }

        public Criteria andMachineroomidBetween(Integer value1, Integer value2) {
            addCriterion("machineRoomID between", value1, value2, "machineroomid");
            return (Criteria) this;
        }

        public Criteria andMachineroomidNotBetween(Integer value1, Integer value2) {
            addCriterion("machineRoomID not between", value1, value2, "machineroomid");
            return (Criteria) this;
        }

        public Criteria andSitenameIsNull() {
            addCriterion("siteName is null");
            return (Criteria) this;
        }

        public Criteria andSitenameIsNotNull() {
            addCriterion("siteName is not null");
            return (Criteria) this;
        }

        public Criteria andSitenameEqualTo(String value) {
            addCriterion("siteName =", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameNotEqualTo(String value) {
            addCriterion("siteName <>", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameGreaterThan(String value) {
            addCriterion("siteName >", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameGreaterThanOrEqualTo(String value) {
            addCriterion("siteName >=", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameLessThan(String value) {
            addCriterion("siteName <", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameLessThanOrEqualTo(String value) {
            addCriterion("siteName <=", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameLike(String value) {
            addCriterion("siteName like", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameNotLike(String value) {
            addCriterion("siteName not like", value, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameIn(List<String> values) {
            addCriterion("siteName in", values, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameNotIn(List<String> values) {
            addCriterion("siteName not in", values, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameBetween(String value1, String value2) {
            addCriterion("siteName between", value1, value2, "sitename");
            return (Criteria) this;
        }

        public Criteria andSitenameNotBetween(String value1, String value2) {
            addCriterion("siteName not between", value1, value2, "sitename");
            return (Criteria) this;
        }

        public Criteria andPicturepathIsNull() {
            addCriterion("picturePath is null");
            return (Criteria) this;
        }

        public Criteria andPicturepathIsNotNull() {
            addCriterion("picturePath is not null");
            return (Criteria) this;
        }

        public Criteria andPicturepathEqualTo(String value) {
            addCriterion("picturePath =", value, "picturepath");
            return (Criteria) this;
        }

        public Criteria andPicturepathNotEqualTo(String value) {
            addCriterion("picturePath <>", value, "picturepath");
            return (Criteria) this;
        }

        public Criteria andPicturepathGreaterThan(String value) {
            addCriterion("picturePath >", value, "picturepath");
            return (Criteria) this;
        }

        public Criteria andPicturepathGreaterThanOrEqualTo(String value) {
            addCriterion("picturePath >=", value, "picturepath");
            return (Criteria) this;
        }

        public Criteria andPicturepathLessThan(String value) {
            addCriterion("picturePath <", value, "picturepath");
            return (Criteria) this;
        }

        public Criteria andPicturepathLessThanOrEqualTo(String value) {
            addCriterion("picturePath <=", value, "picturepath");
            return (Criteria) this;
        }

        public Criteria andPicturepathLike(String value) {
            addCriterion("picturePath like", value, "picturepath");
            return (Criteria) this;
        }

        public Criteria andPicturepathNotLike(String value) {
            addCriterion("picturePath not like", value, "picturepath");
            return (Criteria) this;
        }

        public Criteria andPicturepathIn(List<String> values) {
            addCriterion("picturePath in", values, "picturepath");
            return (Criteria) this;
        }

        public Criteria andPicturepathNotIn(List<String> values) {
            addCriterion("picturePath not in", values, "picturepath");
            return (Criteria) this;
        }

        public Criteria andPicturepathBetween(String value1, String value2) {
            addCriterion("picturePath between", value1, value2, "picturepath");
            return (Criteria) this;
        }

        public Criteria andPicturepathNotBetween(String value1, String value2) {
            addCriterion("picturePath not between", value1, value2, "picturepath");
            return (Criteria) this;
        }

        public Criteria andMachineroomnameIsNull() {
            addCriterion("machineRoomName is null");
            return (Criteria) this;
        }

        public Criteria andMachineroomnameIsNotNull() {
            addCriterion("machineRoomName is not null");
            return (Criteria) this;
        }

        public Criteria andMachineroomnameEqualTo(String value) {
            addCriterion("machineRoomName =", value, "machineroomname");
            return (Criteria) this;
        }

        public Criteria andMachineroomnameNotEqualTo(String value) {
            addCriterion("machineRoomName <>", value, "machineroomname");
            return (Criteria) this;
        }

        public Criteria andMachineroomnameGreaterThan(String value) {
            addCriterion("machineRoomName >", value, "machineroomname");
            return (Criteria) this;
        }

        public Criteria andMachineroomnameGreaterThanOrEqualTo(String value) {
            addCriterion("machineRoomName >=", value, "machineroomname");
            return (Criteria) this;
        }

        public Criteria andMachineroomnameLessThan(String value) {
            addCriterion("machineRoomName <", value, "machineroomname");
            return (Criteria) this;
        }

        public Criteria andMachineroomnameLessThanOrEqualTo(String value) {
            addCriterion("machineRoomName <=", value, "machineroomname");
            return (Criteria) this;
        }

        public Criteria andMachineroomnameLike(String value) {
            addCriterion("machineRoomName like", value, "machineroomname");
            return (Criteria) this;
        }

        public Criteria andMachineroomnameNotLike(String value) {
            addCriterion("machineRoomName not like", value, "machineroomname");
            return (Criteria) this;
        }

        public Criteria andMachineroomnameIn(List<String> values) {
            addCriterion("machineRoomName in", values, "machineroomname");
            return (Criteria) this;
        }

        public Criteria andMachineroomnameNotIn(List<String> values) {
            addCriterion("machineRoomName not in", values, "machineroomname");
            return (Criteria) this;
        }

        public Criteria andMachineroomnameBetween(String value1, String value2) {
            addCriterion("machineRoomName between", value1, value2, "machineroomname");
            return (Criteria) this;
        }

        public Criteria andMachineroomnameNotBetween(String value1, String value2) {
            addCriterion("machineRoomName not between", value1, value2, "machineroomname");
            return (Criteria) this;
        }

        public Criteria andSiteidIsNull() {
            addCriterion("siteId is null");
            return (Criteria) this;
        }

        public Criteria andSiteidIsNotNull() {
            addCriterion("siteId is not null");
            return (Criteria) this;
        }

        public Criteria andSiteidEqualTo(Integer value) {
            addCriterion("siteId =", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidNotEqualTo(Integer value) {
            addCriterion("siteId <>", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidGreaterThan(Integer value) {
            addCriterion("siteId >", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidGreaterThanOrEqualTo(Integer value) {
            addCriterion("siteId >=", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidLessThan(Integer value) {
            addCriterion("siteId <", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidLessThanOrEqualTo(Integer value) {
            addCriterion("siteId <=", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidIn(List<Integer> values) {
            addCriterion("siteId in", values, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidNotIn(List<Integer> values) {
            addCriterion("siteId not in", values, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidBetween(Integer value1, Integer value2) {
            addCriterion("siteId between", value1, value2, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidNotBetween(Integer value1, Integer value2) {
            addCriterion("siteId not between", value1, value2, "siteid");
            return (Criteria) this;
        }

        public Criteria andOutincardIsNull() {
            addCriterion("outInCard is null");
            return (Criteria) this;
        }

        public Criteria andOutincardIsNotNull() {
            addCriterion("outInCard is not null");
            return (Criteria) this;
        }

        public Criteria andOutincardEqualTo(Integer value) {
            addCriterion("outInCard =", value, "outincard");
            return (Criteria) this;
        }

        public Criteria andOutincardNotEqualTo(Integer value) {
            addCriterion("outInCard <>", value, "outincard");
            return (Criteria) this;
        }

        public Criteria andOutincardGreaterThan(Integer value) {
            addCriterion("outInCard >", value, "outincard");
            return (Criteria) this;
        }

        public Criteria andOutincardGreaterThanOrEqualTo(Integer value) {
            addCriterion("outInCard >=", value, "outincard");
            return (Criteria) this;
        }

        public Criteria andOutincardLessThan(Integer value) {
            addCriterion("outInCard <", value, "outincard");
            return (Criteria) this;
        }

        public Criteria andOutincardLessThanOrEqualTo(Integer value) {
            addCriterion("outInCard <=", value, "outincard");
            return (Criteria) this;
        }

        public Criteria andOutincardIn(List<Integer> values) {
            addCriterion("outInCard in", values, "outincard");
            return (Criteria) this;
        }

        public Criteria andOutincardNotIn(List<Integer> values) {
            addCriterion("outInCard not in", values, "outincard");
            return (Criteria) this;
        }

        public Criteria andOutincardBetween(Integer value1, Integer value2) {
            addCriterion("outInCard between", value1, value2, "outincard");
            return (Criteria) this;
        }

        public Criteria andOutincardNotBetween(Integer value1, Integer value2) {
            addCriterion("outInCard not between", value1, value2, "outincard");
            return (Criteria) this;
        }

        public Criteria andDeviceplaceIsNull() {
            addCriterion("devicePlace is null");
            return (Criteria) this;
        }

        public Criteria andDeviceplaceIsNotNull() {
            addCriterion("devicePlace is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceplaceEqualTo(String value) {
            addCriterion("devicePlace =", value, "deviceplace");
            return (Criteria) this;
        }

        public Criteria andDeviceplaceNotEqualTo(String value) {
            addCriterion("devicePlace <>", value, "deviceplace");
            return (Criteria) this;
        }

        public Criteria andDeviceplaceGreaterThan(String value) {
            addCriterion("devicePlace >", value, "deviceplace");
            return (Criteria) this;
        }

        public Criteria andDeviceplaceGreaterThanOrEqualTo(String value) {
            addCriterion("devicePlace >=", value, "deviceplace");
            return (Criteria) this;
        }

        public Criteria andDeviceplaceLessThan(String value) {
            addCriterion("devicePlace <", value, "deviceplace");
            return (Criteria) this;
        }

        public Criteria andDeviceplaceLessThanOrEqualTo(String value) {
            addCriterion("devicePlace <=", value, "deviceplace");
            return (Criteria) this;
        }

        public Criteria andDeviceplaceLike(String value) {
            addCriterion("devicePlace like", value, "deviceplace");
            return (Criteria) this;
        }

        public Criteria andDeviceplaceNotLike(String value) {
            addCriterion("devicePlace not like", value, "deviceplace");
            return (Criteria) this;
        }

        public Criteria andDeviceplaceIn(List<String> values) {
            addCriterion("devicePlace in", values, "deviceplace");
            return (Criteria) this;
        }

        public Criteria andDeviceplaceNotIn(List<String> values) {
            addCriterion("devicePlace not in", values, "deviceplace");
            return (Criteria) this;
        }

        public Criteria andDeviceplaceBetween(String value1, String value2) {
            addCriterion("devicePlace between", value1, value2, "deviceplace");
            return (Criteria) this;
        }

        public Criteria andDeviceplaceNotBetween(String value1, String value2) {
            addCriterion("devicePlace not between", value1, value2, "deviceplace");
            return (Criteria) this;
        }

        public Criteria andSourceplaceIsNull() {
            addCriterion("sourcePlace is null");
            return (Criteria) this;
        }

        public Criteria andSourceplaceIsNotNull() {
            addCriterion("sourcePlace is not null");
            return (Criteria) this;
        }

        public Criteria andSourceplaceEqualTo(String value) {
            addCriterion("sourcePlace =", value, "sourceplace");
            return (Criteria) this;
        }

        public Criteria andSourceplaceNotEqualTo(String value) {
            addCriterion("sourcePlace <>", value, "sourceplace");
            return (Criteria) this;
        }

        public Criteria andSourceplaceGreaterThan(String value) {
            addCriterion("sourcePlace >", value, "sourceplace");
            return (Criteria) this;
        }

        public Criteria andSourceplaceGreaterThanOrEqualTo(String value) {
            addCriterion("sourcePlace >=", value, "sourceplace");
            return (Criteria) this;
        }

        public Criteria andSourceplaceLessThan(String value) {
            addCriterion("sourcePlace <", value, "sourceplace");
            return (Criteria) this;
        }

        public Criteria andSourceplaceLessThanOrEqualTo(String value) {
            addCriterion("sourcePlace <=", value, "sourceplace");
            return (Criteria) this;
        }

        public Criteria andSourceplaceLike(String value) {
            addCriterion("sourcePlace like", value, "sourceplace");
            return (Criteria) this;
        }

        public Criteria andSourceplaceNotLike(String value) {
            addCriterion("sourcePlace not like", value, "sourceplace");
            return (Criteria) this;
        }

        public Criteria andSourceplaceIn(List<String> values) {
            addCriterion("sourcePlace in", values, "sourceplace");
            return (Criteria) this;
        }

        public Criteria andSourceplaceNotIn(List<String> values) {
            addCriterion("sourcePlace not in", values, "sourceplace");
            return (Criteria) this;
        }

        public Criteria andSourceplaceBetween(String value1, String value2) {
            addCriterion("sourcePlace between", value1, value2, "sourceplace");
            return (Criteria) this;
        }

        public Criteria andSourceplaceNotBetween(String value1, String value2) {
            addCriterion("sourcePlace not between", value1, value2, "sourceplace");
            return (Criteria) this;
        }

        public Criteria andCorrelationuseridIsNull() {
            addCriterion("correlationUserId is null");
            return (Criteria) this;
        }

        public Criteria andCorrelationuseridIsNotNull() {
            addCriterion("correlationUserId is not null");
            return (Criteria) this;
        }

        public Criteria andCorrelationuseridEqualTo(Integer value) {
            addCriterion("correlationUserId =", value, "correlationuserid");
            return (Criteria) this;
        }

        public Criteria andCorrelationuseridNotEqualTo(Integer value) {
            addCriterion("correlationUserId <>", value, "correlationuserid");
            return (Criteria) this;
        }

        public Criteria andCorrelationuseridGreaterThan(Integer value) {
            addCriterion("correlationUserId >", value, "correlationuserid");
            return (Criteria) this;
        }

        public Criteria andCorrelationuseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("correlationUserId >=", value, "correlationuserid");
            return (Criteria) this;
        }

        public Criteria andCorrelationuseridLessThan(Integer value) {
            addCriterion("correlationUserId <", value, "correlationuserid");
            return (Criteria) this;
        }

        public Criteria andCorrelationuseridLessThanOrEqualTo(Integer value) {
            addCriterion("correlationUserId <=", value, "correlationuserid");
            return (Criteria) this;
        }

        public Criteria andCorrelationuseridIn(List<Integer> values) {
            addCriterion("correlationUserId in", values, "correlationuserid");
            return (Criteria) this;
        }

        public Criteria andCorrelationuseridNotIn(List<Integer> values) {
            addCriterion("correlationUserId not in", values, "correlationuserid");
            return (Criteria) this;
        }

        public Criteria andCorrelationuseridBetween(Integer value1, Integer value2) {
            addCriterion("correlationUserId between", value1, value2, "correlationuserid");
            return (Criteria) this;
        }

        public Criteria andCorrelationuseridNotBetween(Integer value1, Integer value2) {
            addCriterion("correlationUserId not between", value1, value2, "correlationuserid");
            return (Criteria) this;
        }

        public Criteria andAreaidIsNull() {
            addCriterion("areaId is null");
            return (Criteria) this;
        }

        public Criteria andAreaidIsNotNull() {
            addCriterion("areaId is not null");
            return (Criteria) this;
        }

        public Criteria andAreaidEqualTo(Integer value) {
            addCriterion("areaId =", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotEqualTo(Integer value) {
            addCriterion("areaId <>", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidGreaterThan(Integer value) {
            addCriterion("areaId >", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("areaId >=", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLessThan(Integer value) {
            addCriterion("areaId <", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLessThanOrEqualTo(Integer value) {
            addCriterion("areaId <=", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidIn(List<Integer> values) {
            addCriterion("areaId in", values, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotIn(List<Integer> values) {
            addCriterion("areaId not in", values, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidBetween(Integer value1, Integer value2) {
            addCriterion("areaId between", value1, value2, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotBetween(Integer value1, Integer value2) {
            addCriterion("areaId not between", value1, value2, "areaid");
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