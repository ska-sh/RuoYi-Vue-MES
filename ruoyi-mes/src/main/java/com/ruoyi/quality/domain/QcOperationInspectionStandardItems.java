package com.ruoyi.quality.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 工序检验项目明细对象 qc_operation_inspection_standard_items
 * 
 * @author 蜗牛
 * @date 2025-05-10
 */
public class QcOperationInspectionStandardItems extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 成品检验标准ID */
    @Excel(name = "成品检验标准ID")
    private Long standardId;

    /** 序号 */
    @Excel(name = "序号")
    private Long rowId;

    /** 检验项目ID */
    @Excel(name = "检验项目ID")
    private Long qcItemId;

    /** 检测工具/方法 */
    @Excel(name = "检测工具/方法")
    private String qcInspectionMethod;

    /** 技术要求/规范 */
    @Excel(name = "技术要求/规范")
    private String technicalSpecification;

    /** 是否关键项 */
    @Excel(name = "是否关键项")
    private String isKeyItem;

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

    public void setStandardId(Long standardId) 
    {
        this.standardId = standardId;
    }

    public Long getStandardId() 
    {
        return standardId;
    }

    public void setRowId(Long rowId) 
    {
        this.rowId = rowId;
    }

    public Long getRowId() 
    {
        return rowId;
    }

    public void setQcItemId(Long qcItemId) 
    {
        this.qcItemId = qcItemId;
    }

    public Long getQcItemId() 
    {
        return qcItemId;
    }

    public void setQcInspectionMethod(String qcInspectionMethod) 
    {
        this.qcInspectionMethod = qcInspectionMethod;
    }

    public String getQcInspectionMethod() 
    {
        return qcInspectionMethod;
    }

    public void setTechnicalSpecification(String technicalSpecification) 
    {
        this.technicalSpecification = technicalSpecification;
    }

    public String getTechnicalSpecification() 
    {
        return technicalSpecification;
    }

    public void setIsKeyItem(String isKeyItem) 
    {
        this.isKeyItem = isKeyItem;
    }

    public String getIsKeyItem() 
    {
        return isKeyItem;
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
            .append("standardId", getStandardId())
            .append("rowId", getRowId())
            .append("qcItemId", getQcItemId())
            .append("qcInspectionMethod", getQcInspectionMethod())
            .append("technicalSpecification", getTechnicalSpecification())
            .append("isKeyItem", getIsKeyItem())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
