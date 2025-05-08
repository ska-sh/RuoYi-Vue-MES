package com.ruoyi.warehouse.service;

import java.util.List;
import com.ruoyi.warehouse.domain.MaterialWarehouseInventory;
import com.ruoyi.warehouse.vo.MaterialWarehouseInventoryVo;

/**
 * 物料实时库存Service接口
 * 
 * @author 蜗牛
 * @date 2025-05-08
 */
public interface IMaterialWarehouseInventoryService 
{
    /**
     * 查询物料实时库存
     * 
     * @param id 物料实时库存主键
     * @return 物料实时库存
     */
    public MaterialWarehouseInventory selectMaterialWarehouseInventoryById(Long id);

    /**
     * 查询物料实时库存列表
     * 
     * @param materialWarehouseInventoryVo 物料实时库存
     * @return 物料实时库存集合
     */
    public List<MaterialWarehouseInventoryVo> selectMaterialWarehouseInventoryList(MaterialWarehouseInventoryVo materialWarehouseInventoryVo);

    /**
     * 新增物料实时库存
     * 
     * @param materialWarehouseInventory 物料实时库存
     * @return 结果
     */
    public int insertMaterialWarehouseInventory(MaterialWarehouseInventory materialWarehouseInventory);

    /**
     * 修改物料实时库存
     * 
     * @param materialWarehouseInventory 物料实时库存
     * @return 结果
     */
    public int updateMaterialWarehouseInventory(MaterialWarehouseInventory materialWarehouseInventory);

    /**
     * 批量删除物料实时库存
     * 
     * @param ids 需要删除的物料实时库存主键集合
     * @return 结果
     */
    public int deleteMaterialWarehouseInventoryByIds(Long[] ids);

    /**
     * 删除物料实时库存信息
     * 
     * @param id 物料实时库存主键
     * @return 结果
     */
    public int deleteMaterialWarehouseInventoryById(Long id);
}
