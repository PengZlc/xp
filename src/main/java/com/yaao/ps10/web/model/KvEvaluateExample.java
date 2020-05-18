package com.yaao.ps10.web.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KvEvaluateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KvEvaluateExample() {
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

        public Criteria andProcessidIsNull() {
            addCriterion("ProcessId is null");
            return (Criteria) this;
        }

        public Criteria andProcessidIsNotNull() {
            addCriterion("ProcessId is not null");
            return (Criteria) this;
        }

        public Criteria andProcessidEqualTo(String value) {
            addCriterion("ProcessId =", value, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidNotEqualTo(String value) {
            addCriterion("ProcessId <>", value, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidGreaterThan(String value) {
            addCriterion("ProcessId >", value, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidGreaterThanOrEqualTo(String value) {
            addCriterion("ProcessId >=", value, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidLessThan(String value) {
            addCriterion("ProcessId <", value, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidLessThanOrEqualTo(String value) {
            addCriterion("ProcessId <=", value, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidLike(String value) {
            addCriterion("ProcessId like", value, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidNotLike(String value) {
            addCriterion("ProcessId not like", value, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidIn(List<String> values) {
            addCriterion("ProcessId in", values, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidNotIn(List<String> values) {
            addCriterion("ProcessId not in", values, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidBetween(String value1, String value2) {
            addCriterion("ProcessId between", value1, value2, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidNotBetween(String value1, String value2) {
            addCriterion("ProcessId not between", value1, value2, "processid");
            return (Criteria) this;
        }

        public Criteria andRoomidIsNull() {
            addCriterion("RoomId is null");
            return (Criteria) this;
        }

        public Criteria andRoomidIsNotNull() {
            addCriterion("RoomId is not null");
            return (Criteria) this;
        }

        public Criteria andRoomidEqualTo(Integer value) {
            addCriterion("RoomId =", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidNotEqualTo(Integer value) {
            addCriterion("RoomId <>", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidGreaterThan(Integer value) {
            addCriterion("RoomId >", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidGreaterThanOrEqualTo(Integer value) {
            addCriterion("RoomId >=", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidLessThan(Integer value) {
            addCriterion("RoomId <", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidLessThanOrEqualTo(Integer value) {
            addCriterion("RoomId <=", value, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidIn(List<Integer> values) {
            addCriterion("RoomId in", values, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidNotIn(List<Integer> values) {
            addCriterion("RoomId not in", values, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidBetween(Integer value1, Integer value2) {
            addCriterion("RoomId between", value1, value2, "roomid");
            return (Criteria) this;
        }

        public Criteria andRoomidNotBetween(Integer value1, Integer value2) {
            addCriterion("RoomId not between", value1, value2, "roomid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("UserId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("UserId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("UserId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("UserId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("UserId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("UserId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("UserId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("UserId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("UserId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("UserId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("UserId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("UserId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUsercontextIsNull() {
            addCriterion("UserContext is null");
            return (Criteria) this;
        }

        public Criteria andUsercontextIsNotNull() {
            addCriterion("UserContext is not null");
            return (Criteria) this;
        }

        public Criteria andUsercontextEqualTo(String value) {
            addCriterion("UserContext =", value, "usercontext");
            return (Criteria) this;
        }

        public Criteria andUsercontextNotEqualTo(String value) {
            addCriterion("UserContext <>", value, "usercontext");
            return (Criteria) this;
        }

        public Criteria andUsercontextGreaterThan(String value) {
            addCriterion("UserContext >", value, "usercontext");
            return (Criteria) this;
        }

        public Criteria andUsercontextGreaterThanOrEqualTo(String value) {
            addCriterion("UserContext >=", value, "usercontext");
            return (Criteria) this;
        }

        public Criteria andUsercontextLessThan(String value) {
            addCriterion("UserContext <", value, "usercontext");
            return (Criteria) this;
        }

        public Criteria andUsercontextLessThanOrEqualTo(String value) {
            addCriterion("UserContext <=", value, "usercontext");
            return (Criteria) this;
        }

        public Criteria andUsercontextLike(String value) {
            addCriterion("UserContext like", value, "usercontext");
            return (Criteria) this;
        }

        public Criteria andUsercontextNotLike(String value) {
            addCriterion("UserContext not like", value, "usercontext");
            return (Criteria) this;
        }

        public Criteria andUsercontextIn(List<String> values) {
            addCriterion("UserContext in", values, "usercontext");
            return (Criteria) this;
        }

        public Criteria andUsercontextNotIn(List<String> values) {
            addCriterion("UserContext not in", values, "usercontext");
            return (Criteria) this;
        }

        public Criteria andUsercontextBetween(String value1, String value2) {
            addCriterion("UserContext between", value1, value2, "usercontext");
            return (Criteria) this;
        }

        public Criteria andUsercontextNotBetween(String value1, String value2) {
            addCriterion("UserContext not between", value1, value2, "usercontext");
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

        public Criteria andNouseridIsNull() {
            addCriterion("NoUserId is null");
            return (Criteria) this;
        }

        public Criteria andNouseridIsNotNull() {
            addCriterion("NoUserId is not null");
            return (Criteria) this;
        }

        public Criteria andNouseridEqualTo(Integer value) {
            addCriterion("NoUserId =", value, "nouserid");
            return (Criteria) this;
        }

        public Criteria andNouseridNotEqualTo(Integer value) {
            addCriterion("NoUserId <>", value, "nouserid");
            return (Criteria) this;
        }

        public Criteria andNouseridGreaterThan(Integer value) {
            addCriterion("NoUserId >", value, "nouserid");
            return (Criteria) this;
        }

        public Criteria andNouseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("NoUserId >=", value, "nouserid");
            return (Criteria) this;
        }

        public Criteria andNouseridLessThan(Integer value) {
            addCriterion("NoUserId <", value, "nouserid");
            return (Criteria) this;
        }

        public Criteria andNouseridLessThanOrEqualTo(Integer value) {
            addCriterion("NoUserId <=", value, "nouserid");
            return (Criteria) this;
        }

        public Criteria andNouseridIn(List<Integer> values) {
            addCriterion("NoUserId in", values, "nouserid");
            return (Criteria) this;
        }

        public Criteria andNouseridNotIn(List<Integer> values) {
            addCriterion("NoUserId not in", values, "nouserid");
            return (Criteria) this;
        }

        public Criteria andNouseridBetween(Integer value1, Integer value2) {
            addCriterion("NoUserId between", value1, value2, "nouserid");
            return (Criteria) this;
        }

        public Criteria andNouseridNotBetween(Integer value1, Integer value2) {
            addCriterion("NoUserId not between", value1, value2, "nouserid");
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