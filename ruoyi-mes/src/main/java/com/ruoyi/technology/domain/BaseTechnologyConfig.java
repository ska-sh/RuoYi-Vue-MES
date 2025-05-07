package com.ruoyi.technology.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 基础工艺对象 base_technology_config
 * 
 * @author 蜗牛
 * @date 2025-05-07
 */
public class BaseTechnologyConfig extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 工艺编号 */
    @Excel(name = "工艺编号")
    private String code;

    /** 工艺名称 */
    @Excel(name = "工艺名称")
    private String name;

    /** 加工内容 */
    @Excel(name = "加工内容")
    private String processContent;

    /** 调机时间 */
    @Excel(name = "调机时间")
    private Integer debuggingTime;

    /** 准备时间 */
    @Excel(name = "准备时间")
    private Integer prepareTime;

    /** 加工时间 */
    @Excel(name = "加工时间")
    private Integer processTime;

    /** 标准工时 */
    @Excel(name = "标准工时")
    private Integer standardTime;

    /** 状态（0正常 1停用） */
    private String status;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setCode(String code) 
    {
        this.code = code;
    }

    public String getCode() 
    {
        return code;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }

    public void setProcessContent(String processContent) 
    {
        this.processContent = processContent;
    }

    public String getProcessContent() 
    {
        return processContent;
    }

    public void setDebuggingTime(Integer debuggingTime) 
    {
        this.debuggingTime = debuggingTime;
    }

    public Integer getDebuggingTime() 
    {
        return debuggingTime;
    }

    public void setPrepareTime(Integer prepareTime) 
    {
        this.prepareTime = prepareTime;
    }

    public Integer getPrepareTime() 
    {
        return prepareTime;
    }

    public void setProcessTime(Integer processTime) 
    {
        this.processTime = processTime;
    }

    public Integer getProcessTime() 
    {
        return processTime;
    }

    public void setStandardTime(Integer standardTime) 
    {
        this.standardTime = standardTime;
    }

    public Integer getStandardTime() 
    {
        return standardTime;
    }

    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    public void setDelFlag(String delFlag) 
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag() 
    {
        return delFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("code", getCode())
            .append("name", getName())
            .append("processContent", getProcessContent())
            .append("debuggingTime", getDebuggingTime())
            .append("prepareTime", getPrepareTime())
            .append("processTime", getProcessTime())
            .append("standardTime", getStandardTime())
            .append("status", getStatus())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
