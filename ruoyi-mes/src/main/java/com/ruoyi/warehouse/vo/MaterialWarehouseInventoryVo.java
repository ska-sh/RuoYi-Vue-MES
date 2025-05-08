package com.ruoyi.warehouse.vo;

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.warehouse.domain.MaterialWarehouseInventory;

import java.io.Serializable;

/**
 * 实时库存Vo
 * @author 蜗牛
 */
public class MaterialWarehouseInventoryVo extends MaterialWarehouseInventory implements Serializable {

    private static final long serialVersionUID = -5781916646118805927L;

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFigureNumber() {
        return figureNumber;
    }

    public void setFigureNumber(String figureNumber) {
        this.figureNumber = figureNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMaterialResourceDict() {
        return materialResourceDict;
    }

    public void setMaterialResourceDict(String materialResourceDict) {
        this.materialResourceDict = materialResourceDict;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public String getMaterialWarehouseCode() {
        return materialWarehouseCode;
    }

    public void setMaterialWarehouseCode(String materialWarehouseCode) {
        this.materialWarehouseCode = materialWarehouseCode;
    }

    public String getStockUnitDict() {
        return stockUnitDict;
    }

    public void setStockUnitDict(String stockUnitDict) {
        this.stockUnitDict = stockUnitDict;
    }

    @Override
    public String toString() {
        return "MaterialWarehouseInventoryVo{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", figureNumber='" + figureNumber + '\'' +
                ", type='" + type + '\'' +
                ", materialResourceDict='" + materialResourceDict + '\'' +
                ", model='" + model + '\'' +
                ", specification='" + specification + '\'' +
                ", materialWarehouseCode='" + materialWarehouseCode + '\'' +
                ", stockUnitDict='" + stockUnitDict + '\'' +
                "} " + super.toString();
    }
}
