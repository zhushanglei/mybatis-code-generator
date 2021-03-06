package generator.entity;

import java.util.ArrayList;
import java.util.List;

public class CategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public CategoryExample() {
        oredCriteria = new ArrayList<>();
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andCriterionScoreIsNull() {
            addCriterion("criterion_score is null");
            return (Criteria) this;
        }

        public Criteria andCriterionScoreIsNotNull() {
            addCriterion("criterion_score is not null");
            return (Criteria) this;
        }

        public Criteria andCriterionScoreEqualTo(Integer value) {
            addCriterion("criterion_score =", value, "criterionScore");
            return (Criteria) this;
        }

        public Criteria andCriterionScoreNotEqualTo(Integer value) {
            addCriterion("criterion_score <>", value, "criterionScore");
            return (Criteria) this;
        }

        public Criteria andCriterionScoreGreaterThan(Integer value) {
            addCriterion("criterion_score >", value, "criterionScore");
            return (Criteria) this;
        }

        public Criteria andCriterionScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("criterion_score >=", value, "criterionScore");
            return (Criteria) this;
        }

        public Criteria andCriterionScoreLessThan(Integer value) {
            addCriterion("criterion_score <", value, "criterionScore");
            return (Criteria) this;
        }

        public Criteria andCriterionScoreLessThanOrEqualTo(Integer value) {
            addCriterion("criterion_score <=", value, "criterionScore");
            return (Criteria) this;
        }

        public Criteria andCriterionScoreIn(List<Integer> values) {
            addCriterion("criterion_score in", values, "criterionScore");
            return (Criteria) this;
        }

        public Criteria andCriterionScoreNotIn(List<Integer> values) {
            addCriterion("criterion_score not in", values, "criterionScore");
            return (Criteria) this;
        }

        public Criteria andCriterionScoreBetween(Integer value1, Integer value2) {
            addCriterion("criterion_score between", value1, value2, "criterionScore");
            return (Criteria) this;
        }

        public Criteria andCriterionScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("criterion_score not between", value1, value2, "criterionScore");
            return (Criteria) this;
        }

        public Criteria andReservoirTypeIsNull() {
            addCriterion("reservoir_type is null");
            return (Criteria) this;
        }

        public Criteria andReservoirTypeIsNotNull() {
            addCriterion("reservoir_type is not null");
            return (Criteria) this;
        }

        public Criteria andReservoirTypeEqualTo(String value) {
            addCriterion("reservoir_type =", value, "reservoirType");
            return (Criteria) this;
        }

        public Criteria andReservoirTypeNotEqualTo(String value) {
            addCriterion("reservoir_type <>", value, "reservoirType");
            return (Criteria) this;
        }

        public Criteria andReservoirTypeGreaterThan(String value) {
            addCriterion("reservoir_type >", value, "reservoirType");
            return (Criteria) this;
        }

        public Criteria andReservoirTypeGreaterThanOrEqualTo(String value) {
            addCriterion("reservoir_type >=", value, "reservoirType");
            return (Criteria) this;
        }

        public Criteria andReservoirTypeLessThan(String value) {
            addCriterion("reservoir_type <", value, "reservoirType");
            return (Criteria) this;
        }

        public Criteria andReservoirTypeLessThanOrEqualTo(String value) {
            addCriterion("reservoir_type <=", value, "reservoirType");
            return (Criteria) this;
        }

        public Criteria andReservoirTypeLike(String value) {
            addCriterion("reservoir_type like", value, "reservoirType");
            return (Criteria) this;
        }

        public Criteria andReservoirTypeNotLike(String value) {
            addCriterion("reservoir_type not like", value, "reservoirType");
            return (Criteria) this;
        }

        public Criteria andReservoirTypeIn(List<String> values) {
            addCriterion("reservoir_type in", values, "reservoirType");
            return (Criteria) this;
        }

        public Criteria andReservoirTypeNotIn(List<String> values) {
            addCriterion("reservoir_type not in", values, "reservoirType");
            return (Criteria) this;
        }

        public Criteria andReservoirTypeBetween(String value1, String value2) {
            addCriterion("reservoir_type between", value1, value2, "reservoirType");
            return (Criteria) this;
        }

        public Criteria andReservoirTypeNotBetween(String value1, String value2) {
            addCriterion("reservoir_type not between", value1, value2, "reservoirType");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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