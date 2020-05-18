package com.yaao.ps10.web.model;

import java.util.ArrayList;
import java.util.List;

public class InspectRoomStateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InspectRoomStateExample() {
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

        public Criteria andWorkIdIsNull() {
            addCriterion("Work_Id is null");
            return (Criteria) this;
        }

        public Criteria andWorkIdIsNotNull() {
            addCriterion("Work_Id is not null");
            return (Criteria) this;
        }

        public Criteria andWorkIdEqualTo(Integer value) {
            addCriterion("Work_Id =", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdNotEqualTo(Integer value) {
            addCriterion("Work_Id <>", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdGreaterThan(Integer value) {
            addCriterion("Work_Id >", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Work_Id >=", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdLessThan(Integer value) {
            addCriterion("Work_Id <", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdLessThanOrEqualTo(Integer value) {
            addCriterion("Work_Id <=", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdIn(List<Integer> values) {
            addCriterion("Work_Id in", values, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdNotIn(List<Integer> values) {
            addCriterion("Work_Id not in", values, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdBetween(Integer value1, Integer value2) {
            addCriterion("Work_Id between", value1, value2, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Work_Id not between", value1, value2, "workId");
            return (Criteria) this;
        }

        public Criteria andRoomIdIsNull() {
            addCriterion("Room_Id is null");
            return (Criteria) this;
        }

        public Criteria andRoomIdIsNotNull() {
            addCriterion("Room_Id is not null");
            return (Criteria) this;
        }

        public Criteria andRoomIdEqualTo(Integer value) {
            addCriterion("Room_Id =", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotEqualTo(Integer value) {
            addCriterion("Room_Id <>", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdGreaterThan(Integer value) {
            addCriterion("Room_Id >", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Room_Id >=", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLessThan(Integer value) {
            addCriterion("Room_Id <", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdLessThanOrEqualTo(Integer value) {
            addCriterion("Room_Id <=", value, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdIn(List<Integer> values) {
            addCriterion("Room_Id in", values, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotIn(List<Integer> values) {
            addCriterion("Room_Id not in", values, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdBetween(Integer value1, Integer value2) {
            addCriterion("Room_Id between", value1, value2, "roomId");
            return (Criteria) this;
        }

        public Criteria andRoomIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Room_Id not between", value1, value2, "roomId");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("State is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("State is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("State =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("State <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("State >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("State >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("State <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("State <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("State in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("State not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("State between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("State not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andWorkTypeIsNull() {
            addCriterion("Work_Type is null");
            return (Criteria) this;
        }

        public Criteria andWorkTypeIsNotNull() {
            addCriterion("Work_Type is not null");
            return (Criteria) this;
        }

        public Criteria andWorkTypeEqualTo(Integer value) {
            addCriterion("Work_Type =", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeNotEqualTo(Integer value) {
            addCriterion("Work_Type <>", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeGreaterThan(Integer value) {
            addCriterion("Work_Type >", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("Work_Type >=", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeLessThan(Integer value) {
            addCriterion("Work_Type <", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeLessThanOrEqualTo(Integer value) {
            addCriterion("Work_Type <=", value, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeIn(List<Integer> values) {
            addCriterion("Work_Type in", values, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeNotIn(List<Integer> values) {
            addCriterion("Work_Type not in", values, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeBetween(Integer value1, Integer value2) {
            addCriterion("Work_Type between", value1, value2, "workType");
            return (Criteria) this;
        }

        public Criteria andWorkTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("Work_Type not between", value1, value2, "workType");
            return (Criteria) this;
        }

        public Criteria andPiidIsNull() {
            addCriterion("PIID is null");
            return (Criteria) this;
        }

        public Criteria andPiidIsNotNull() {
            addCriterion("PIID is not null");
            return (Criteria) this;
        }

        public Criteria andPiidEqualTo(String value) {
            addCriterion("PIID =", value, "piid");
            return (Criteria) this;
        }

        public Criteria andPiidNotEqualTo(String value) {
            addCriterion("PIID <>", value, "piid");
            return (Criteria) this;
        }

        public Criteria andPiidGreaterThan(String value) {
            addCriterion("PIID >", value, "piid");
            return (Criteria) this;
        }

        public Criteria andPiidGreaterThanOrEqualTo(String value) {
            addCriterion("PIID >=", value, "piid");
            return (Criteria) this;
        }

        public Criteria andPiidLessThan(String value) {
            addCriterion("PIID <", value, "piid");
            return (Criteria) this;
        }

        public Criteria andPiidLessThanOrEqualTo(String value) {
            addCriterion("PIID <=", value, "piid");
            return (Criteria) this;
        }

        public Criteria andPiidLike(String value) {
            addCriterion("PIID like", value, "piid");
            return (Criteria) this;
        }

        public Criteria andPiidNotLike(String value) {
            addCriterion("PIID not like", value, "piid");
            return (Criteria) this;
        }

        public Criteria andPiidIn(List<String> values) {
            addCriterion("PIID in", values, "piid");
            return (Criteria) this;
        }

        public Criteria andPiidNotIn(List<String> values) {
            addCriterion("PIID not in", values, "piid");
            return (Criteria) this;
        }

        public Criteria andPiidBetween(String value1, String value2) {
            addCriterion("PIID between", value1, value2, "piid");
            return (Criteria) this;
        }

        public Criteria andPiidNotBetween(String value1, String value2) {
            addCriterion("PIID not between", value1, value2, "piid");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIsNull() {
            addCriterion("Room_Type is null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIsNotNull() {
            addCriterion("Room_Type is not null");
            return (Criteria) this;
        }

        public Criteria andRoomTypeEqualTo(Integer value) {
            addCriterion("Room_Type =", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotEqualTo(Integer value) {
            addCriterion("Room_Type <>", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeGreaterThan(Integer value) {
            addCriterion("Room_Type >", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("Room_Type >=", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeLessThan(Integer value) {
            addCriterion("Room_Type <", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeLessThanOrEqualTo(Integer value) {
            addCriterion("Room_Type <=", value, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeIn(List<Integer> values) {
            addCriterion("Room_Type in", values, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotIn(List<Integer> values) {
            addCriterion("Room_Type not in", values, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeBetween(Integer value1, Integer value2) {
            addCriterion("Room_Type between", value1, value2, "roomType");
            return (Criteria) this;
        }

        public Criteria andRoomTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("Room_Type not between", value1, value2, "roomType");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("User_Id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("User_Id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("User_Id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("User_Id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("User_Id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("User_Id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("User_Id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("User_Id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("User_Id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("User_Id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("User_Id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("User_Id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andIsnotexceptionIsNull() {
            addCriterion("IsNotException is null");
            return (Criteria) this;
        }

        public Criteria andIsnotexceptionIsNotNull() {
            addCriterion("IsNotException is not null");
            return (Criteria) this;
        }

        public Criteria andIsnotexceptionEqualTo(Integer value) {
            addCriterion("IsNotException =", value, "isnotexception");
            return (Criteria) this;
        }

        public Criteria andIsnotexceptionNotEqualTo(Integer value) {
            addCriterion("IsNotException <>", value, "isnotexception");
            return (Criteria) this;
        }

        public Criteria andIsnotexceptionGreaterThan(Integer value) {
            addCriterion("IsNotException >", value, "isnotexception");
            return (Criteria) this;
        }

        public Criteria andIsnotexceptionGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsNotException >=", value, "isnotexception");
            return (Criteria) this;
        }

        public Criteria andIsnotexceptionLessThan(Integer value) {
            addCriterion("IsNotException <", value, "isnotexception");
            return (Criteria) this;
        }

        public Criteria andIsnotexceptionLessThanOrEqualTo(Integer value) {
            addCriterion("IsNotException <=", value, "isnotexception");
            return (Criteria) this;
        }

        public Criteria andIsnotexceptionIn(List<Integer> values) {
            addCriterion("IsNotException in", values, "isnotexception");
            return (Criteria) this;
        }

        public Criteria andIsnotexceptionNotIn(List<Integer> values) {
            addCriterion("IsNotException not in", values, "isnotexception");
            return (Criteria) this;
        }

        public Criteria andIsnotexceptionBetween(Integer value1, Integer value2) {
            addCriterion("IsNotException between", value1, value2, "isnotexception");
            return (Criteria) this;
        }

        public Criteria andIsnotexceptionNotBetween(Integer value1, Integer value2) {
            addCriterion("IsNotException not between", value1, value2, "isnotexception");
            return (Criteria) this;
        }

        public Criteria andReasondataIsNull() {
            addCriterion("ReasonData is null");
            return (Criteria) this;
        }

        public Criteria andReasondataIsNotNull() {
            addCriterion("ReasonData is not null");
            return (Criteria) this;
        }

        public Criteria andReasondataEqualTo(String value) {
            addCriterion("ReasonData =", value, "reasondata");
            return (Criteria) this;
        }

        public Criteria andReasondataNotEqualTo(String value) {
            addCriterion("ReasonData <>", value, "reasondata");
            return (Criteria) this;
        }

        public Criteria andReasondataGreaterThan(String value) {
            addCriterion("ReasonData >", value, "reasondata");
            return (Criteria) this;
        }

        public Criteria andReasondataGreaterThanOrEqualTo(String value) {
            addCriterion("ReasonData >=", value, "reasondata");
            return (Criteria) this;
        }

        public Criteria andReasondataLessThan(String value) {
            addCriterion("ReasonData <", value, "reasondata");
            return (Criteria) this;
        }

        public Criteria andReasondataLessThanOrEqualTo(String value) {
            addCriterion("ReasonData <=", value, "reasondata");
            return (Criteria) this;
        }

        public Criteria andReasondataLike(String value) {
            addCriterion("ReasonData like", value, "reasondata");
            return (Criteria) this;
        }

        public Criteria andReasondataNotLike(String value) {
            addCriterion("ReasonData not like", value, "reasondata");
            return (Criteria) this;
        }

        public Criteria andReasondataIn(List<String> values) {
            addCriterion("ReasonData in", values, "reasondata");
            return (Criteria) this;
        }

        public Criteria andReasondataNotIn(List<String> values) {
            addCriterion("ReasonData not in", values, "reasondata");
            return (Criteria) this;
        }

        public Criteria andReasondataBetween(String value1, String value2) {
            addCriterion("ReasonData between", value1, value2, "reasondata");
            return (Criteria) this;
        }

        public Criteria andReasondataNotBetween(String value1, String value2) {
            addCriterion("ReasonData not between", value1, value2, "reasondata");
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