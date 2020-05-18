package com.yaao.ps10.quartz.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskScheduleJobExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaskScheduleJobExample() {
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

        public Criteria andJobIdIsNull() {
            addCriterion("Job_ID is null");
            return (Criteria) this;
        }

        public Criteria andJobIdIsNotNull() {
            addCriterion("Job_ID is not null");
            return (Criteria) this;
        }

        public Criteria andJobIdEqualTo(Long value) {
            addCriterion("Job_ID =", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotEqualTo(Long value) {
            addCriterion("Job_ID <>", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThan(Long value) {
            addCriterion("Job_ID >", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThanOrEqualTo(Long value) {
            addCriterion("Job_ID >=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThan(Long value) {
            addCriterion("Job_ID <", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThanOrEqualTo(Long value) {
            addCriterion("Job_ID <=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdIn(List<Long> values) {
            addCriterion("Job_ID in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotIn(List<Long> values) {
            addCriterion("Job_ID not in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdBetween(Long value1, Long value2) {
            addCriterion("Job_ID between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotBetween(Long value1, Long value2) {
            addCriterion("Job_ID not between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("Create_Time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("Create_Time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("Create_Time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("Create_Time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("Create_Time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Create_Time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("Create_Time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("Create_Time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("Create_Time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("Create_Time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("Create_Time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("Create_Time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("Update_Time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("Update_Time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("Update_Time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("Update_Time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("Update_Time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Update_Time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("Update_Time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("Update_Time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("Update_Time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("Update_Time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("Update_Time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("Update_Time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andJobNameIsNull() {
            addCriterion("Job_Name is null");
            return (Criteria) this;
        }

        public Criteria andJobNameIsNotNull() {
            addCriterion("Job_Name is not null");
            return (Criteria) this;
        }

        public Criteria andJobNameEqualTo(String value) {
            addCriterion("Job_Name =", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotEqualTo(String value) {
            addCriterion("Job_Name <>", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameGreaterThan(String value) {
            addCriterion("Job_Name >", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameGreaterThanOrEqualTo(String value) {
            addCriterion("Job_Name >=", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLessThan(String value) {
            addCriterion("Job_Name <", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLessThanOrEqualTo(String value) {
            addCriterion("Job_Name <=", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLike(String value) {
            addCriterion("Job_Name like", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotLike(String value) {
            addCriterion("Job_Name not like", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameIn(List<String> values) {
            addCriterion("Job_Name in", values, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotIn(List<String> values) {
            addCriterion("Job_Name not in", values, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameBetween(String value1, String value2) {
            addCriterion("Job_Name between", value1, value2, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotBetween(String value1, String value2) {
            addCriterion("Job_Name not between", value1, value2, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobGroupIsNull() {
            addCriterion("Job_Group is null");
            return (Criteria) this;
        }

        public Criteria andJobGroupIsNotNull() {
            addCriterion("Job_Group is not null");
            return (Criteria) this;
        }

        public Criteria andJobGroupEqualTo(String value) {
            addCriterion("Job_Group =", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupNotEqualTo(String value) {
            addCriterion("Job_Group <>", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupGreaterThan(String value) {
            addCriterion("Job_Group >", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupGreaterThanOrEqualTo(String value) {
            addCriterion("Job_Group >=", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupLessThan(String value) {
            addCriterion("Job_Group <", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupLessThanOrEqualTo(String value) {
            addCriterion("Job_Group <=", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupLike(String value) {
            addCriterion("Job_Group like", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupNotLike(String value) {
            addCriterion("Job_Group not like", value, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupIn(List<String> values) {
            addCriterion("Job_Group in", values, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupNotIn(List<String> values) {
            addCriterion("Job_Group not in", values, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupBetween(String value1, String value2) {
            addCriterion("Job_Group between", value1, value2, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobGroupNotBetween(String value1, String value2) {
            addCriterion("Job_Group not between", value1, value2, "jobGroup");
            return (Criteria) this;
        }

        public Criteria andJobStatusIsNull() {
            addCriterion("Job_Status is null");
            return (Criteria) this;
        }

        public Criteria andJobStatusIsNotNull() {
            addCriterion("Job_Status is not null");
            return (Criteria) this;
        }

        public Criteria andJobStatusEqualTo(String value) {
            addCriterion("Job_Status =", value, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusNotEqualTo(String value) {
            addCriterion("Job_Status <>", value, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusGreaterThan(String value) {
            addCriterion("Job_Status >", value, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusGreaterThanOrEqualTo(String value) {
            addCriterion("Job_Status >=", value, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusLessThan(String value) {
            addCriterion("Job_Status <", value, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusLessThanOrEqualTo(String value) {
            addCriterion("Job_Status <=", value, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusLike(String value) {
            addCriterion("Job_Status like", value, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusNotLike(String value) {
            addCriterion("Job_Status not like", value, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusIn(List<String> values) {
            addCriterion("Job_Status in", values, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusNotIn(List<String> values) {
            addCriterion("Job_Status not in", values, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusBetween(String value1, String value2) {
            addCriterion("Job_Status between", value1, value2, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andJobStatusNotBetween(String value1, String value2) {
            addCriterion("Job_Status not between", value1, value2, "jobStatus");
            return (Criteria) this;
        }

        public Criteria andCronExpressionIsNull() {
            addCriterion("Cron_Expression is null");
            return (Criteria) this;
        }

        public Criteria andCronExpressionIsNotNull() {
            addCriterion("Cron_Expression is not null");
            return (Criteria) this;
        }

        public Criteria andCronExpressionEqualTo(String value) {
            addCriterion("Cron_Expression =", value, "cronExpression");
            return (Criteria) this;
        }

        public Criteria andCronExpressionNotEqualTo(String value) {
            addCriterion("Cron_Expression <>", value, "cronExpression");
            return (Criteria) this;
        }

        public Criteria andCronExpressionGreaterThan(String value) {
            addCriterion("Cron_Expression >", value, "cronExpression");
            return (Criteria) this;
        }

        public Criteria andCronExpressionGreaterThanOrEqualTo(String value) {
            addCriterion("Cron_Expression >=", value, "cronExpression");
            return (Criteria) this;
        }

        public Criteria andCronExpressionLessThan(String value) {
            addCriterion("Cron_Expression <", value, "cronExpression");
            return (Criteria) this;
        }

        public Criteria andCronExpressionLessThanOrEqualTo(String value) {
            addCriterion("Cron_Expression <=", value, "cronExpression");
            return (Criteria) this;
        }

        public Criteria andCronExpressionLike(String value) {
            addCriterion("Cron_Expression like", value, "cronExpression");
            return (Criteria) this;
        }

        public Criteria andCronExpressionNotLike(String value) {
            addCriterion("Cron_Expression not like", value, "cronExpression");
            return (Criteria) this;
        }

        public Criteria andCronExpressionIn(List<String> values) {
            addCriterion("Cron_Expression in", values, "cronExpression");
            return (Criteria) this;
        }

        public Criteria andCronExpressionNotIn(List<String> values) {
            addCriterion("Cron_Expression not in", values, "cronExpression");
            return (Criteria) this;
        }

        public Criteria andCronExpressionBetween(String value1, String value2) {
            addCriterion("Cron_Expression between", value1, value2, "cronExpression");
            return (Criteria) this;
        }

        public Criteria andCronExpressionNotBetween(String value1, String value2) {
            addCriterion("Cron_Expression not between", value1, value2, "cronExpression");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("Description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("Description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("Description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("Description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("Description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("Description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("Description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("Description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("Description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("Description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("Description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("Description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("Description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("Description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andBeanClassIsNull() {
            addCriterion("Bean_Class is null");
            return (Criteria) this;
        }

        public Criteria andBeanClassIsNotNull() {
            addCriterion("Bean_Class is not null");
            return (Criteria) this;
        }

        public Criteria andBeanClassEqualTo(String value) {
            addCriterion("Bean_Class =", value, "beanClass");
            return (Criteria) this;
        }

        public Criteria andBeanClassNotEqualTo(String value) {
            addCriterion("Bean_Class <>", value, "beanClass");
            return (Criteria) this;
        }

        public Criteria andBeanClassGreaterThan(String value) {
            addCriterion("Bean_Class >", value, "beanClass");
            return (Criteria) this;
        }

        public Criteria andBeanClassGreaterThanOrEqualTo(String value) {
            addCriterion("Bean_Class >=", value, "beanClass");
            return (Criteria) this;
        }

        public Criteria andBeanClassLessThan(String value) {
            addCriterion("Bean_Class <", value, "beanClass");
            return (Criteria) this;
        }

        public Criteria andBeanClassLessThanOrEqualTo(String value) {
            addCriterion("Bean_Class <=", value, "beanClass");
            return (Criteria) this;
        }

        public Criteria andBeanClassLike(String value) {
            addCriterion("Bean_Class like", value, "beanClass");
            return (Criteria) this;
        }

        public Criteria andBeanClassNotLike(String value) {
            addCriterion("Bean_Class not like", value, "beanClass");
            return (Criteria) this;
        }

        public Criteria andBeanClassIn(List<String> values) {
            addCriterion("Bean_Class in", values, "beanClass");
            return (Criteria) this;
        }

        public Criteria andBeanClassNotIn(List<String> values) {
            addCriterion("Bean_Class not in", values, "beanClass");
            return (Criteria) this;
        }

        public Criteria andBeanClassBetween(String value1, String value2) {
            addCriterion("Bean_Class between", value1, value2, "beanClass");
            return (Criteria) this;
        }

        public Criteria andBeanClassNotBetween(String value1, String value2) {
            addCriterion("Bean_Class not between", value1, value2, "beanClass");
            return (Criteria) this;
        }

        public Criteria andIsconcurrentIsNull() {
            addCriterion("IsConcurrent is null");
            return (Criteria) this;
        }

        public Criteria andIsconcurrentIsNotNull() {
            addCriterion("IsConcurrent is not null");
            return (Criteria) this;
        }

        public Criteria andIsconcurrentEqualTo(String value) {
            addCriterion("IsConcurrent =", value, "isconcurrent");
            return (Criteria) this;
        }

        public Criteria andIsconcurrentNotEqualTo(String value) {
            addCriterion("IsConcurrent <>", value, "isconcurrent");
            return (Criteria) this;
        }

        public Criteria andIsconcurrentGreaterThan(String value) {
            addCriterion("IsConcurrent >", value, "isconcurrent");
            return (Criteria) this;
        }

        public Criteria andIsconcurrentGreaterThanOrEqualTo(String value) {
            addCriterion("IsConcurrent >=", value, "isconcurrent");
            return (Criteria) this;
        }

        public Criteria andIsconcurrentLessThan(String value) {
            addCriterion("IsConcurrent <", value, "isconcurrent");
            return (Criteria) this;
        }

        public Criteria andIsconcurrentLessThanOrEqualTo(String value) {
            addCriterion("IsConcurrent <=", value, "isconcurrent");
            return (Criteria) this;
        }

        public Criteria andIsconcurrentLike(String value) {
            addCriterion("IsConcurrent like", value, "isconcurrent");
            return (Criteria) this;
        }

        public Criteria andIsconcurrentNotLike(String value) {
            addCriterion("IsConcurrent not like", value, "isconcurrent");
            return (Criteria) this;
        }

        public Criteria andIsconcurrentIn(List<String> values) {
            addCriterion("IsConcurrent in", values, "isconcurrent");
            return (Criteria) this;
        }

        public Criteria andIsconcurrentNotIn(List<String> values) {
            addCriterion("IsConcurrent not in", values, "isconcurrent");
            return (Criteria) this;
        }

        public Criteria andIsconcurrentBetween(String value1, String value2) {
            addCriterion("IsConcurrent between", value1, value2, "isconcurrent");
            return (Criteria) this;
        }

        public Criteria andIsconcurrentNotBetween(String value1, String value2) {
            addCriterion("IsConcurrent not between", value1, value2, "isconcurrent");
            return (Criteria) this;
        }

        public Criteria andSpringIdIsNull() {
            addCriterion("Spring_Id is null");
            return (Criteria) this;
        }

        public Criteria andSpringIdIsNotNull() {
            addCriterion("Spring_Id is not null");
            return (Criteria) this;
        }

        public Criteria andSpringIdEqualTo(String value) {
            addCriterion("Spring_Id =", value, "springId");
            return (Criteria) this;
        }

        public Criteria andSpringIdNotEqualTo(String value) {
            addCriterion("Spring_Id <>", value, "springId");
            return (Criteria) this;
        }

        public Criteria andSpringIdGreaterThan(String value) {
            addCriterion("Spring_Id >", value, "springId");
            return (Criteria) this;
        }

        public Criteria andSpringIdGreaterThanOrEqualTo(String value) {
            addCriterion("Spring_Id >=", value, "springId");
            return (Criteria) this;
        }

        public Criteria andSpringIdLessThan(String value) {
            addCriterion("Spring_Id <", value, "springId");
            return (Criteria) this;
        }

        public Criteria andSpringIdLessThanOrEqualTo(String value) {
            addCriterion("Spring_Id <=", value, "springId");
            return (Criteria) this;
        }

        public Criteria andSpringIdLike(String value) {
            addCriterion("Spring_Id like", value, "springId");
            return (Criteria) this;
        }

        public Criteria andSpringIdNotLike(String value) {
            addCriterion("Spring_Id not like", value, "springId");
            return (Criteria) this;
        }

        public Criteria andSpringIdIn(List<String> values) {
            addCriterion("Spring_Id in", values, "springId");
            return (Criteria) this;
        }

        public Criteria andSpringIdNotIn(List<String> values) {
            addCriterion("Spring_Id not in", values, "springId");
            return (Criteria) this;
        }

        public Criteria andSpringIdBetween(String value1, String value2) {
            addCriterion("Spring_Id between", value1, value2, "springId");
            return (Criteria) this;
        }

        public Criteria andSpringIdNotBetween(String value1, String value2) {
            addCriterion("Spring_Id not between", value1, value2, "springId");
            return (Criteria) this;
        }

        public Criteria andMethodNameIsNull() {
            addCriterion("Method_Name is null");
            return (Criteria) this;
        }

        public Criteria andMethodNameIsNotNull() {
            addCriterion("Method_Name is not null");
            return (Criteria) this;
        }

        public Criteria andMethodNameEqualTo(String value) {
            addCriterion("Method_Name =", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameNotEqualTo(String value) {
            addCriterion("Method_Name <>", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameGreaterThan(String value) {
            addCriterion("Method_Name >", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameGreaterThanOrEqualTo(String value) {
            addCriterion("Method_Name >=", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameLessThan(String value) {
            addCriterion("Method_Name <", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameLessThanOrEqualTo(String value) {
            addCriterion("Method_Name <=", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameLike(String value) {
            addCriterion("Method_Name like", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameNotLike(String value) {
            addCriterion("Method_Name not like", value, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameIn(List<String> values) {
            addCriterion("Method_Name in", values, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameNotIn(List<String> values) {
            addCriterion("Method_Name not in", values, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameBetween(String value1, String value2) {
            addCriterion("Method_Name between", value1, value2, "methodName");
            return (Criteria) this;
        }

        public Criteria andMethodNameNotBetween(String value1, String value2) {
            addCriterion("Method_Name not between", value1, value2, "methodName");
            return (Criteria) this;
        }

        public Criteria andJobTyleIsNull() {
            addCriterion("Job_Tyle is null");
            return (Criteria) this;
        }

        public Criteria andJobTyleIsNotNull() {
            addCriterion("Job_Tyle is not null");
            return (Criteria) this;
        }

        public Criteria andJobTyleEqualTo(String value) {
            addCriterion("Job_Tyle =", value, "jobTyle");
            return (Criteria) this;
        }

        public Criteria andJobTyleNotEqualTo(String value) {
            addCriterion("Job_Tyle <>", value, "jobTyle");
            return (Criteria) this;
        }

        public Criteria andJobTyleGreaterThan(String value) {
            addCriterion("Job_Tyle >", value, "jobTyle");
            return (Criteria) this;
        }

        public Criteria andJobTyleGreaterThanOrEqualTo(String value) {
            addCriterion("Job_Tyle >=", value, "jobTyle");
            return (Criteria) this;
        }

        public Criteria andJobTyleLessThan(String value) {
            addCriterion("Job_Tyle <", value, "jobTyle");
            return (Criteria) this;
        }

        public Criteria andJobTyleLessThanOrEqualTo(String value) {
            addCriterion("Job_Tyle <=", value, "jobTyle");
            return (Criteria) this;
        }

        public Criteria andJobTyleLike(String value) {
            addCriterion("Job_Tyle like", value, "jobTyle");
            return (Criteria) this;
        }

        public Criteria andJobTyleNotLike(String value) {
            addCriterion("Job_Tyle not like", value, "jobTyle");
            return (Criteria) this;
        }

        public Criteria andJobTyleIn(List<String> values) {
            addCriterion("Job_Tyle in", values, "jobTyle");
            return (Criteria) this;
        }

        public Criteria andJobTyleNotIn(List<String> values) {
            addCriterion("Job_Tyle not in", values, "jobTyle");
            return (Criteria) this;
        }

        public Criteria andJobTyleBetween(String value1, String value2) {
            addCriterion("Job_Tyle between", value1, value2, "jobTyle");
            return (Criteria) this;
        }

        public Criteria andJobTyleNotBetween(String value1, String value2) {
            addCriterion("Job_Tyle not between", value1, value2, "jobTyle");
            return (Criteria) this;
        }

        public Criteria andJobSubtypeIsNull() {
            addCriterion("Job_SubType is null");
            return (Criteria) this;
        }

        public Criteria andJobSubtypeIsNotNull() {
            addCriterion("Job_SubType is not null");
            return (Criteria) this;
        }

        public Criteria andJobSubtypeEqualTo(String value) {
            addCriterion("Job_SubType =", value, "jobSubtype");
            return (Criteria) this;
        }

        public Criteria andJobSubtypeNotEqualTo(String value) {
            addCriterion("Job_SubType <>", value, "jobSubtype");
            return (Criteria) this;
        }

        public Criteria andJobSubtypeGreaterThan(String value) {
            addCriterion("Job_SubType >", value, "jobSubtype");
            return (Criteria) this;
        }

        public Criteria andJobSubtypeGreaterThanOrEqualTo(String value) {
            addCriterion("Job_SubType >=", value, "jobSubtype");
            return (Criteria) this;
        }

        public Criteria andJobSubtypeLessThan(String value) {
            addCriterion("Job_SubType <", value, "jobSubtype");
            return (Criteria) this;
        }

        public Criteria andJobSubtypeLessThanOrEqualTo(String value) {
            addCriterion("Job_SubType <=", value, "jobSubtype");
            return (Criteria) this;
        }

        public Criteria andJobSubtypeLike(String value) {
            addCriterion("Job_SubType like", value, "jobSubtype");
            return (Criteria) this;
        }

        public Criteria andJobSubtypeNotLike(String value) {
            addCriterion("Job_SubType not like", value, "jobSubtype");
            return (Criteria) this;
        }

        public Criteria andJobSubtypeIn(List<String> values) {
            addCriterion("Job_SubType in", values, "jobSubtype");
            return (Criteria) this;
        }

        public Criteria andJobSubtypeNotIn(List<String> values) {
            addCriterion("Job_SubType not in", values, "jobSubtype");
            return (Criteria) this;
        }

        public Criteria andJobSubtypeBetween(String value1, String value2) {
            addCriterion("Job_SubType between", value1, value2, "jobSubtype");
            return (Criteria) this;
        }

        public Criteria andJobSubtypeNotBetween(String value1, String value2) {
            addCriterion("Job_SubType not between", value1, value2, "jobSubtype");
            return (Criteria) this;
        }

        public Criteria andActIdIsNull() {
            addCriterion("ACT_ID is null");
            return (Criteria) this;
        }

        public Criteria andActIdIsNotNull() {
            addCriterion("ACT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andActIdEqualTo(String value) {
            addCriterion("ACT_ID =", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdNotEqualTo(String value) {
            addCriterion("ACT_ID <>", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdGreaterThan(String value) {
            addCriterion("ACT_ID >", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdGreaterThanOrEqualTo(String value) {
            addCriterion("ACT_ID >=", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdLessThan(String value) {
            addCriterion("ACT_ID <", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdLessThanOrEqualTo(String value) {
            addCriterion("ACT_ID <=", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdLike(String value) {
            addCriterion("ACT_ID like", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdNotLike(String value) {
            addCriterion("ACT_ID not like", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdIn(List<String> values) {
            addCriterion("ACT_ID in", values, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdNotIn(List<String> values) {
            addCriterion("ACT_ID not in", values, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdBetween(String value1, String value2) {
            addCriterion("ACT_ID between", value1, value2, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdNotBetween(String value1, String value2) {
            addCriterion("ACT_ID not between", value1, value2, "actId");
            return (Criteria) this;
        }

        public Criteria andPeriodIsNull() {
            addCriterion("Period is null");
            return (Criteria) this;
        }

        public Criteria andPeriodIsNotNull() {
            addCriterion("Period is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodEqualTo(Integer value) {
            addCriterion("Period =", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotEqualTo(Integer value) {
            addCriterion("Period <>", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodGreaterThan(Integer value) {
            addCriterion("Period >", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodGreaterThanOrEqualTo(Integer value) {
            addCriterion("Period >=", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodLessThan(Integer value) {
            addCriterion("Period <", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodLessThanOrEqualTo(Integer value) {
            addCriterion("Period <=", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodIn(List<Integer> values) {
            addCriterion("Period in", values, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotIn(List<Integer> values) {
            addCriterion("Period not in", values, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodBetween(Integer value1, Integer value2) {
            addCriterion("Period between", value1, value2, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotBetween(Integer value1, Integer value2) {
            addCriterion("Period not between", value1, value2, "period");
            return (Criteria) this;
        }

        public Criteria andValiduseridIsNull() {
            addCriterion("ValidUserID is null");
            return (Criteria) this;
        }

        public Criteria andValiduseridIsNotNull() {
            addCriterion("ValidUserID is not null");
            return (Criteria) this;
        }

        public Criteria andValiduseridEqualTo(Integer value) {
            addCriterion("ValidUserID =", value, "validuserid");
            return (Criteria) this;
        }

        public Criteria andValiduseridNotEqualTo(Integer value) {
            addCriterion("ValidUserID <>", value, "validuserid");
            return (Criteria) this;
        }

        public Criteria andValiduseridGreaterThan(Integer value) {
            addCriterion("ValidUserID >", value, "validuserid");
            return (Criteria) this;
        }

        public Criteria andValiduseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("ValidUserID >=", value, "validuserid");
            return (Criteria) this;
        }

        public Criteria andValiduseridLessThan(Integer value) {
            addCriterion("ValidUserID <", value, "validuserid");
            return (Criteria) this;
        }

        public Criteria andValiduseridLessThanOrEqualTo(Integer value) {
            addCriterion("ValidUserID <=", value, "validuserid");
            return (Criteria) this;
        }

        public Criteria andValiduseridIn(List<Integer> values) {
            addCriterion("ValidUserID in", values, "validuserid");
            return (Criteria) this;
        }

        public Criteria andValiduseridNotIn(List<Integer> values) {
            addCriterion("ValidUserID not in", values, "validuserid");
            return (Criteria) this;
        }

        public Criteria andValiduseridBetween(Integer value1, Integer value2) {
            addCriterion("ValidUserID between", value1, value2, "validuserid");
            return (Criteria) this;
        }

        public Criteria andValiduseridNotBetween(Integer value1, Integer value2) {
            addCriterion("ValidUserID not between", value1, value2, "validuserid");
            return (Criteria) this;
        }

        public Criteria andDutyCycleIsNull() {
            addCriterion("Duty_Cycle is null");
            return (Criteria) this;
        }

        public Criteria andDutyCycleIsNotNull() {
            addCriterion("Duty_Cycle is not null");
            return (Criteria) this;
        }

        public Criteria andDutyCycleEqualTo(Integer value) {
            addCriterion("Duty_Cycle =", value, "dutyCycle");
            return (Criteria) this;
        }

        public Criteria andDutyCycleNotEqualTo(Integer value) {
            addCriterion("Duty_Cycle <>", value, "dutyCycle");
            return (Criteria) this;
        }

        public Criteria andDutyCycleGreaterThan(Integer value) {
            addCriterion("Duty_Cycle >", value, "dutyCycle");
            return (Criteria) this;
        }

        public Criteria andDutyCycleGreaterThanOrEqualTo(Integer value) {
            addCriterion("Duty_Cycle >=", value, "dutyCycle");
            return (Criteria) this;
        }

        public Criteria andDutyCycleLessThan(Integer value) {
            addCriterion("Duty_Cycle <", value, "dutyCycle");
            return (Criteria) this;
        }

        public Criteria andDutyCycleLessThanOrEqualTo(Integer value) {
            addCriterion("Duty_Cycle <=", value, "dutyCycle");
            return (Criteria) this;
        }

        public Criteria andDutyCycleIn(List<Integer> values) {
            addCriterion("Duty_Cycle in", values, "dutyCycle");
            return (Criteria) this;
        }

        public Criteria andDutyCycleNotIn(List<Integer> values) {
            addCriterion("Duty_Cycle not in", values, "dutyCycle");
            return (Criteria) this;
        }

        public Criteria andDutyCycleBetween(Integer value1, Integer value2) {
            addCriterion("Duty_Cycle between", value1, value2, "dutyCycle");
            return (Criteria) this;
        }

        public Criteria andDutyCycleNotBetween(Integer value1, Integer value2) {
            addCriterion("Duty_Cycle not between", value1, value2, "dutyCycle");
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