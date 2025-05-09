package com.ruoyi.material.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * 物料BOM对象 base_material_bom
 * 
 * @author 蜗牛
 * @date 2025-05-09
 */
public class BaseMaterialBom extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 成品物料编码 */
    @Excel(name = "成品物料编码")
    private String productCode;

    /** 物料编码 */
    @Excel(name = "物料编码")
    private String code;

    /** 物料名称 */
    @Excel(name = "物料名称")
    private String name;

    /** 图号 */
    @Excel(name = "图号")
    private String figureNumber;

    /** 物料类标(material_category_code) */
    @Excel(name = "物料类标(material_category_code)")
    private String type;

    /** 物料来源(material_resource_dict) */
    @Excel(name = "物料来源(material_resource_dict)")
    private String materialResourceDict;

    /** 型号 */
    @Excel(name = "型号")
    private String model;

    /** 规格 */
    @Excel(name = "规格")
    private String specification;

    /** 仓库(material_warehouse_code) */
    @Excel(name = "仓库(material_warehouse_code)")
    private String materialWarehouseCode;

    /** 库存单位 */
    @Excel(name = "库存单位")
    private String stockUnitDict;

    /** 角色状态（0正常 1停用） */
    @Excel(name = "角色状态", readConverterExp = "0=正常,1=停用")
    private String status;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    /** 子菜单 */
    private List<BaseMaterialBom> children = new ArrayList<>();

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setProductCode(String productCode) 
    {
        this.productCode = productCode;
    }

    public String getProductCode() 
    {
        return productCode;
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

    public List<BaseMaterialBom> getChildren() {
        return children;
    }

    public void setChildren(List<BaseMaterialBom> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("productCode", getProductCode())
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
