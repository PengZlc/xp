package com.yaao.ps10.web.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InspectWorkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InspectWorkExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("Name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("Name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("Name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("Name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("Name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("Name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("Name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("Name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("Name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("Name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("Name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("Name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("Name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("Name not between", value1, value2, "name");
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

        public Criteria andSiteidIsNull() {
            addCriterion("SiteId is null");
            return (Criteria) this;
        }

        public Criteria andSiteidIsNotNull() {
            addCriterion("SiteId is not null");
            return (Criteria) this;
        }

        public Criteria andSiteidEqualTo(Integer value) {
            addCriterion("SiteId =", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidNotEqualTo(Integer value) {
            addCriterion("SiteId <>", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidGreaterThan(Integer value) {
            addCriterion("SiteId >", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidGreaterThanOrEqualTo(Integer value) {
            addCriterion("SiteId >=", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidLessThan(Integer value) {
            addCriterion("SiteId <", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidLessThanOrEqualTo(Integer value) {
            addCriterion("SiteId <=", value, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidIn(List<Integer> values) {
            addCriterion("SiteId in", values, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidNotIn(List<Integer> values) {
            addCriterion("SiteId not in", values, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidBetween(Integer value1, Integer value2) {
            addCriterion("SiteId between", value1, value2, "siteid");
            return (Criteria) this;
        }

        public Criteria andSiteidNotBetween(Integer value1, Integer value2) {
            addCriterion("SiteId not between", value1, value2, "siteid");
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

        public Criteria andTeamidIsNull() {
            addCriterion("TeamId is null");
            return (Criteria) this;
        }

        public Criteria andTeamidIsNotNull() {
            addCriterion("TeamId is not null");
            return (Criteria) this;
        }

        public Criteria andTeamidEqualTo(Integer value) {
            addCriterion("TeamId =", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidNotEqualTo(Integer value) {
            addCriterion("TeamId <>", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidGreaterThan(Integer value) {
            addCriterion("TeamId >", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TeamId >=", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidLessThan(Integer value) {
            addCriterion("TeamId <", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidLessThanOrEqualTo(Integer value) {
            addCriterion("TeamId <=", value, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidIn(List<Integer> values) {
            addCriterion("TeamId in", values, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidNotIn(List<Integer> values) {
            addCriterion("TeamId not in", values, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidBetween(Integer value1, Integer value2) {
            addCriterion("TeamId between", value1, value2, "teamid");
            return (Criteria) this;
        }

        public Criteria andTeamidNotBetween(Integer value1, Integer value2) {
            addCriterion("TeamId not between", value1, value2, "teamid");
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

        public Criteria andUseridEqualTo(String value) {
            addCriterion("UserId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("UserId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("UserId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("UserId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("UserId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("UserId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("UserId like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("UserId not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("UserId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("UserId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("UserId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("UserId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("Flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("Flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(Integer value) {
            addCriterion("Flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(Integer value) {
            addCriterion("Flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(Integer value) {
            addCriterion("Flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("Flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(Integer value) {
            addCriterion("Flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(Integer value) {
            addCriterion("Flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<Integer> values) {
            addCriterion("Flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<Integer> values) {
            addCriterion("Flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(Integer value1, Integer value2) {
            addCriterion("Flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("Flag not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("Note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("Note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("Note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("Note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("Note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("Note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("Note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("Note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("Note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("Note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("Note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("Note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("Note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("Note not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("StartTime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("StartTime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterion("StartTime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterion("StartTime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterion("StartTime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("StartTime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterion("StartTime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("StartTime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterion("StartTime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterion("StartTime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterion("StartTime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("StartTime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("EndTime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("EndTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("EndTime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("EndTime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("EndTime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("EndTime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("EndTime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("EndTime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("EndTime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("EndTime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("EndTime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("EndTime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andRequiredstarttimeIsNull() {
            addCriterion("RequiredStartTime is null");
            return (Criteria) this;
        }

        public Criteria andRequiredstarttimeIsNotNull() {
            addCriterion("RequiredStartTime is not null");
            return (Criteria) this;
        }

        public Criteria andRequiredstarttimeEqualTo(Date value) {
            addCriterion("RequiredStartTime =", value, "requiredstarttime");
            return (Criteria) this;
        }

        public Criteria andRequiredstarttimeNotEqualTo(Date value) {
            addCriterion("RequiredStartTime <>", value, "requiredstarttime");
            return (Criteria) this;
        }

        public Criteria andRequiredstarttimeGreaterThan(Date value) {
            addCriterion("RequiredStartTime >", value, "requiredstarttime");
            return (Criteria) this;
        }

        public Criteria andRequiredstarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RequiredStartTime >=", value, "requiredstarttime");
            return (Criteria) this;
        }

        public Criteria andRequiredstarttimeLessThan(Date value) {
            addCriterion("RequiredStartTime <", value, "requiredstarttime");
            return (Criteria) this;
        }

        public Criteria andRequiredstarttimeLessThanOrEqualTo(Date value) {
            addCriterion("RequiredStartTime <=", value, "requiredstarttime");
            return (Criteria) this;
        }

        public Criteria andRequiredstarttimeIn(List<Date> values) {
            addCriterion("RequiredStartTime in", values, "requiredstarttime");
            return (Criteria) this;
        }

        public Criteria andRequiredstarttimeNotIn(List<Date> values) {
            addCriterion("RequiredStartTime not in", values, "requiredstarttime");
            return (Criteria) this;
        }

        public Criteria andRequiredstarttimeBetween(Date value1, Date value2) {
            addCriterion("RequiredStartTime between", value1, value2, "requiredstarttime");
            return (Criteria) this;
        }

        public Criteria andRequiredstarttimeNotBetween(Date value1, Date value2) {
            addCriterion("RequiredStartTime not between", value1, value2, "requiredstarttime");
            return (Criteria) this;
        }

        public Criteria andRequiredendtimeIsNull() {
            addCriterion("RequiredEndTime is null");
            return (Criteria) this;
        }

        public Criteria andRequiredendtimeIsNotNull() {
            addCriterion("RequiredEndTime is not null");
            return (Criteria) this;
        }

        public Criteria andRequiredendtimeEqualTo(Date value) {
            addCriterion("RequiredEndTime =", value, "requiredendtime");
            return (Criteria) this;
        }

        public Criteria andRequiredendtimeNotEqualTo(Date value) {
            addCriterion("RequiredEndTime <>", value, "requiredendtime");
            return (Criteria) this;
        }

        public Criteria andRequiredendtimeGreaterThan(Date value) {
            addCriterion("RequiredEndTime >", value, "requiredendtime");
            return (Criteria) this;
        }

        public Criteria andRequiredendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RequiredEndTime >=", value, "requiredendtime");
            return (Criteria) this;
        }

        public Criteria andRequiredendtimeLessThan(Date value) {
            addCriterion("RequiredEndTime <", value, "requiredendtime");
            return (Criteria) this;
        }

        public Criteria andRequiredendtimeLessThanOrEqualTo(Date value) {
            addCriterion("RequiredEndTime <=", value, "requiredendtime");
            return (Criteria) this;
        }

        public Criteria andRequiredendtimeIn(List<Date> values) {
            addCriterion("RequiredEndTime in", values, "requiredendtime");
            return (Criteria) this;
        }

        public Criteria andRequiredendtimeNotIn(List<Date> values) {
            addCriterion("RequiredEndTime not in", values, "requiredendtime");
            return (Criteria) this;
        }

        public Criteria andRequiredendtimeBetween(Date value1, Date value2) {
            addCriterion("RequiredEndTime between", value1, value2, "requiredendtime");
            return (Criteria) this;
        }

        public Criteria andRequiredendtimeNotBetween(Date value1, Date value2) {
            addCriterion("RequiredEndTime not between", value1, value2, "requiredendtime");
            return (Criteria) this;
        }

        public Criteria andActualstarttimeIsNull() {
            addCriterion("ActualStartTime is null");
            return (Criteria) this;
        }

        public Criteria andActualstarttimeIsNotNull() {
            addCriterion("ActualStartTime is not null");
            return (Criteria) this;
        }

        public Criteria andActualstarttimeEqualTo(Date value) {
            addCriterion("ActualStartTime =", value, "actualstarttime");
            return (Criteria) this;
        }

        public Criteria andActualstarttimeNotEqualTo(Date value) {
            addCriterion("ActualStartTime <>", value, "actualstarttime");
            return (Criteria) this;
        }

        public Criteria andActualstarttimeGreaterThan(Date value) {
            addCriterion("ActualStartTime >", value, "actualstarttime");
            return (Criteria) this;
        }

        public Criteria andActualstarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ActualStartTime >=", value, "actualstarttime");
            return (Criteria) this;
        }

        public Criteria andActualstarttimeLessThan(Date value) {
            addCriterion("ActualStartTime <", value, "actualstarttime");
            return (Criteria) this;
        }

        public Criteria andActualstarttimeLessThanOrEqualTo(Date value) {
            addCriterion("ActualStartTime <=", value, "actualstarttime");
            return (Criteria) this;
        }

        public Criteria andActualstarttimeIn(List<Date> values) {
            addCriterion("ActualStartTime in", values, "actualstarttime");
            return (Criteria) this;
        }

        public Criteria andActualstarttimeNotIn(List<Date> values) {
            addCriterion("ActualStartTime not in", values, "actualstarttime");
            return (Criteria) this;
        }

        public Criteria andActualstarttimeBetween(Date value1, Date value2) {
            addCriterion("ActualStartTime between", value1, value2, "actualstarttime");
            return (Criteria) this;
        }

        public Criteria andActualstarttimeNotBetween(Date value1, Date value2) {
            addCriterion("ActualStartTime not between", value1, value2, "actualstarttime");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("Grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("Grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(String value) {
            addCriterion("Grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(String value) {
            addCriterion("Grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(String value) {
            addCriterion("Grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(String value) {
            addCriterion("Grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(String value) {
            addCriterion("Grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(String value) {
            addCriterion("Grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLike(String value) {
            addCriterion("Grade like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotLike(String value) {
            addCriterion("Grade not like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<String> values) {
            addCriterion("Grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<String> values) {
            addCriterion("Grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(String value1, String value2) {
            addCriterion("Grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(String value1, String value2) {
            addCriterion("Grade not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("UserName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("UserName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("UserName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("UserName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("UserName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("UserName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("UserName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("UserName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("UserName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("UserName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("UserName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("UserName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("UserName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("UserName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andValidinstateIsNull() {
            addCriterion("ValidInstate is null");
            return (Criteria) this;
        }

        public Criteria andValidinstateIsNotNull() {
            addCriterion("ValidInstate is not null");
            return (Criteria) this;
        }

        public Criteria andValidinstateEqualTo(Integer value) {
            addCriterion("ValidInstate =", value, "validinstate");
            return (Criteria) this;
        }

        public Criteria andValidinstateNotEqualTo(Integer value) {
            addCriterion("ValidInstate <>", value, "validinstate");
            return (Criteria) this;
        }

        public Criteria andValidinstateGreaterThan(Integer value) {
            addCriterion("ValidInstate >", value, "validinstate");
            return (Criteria) this;
        }

        public Criteria andValidinstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("ValidInstate >=", value, "validinstate");
            return (Criteria) this;
        }

        public Criteria andValidinstateLessThan(Integer value) {
            addCriterion("ValidInstate <", value, "validinstate");
            return (Criteria) this;
        }

        public Criteria andValidinstateLessThanOrEqualTo(Integer value) {
            addCriterion("ValidInstate <=", value, "validinstate");
            return (Criteria) this;
        }

        public Criteria andValidinstateIn(List<Integer> values) {
            addCriterion("ValidInstate in", values, "validinstate");
            return (Criteria) this;
        }

        public Criteria andValidinstateNotIn(List<Integer> values) {
            addCriterion("ValidInstate not in", values, "validinstate");
            return (Criteria) this;
        }

        public Criteria andValidinstateBetween(Integer value1, Integer value2) {
            addCriterion("ValidInstate between", value1, value2, "validinstate");
            return (Criteria) this;
        }

        public Criteria andValidinstateNotBetween(Integer value1, Integer value2) {
            addCriterion("ValidInstate not between", value1, value2, "validinstate");
            return (Criteria) this;
        }

        public Criteria andValidinflagIsNull() {
            addCriterion("ValidInFlag is null");
            return (Criteria) this;
        }

        public Criteria andValidinflagIsNotNull() {
            addCriterion("ValidInFlag is not null");
            return (Criteria) this;
        }

        public Criteria andValidinflagEqualTo(Integer value) {
            addCriterion("ValidInFlag =", value, "validinflag");
            return (Criteria) this;
        }

        public Criteria andValidinflagNotEqualTo(Integer value) {
            addCriterion("ValidInFlag <>", value, "validinflag");
            return (Criteria) this;
        }

        public Criteria andValidinflagGreaterThan(Integer value) {
            addCriterion("ValidInFlag >", value, "validinflag");
            return (Criteria) this;
        }

        public Criteria andValidinflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("ValidInFlag >=", value, "validinflag");
            return (Criteria) this;
        }

        public Criteria andValidinflagLessThan(Integer value) {
            addCriterion("ValidInFlag <", value, "validinflag");
            return (Criteria) this;
        }

        public Criteria andValidinflagLessThanOrEqualTo(Integer value) {
            addCriterion("ValidInFlag <=", value, "validinflag");
            return (Criteria) this;
        }

        public Criteria andValidinflagIn(List<Integer> values) {
            addCriterion("ValidInFlag in", values, "validinflag");
            return (Criteria) this;
        }

        public Criteria andValidinflagNotIn(List<Integer> values) {
            addCriterion("ValidInFlag not in", values, "validinflag");
            return (Criteria) this;
        }

        public Criteria andValidinflagBetween(Integer value1, Integer value2) {
            addCriterion("ValidInFlag between", value1, value2, "validinflag");
            return (Criteria) this;
        }

        public Criteria andValidinflagNotBetween(Integer value1, Integer value2) {
            addCriterion("ValidInFlag not between", value1, value2, "validinflag");
            return (Criteria) this;
        }

        public Criteria andValidinstructionIsNull() {
            addCriterion("ValidInstruction is null");
            return (Criteria) this;
        }

        public Criteria andValidinstructionIsNotNull() {
            addCriterion("ValidInstruction is not null");
            return (Criteria) this;
        }

        public Criteria andValidinstructionEqualTo(String value) {
            addCriterion("ValidInstruction =", value, "validinstruction");
            return (Criteria) this;
        }

        public Criteria andValidinstructionNotEqualTo(String value) {
            addCriterion("ValidInstruction <>", value, "validinstruction");
            return (Criteria) this;
        }

        public Criteria andValidinstructionGreaterThan(String value) {
            addCriterion("ValidInstruction >", value, "validinstruction");
            return (Criteria) this;
        }

        public Criteria andValidinstructionGreaterThanOrEqualTo(String value) {
            addCriterion("ValidInstruction >=", value, "validinstruction");
            return (Criteria) this;
        }

        public Criteria andValidinstructionLessThan(String value) {
            addCriterion("ValidInstruction <", value, "validinstruction");
            return (Criteria) this;
        }

        public Criteria andValidinstructionLessThanOrEqualTo(String value) {
            addCriterion("ValidInstruction <=", value, "validinstruction");
            return (Criteria) this;
        }

        public Criteria andValidinstructionLike(String value) {
            addCriterion("ValidInstruction like", value, "validinstruction");
            return (Criteria) this;
        }

        public Criteria andValidinstructionNotLike(String value) {
            addCriterion("ValidInstruction not like", value, "validinstruction");
            return (Criteria) this;
        }

        public Criteria andValidinstructionIn(List<String> values) {
            addCriterion("ValidInstruction in", values, "validinstruction");
            return (Criteria) this;
        }

        public Criteria andValidinstructionNotIn(List<String> values) {
            addCriterion("ValidInstruction not in", values, "validinstruction");
            return (Criteria) this;
        }

        public Criteria andValidinstructionBetween(String value1, String value2) {
            addCriterion("ValidInstruction between", value1, value2, "validinstruction");
            return (Criteria) this;
        }

        public Criteria andValidinstructionNotBetween(String value1, String value2) {
            addCriterion("ValidInstruction not between", value1, value2, "validinstruction");
            return (Criteria) this;
        }

        public Criteria andUsercountIsNull() {
            addCriterion("UserCount is null");
            return (Criteria) this;
        }

        public Criteria andUsercountIsNotNull() {
            addCriterion("UserCount is not null");
            return (Criteria) this;
        }

        public Criteria andUsercountEqualTo(Integer value) {
            addCriterion("UserCount =", value, "usercount");
            return (Criteria) this;
        }

        public Criteria andUsercountNotEqualTo(Integer value) {
            addCriterion("UserCount <>", value, "usercount");
            return (Criteria) this;
        }

        public Criteria andUsercountGreaterThan(Integer value) {
            addCriterion("UserCount >", value, "usercount");
            return (Criteria) this;
        }

        public Criteria andUsercountGreaterThanOrEqualTo(Integer value) {
            addCriterion("UserCount >=", value, "usercount");
            return (Criteria) this;
        }

        public Criteria andUsercountLessThan(Integer value) {
            addCriterion("UserCount <", value, "usercount");
            return (Criteria) this;
        }

        public Criteria andUsercountLessThanOrEqualTo(Integer value) {
            addCriterion("UserCount <=", value, "usercount");
            return (Criteria) this;
        }

        public Criteria andUsercountIn(List<Integer> values) {
            addCriterion("UserCount in", values, "usercount");
            return (Criteria) this;
        }

        public Criteria andUsercountNotIn(List<Integer> values) {
            addCriterion("UserCount not in", values, "usercount");
            return (Criteria) this;
        }

        public Criteria andUsercountBetween(Integer value1, Integer value2) {
            addCriterion("UserCount between", value1, value2, "usercount");
            return (Criteria) this;
        }

        public Criteria andUsercountNotBetween(Integer value1, Integer value2) {
            addCriterion("UserCount not between", value1, value2, "usercount");
            return (Criteria) this;
        }

        public Criteria andIstempinspIsNull() {
            addCriterion("IsTempInsp is null");
            return (Criteria) this;
        }

        public Criteria andIstempinspIsNotNull() {
            addCriterion("IsTempInsp is not null");
            return (Criteria) this;
        }

        public Criteria andIstempinspEqualTo(Integer value) {
            addCriterion("IsTempInsp =", value, "istempinsp");
            return (Criteria) this;
        }

        public Criteria andIstempinspNotEqualTo(Integer value) {
            addCriterion("IsTempInsp <>", value, "istempinsp");
            return (Criteria) this;
        }

        public Criteria andIstempinspGreaterThan(Integer value) {
            addCriterion("IsTempInsp >", value, "istempinsp");
            return (Criteria) this;
        }

        public Criteria andIstempinspGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsTempInsp >=", value, "istempinsp");
            return (Criteria) this;
        }

        public Criteria andIstempinspLessThan(Integer value) {
            addCriterion("IsTempInsp <", value, "istempinsp");
            return (Criteria) this;
        }

        public Criteria andIstempinspLessThanOrEqualTo(Integer value) {
            addCriterion("IsTempInsp <=", value, "istempinsp");
            return (Criteria) this;
        }

        public Criteria andIstempinspIn(List<Integer> values) {
            addCriterion("IsTempInsp in", values, "istempinsp");
            return (Criteria) this;
        }

        public Criteria andIstempinspNotIn(List<Integer> values) {
            addCriterion("IsTempInsp not in", values, "istempinsp");
            return (Criteria) this;
        }

        public Criteria andIstempinspBetween(Integer value1, Integer value2) {
            addCriterion("IsTempInsp between", value1, value2, "istempinsp");
            return (Criteria) this;
        }

        public Criteria andIstempinspNotBetween(Integer value1, Integer value2) {
            addCriterion("IsTempInsp not between", value1, value2, "istempinsp");
            return (Criteria) this;
        }

        public Criteria andBusinesskeyIsNull() {
            addCriterion("BusinessKey is null");
            return (Criteria) this;
        }

        public Criteria andBusinesskeyIsNotNull() {
            addCriterion("BusinessKey is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesskeyEqualTo(String value) {
            addCriterion("BusinessKey =", value, "businesskey");
            return (Criteria) this;
        }

        public Criteria andBusinesskeyNotEqualTo(String value) {
            addCriterion("BusinessKey <>", value, "businesskey");
            return (Criteria) this;
        }

        public Criteria andBusinesskeyGreaterThan(String value) {
            addCriterion("BusinessKey >", value, "businesskey");
            return (Criteria) this;
        }

        public Criteria andBusinesskeyGreaterThanOrEqualTo(String value) {
            addCriterion("BusinessKey >=", value, "businesskey");
            return (Criteria) this;
        }

        public Criteria andBusinesskeyLessThan(String value) {
            addCriterion("BusinessKey <", value, "businesskey");
            return (Criteria) this;
        }

        public Criteria andBusinesskeyLessThanOrEqualTo(String value) {
            addCriterion("BusinessKey <=", value, "businesskey");
            return (Criteria) this;
        }

        public Criteria andBusinesskeyLike(String value) {
            addCriterion("BusinessKey like", value, "businesskey");
            return (Criteria) this;
        }

        public Criteria andBusinesskeyNotLike(String value) {
            addCriterion("BusinessKey not like", value, "businesskey");
            return (Criteria) this;
        }

        public Criteria andBusinesskeyIn(List<String> values) {
            addCriterion("BusinessKey in", values, "businesskey");
            return (Criteria) this;
        }

        public Criteria andBusinesskeyNotIn(List<String> values) {
            addCriterion("BusinessKey not in", values, "businesskey");
            return (Criteria) this;
        }

        public Criteria andBusinesskeyBetween(String value1, String value2) {
            addCriterion("BusinessKey between", value1, value2, "businesskey");
            return (Criteria) this;
        }

        public Criteria andBusinesskeyNotBetween(String value1, String value2) {
            addCriterion("BusinessKey not between", value1, value2, "businesskey");
            return (Criteria) this;
        }

        public Criteria andTaskdefkeyIsNull() {
            addCriterion("TaskDefKey is null");
            return (Criteria) this;
        }

        public Criteria andTaskdefkeyIsNotNull() {
            addCriterion("TaskDefKey is not null");
            return (Criteria) this;
        }

        public Criteria andTaskdefkeyEqualTo(String value) {
            addCriterion("TaskDefKey =", value, "taskdefkey");
            return (Criteria) this;
        }

        public Criteria andTaskdefkeyNotEqualTo(String value) {
            addCriterion("TaskDefKey <>", value, "taskdefkey");
            return (Criteria) this;
        }

        public Criteria andTaskdefkeyGreaterThan(String value) {
            addCriterion("TaskDefKey >", value, "taskdefkey");
            return (Criteria) this;
        }

        public Criteria andTaskdefkeyGreaterThanOrEqualTo(String value) {
            addCriterion("TaskDefKey >=", value, "taskdefkey");
            return (Criteria) this;
        }

        public Criteria andTaskdefkeyLessThan(String value) {
            addCriterion("TaskDefKey <", value, "taskdefkey");
            return (Criteria) this;
        }

        public Criteria andTaskdefkeyLessThanOrEqualTo(String value) {
            addCriterion("TaskDefKey <=", value, "taskdefkey");
            return (Criteria) this;
        }

        public Criteria andTaskdefkeyLike(String value) {
            addCriterion("TaskDefKey like", value, "taskdefkey");
            return (Criteria) this;
        }

        public Criteria andTaskdefkeyNotLike(String value) {
            addCriterion("TaskDefKey not like", value, "taskdefkey");
            return (Criteria) this;
        }

        public Criteria andTaskdefkeyIn(List<String> values) {
            addCriterion("TaskDefKey in", values, "taskdefkey");
            return (Criteria) this;
        }

        public Criteria andTaskdefkeyNotIn(List<String> values) {
            addCriterion("TaskDefKey not in", values, "taskdefkey");
            return (Criteria) this;
        }

        public Criteria andTaskdefkeyBetween(String value1, String value2) {
            addCriterion("TaskDefKey between", value1, value2, "taskdefkey");
            return (Criteria) this;
        }

        public Criteria andTaskdefkeyNotBetween(String value1, String value2) {
            addCriterion("TaskDefKey not between", value1, value2, "taskdefkey");
            return (Criteria) this;
        }

        public Criteria andInitiateuserIsNull() {
            addCriterion("InitiateUser is null");
            return (Criteria) this;
        }

        public Criteria andInitiateuserIsNotNull() {
            addCriterion("InitiateUser is not null");
            return (Criteria) this;
        }

        public Criteria andInitiateuserEqualTo(String value) {
            addCriterion("InitiateUser =", value, "initiateuser");
            return (Criteria) this;
        }

        public Criteria andInitiateuserNotEqualTo(String value) {
            addCriterion("InitiateUser <>", value, "initiateuser");
            return (Criteria) this;
        }

        public Criteria andInitiateuserGreaterThan(String value) {
            addCriterion("InitiateUser >", value, "initiateuser");
            return (Criteria) this;
        }

        public Criteria andInitiateuserGreaterThanOrEqualTo(String value) {
            addCriterion("InitiateUser >=", value, "initiateuser");
            return (Criteria) this;
        }

        public Criteria andInitiateuserLessThan(String value) {
            addCriterion("InitiateUser <", value, "initiateuser");
            return (Criteria) this;
        }

        public Criteria andInitiateuserLessThanOrEqualTo(String value) {
            addCriterion("InitiateUser <=", value, "initiateuser");
            return (Criteria) this;
        }

        public Criteria andInitiateuserLike(String value) {
            addCriterion("InitiateUser like", value, "initiateuser");
            return (Criteria) this;
        }

        public Criteria andInitiateuserNotLike(String value) {
            addCriterion("InitiateUser not like", value, "initiateuser");
            return (Criteria) this;
        }

        public Criteria andInitiateuserIn(List<String> values) {
            addCriterion("InitiateUser in", values, "initiateuser");
            return (Criteria) this;
        }

        public Criteria andInitiateuserNotIn(List<String> values) {
            addCriterion("InitiateUser not in", values, "initiateuser");
            return (Criteria) this;
        }

        public Criteria andInitiateuserBetween(String value1, String value2) {
            addCriterion("InitiateUser between", value1, value2, "initiateuser");
            return (Criteria) this;
        }

        public Criteria andInitiateuserNotBetween(String value1, String value2) {
            addCriterion("InitiateUser not between", value1, value2, "initiateuser");
            return (Criteria) this;
        }

        public Criteria andNfccodeIsNull() {
            addCriterion("NfcCode is null");
            return (Criteria) this;
        }

        public Criteria andNfccodeIsNotNull() {
            addCriterion("NfcCode is not null");
            return (Criteria) this;
        }

        public Criteria andNfccodeEqualTo(Integer value) {
            addCriterion("NfcCode =", value, "nfccode");
            return (Criteria) this;
        }

        public Criteria andNfccodeNotEqualTo(Integer value) {
            addCriterion("NfcCode <>", value, "nfccode");
            return (Criteria) this;
        }

        public Criteria andNfccodeGreaterThan(Integer value) {
            addCriterion("NfcCode >", value, "nfccode");
            return (Criteria) this;
        }

        public Criteria andNfccodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("NfcCode >=", value, "nfccode");
            return (Criteria) this;
        }

        public Criteria andNfccodeLessThan(Integer value) {
            addCriterion("NfcCode <", value, "nfccode");
            return (Criteria) this;
        }

        public Criteria andNfccodeLessThanOrEqualTo(Integer value) {
            addCriterion("NfcCode <=", value, "nfccode");
            return (Criteria) this;
        }

        public Criteria andNfccodeIn(List<Integer> values) {
            addCriterion("NfcCode in", values, "nfccode");
            return (Criteria) this;
        }

        public Criteria andNfccodeNotIn(List<Integer> values) {
            addCriterion("NfcCode not in", values, "nfccode");
            return (Criteria) this;
        }

        public Criteria andNfccodeBetween(Integer value1, Integer value2) {
            addCriterion("NfcCode between", value1, value2, "nfccode");
            return (Criteria) this;
        }

        public Criteria andNfccodeNotBetween(Integer value1, Integer value2) {
            addCriterion("NfcCode not between", value1, value2, "nfccode");
            return (Criteria) this;
        }

        public Criteria andValidinuseridIsNull() {
            addCriterion("ValidInUserId is null");
            return (Criteria) this;
        }

        public Criteria andValidinuseridIsNotNull() {
            addCriterion("ValidInUserId is not null");
            return (Criteria) this;
        }

        public Criteria andValidinuseridEqualTo(Integer value) {
            addCriterion("ValidInUserId =", value, "validinuserid");
            return (Criteria) this;
        }

        public Criteria andValidinuseridNotEqualTo(Integer value) {
            addCriterion("ValidInUserId <>", value, "validinuserid");
            return (Criteria) this;
        }

        public Criteria andValidinuseridGreaterThan(Integer value) {
            addCriterion("ValidInUserId >", value, "validinuserid");
            return (Criteria) this;
        }

        public Criteria andValidinuseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("ValidInUserId >=", value, "validinuserid");
            return (Criteria) this;
        }

        public Criteria andValidinuseridLessThan(Integer value) {
            addCriterion("ValidInUserId <", value, "validinuserid");
            return (Criteria) this;
        }

        public Criteria andValidinuseridLessThanOrEqualTo(Integer value) {
            addCriterion("ValidInUserId <=", value, "validinuserid");
            return (Criteria) this;
        }

        public Criteria andValidinuseridIn(List<Integer> values) {
            addCriterion("ValidInUserId in", values, "validinuserid");
            return (Criteria) this;
        }

        public Criteria andValidinuseridNotIn(List<Integer> values) {
            addCriterion("ValidInUserId not in", values, "validinuserid");
            return (Criteria) this;
        }

        public Criteria andValidinuseridBetween(Integer value1, Integer value2) {
            addCriterion("ValidInUserId between", value1, value2, "validinuserid");
            return (Criteria) this;
        }

        public Criteria andValidinuseridNotBetween(Integer value1, Integer value2) {
            addCriterion("ValidInUserId not between", value1, value2, "validinuserid");
            return (Criteria) this;
        }

        public Criteria andUncompletereasonIsNull() {
            addCriterion("UncompleteReason is null");
            return (Criteria) this;
        }

        public Criteria andUncompletereasonIsNotNull() {
            addCriterion("UncompleteReason is not null");
            return (Criteria) this;
        }

        public Criteria andUncompletereasonEqualTo(String value) {
            addCriterion("UncompleteReason =", value, "uncompletereason");
            return (Criteria) this;
        }

        public Criteria andUncompletereasonNotEqualTo(String value) {
            addCriterion("UncompleteReason <>", value, "uncompletereason");
            return (Criteria) this;
        }

        public Criteria andUncompletereasonGreaterThan(String value) {
            addCriterion("UncompleteReason >", value, "uncompletereason");
            return (Criteria) this;
        }

        public Criteria andUncompletereasonGreaterThanOrEqualTo(String value) {
            addCriterion("UncompleteReason >=", value, "uncompletereason");
            return (Criteria) this;
        }

        public Criteria andUncompletereasonLessThan(String value) {
            addCriterion("UncompleteReason <", value, "uncompletereason");
            return (Criteria) this;
        }

        public Criteria andUncompletereasonLessThanOrEqualTo(String value) {
            addCriterion("UncompleteReason <=", value, "uncompletereason");
            return (Criteria) this;
        }

        public Criteria andUncompletereasonLike(String value) {
            addCriterion("UncompleteReason like", value, "uncompletereason");
            return (Criteria) this;
        }

        public Criteria andUncompletereasonNotLike(String value) {
            addCriterion("UncompleteReason not like", value, "uncompletereason");
            return (Criteria) this;
        }

        public Criteria andUncompletereasonIn(List<String> values) {
            addCriterion("UncompleteReason in", values, "uncompletereason");
            return (Criteria) this;
        }

        public Criteria andUncompletereasonNotIn(List<String> values) {
            addCriterion("UncompleteReason not in", values, "uncompletereason");
            return (Criteria) this;
        }

        public Criteria andUncompletereasonBetween(String value1, String value2) {
            addCriterion("UncompleteReason between", value1, value2, "uncompletereason");
            return (Criteria) this;
        }

        public Criteria andUncompletereasonNotBetween(String value1, String value2) {
            addCriterion("UncompleteReason not between", value1, value2, "uncompletereason");
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