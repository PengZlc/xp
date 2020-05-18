package com.yaao.ps10.web.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KvModelTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KvModelTableExample() {
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
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andModelnameIsNull() {
            addCriterion("ModelName is null");
            return (Criteria) this;
        }

        public Criteria andModelnameIsNotNull() {
            addCriterion("ModelName is not null");
            return (Criteria) this;
        }

        public Criteria andModelnameEqualTo(String value) {
            addCriterion("ModelName =", value, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameNotEqualTo(String value) {
            addCriterion("ModelName <>", value, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameGreaterThan(String value) {
            addCriterion("ModelName >", value, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameGreaterThanOrEqualTo(String value) {
            addCriterion("ModelName >=", value, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameLessThan(String value) {
            addCriterion("ModelName <", value, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameLessThanOrEqualTo(String value) {
            addCriterion("ModelName <=", value, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameLike(String value) {
            addCriterion("ModelName like", value, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameNotLike(String value) {
            addCriterion("ModelName not like", value, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameIn(List<String> values) {
            addCriterion("ModelName in", values, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameNotIn(List<String> values) {
            addCriterion("ModelName not in", values, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameBetween(String value1, String value2) {
            addCriterion("ModelName between", value1, value2, "modelname");
            return (Criteria) this;
        }

        public Criteria andModelnameNotBetween(String value1, String value2) {
            addCriterion("ModelName not between", value1, value2, "modelname");
            return (Criteria) this;
        }

        public Criteria andCreateuseridIsNull() {
            addCriterion("CreateUserId is null");
            return (Criteria) this;
        }

        public Criteria andCreateuseridIsNotNull() {
            addCriterion("CreateUserId is not null");
            return (Criteria) this;
        }

        public Criteria andCreateuseridEqualTo(Integer value) {
            addCriterion("CreateUserId =", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotEqualTo(Integer value) {
            addCriterion("CreateUserId <>", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridGreaterThan(Integer value) {
            addCriterion("CreateUserId >", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("CreateUserId >=", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridLessThan(Integer value) {
            addCriterion("CreateUserId <", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridLessThanOrEqualTo(Integer value) {
            addCriterion("CreateUserId <=", value, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridIn(List<Integer> values) {
            addCriterion("CreateUserId in", values, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotIn(List<Integer> values) {
            addCriterion("CreateUserId not in", values, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridBetween(Integer value1, Integer value2) {
            addCriterion("CreateUserId between", value1, value2, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateuseridNotBetween(Integer value1, Integer value2) {
            addCriterion("CreateUserId not between", value1, value2, "createuserid");
            return (Criteria) this;
        }

        public Criteria andCreateusernameIsNull() {
            addCriterion("CreateUserName is null");
            return (Criteria) this;
        }

        public Criteria andCreateusernameIsNotNull() {
            addCriterion("CreateUserName is not null");
            return (Criteria) this;
        }

        public Criteria andCreateusernameEqualTo(String value) {
            addCriterion("CreateUserName =", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameNotEqualTo(String value) {
            addCriterion("CreateUserName <>", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameGreaterThan(String value) {
            addCriterion("CreateUserName >", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameGreaterThanOrEqualTo(String value) {
            addCriterion("CreateUserName >=", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameLessThan(String value) {
            addCriterion("CreateUserName <", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameLessThanOrEqualTo(String value) {
            addCriterion("CreateUserName <=", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameLike(String value) {
            addCriterion("CreateUserName like", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameNotLike(String value) {
            addCriterion("CreateUserName not like", value, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameIn(List<String> values) {
            addCriterion("CreateUserName in", values, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameNotIn(List<String> values) {
            addCriterion("CreateUserName not in", values, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameBetween(String value1, String value2) {
            addCriterion("CreateUserName between", value1, value2, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreateusernameNotBetween(String value1, String value2) {
            addCriterion("CreateUserName not between", value1, value2, "createusername");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CreateTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CreateTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CreateTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CreateTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CreateTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CreateTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CreateTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CreateTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CreateTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CreateTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CreateTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andModeltypeIsNull() {
            addCriterion("ModelType is null");
            return (Criteria) this;
        }

        public Criteria andModeltypeIsNotNull() {
            addCriterion("ModelType is not null");
            return (Criteria) this;
        }

        public Criteria andModeltypeEqualTo(String value) {
            addCriterion("ModelType =", value, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeNotEqualTo(String value) {
            addCriterion("ModelType <>", value, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeGreaterThan(String value) {
            addCriterion("ModelType >", value, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeGreaterThanOrEqualTo(String value) {
            addCriterion("ModelType >=", value, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeLessThan(String value) {
            addCriterion("ModelType <", value, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeLessThanOrEqualTo(String value) {
            addCriterion("ModelType <=", value, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeLike(String value) {
            addCriterion("ModelType like", value, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeNotLike(String value) {
            addCriterion("ModelType not like", value, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeIn(List<String> values) {
            addCriterion("ModelType in", values, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeNotIn(List<String> values) {
            addCriterion("ModelType not in", values, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeBetween(String value1, String value2) {
            addCriterion("ModelType between", value1, value2, "modeltype");
            return (Criteria) this;
        }

        public Criteria andModeltypeNotBetween(String value1, String value2) {
            addCriterion("ModelType not between", value1, value2, "modeltype");
            return (Criteria) this;
        }

        public Criteria andRoomidsIsNull() {
            addCriterion("RoomIds is null");
            return (Criteria) this;
        }

        public Criteria andRoomidsIsNotNull() {
            addCriterion("RoomIds is not null");
            return (Criteria) this;
        }

        public Criteria andRoomidsEqualTo(String value) {
            addCriterion("RoomIds =", value, "roomids");
            return (Criteria) this;
        }

        public Criteria andRoomidsNotEqualTo(String value) {
            addCriterion("RoomIds <>", value, "roomids");
            return (Criteria) this;
        }

        public Criteria andRoomidsGreaterThan(String value) {
            addCriterion("RoomIds >", value, "roomids");
            return (Criteria) this;
        }

        public Criteria andRoomidsGreaterThanOrEqualTo(String value) {
            addCriterion("RoomIds >=", value, "roomids");
            return (Criteria) this;
        }

        public Criteria andRoomidsLessThan(String value) {
            addCriterion("RoomIds <", value, "roomids");
            return (Criteria) this;
        }

        public Criteria andRoomidsLessThanOrEqualTo(String value) {
            addCriterion("RoomIds <=", value, "roomids");
            return (Criteria) this;
        }

        public Criteria andRoomidsLike(String value) {
            addCriterion("RoomIds like", value, "roomids");
            return (Criteria) this;
        }

        public Criteria andRoomidsNotLike(String value) {
            addCriterion("RoomIds not like", value, "roomids");
            return (Criteria) this;
        }

        public Criteria andRoomidsIn(List<String> values) {
            addCriterion("RoomIds in", values, "roomids");
            return (Criteria) this;
        }

        public Criteria andRoomidsNotIn(List<String> values) {
            addCriterion("RoomIds not in", values, "roomids");
            return (Criteria) this;
        }

        public Criteria andRoomidsBetween(String value1, String value2) {
            addCriterion("RoomIds between", value1, value2, "roomids");
            return (Criteria) this;
        }

        public Criteria andRoomidsNotBetween(String value1, String value2) {
            addCriterion("RoomIds not between", value1, value2, "roomids");
            return (Criteria) this;
        }

        public Criteria andUseridsIsNull() {
            addCriterion("UserIds is null");
            return (Criteria) this;
        }

        public Criteria andUseridsIsNotNull() {
            addCriterion("UserIds is not null");
            return (Criteria) this;
        }

        public Criteria andUseridsEqualTo(String value) {
            addCriterion("UserIds =", value, "userids");
            return (Criteria) this;
        }

        public Criteria andUseridsNotEqualTo(String value) {
            addCriterion("UserIds <>", value, "userids");
            return (Criteria) this;
        }

        public Criteria andUseridsGreaterThan(String value) {
            addCriterion("UserIds >", value, "userids");
            return (Criteria) this;
        }

        public Criteria andUseridsGreaterThanOrEqualTo(String value) {
            addCriterion("UserIds >=", value, "userids");
            return (Criteria) this;
        }

        public Criteria andUseridsLessThan(String value) {
            addCriterion("UserIds <", value, "userids");
            return (Criteria) this;
        }

        public Criteria andUseridsLessThanOrEqualTo(String value) {
            addCriterion("UserIds <=", value, "userids");
            return (Criteria) this;
        }

        public Criteria andUseridsLike(String value) {
            addCriterion("UserIds like", value, "userids");
            return (Criteria) this;
        }

        public Criteria andUseridsNotLike(String value) {
            addCriterion("UserIds not like", value, "userids");
            return (Criteria) this;
        }

        public Criteria andUseridsIn(List<String> values) {
            addCriterion("UserIds in", values, "userids");
            return (Criteria) this;
        }

        public Criteria andUseridsNotIn(List<String> values) {
            addCriterion("UserIds not in", values, "userids");
            return (Criteria) this;
        }

        public Criteria andUseridsBetween(String value1, String value2) {
            addCriterion("UserIds between", value1, value2, "userids");
            return (Criteria) this;
        }

        public Criteria andUseridsNotBetween(String value1, String value2) {
            addCriterion("UserIds not between", value1, value2, "userids");
            return (Criteria) this;
        }

        public Criteria andAreaidIsNull() {
            addCriterion("AreaId is null");
            return (Criteria) this;
        }

        public Criteria andAreaidIsNotNull() {
            addCriterion("AreaId is not null");
            return (Criteria) this;
        }

        public Criteria andAreaidEqualTo(Integer value) {
            addCriterion("AreaId =", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotEqualTo(Integer value) {
            addCriterion("AreaId <>", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidGreaterThan(Integer value) {
            addCriterion("AreaId >", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("AreaId >=", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLessThan(Integer value) {
            addCriterion("AreaId <", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLessThanOrEqualTo(Integer value) {
            addCriterion("AreaId <=", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidIn(List<Integer> values) {
            addCriterion("AreaId in", values, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotIn(List<Integer> values) {
            addCriterion("AreaId not in", values, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidBetween(Integer value1, Integer value2) {
            addCriterion("AreaId between", value1, value2, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotBetween(Integer value1, Integer value2) {
            addCriterion("AreaId not between", value1, value2, "areaid");
            return (Criteria) this;
        }

        public Criteria andDepartnameIsNull() {
            addCriterion("DepartName is null");
            return (Criteria) this;
        }

        public Criteria andDepartnameIsNotNull() {
            addCriterion("DepartName is not null");
            return (Criteria) this;
        }

        public Criteria andDepartnameEqualTo(String value) {
            addCriterion("DepartName =", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameNotEqualTo(String value) {
            addCriterion("DepartName <>", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameGreaterThan(String value) {
            addCriterion("DepartName >", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameGreaterThanOrEqualTo(String value) {
            addCriterion("DepartName >=", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameLessThan(String value) {
            addCriterion("DepartName <", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameLessThanOrEqualTo(String value) {
            addCriterion("DepartName <=", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameLike(String value) {
            addCriterion("DepartName like", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameNotLike(String value) {
            addCriterion("DepartName not like", value, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameIn(List<String> values) {
            addCriterion("DepartName in", values, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameNotIn(List<String> values) {
            addCriterion("DepartName not in", values, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameBetween(String value1, String value2) {
            addCriterion("DepartName between", value1, value2, "departname");
            return (Criteria) this;
        }

        public Criteria andDepartnameNotBetween(String value1, String value2) {
            addCriterion("DepartName not between", value1, value2, "departname");
            return (Criteria) this;
        }

        public Criteria andNfcspacetimeIsNull() {
            addCriterion("NfcSpaceTime is null");
            return (Criteria) this;
        }

        public Criteria andNfcspacetimeIsNotNull() {
            addCriterion("NfcSpaceTime is not null");
            return (Criteria) this;
        }

        public Criteria andNfcspacetimeEqualTo(Integer value) {
            addCriterion("NfcSpaceTime =", value, "nfcspacetime");
            return (Criteria) this;
        }

        public Criteria andNfcspacetimeNotEqualTo(Integer value) {
            addCriterion("NfcSpaceTime <>", value, "nfcspacetime");
            return (Criteria) this;
        }

        public Criteria andNfcspacetimeGreaterThan(Integer value) {
            addCriterion("NfcSpaceTime >", value, "nfcspacetime");
            return (Criteria) this;
        }

        public Criteria andNfcspacetimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("NfcSpaceTime >=", value, "nfcspacetime");
            return (Criteria) this;
        }

        public Criteria andNfcspacetimeLessThan(Integer value) {
            addCriterion("NfcSpaceTime <", value, "nfcspacetime");
            return (Criteria) this;
        }

        public Criteria andNfcspacetimeLessThanOrEqualTo(Integer value) {
            addCriterion("NfcSpaceTime <=", value, "nfcspacetime");
            return (Criteria) this;
        }

        public Criteria andNfcspacetimeIn(List<Integer> values) {
            addCriterion("NfcSpaceTime in", values, "nfcspacetime");
            return (Criteria) this;
        }

        public Criteria andNfcspacetimeNotIn(List<Integer> values) {
            addCriterion("NfcSpaceTime not in", values, "nfcspacetime");
            return (Criteria) this;
        }

        public Criteria andNfcspacetimeBetween(Integer value1, Integer value2) {
            addCriterion("NfcSpaceTime between", value1, value2, "nfcspacetime");
            return (Criteria) this;
        }

        public Criteria andNfcspacetimeNotBetween(Integer value1, Integer value2) {
            addCriterion("NfcSpaceTime not between", value1, value2, "nfcspacetime");
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