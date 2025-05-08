package com.ruoyi.warehouse.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.warehouse.vo.MaterialWarehouseInventoryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.warehouse.mapper.MaterialWarehouseInventoryMapper;
import com.ruoyi.warehouse.domain.MaterialWarehouseInventory;
import com.ruoyi.warehouse.service.IMaterialWarehouseInventoryService;

/**
 * 物料实时库存Service业务层处理
 * 
 * @author 蜗牛
 * @date 2025-05-08
 */
@Service
public class MaterialWarehouseInventoryServiceImpl implements IMaterialWarehouseInventoryService 
{
    @Autowired
    private MaterialWarehouseInventoryMapper materialWarehouseInventoryMapper;

    /**
     * 查询物料实时库存
     * 
     * @param id 物料实时库存主键
     * @return 物料实时库存
     */
    @Override
    public MaterialWarehouseInventory selectMaterialWarehouseInventoryById(Long id)
    {
        return materialWarehouseInventoryMapper.selectMaterialWarehouseInventoryById(id);
    }

    /**
     * 查询物料实时库存列表
     * 
     * @param materialWarehouseInventoryVo 物料实时库存
     * @return 物料实时库存
     */
    @Override
    public List<MaterialWarehouseInventoryVo> selectMaterialWarehouseInventoryList(MaterialWarehouseInventoryVo materialWarehouseInventoryVo)
    {
        return materialWarehouseInventoryMapper.selectMaterialWarehouseInventoryList(materialWarehouseInventoryVo);
    }

    /**
     * 新增物料实时库存
     * 
     * @param materialWarehouseInventory 物料实时库存
     * @return 结果
     */
    @Override
    public int insertMaterialWarehouseInventory(MaterialWarehouseInventory materialWarehouseInventory)
    {
        materialWarehouseInventory.setCreateTime(DateUtils.getNowDate());
        return materialWarehouseInventoryMapper.insertMaterialWarehouseInventory(materialWarehouseInventory);
    }

    /**
     * 修改物料实时库存
     * 
     * @param materialWarehouseInventory 物料实时库存
     * @return 结果
     */
    @Override
    public int updateMaterialWarehouseInventory(MaterialWarehouseInventory materialWarehouseInventory)
    {
        materialWarehouseInventory.setUpdateTime(DateUtils.getNowDate());
        return materialWarehouseInventoryMapper.updateMaterialWarehouseInventory(materialWarehouseInventory);
    }

    /**
     * 批量删除物料实时库存
     * 
     * @param ids 需要删除的物料实时库存主键
     * @return 结果
     */
    @Override
    public int deleteMaterialWarehouseInventoryByIds(Long[] ids)
    {
        return materialWarehouseInventoryMapper.deleteMaterialWarehouseInventoryByIds(ids);
    }

    /**
     * 删除物料实时库存信息
     * 
     * @param id 物料实时库存主键
     * @return 结果
     */
    @Override
    public int deleteMaterialWarehouseInventoryById(Long id)
    {
        return materialWarehouseInventoryMapper.deleteMaterialWarehouseInventoryById(id);
    }
}
