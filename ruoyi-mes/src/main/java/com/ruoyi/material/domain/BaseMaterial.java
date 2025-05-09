package com.ruoyi.material.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 物料管理对象 base_material
 * 
 * @author 蜗牛
 * @date 2025-05-06
 */
public class BaseMaterial extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
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

    /** 物料类别 */
    @Excel(name = "物料类别")
    private String type;

    /** 物料来源 */
    @Excel(name = "物料来源")
    private String materialResourceDict;

    /** 型号 */
    @Excel(name = "型号")
    private String model;

    /** 规格 */
    @Excel(name = "规格")
    private String specification;

    /** 仓库 */
    @Excel(name = "仓库")
    private String materialWarehouseCode;

    /** 库存单位 */
    @Excel(name = "库存单位")
    private String stockUnitDict;

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

    public void setFigureNumber(String figureNumber) 
    {
        this.figureNumber = figureNumber;
    }

    public String getFigureNumber() 
    {
        return figureNumber;
    }

    public void setType(String type) 
    {
        this.type = type;
    }

    public String getType() 
    {
        return type;
    }

    public void setMaterialResourceDict(String materialResourceDict) 
    {
        this.materialResourceDict = materialResourceDict;
    }

    public String getMaterialResourceDict() 
    {
        return materialResourceDict;
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

    public void setMaterialWarehouseCode(String materialWarehouseCode) 
    {
        this.materialWarehouseCode = materialWarehouseCode;
    }

    public String getMaterialWarehouseCode() 
    {
        return materialWarehouseCode;
    }

    public void setStockUnitDict(String stockUnitDict) 
    {
        this.stockUnitDict = stockUnitDict;
    }

    public String getStockUnitDict() 
    {
        return stockUnitDict;
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
            .append("figureNumber", getFigureNumber())
            .append("type", getType())
            .append("materialResourceDict", getMaterialResourceDict())
            .append("model", getModel())
            .append("specification", getSpecification())
            .append("materialWarehouseCode", getMaterialWarehouseCode())
            .append("stockUnitDict", getStockUnitDict())
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
