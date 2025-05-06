package com.ruoyi.material.mapper;

import java.util.List;
import com.ruoyi.material.domain.BaseMaterial;

/**
 * 物料管理Mapper接口
 * 
 * @author 蜗牛
 * @date 2025-05-06
 */
public interface BaseMaterialMapper 
{
    /**
     * 查询物料管理
     * 
     * @param id 物料管理主键
     * @return 物料管理
     */
    public BaseMaterial selectBaseMaterialById(Long id);

    /**
     * 查询物料管理列表
     * 
     * @param baseMaterial 物料管理
     * @return 物料管理集合
     */
    public List<BaseMaterial> selectBaseMaterialList(BaseMaterial baseMaterial);

    /**
     * 新增物料管理
     * 
     * @param baseMaterial 物料管理
     * @return 结果
     */
    public int insertBaseMaterial(BaseMaterial baseMaterial);

    /**
     * 修改物料管理
     * 
     * @param baseMaterial 物料管理
     * @return 结果
     */
    public int updateBaseMaterial(BaseMaterial baseMaterial);

    /**
     * 删除物料管理
     * 
     * @param id 物料管理主键
     * @return 结果
     */
    public int deleteBaseMaterialById(Long id);

    /**
     * 批量删除物料管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBaseMaterialByIds(Long[] ids);
}
