package com.yaao.ps10.base.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserTableExample() {
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

        public Criteria andMemberidIsNull() {
            addCriterion("MemberID is null");
            return (Criteria) this;
        }

        public Criteria andMemberidIsNotNull() {
            addCriterion("MemberID is not null");
            return (Criteria) this;
        }

        public Criteria andMemberidEqualTo(Integer value) {
            addCriterion("MemberID =", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotEqualTo(Integer value) {
            addCriterion("MemberID <>", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidGreaterThan(Integer value) {
            addCriterion("MemberID >", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidGreaterThanOrEqualTo(Integer value) {
            addCriterion("MemberID >=", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidLessThan(Integer value) {
            addCriterion("MemberID <", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidLessThanOrEqualTo(Integer value) {
            addCriterion("MemberID <=", value, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidIn(List<Integer> values) {
            addCriterion("MemberID in", values, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotIn(List<Integer> values) {
            addCriterion("MemberID not in", values, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidBetween(Integer value1, Integer value2) {
            addCriterion("MemberID between", value1, value2, "memberid");
            return (Criteria) this;
        }

        public Criteria andMemberidNotBetween(Integer value1, Integer value2) {
            addCriterion("MemberID not between", value1, value2, "memberid");
            return (Criteria) this;
        }

        public Criteria andLognameIsNull() {
            addCriterion("LogName is null");
            return (Criteria) this;
        }

        public Criteria andLognameIsNotNull() {
            addCriterion("LogName is not null");
            return (Criteria) this;
        }

        public Criteria andLognameEqualTo(String value) {
            addCriterion("LogName =", value, "logname");
            return (Criteria) this;
        }

        public Criteria andLognameNotEqualTo(String value) {
            addCriterion("LogName <>", value, "logname");
            return (Criteria) this;
        }

        public Criteria andLognameGreaterThan(String value) {
            addCriterion("LogName >", value, "logname");
            return (Criteria) this;
        }

        public Criteria andLognameGreaterThanOrEqualTo(String value) {
            addCriterion("LogName >=", value, "logname");
            return (Criteria) this;
        }

        public Criteria andLognameLessThan(String value) {
            addCriterion("LogName <", value, "logname");
            return (Criteria) this;
        }

        public Criteria andLognameLessThanOrEqualTo(String value) {
            addCriterion("LogName <=", value, "logname");
            return (Criteria) this;
        }

        public Criteria andLognameLike(String value) {
            addCriterion("LogName like", value, "logname");
            return (Criteria) this;
        }

        public Criteria andLognameNotLike(String value) {
            addCriterion("LogName not like", value, "logname");
            return (Criteria) this;
        }

        public Criteria andLognameIn(List<String> values) {
            addCriterion("LogName in", values, "logname");
            return (Criteria) this;
        }

        public Criteria andLognameNotIn(List<String> values) {
            addCriterion("LogName not in", values, "logname");
            return (Criteria) this;
        }

        public Criteria andLognameBetween(String value1, String value2) {
            addCriterion("LogName between", value1, value2, "logname");
            return (Criteria) this;
        }

        public Criteria andLognameNotBetween(String value1, String value2) {
            addCriterion("LogName not between", value1, value2, "logname");
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

        public Criteria andDepartmentidIsNull() {
            addCriterion("DepartmentID is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIsNotNull() {
            addCriterion("DepartmentID is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentidEqualTo(Integer value) {
            addCriterion("DepartmentID =", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotEqualTo(Integer value) {
            addCriterion("DepartmentID <>", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThan(Integer value) {
            addCriterion("DepartmentID >", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DepartmentID >=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThan(Integer value) {
            addCriterion("DepartmentID <", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidLessThanOrEqualTo(Integer value) {
            addCriterion("DepartmentID <=", value, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidIn(List<Integer> values) {
            addCriterion("DepartmentID in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotIn(List<Integer> values) {
            addCriterion("DepartmentID not in", values, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidBetween(Integer value1, Integer value2) {
            addCriterion("DepartmentID between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andDepartmentidNotBetween(Integer value1, Integer value2) {
            addCriterion("DepartmentID not between", value1, value2, "departmentid");
            return (Criteria) this;
        }

        public Criteria andMaintflagIsNull() {
            addCriterion("MaintFlag is null");
            return (Criteria) this;
        }

        public Criteria andMaintflagIsNotNull() {
            addCriterion("MaintFlag is not null");
            return (Criteria) this;
        }

        public Criteria andMaintflagEqualTo(Integer value) {
            addCriterion("MaintFlag =", value, "maintflag");
            return (Criteria) this;
        }

        public Criteria andMaintflagNotEqualTo(Integer value) {
            addCriterion("MaintFlag <>", value, "maintflag");
            return (Criteria) this;
        }

        public Criteria andMaintflagGreaterThan(Integer value) {
            addCriterion("MaintFlag >", value, "maintflag");
            return (Criteria) this;
        }

        public Criteria andMaintflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("MaintFlag >=", value, "maintflag");
            return (Criteria) this;
        }

        public Criteria andMaintflagLessThan(Integer value) {
            addCriterion("MaintFlag <", value, "maintflag");
            return (Criteria) this;
        }

        public Criteria andMaintflagLessThanOrEqualTo(Integer value) {
            addCriterion("MaintFlag <=", value, "maintflag");
            return (Criteria) this;
        }

        public Criteria andMaintflagIn(List<Integer> values) {
            addCriterion("MaintFlag in", values, "maintflag");
            return (Criteria) this;
        }

        public Criteria andMaintflagNotIn(List<Integer> values) {
            addCriterion("MaintFlag not in", values, "maintflag");
            return (Criteria) this;
        }

        public Criteria andMaintflagBetween(Integer value1, Integer value2) {
            addCriterion("MaintFlag between", value1, value2, "maintflag");
            return (Criteria) this;
        }

        public Criteria andMaintflagNotBetween(Integer value1, Integer value2) {
            addCriterion("MaintFlag not between", value1, value2, "maintflag");
            return (Criteria) this;
        }

        public Criteria andOndutyflagIsNull() {
            addCriterion("OndutyFlag is null");
            return (Criteria) this;
        }

        public Criteria andOndutyflagIsNotNull() {
            addCriterion("OndutyFlag is not null");
            return (Criteria) this;
        }

        public Criteria andOndutyflagEqualTo(Integer value) {
            addCriterion("OndutyFlag =", value, "ondutyflag");
            return (Criteria) this;
        }

        public Criteria andOndutyflagNotEqualTo(Integer value) {
            addCriterion("OndutyFlag <>", value, "ondutyflag");
            return (Criteria) this;
        }

        public Criteria andOndutyflagGreaterThan(Integer value) {
            addCriterion("OndutyFlag >", value, "ondutyflag");
            return (Criteria) this;
        }

        public Criteria andOndutyflagGreaterThanOrEqualTo(Integer value) {
            addCriterion("OndutyFlag >=", value, "ondutyflag");
            return (Criteria) this;
        }

        public Criteria andOndutyflagLessThan(Integer value) {
            addCriterion("OndutyFlag <", value, "ondutyflag");
            return (Criteria) this;
        }

        public Criteria andOndutyflagLessThanOrEqualTo(Integer value) {
            addCriterion("OndutyFlag <=", value, "ondutyflag");
            return (Criteria) this;
        }

        public Criteria andOndutyflagIn(List<Integer> values) {
            addCriterion("OndutyFlag in", values, "ondutyflag");
            return (Criteria) this;
        }

        public Criteria andOndutyflagNotIn(List<Integer> values) {
            addCriterion("OndutyFlag not in", values, "ondutyflag");
            return (Criteria) this;
        }

        public Criteria andOndutyflagBetween(Integer value1, Integer value2) {
            addCriterion("OndutyFlag between", value1, value2, "ondutyflag");
            return (Criteria) this;
        }

        public Criteria andOndutyflagNotBetween(Integer value1, Integer value2) {
            addCriterion("OndutyFlag not between", value1, value2, "ondutyflag");
            return (Criteria) this;
        }

        public Criteria andRoleidIsNull() {
            addCriterion("RoleID is null");
            return (Criteria) this;
        }

        public Criteria andRoleidIsNotNull() {
            addCriterion("RoleID is not null");
            return (Criteria) this;
        }

        public Criteria andRoleidEqualTo(Integer value) {
            addCriterion("RoleID =", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotEqualTo(Integer value) {
            addCriterion("RoleID <>", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThan(Integer value) {
            addCriterion("RoleID >", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("RoleID >=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThan(Integer value) {
            addCriterion("RoleID <", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidLessThanOrEqualTo(Integer value) {
            addCriterion("RoleID <=", value, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidIn(List<Integer> values) {
            addCriterion("RoleID in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotIn(List<Integer> values) {
            addCriterion("RoleID not in", values, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidBetween(Integer value1, Integer value2) {
            addCriterion("RoleID between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andRoleidNotBetween(Integer value1, Integer value2) {
            addCriterion("RoleID not between", value1, value2, "roleid");
            return (Criteria) this;
        }

        public Criteria andSroleidIsNull() {
            addCriterion("SRoleID is null");
            return (Criteria) this;
        }

        public Criteria andSroleidIsNotNull() {
            addCriterion("SRoleID is not null");
            return (Criteria) this;
        }

        public Criteria andSroleidEqualTo(Integer value) {
            addCriterion("SRoleID =", value, "sroleid");
            return (Criteria) this;
        }

        public Criteria andSroleidNotEqualTo(Integer value) {
            addCriterion("SRoleID <>", value, "sroleid");
            return (Criteria) this;
        }

        public Criteria andSroleidGreaterThan(Integer value) {
            addCriterion("SRoleID >", value, "sroleid");
            return (Criteria) this;
        }

        public Criteria andSroleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("SRoleID >=", value, "sroleid");
            return (Criteria) this;
        }

        public Criteria andSroleidLessThan(Integer value) {
            addCriterion("SRoleID <", value, "sroleid");
            return (Criteria) this;
        }

        public Criteria andSroleidLessThanOrEqualTo(Integer value) {
            addCriterion("SRoleID <=", value, "sroleid");
            return (Criteria) this;
        }

        public Criteria andSroleidIn(List<Integer> values) {
            addCriterion("SRoleID in", values, "sroleid");
            return (Criteria) this;
        }

        public Criteria andSroleidNotIn(List<Integer> values) {
            addCriterion("SRoleID not in", values, "sroleid");
            return (Criteria) this;
        }

        public Criteria andSroleidBetween(Integer value1, Integer value2) {
            addCriterion("SRoleID between", value1, value2, "sroleid");
            return (Criteria) this;
        }

        public Criteria andSroleidNotBetween(Integer value1, Integer value2) {
            addCriterion("SRoleID not between", value1, value2, "sroleid");
            return (Criteria) this;
        }

        public Criteria andTroleidIsNull() {
            addCriterion("TRoleID is null");
            return (Criteria) this;
        }

        public Criteria andTroleidIsNotNull() {
            addCriterion("TRoleID is not null");
            return (Criteria) this;
        }

        public Criteria andTroleidEqualTo(Integer value) {
            addCriterion("TRoleID =", value, "troleid");
            return (Criteria) this;
        }

        public Criteria andTroleidNotEqualTo(Integer value) {
            addCriterion("TRoleID <>", value, "troleid");
            return (Criteria) this;
        }

        public Criteria andTroleidGreaterThan(Integer value) {
            addCriterion("TRoleID >", value, "troleid");
            return (Criteria) this;
        }

        public Criteria andTroleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TRoleID >=", value, "troleid");
            return (Criteria) this;
        }

        public Criteria andTroleidLessThan(Integer value) {
            addCriterion("TRoleID <", value, "troleid");
            return (Criteria) this;
        }

        public Criteria andTroleidLessThanOrEqualTo(Integer value) {
            addCriterion("TRoleID <=", value, "troleid");
            return (Criteria) this;
        }

        public Criteria andTroleidIn(List<Integer> values) {
            addCriterion("TRoleID in", values, "troleid");
            return (Criteria) this;
        }

        public Criteria andTroleidNotIn(List<Integer> values) {
            addCriterion("TRoleID not in", values, "troleid");
            return (Criteria) this;
        }

        public Criteria andTroleidBetween(Integer value1, Integer value2) {
            addCriterion("TRoleID between", value1, value2, "troleid");
            return (Criteria) this;
        }

        public Criteria andTroleidNotBetween(Integer value1, Integer value2) {
            addCriterion("TRoleID not between", value1, value2, "troleid");
            return (Criteria) this;
        }

        public Criteria andCardcodeIsNull() {
            addCriterion("CardCode is null");
            return (Criteria) this;
        }

        public Criteria andCardcodeIsNotNull() {
            addCriterion("CardCode is not null");
            return (Criteria) this;
        }

        public Criteria andCardcodeEqualTo(Integer value) {
            addCriterion("CardCode =", value, "cardcode");
            return (Criteria) this;
        }

        public Criteria andCardcodeNotEqualTo(Integer value) {
            addCriterion("CardCode <>", value, "cardcode");
            return (Criteria) this;
        }

        public Criteria andCardcodeGreaterThan(Integer value) {
            addCriterion("CardCode >", value, "cardcode");
            return (Criteria) this;
        }

        public Criteria andCardcodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("CardCode >=", value, "cardcode");
            return (Criteria) this;
        }

        public Criteria andCardcodeLessThan(Integer value) {
            addCriterion("CardCode <", value, "cardcode");
            return (Criteria) this;
        }

        public Criteria andCardcodeLessThanOrEqualTo(Integer value) {
            addCriterion("CardCode <=", value, "cardcode");
            return (Criteria) this;
        }

        public Criteria andCardcodeIn(List<Integer> values) {
            addCriterion("CardCode in", values, "cardcode");
            return (Criteria) this;
        }

        public Criteria andCardcodeNotIn(List<Integer> values) {
            addCriterion("CardCode not in", values, "cardcode");
            return (Criteria) this;
        }

        public Criteria andCardcodeBetween(Integer value1, Integer value2) {
            addCriterion("CardCode between", value1, value2, "cardcode");
            return (Criteria) this;
        }

        public Criteria andCardcodeNotBetween(Integer value1, Integer value2) {
            addCriterion("CardCode not between", value1, value2, "cardcode");
            return (Criteria) this;
        }

        public Criteria andTelphoneIsNull() {
            addCriterion("Telphone is null");
            return (Criteria) this;
        }

        public Criteria andTelphoneIsNotNull() {
            addCriterion("Telphone is not null");
            return (Criteria) this;
        }

        public Criteria andTelphoneEqualTo(String value) {
            addCriterion("Telphone =", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotEqualTo(String value) {
            addCriterion("Telphone <>", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneGreaterThan(String value) {
            addCriterion("Telphone >", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneGreaterThanOrEqualTo(String value) {
            addCriterion("Telphone >=", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneLessThan(String value) {
            addCriterion("Telphone <", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneLessThanOrEqualTo(String value) {
            addCriterion("Telphone <=", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneLike(String value) {
            addCriterion("Telphone like", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotLike(String value) {
            addCriterion("Telphone not like", value, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneIn(List<String> values) {
            addCriterion("Telphone in", values, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotIn(List<String> values) {
            addCriterion("Telphone not in", values, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneBetween(String value1, String value2) {
            addCriterion("Telphone between", value1, value2, "telphone");
            return (Criteria) this;
        }

        public Criteria andTelphoneNotBetween(String value1, String value2) {
            addCriterion("Telphone not between", value1, value2, "telphone");
            return (Criteria) this;
        }

        public Criteria andValidflagIsNull() {
            addCriterion("ValidFlag is null");
            return (Criteria) this;
        }

        public Criteria andValidflagIsNotNull() {
            addCriterion("ValidFlag is not null");
            return (Criteria) this;
        }

        public Criteria andValidflagEqualTo(Short value) {
            addCriterion("ValidFlag =", value, "validflag");
            return (Criteria) this;
        }

        public Criteria andValidflagNotEqualTo(Short value) {
            addCriterion("ValidFlag <>", value, "validflag");
            return (Criteria) this;
        }

        public Criteria andValidflagGreaterThan(Short value) {
            addCriterion("ValidFlag >", value, "validflag");
            return (Criteria) this;
        }

        public Criteria andValidflagGreaterThanOrEqualTo(Short value) {
            addCriterion("ValidFlag >=", value, "validflag");
            return (Criteria) this;
        }

        public Criteria andValidflagLessThan(Short value) {
            addCriterion("ValidFlag <", value, "validflag");
            return (Criteria) this;
        }

        public Criteria andValidflagLessThanOrEqualTo(Short value) {
            addCriterion("ValidFlag <=", value, "validflag");
            return (Criteria) this;
        }

        public Criteria andValidflagIn(List<Short> values) {
            addCriterion("ValidFlag in", values, "validflag");
            return (Criteria) this;
        }

        public Criteria andValidflagNotIn(List<Short> values) {
            addCriterion("ValidFlag not in", values, "validflag");
            return (Criteria) this;
        }

        public Criteria andValidflagBetween(Short value1, Short value2) {
            addCriterion("ValidFlag between", value1, value2, "validflag");
            return (Criteria) this;
        }

        public Criteria andValidflagNotBetween(Short value1, Short value2) {
            addCriterion("ValidFlag not between", value1, value2, "validflag");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("Sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("Sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Short value) {
            addCriterion("Sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Short value) {
            addCriterion("Sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Short value) {
            addCriterion("Sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Short value) {
            addCriterion("Sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Short value) {
            addCriterion("Sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Short value) {
            addCriterion("Sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Short> values) {
            addCriterion("Sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Short> values) {
            addCriterion("Sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Short value1, Short value2) {
            addCriterion("Sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Short value1, Short value2) {
            addCriterion("Sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andPwdIsNull() {
            addCriterion("Pwd is null");
            return (Criteria) this;
        }

        public Criteria andPwdIsNotNull() {
            addCriterion("Pwd is not null");
            return (Criteria) this;
        }

        public Criteria andPwdEqualTo(String value) {
            addCriterion("Pwd =", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotEqualTo(String value) {
            addCriterion("Pwd <>", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdGreaterThan(String value) {
            addCriterion("Pwd >", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdGreaterThanOrEqualTo(String value) {
            addCriterion("Pwd >=", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLessThan(String value) {
            addCriterion("Pwd <", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLessThanOrEqualTo(String value) {
            addCriterion("Pwd <=", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLike(String value) {
            addCriterion("Pwd like", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotLike(String value) {
            addCriterion("Pwd not like", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdIn(List<String> values) {
            addCriterion("Pwd in", values, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotIn(List<String> values) {
            addCriterion("Pwd not in", values, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdBetween(String value1, String value2) {
            addCriterion("Pwd between", value1, value2, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotBetween(String value1, String value2) {
            addCriterion("Pwd not between", value1, value2, "pwd");
            return (Criteria) this;
        }

        public Criteria andAvailtimeIsNull() {
            addCriterion("AvailTime is null");
            return (Criteria) this;
        }

        public Criteria andAvailtimeIsNotNull() {
            addCriterion("AvailTime is not null");
            return (Criteria) this;
        }

        public Criteria andAvailtimeEqualTo(Integer value) {
            addCriterion("AvailTime =", value, "availtime");
            return (Criteria) this;
        }

        public Criteria andAvailtimeNotEqualTo(Integer value) {
            addCriterion("AvailTime <>", value, "availtime");
            return (Criteria) this;
        }

        public Criteria andAvailtimeGreaterThan(Integer value) {
            addCriterion("AvailTime >", value, "availtime");
            return (Criteria) this;
        }

        public Criteria andAvailtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("AvailTime >=", value, "availtime");
            return (Criteria) this;
        }

        public Criteria andAvailtimeLessThan(Integer value) {
            addCriterion("AvailTime <", value, "availtime");
            return (Criteria) this;
        }

        public Criteria andAvailtimeLessThanOrEqualTo(Integer value) {
            addCriterion("AvailTime <=", value, "availtime");
            return (Criteria) this;
        }

        public Criteria andAvailtimeIn(List<Integer> values) {
            addCriterion("AvailTime in", values, "availtime");
            return (Criteria) this;
        }

        public Criteria andAvailtimeNotIn(List<Integer> values) {
            addCriterion("AvailTime not in", values, "availtime");
            return (Criteria) this;
        }

        public Criteria andAvailtimeBetween(Integer value1, Integer value2) {
            addCriterion("AvailTime between", value1, value2, "availtime");
            return (Criteria) this;
        }

        public Criteria andAvailtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("AvailTime not between", value1, value2, "availtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("UpdateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("UpdateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("UpdateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("UpdateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("UpdateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UpdateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("UpdateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("UpdateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("UpdateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("UpdateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("UpdateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("UpdateTime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("Email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("Email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("Email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("Email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("Email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("Email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("Email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("Email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("Email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("Email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("Email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("Email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("Email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("Email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andDscIsNull() {
            addCriterion("Dsc is null");
            return (Criteria) this;
        }

        public Criteria andDscIsNotNull() {
            addCriterion("Dsc is not null");
            return (Criteria) this;
        }

        public Criteria andDscEqualTo(String value) {
            addCriterion("Dsc =", value, "dsc");
            return (Criteria) this;
        }

        public Criteria andDscNotEqualTo(String value) {
            addCriterion("Dsc <>", value, "dsc");
            return (Criteria) this;
        }

        public Criteria andDscGreaterThan(String value) {
            addCriterion("Dsc >", value, "dsc");
            return (Criteria) this;
        }

        public Criteria andDscGreaterThanOrEqualTo(String value) {
            addCriterion("Dsc >=", value, "dsc");
            return (Criteria) this;
        }

        public Criteria andDscLessThan(String value) {
            addCriterion("Dsc <", value, "dsc");
            return (Criteria) this;
        }

        public Criteria andDscLessThanOrEqualTo(String value) {
            addCriterion("Dsc <=", value, "dsc");
            return (Criteria) this;
        }

        public Criteria andDscLike(String value) {
            addCriterion("Dsc like", value, "dsc");
            return (Criteria) this;
        }

        public Criteria andDscNotLike(String value) {
            addCriterion("Dsc not like", value, "dsc");
            return (Criteria) this;
        }

        public Criteria andDscIn(List<String> values) {
            addCriterion("Dsc in", values, "dsc");
            return (Criteria) this;
        }

        public Criteria andDscNotIn(List<String> values) {
            addCriterion("Dsc not in", values, "dsc");
            return (Criteria) this;
        }

        public Criteria andDscBetween(String value1, String value2) {
            addCriterion("Dsc between", value1, value2, "dsc");
            return (Criteria) this;
        }

        public Criteria andDscNotBetween(String value1, String value2) {
            addCriterion("Dsc not between", value1, value2, "dsc");
            return (Criteria) this;
        }

        public Criteria andPicpathIsNull() {
            addCriterion("PicPath is null");
            return (Criteria) this;
        }

        public Criteria andPicpathIsNotNull() {
            addCriterion("PicPath is not null");
            return (Criteria) this;
        }

        public Criteria andPicpathEqualTo(String value) {
            addCriterion("PicPath =", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathNotEqualTo(String value) {
            addCriterion("PicPath <>", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathGreaterThan(String value) {
            addCriterion("PicPath >", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathGreaterThanOrEqualTo(String value) {
            addCriterion("PicPath >=", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathLessThan(String value) {
            addCriterion("PicPath <", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathLessThanOrEqualTo(String value) {
            addCriterion("PicPath <=", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathLike(String value) {
            addCriterion("PicPath like", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathNotLike(String value) {
            addCriterion("PicPath not like", value, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathIn(List<String> values) {
            addCriterion("PicPath in", values, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathNotIn(List<String> values) {
            addCriterion("PicPath not in", values, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathBetween(String value1, String value2) {
            addCriterion("PicPath between", value1, value2, "picpath");
            return (Criteria) this;
        }

        public Criteria andPicpathNotBetween(String value1, String value2) {
            addCriterion("PicPath not between", value1, value2, "picpath");
            return (Criteria) this;
        }

        public Criteria andJobnumIsNull() {
            addCriterion("JobNum is null");
            return (Criteria) this;
        }

        public Criteria andJobnumIsNotNull() {
            addCriterion("JobNum is not null");
            return (Criteria) this;
        }

        public Criteria andJobnumEqualTo(String value) {
            addCriterion("JobNum =", value, "jobnum");
            return (Criteria) this;
        }

        public Criteria andJobnumNotEqualTo(String value) {
            addCriterion("JobNum <>", value, "jobnum");
            return (Criteria) this;
        }

        public Criteria andJobnumGreaterThan(String value) {
            addCriterion("JobNum >", value, "jobnum");
            return (Criteria) this;
        }

        public Criteria andJobnumGreaterThanOrEqualTo(String value) {
            addCriterion("JobNum >=", value, "jobnum");
            return (Criteria) this;
        }

        public Criteria andJobnumLessThan(String value) {
            addCriterion("JobNum <", value, "jobnum");
            return (Criteria) this;
        }

        public Criteria andJobnumLessThanOrEqualTo(String value) {
            addCriterion("JobNum <=", value, "jobnum");
            return (Criteria) this;
        }

        public Criteria andJobnumLike(String value) {
            addCriterion("JobNum like", value, "jobnum");
            return (Criteria) this;
        }

        public Criteria andJobnumNotLike(String value) {
            addCriterion("JobNum not like", value, "jobnum");
            return (Criteria) this;
        }

        public Criteria andJobnumIn(List<String> values) {
            addCriterion("JobNum in", values, "jobnum");
            return (Criteria) this;
        }

        public Criteria andJobnumNotIn(List<String> values) {
            addCriterion("JobNum not in", values, "jobnum");
            return (Criteria) this;
        }

        public Criteria andJobnumBetween(String value1, String value2) {
            addCriterion("JobNum between", value1, value2, "jobnum");
            return (Criteria) this;
        }

        public Criteria andJobnumNotBetween(String value1, String value2) {
            addCriterion("JobNum not between", value1, value2, "jobnum");
            return (Criteria) this;
        }

        public Criteria andGroupnumIsNull() {
            addCriterion("GroupNum is null");
            return (Criteria) this;
        }

        public Criteria andGroupnumIsNotNull() {
            addCriterion("GroupNum is not null");
            return (Criteria) this;
        }

        public Criteria andGroupnumEqualTo(String value) {
            addCriterion("GroupNum =", value, "groupnum");
            return (Criteria) this;
        }

        public Criteria andGroupnumNotEqualTo(String value) {
            addCriterion("GroupNum <>", value, "groupnum");
            return (Criteria) this;
        }

        public Criteria andGroupnumGreaterThan(String value) {
            addCriterion("GroupNum >", value, "groupnum");
            return (Criteria) this;
        }

        public Criteria andGroupnumGreaterThanOrEqualTo(String value) {
            addCriterion("GroupNum >=", value, "groupnum");
            return (Criteria) this;
        }

        public Criteria andGroupnumLessThan(String value) {
            addCriterion("GroupNum <", value, "groupnum");
            return (Criteria) this;
        }

        public Criteria andGroupnumLessThanOrEqualTo(String value) {
            addCriterion("GroupNum <=", value, "groupnum");
            return (Criteria) this;
        }

        public Criteria andGroupnumLike(String value) {
            addCriterion("GroupNum like", value, "groupnum");
            return (Criteria) this;
        }

        public Criteria andGroupnumNotLike(String value) {
            addCriterion("GroupNum not like", value, "groupnum");
            return (Criteria) this;
        }

        public Criteria andGroupnumIn(List<String> values) {
            addCriterion("GroupNum in", values, "groupnum");
            return (Criteria) this;
        }

        public Criteria andGroupnumNotIn(List<String> values) {
            addCriterion("GroupNum not in", values, "groupnum");
            return (Criteria) this;
        }

        public Criteria andGroupnumBetween(String value1, String value2) {
            addCriterion("GroupNum between", value1, value2, "groupnum");
            return (Criteria) this;
        }

        public Criteria andGroupnumNotBetween(String value1, String value2) {
            addCriterion("GroupNum not between", value1, value2, "groupnum");
            return (Criteria) this;
        }

        public Criteria andDeptid2IsNull() {
            addCriterion("deptid2 is null");
            return (Criteria) this;
        }

        public Criteria andDeptid2IsNotNull() {
            addCriterion("deptid2 is not null");
            return (Criteria) this;
        }

        public Criteria andDeptid2EqualTo(Integer value) {
            addCriterion("deptid2 =", value, "deptid2");
            return (Criteria) this;
        }

        public Criteria andDeptid2NotEqualTo(Integer value) {
            addCriterion("deptid2 <>", value, "deptid2");
            return (Criteria) this;
        }

        public Criteria andDeptid2GreaterThan(Integer value) {
            addCriterion("deptid2 >", value, "deptid2");
            return (Criteria) this;
        }

        public Criteria andDeptid2GreaterThanOrEqualTo(Integer value) {
            addCriterion("deptid2 >=", value, "deptid2");
            return (Criteria) this;
        }

        public Criteria andDeptid2LessThan(Integer value) {
            addCriterion("deptid2 <", value, "deptid2");
            return (Criteria) this;
        }

        public Criteria andDeptid2LessThanOrEqualTo(Integer value) {
            addCriterion("deptid2 <=", value, "deptid2");
            return (Criteria) this;
        }

        public Criteria andDeptid2In(List<Integer> values) {
            addCriterion("deptid2 in", values, "deptid2");
            return (Criteria) this;
        }

        public Criteria andDeptid2NotIn(List<Integer> values) {
            addCriterion("deptid2 not in", values, "deptid2");
            return (Criteria) this;
        }

        public Criteria andDeptid2Between(Integer value1, Integer value2) {
            addCriterion("deptid2 between", value1, value2, "deptid2");
            return (Criteria) this;
        }

        public Criteria andDeptid2NotBetween(Integer value1, Integer value2) {
            addCriterion("deptid2 not between", value1, value2, "deptid2");
            return (Criteria) this;
        }

        public Criteria andDeptid3IsNull() {
            addCriterion("deptid3 is null");
            return (Criteria) this;
        }

        public Criteria andDeptid3IsNotNull() {
            addCriterion("deptid3 is not null");
            return (Criteria) this;
        }

        public Criteria andDeptid3EqualTo(Integer value) {
            addCriterion("deptid3 =", value, "deptid3");
            return (Criteria) this;
        }

        public Criteria andDeptid3NotEqualTo(Integer value) {
            addCriterion("deptid3 <>", value, "deptid3");
            return (Criteria) this;
        }

        public Criteria andDeptid3GreaterThan(Integer value) {
            addCriterion("deptid3 >", value, "deptid3");
            return (Criteria) this;
        }

        public Criteria andDeptid3GreaterThanOrEqualTo(Integer value) {
            addCriterion("deptid3 >=", value, "deptid3");
            return (Criteria) this;
        }

        public Criteria andDeptid3LessThan(Integer value) {
            addCriterion("deptid3 <", value, "deptid3");
            return (Criteria) this;
        }

        public Criteria andDeptid3LessThanOrEqualTo(Integer value) {
            addCriterion("deptid3 <=", value, "deptid3");
            return (Criteria) this;
        }

        public Criteria andDeptid3In(List<Integer> values) {
            addCriterion("deptid3 in", values, "deptid3");
            return (Criteria) this;
        }

        public Criteria andDeptid3NotIn(List<Integer> values) {
            addCriterion("deptid3 not in", values, "deptid3");
            return (Criteria) this;
        }

        public Criteria andDeptid3Between(Integer value1, Integer value2) {
            addCriterion("deptid3 between", value1, value2, "deptid3");
            return (Criteria) this;
        }

        public Criteria andDeptid3NotBetween(Integer value1, Integer value2) {
            addCriterion("deptid3 not between", value1, value2, "deptid3");
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