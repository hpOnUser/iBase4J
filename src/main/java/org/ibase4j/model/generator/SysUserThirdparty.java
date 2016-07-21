package org.ibase4j.model.generator;

import java.io.Serializable;
import java.util.Date;

public class SysUserThirdparty implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_thirdparty.id_
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_thirdparty.user_id
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_thirdparty.provider_
     *
     * @mbggenerated
     */
    private String provider;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_thirdparty.open_id
     *
     * @mbggenerated
     */
    private String openId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_thirdparty.enable_
     *
     * @mbggenerated
     */
    private Boolean enable;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_thirdparty.remark_
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_thirdparty.create_by
     *
     * @mbggenerated
     */
    private Integer createBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_thirdparty.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_thirdparty.update_by
     *
     * @mbggenerated
     */
    private Integer updateBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user_thirdparty.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sys_user_thirdparty
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_thirdparty.id_
     *
     * @return the value of sys_user_thirdparty.id_
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_thirdparty.id_
     *
     * @param id the value for sys_user_thirdparty.id_
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_thirdparty.user_id
     *
     * @return the value of sys_user_thirdparty.user_id
     *
     * @mbggenerated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_thirdparty.user_id
     *
     * @param userId the value for sys_user_thirdparty.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_thirdparty.provider_
     *
     * @return the value of sys_user_thirdparty.provider_
     *
     * @mbggenerated
     */
    public String getProvider() {
        return provider;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_thirdparty.provider_
     *
     * @param provider the value for sys_user_thirdparty.provider_
     *
     * @mbggenerated
     */
    public void setProvider(String provider) {
        this.provider = provider == null ? null : provider.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_thirdparty.open_id
     *
     * @return the value of sys_user_thirdparty.open_id
     *
     * @mbggenerated
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_thirdparty.open_id
     *
     * @param openId the value for sys_user_thirdparty.open_id
     *
     * @mbggenerated
     */
    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_thirdparty.enable_
     *
     * @return the value of sys_user_thirdparty.enable_
     *
     * @mbggenerated
     */
    public Boolean getEnable() {
        return enable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_thirdparty.enable_
     *
     * @param enable the value for sys_user_thirdparty.enable_
     *
     * @mbggenerated
     */
    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_thirdparty.remark_
     *
     * @return the value of sys_user_thirdparty.remark_
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_thirdparty.remark_
     *
     * @param remark the value for sys_user_thirdparty.remark_
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_thirdparty.create_by
     *
     * @return the value of sys_user_thirdparty.create_by
     *
     * @mbggenerated
     */
    public Integer getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_thirdparty.create_by
     *
     * @param createBy the value for sys_user_thirdparty.create_by
     *
     * @mbggenerated
     */
    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_thirdparty.create_time
     *
     * @return the value of sys_user_thirdparty.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_thirdparty.create_time
     *
     * @param createTime the value for sys_user_thirdparty.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_thirdparty.update_by
     *
     * @return the value of sys_user_thirdparty.update_by
     *
     * @mbggenerated
     */
    public Integer getUpdateBy() {
        return updateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_thirdparty.update_by
     *
     * @param updateBy the value for sys_user_thirdparty.update_by
     *
     * @mbggenerated
     */
    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user_thirdparty.update_time
     *
     * @return the value of sys_user_thirdparty.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user_thirdparty.update_time
     *
     * @param updateTime the value for sys_user_thirdparty.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_thirdparty
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", provider=").append(provider);
        sb.append(", openId=").append(openId);
        sb.append(", enable=").append(enable);
        sb.append(", remark=").append(remark);
        sb.append(", createBy=").append(createBy);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_thirdparty
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SysUserThirdparty other = (SysUserThirdparty) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getProvider() == null ? other.getProvider() == null : this.getProvider().equals(other.getProvider()))
            && (this.getOpenId() == null ? other.getOpenId() == null : this.getOpenId().equals(other.getOpenId()))
            && (this.getEnable() == null ? other.getEnable() == null : this.getEnable().equals(other.getEnable()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateBy() == null ? other.getUpdateBy() == null : this.getUpdateBy().equals(other.getUpdateBy()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_user_thirdparty
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getProvider() == null) ? 0 : getProvider().hashCode());
        result = prime * result + ((getOpenId() == null) ? 0 : getOpenId().hashCode());
        result = prime * result + ((getEnable() == null) ? 0 : getEnable().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateBy() == null) ? 0 : getUpdateBy().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }
}