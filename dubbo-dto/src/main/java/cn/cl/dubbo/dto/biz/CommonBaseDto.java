package cn.cl.dubbo.dto.biz;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by chenlang on 2017/5/31.
 */
public class CommonBaseDto implements Serializable{

    // 主键ID
    protected Integer id;

    // 创建者
    protected Integer createdBy;

    // 创建时间
    protected Date createTime;

    // 更新者
    protected Integer updateBy;

    // 更新时间
    protected Date updateTime;

    // 国际化标识
    protected String locale;

    // 创建者名称
    protected String createdByName;

    // 更新者名称
    protected String updateByName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getCreatedByName() {
        return createdByName;
    }

    public void setCreatedByName(String createdByName) {
        this.createdByName = createdByName;
    }

    public String getUpdateByName() {
        return updateByName;
    }

    public void setUpdateByName(String updateByName) {
        this.updateByName = updateByName;
    }
}
