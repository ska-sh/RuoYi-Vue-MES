package com.ruoyi.quality.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 工序检验标准对象 qc_operation_inspection_standards
 * 
 * @author 蜗牛
 * @date 2025-05-10
 */
public class QcOperationInspectionStandards extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** 物料编码 */
    @Excel(name = "物料编码")
    private String code;

    /** 物料名称 */
    @Excel(name = "物料名称")
    private String name;

    /** 图号 */
    @Excel(name = "图号")
    private String figureNumber;

    /** 型号 */
    @Excel(name = "型号")
    private String model;

    /** 规格 */
    @Excel(name = "规格")
    private String specification;

    /** 工序编号 */
    @Excel(name = "工序编号")
    private String operationNumber;

    /** 工序名称 */
    @Excel(name = "工序名称")
    private String operationName;

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

    public void setFigureNumber(String figureNumber) 
    {
        this.figureNumber = figureNumber;
    }

    public String getFigureNumber() 
    {
        return figureNumber;
    }

    public void setModel(String model) 
    {
        this.model = model;
    }

    public String getModel() 
    {
        return model;
    }

    public void setSpecification(String specification) 
    {
        this.specification = specification;
    }

    public String getSpecification() 
    {
        return specification;
    }

    public void setOperationNumber(String operationNumber) 
    {
        this.operationNumber = operationNumber;
    }

    public String getOperationNumber() 
    {
        return operationNumber;
    }

    public void setOperationName(String operationName) 
    {
        this.operationName = operationName;
    }

    public String getOperationName() 
    {
        return operationName;
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
            .append("figureNumber", getFigureNumber())
            .append("model", getModel())
            .append("specification", getSpecification())
            .append("operationNumber", getOperationNumber())
            .append("operationName", getOperationName())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
