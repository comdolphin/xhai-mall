package com.xhai.mall.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BizFileExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BizFileExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andStorageTypeIsNull() {
            addCriterion("storage_type is null");
            return (Criteria) this;
        }

        public Criteria andStorageTypeIsNotNull() {
            addCriterion("storage_type is not null");
            return (Criteria) this;
        }

        public Criteria andStorageTypeEqualTo(String value) {
            addCriterion("storage_type =", value, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeNotEqualTo(String value) {
            addCriterion("storage_type <>", value, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeGreaterThan(String value) {
            addCriterion("storage_type >", value, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeGreaterThanOrEqualTo(String value) {
            addCriterion("storage_type >=", value, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeLessThan(String value) {
            addCriterion("storage_type <", value, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeLessThanOrEqualTo(String value) {
            addCriterion("storage_type <=", value, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeLike(String value) {
            addCriterion("storage_type like", value, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeNotLike(String value) {
            addCriterion("storage_type not like", value, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeIn(List<String> values) {
            addCriterion("storage_type in", values, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeNotIn(List<String> values) {
            addCriterion("storage_type not in", values, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeBetween(String value1, String value2) {
            addCriterion("storage_type between", value1, value2, "storageType");
            return (Criteria) this;
        }

        public Criteria andStorageTypeNotBetween(String value1, String value2) {
            addCriterion("storage_type not between", value1, value2, "storageType");
            return (Criteria) this;
        }

        public Criteria andOriginalFileNameIsNull() {
            addCriterion("original_file_name is null");
            return (Criteria) this;
        }

        public Criteria andOriginalFileNameIsNotNull() {
            addCriterion("original_file_name is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalFileNameEqualTo(String value) {
            addCriterion("original_file_name =", value, "originalFileName");
            return (Criteria) this;
        }

        public Criteria andOriginalFileNameNotEqualTo(String value) {
            addCriterion("original_file_name <>", value, "originalFileName");
            return (Criteria) this;
        }

        public Criteria andOriginalFileNameGreaterThan(String value) {
            addCriterion("original_file_name >", value, "originalFileName");
            return (Criteria) this;
        }

        public Criteria andOriginalFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("original_file_name >=", value, "originalFileName");
            return (Criteria) this;
        }

        public Criteria andOriginalFileNameLessThan(String value) {
            addCriterion("original_file_name <", value, "originalFileName");
            return (Criteria) this;
        }

        public Criteria andOriginalFileNameLessThanOrEqualTo(String value) {
            addCriterion("original_file_name <=", value, "originalFileName");
            return (Criteria) this;
        }

        public Criteria andOriginalFileNameLike(String value) {
            addCriterion("original_file_name like", value, "originalFileName");
            return (Criteria) this;
        }

        public Criteria andOriginalFileNameNotLike(String value) {
            addCriterion("original_file_name not like", value, "originalFileName");
            return (Criteria) this;
        }

        public Criteria andOriginalFileNameIn(List<String> values) {
            addCriterion("original_file_name in", values, "originalFileName");
            return (Criteria) this;
        }

        public Criteria andOriginalFileNameNotIn(List<String> values) {
            addCriterion("original_file_name not in", values, "originalFileName");
            return (Criteria) this;
        }

        public Criteria andOriginalFileNameBetween(String value1, String value2) {
            addCriterion("original_file_name between", value1, value2, "originalFileName");
            return (Criteria) this;
        }

        public Criteria andOriginalFileNameNotBetween(String value1, String value2) {
            addCriterion("original_file_name not between", value1, value2, "originalFileName");
            return (Criteria) this;
        }

        public Criteria andSizeIsNull() {
            addCriterion("size is null");
            return (Criteria) this;
        }

        public Criteria andSizeIsNotNull() {
            addCriterion("size is not null");
            return (Criteria) this;
        }

        public Criteria andSizeEqualTo(Long value) {
            addCriterion("size =", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotEqualTo(Long value) {
            addCriterion("size <>", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThan(Long value) {
            addCriterion("size >", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThanOrEqualTo(Long value) {
            addCriterion("size >=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThan(Long value) {
            addCriterion("size <", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThanOrEqualTo(Long value) {
            addCriterion("size <=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeIn(List<Long> values) {
            addCriterion("size in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotIn(List<Long> values) {
            addCriterion("size not in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeBetween(Long value1, Long value2) {
            addCriterion("size between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotBetween(Long value1, Long value2) {
            addCriterion("size not between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSuffixIsNull() {
            addCriterion("suffix is null");
            return (Criteria) this;
        }

        public Criteria andSuffixIsNotNull() {
            addCriterion("suffix is not null");
            return (Criteria) this;
        }

        public Criteria andSuffixEqualTo(String value) {
            addCriterion("suffix =", value, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixNotEqualTo(String value) {
            addCriterion("suffix <>", value, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixGreaterThan(String value) {
            addCriterion("suffix >", value, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixGreaterThanOrEqualTo(String value) {
            addCriterion("suffix >=", value, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixLessThan(String value) {
            addCriterion("suffix <", value, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixLessThanOrEqualTo(String value) {
            addCriterion("suffix <=", value, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixLike(String value) {
            addCriterion("suffix like", value, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixNotLike(String value) {
            addCriterion("suffix not like", value, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixIn(List<String> values) {
            addCriterion("suffix in", values, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixNotIn(List<String> values) {
            addCriterion("suffix not in", values, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixBetween(String value1, String value2) {
            addCriterion("suffix between", value1, value2, "suffix");
            return (Criteria) this;
        }

        public Criteria andSuffixNotBetween(String value1, String value2) {
            addCriterion("suffix not between", value1, value2, "suffix");
            return (Criteria) this;
        }

        public Criteria andWidthIsNull() {
            addCriterion("width is null");
            return (Criteria) this;
        }

        public Criteria andWidthIsNotNull() {
            addCriterion("width is not null");
            return (Criteria) this;
        }

        public Criteria andWidthEqualTo(Integer value) {
            addCriterion("width =", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotEqualTo(Integer value) {
            addCriterion("width <>", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThan(Integer value) {
            addCriterion("width >", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthGreaterThanOrEqualTo(Integer value) {
            addCriterion("width >=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThan(Integer value) {
            addCriterion("width <", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthLessThanOrEqualTo(Integer value) {
            addCriterion("width <=", value, "width");
            return (Criteria) this;
        }

        public Criteria andWidthIn(List<Integer> values) {
            addCriterion("width in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotIn(List<Integer> values) {
            addCriterion("width not in", values, "width");
            return (Criteria) this;
        }

        public Criteria andWidthBetween(Integer value1, Integer value2) {
            addCriterion("width between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andWidthNotBetween(Integer value1, Integer value2) {
            addCriterion("width not between", value1, value2, "width");
            return (Criteria) this;
        }

        public Criteria andHeightIsNull() {
            addCriterion("height is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("height is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(Integer value) {
            addCriterion("height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(Integer value) {
            addCriterion("height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(Integer value) {
            addCriterion("height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(Integer value) {
            addCriterion("height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(Integer value) {
            addCriterion("height <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<Integer> values) {
            addCriterion("height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<Integer> values) {
            addCriterion("height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(Integer value1, Integer value2) {
            addCriterion("height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(Integer value1, Integer value2) {
            addCriterion("height not between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andFilePathIsNull() {
            addCriterion("file_path is null");
            return (Criteria) this;
        }

        public Criteria andFilePathIsNotNull() {
            addCriterion("file_path is not null");
            return (Criteria) this;
        }

        public Criteria andFilePathEqualTo(String value) {
            addCriterion("file_path =", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotEqualTo(String value) {
            addCriterion("file_path <>", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathGreaterThan(String value) {
            addCriterion("file_path >", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("file_path >=", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLessThan(String value) {
            addCriterion("file_path <", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLessThanOrEqualTo(String value) {
            addCriterion("file_path <=", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLike(String value) {
            addCriterion("file_path like", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotLike(String value) {
            addCriterion("file_path not like", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathIn(List<String> values) {
            addCriterion("file_path in", values, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotIn(List<String> values) {
            addCriterion("file_path not in", values, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathBetween(String value1, String value2) {
            addCriterion("file_path between", value1, value2, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotBetween(String value1, String value2) {
            addCriterion("file_path not between", value1, value2, "filePath");
            return (Criteria) this;
        }

        public Criteria andFullFilePathIsNull() {
            addCriterion("full_file_path is null");
            return (Criteria) this;
        }

        public Criteria andFullFilePathIsNotNull() {
            addCriterion("full_file_path is not null");
            return (Criteria) this;
        }

        public Criteria andFullFilePathEqualTo(String value) {
            addCriterion("full_file_path =", value, "fullFilePath");
            return (Criteria) this;
        }

        public Criteria andFullFilePathNotEqualTo(String value) {
            addCriterion("full_file_path <>", value, "fullFilePath");
            return (Criteria) this;
        }

        public Criteria andFullFilePathGreaterThan(String value) {
            addCriterion("full_file_path >", value, "fullFilePath");
            return (Criteria) this;
        }

        public Criteria andFullFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("full_file_path >=", value, "fullFilePath");
            return (Criteria) this;
        }

        public Criteria andFullFilePathLessThan(String value) {
            addCriterion("full_file_path <", value, "fullFilePath");
            return (Criteria) this;
        }

        public Criteria andFullFilePathLessThanOrEqualTo(String value) {
            addCriterion("full_file_path <=", value, "fullFilePath");
            return (Criteria) this;
        }

        public Criteria andFullFilePathLike(String value) {
            addCriterion("full_file_path like", value, "fullFilePath");
            return (Criteria) this;
        }

        public Criteria andFullFilePathNotLike(String value) {
            addCriterion("full_file_path not like", value, "fullFilePath");
            return (Criteria) this;
        }

        public Criteria andFullFilePathIn(List<String> values) {
            addCriterion("full_file_path in", values, "fullFilePath");
            return (Criteria) this;
        }

        public Criteria andFullFilePathNotIn(List<String> values) {
            addCriterion("full_file_path not in", values, "fullFilePath");
            return (Criteria) this;
        }

        public Criteria andFullFilePathBetween(String value1, String value2) {
            addCriterion("full_file_path between", value1, value2, "fullFilePath");
            return (Criteria) this;
        }

        public Criteria andFullFilePathNotBetween(String value1, String value2) {
            addCriterion("full_file_path not between", value1, value2, "fullFilePath");
            return (Criteria) this;
        }

        public Criteria andFileHashIsNull() {
            addCriterion("file_hash is null");
            return (Criteria) this;
        }

        public Criteria andFileHashIsNotNull() {
            addCriterion("file_hash is not null");
            return (Criteria) this;
        }

        public Criteria andFileHashEqualTo(String value) {
            addCriterion("file_hash =", value, "fileHash");
            return (Criteria) this;
        }

        public Criteria andFileHashNotEqualTo(String value) {
            addCriterion("file_hash <>", value, "fileHash");
            return (Criteria) this;
        }

        public Criteria andFileHashGreaterThan(String value) {
            addCriterion("file_hash >", value, "fileHash");
            return (Criteria) this;
        }

        public Criteria andFileHashGreaterThanOrEqualTo(String value) {
            addCriterion("file_hash >=", value, "fileHash");
            return (Criteria) this;
        }

        public Criteria andFileHashLessThan(String value) {
            addCriterion("file_hash <", value, "fileHash");
            return (Criteria) this;
        }

        public Criteria andFileHashLessThanOrEqualTo(String value) {
            addCriterion("file_hash <=", value, "fileHash");
            return (Criteria) this;
        }

        public Criteria andFileHashLike(String value) {
            addCriterion("file_hash like", value, "fileHash");
            return (Criteria) this;
        }

        public Criteria andFileHashNotLike(String value) {
            addCriterion("file_hash not like", value, "fileHash");
            return (Criteria) this;
        }

        public Criteria andFileHashIn(List<String> values) {
            addCriterion("file_hash in", values, "fileHash");
            return (Criteria) this;
        }

        public Criteria andFileHashNotIn(List<String> values) {
            addCriterion("file_hash not in", values, "fileHash");
            return (Criteria) this;
        }

        public Criteria andFileHashBetween(String value1, String value2) {
            addCriterion("file_hash between", value1, value2, "fileHash");
            return (Criteria) this;
        }

        public Criteria andFileHashNotBetween(String value1, String value2) {
            addCriterion("file_hash not between", value1, value2, "fileHash");
            return (Criteria) this;
        }

        public Criteria andUploadTypeIsNull() {
            addCriterion("upload_type is null");
            return (Criteria) this;
        }

        public Criteria andUploadTypeIsNotNull() {
            addCriterion("upload_type is not null");
            return (Criteria) this;
        }

        public Criteria andUploadTypeEqualTo(String value) {
            addCriterion("upload_type =", value, "uploadType");
            return (Criteria) this;
        }

        public Criteria andUploadTypeNotEqualTo(String value) {
            addCriterion("upload_type <>", value, "uploadType");
            return (Criteria) this;
        }

        public Criteria andUploadTypeGreaterThan(String value) {
            addCriterion("upload_type >", value, "uploadType");
            return (Criteria) this;
        }

        public Criteria andUploadTypeGreaterThanOrEqualTo(String value) {
            addCriterion("upload_type >=", value, "uploadType");
            return (Criteria) this;
        }

        public Criteria andUploadTypeLessThan(String value) {
            addCriterion("upload_type <", value, "uploadType");
            return (Criteria) this;
        }

        public Criteria andUploadTypeLessThanOrEqualTo(String value) {
            addCriterion("upload_type <=", value, "uploadType");
            return (Criteria) this;
        }

        public Criteria andUploadTypeLike(String value) {
            addCriterion("upload_type like", value, "uploadType");
            return (Criteria) this;
        }

        public Criteria andUploadTypeNotLike(String value) {
            addCriterion("upload_type not like", value, "uploadType");
            return (Criteria) this;
        }

        public Criteria andUploadTypeIn(List<String> values) {
            addCriterion("upload_type in", values, "uploadType");
            return (Criteria) this;
        }

        public Criteria andUploadTypeNotIn(List<String> values) {
            addCriterion("upload_type not in", values, "uploadType");
            return (Criteria) this;
        }

        public Criteria andUploadTypeBetween(String value1, String value2) {
            addCriterion("upload_type between", value1, value2, "uploadType");
            return (Criteria) this;
        }

        public Criteria andUploadTypeNotBetween(String value1, String value2) {
            addCriterion("upload_type not between", value1, value2, "uploadType");
            return (Criteria) this;
        }

        public Criteria andUploadStartTimeIsNull() {
            addCriterion("upload_start_time is null");
            return (Criteria) this;
        }

        public Criteria andUploadStartTimeIsNotNull() {
            addCriterion("upload_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andUploadStartTimeEqualTo(Date value) {
            addCriterion("upload_start_time =", value, "uploadStartTime");
            return (Criteria) this;
        }

        public Criteria andUploadStartTimeNotEqualTo(Date value) {
            addCriterion("upload_start_time <>", value, "uploadStartTime");
            return (Criteria) this;
        }

        public Criteria andUploadStartTimeGreaterThan(Date value) {
            addCriterion("upload_start_time >", value, "uploadStartTime");
            return (Criteria) this;
        }

        public Criteria andUploadStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("upload_start_time >=", value, "uploadStartTime");
            return (Criteria) this;
        }

        public Criteria andUploadStartTimeLessThan(Date value) {
            addCriterion("upload_start_time <", value, "uploadStartTime");
            return (Criteria) this;
        }

        public Criteria andUploadStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("upload_start_time <=", value, "uploadStartTime");
            return (Criteria) this;
        }

        public Criteria andUploadStartTimeIn(List<Date> values) {
            addCriterion("upload_start_time in", values, "uploadStartTime");
            return (Criteria) this;
        }

        public Criteria andUploadStartTimeNotIn(List<Date> values) {
            addCriterion("upload_start_time not in", values, "uploadStartTime");
            return (Criteria) this;
        }

        public Criteria andUploadStartTimeBetween(Date value1, Date value2) {
            addCriterion("upload_start_time between", value1, value2, "uploadStartTime");
            return (Criteria) this;
        }

        public Criteria andUploadStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("upload_start_time not between", value1, value2, "uploadStartTime");
            return (Criteria) this;
        }

        public Criteria andUploadEndTimeIsNull() {
            addCriterion("upload_end_time is null");
            return (Criteria) this;
        }

        public Criteria andUploadEndTimeIsNotNull() {
            addCriterion("upload_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andUploadEndTimeEqualTo(Date value) {
            addCriterion("upload_end_time =", value, "uploadEndTime");
            return (Criteria) this;
        }

        public Criteria andUploadEndTimeNotEqualTo(Date value) {
            addCriterion("upload_end_time <>", value, "uploadEndTime");
            return (Criteria) this;
        }

        public Criteria andUploadEndTimeGreaterThan(Date value) {
            addCriterion("upload_end_time >", value, "uploadEndTime");
            return (Criteria) this;
        }

        public Criteria andUploadEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("upload_end_time >=", value, "uploadEndTime");
            return (Criteria) this;
        }

        public Criteria andUploadEndTimeLessThan(Date value) {
            addCriterion("upload_end_time <", value, "uploadEndTime");
            return (Criteria) this;
        }

        public Criteria andUploadEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("upload_end_time <=", value, "uploadEndTime");
            return (Criteria) this;
        }

        public Criteria andUploadEndTimeIn(List<Date> values) {
            addCriterion("upload_end_time in", values, "uploadEndTime");
            return (Criteria) this;
        }

        public Criteria andUploadEndTimeNotIn(List<Date> values) {
            addCriterion("upload_end_time not in", values, "uploadEndTime");
            return (Criteria) this;
        }

        public Criteria andUploadEndTimeBetween(Date value1, Date value2) {
            addCriterion("upload_end_time between", value1, value2, "uploadEndTime");
            return (Criteria) this;
        }

        public Criteria andUploadEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("upload_end_time not between", value1, value2, "uploadEndTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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