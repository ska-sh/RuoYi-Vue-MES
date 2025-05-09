package com.ruoyi.material.mapper;

import java.util.List;
import com.ruoyi.material.domain.BaseMaterialBom;

/**
 * 物料BOMMapper接口
 * 
 * @author 蜗牛
 * @date 2025-05-09
 */
public interface BaseMaterialBomMapper 
{
    /**
     * 查询物料BOM
     * 
     * @param id 物料BOM主键
     * @return 物料BOM
     */
    public BaseMaterialBom selectBaseMaterialBomById(Long id);

    /**
     * 查询物料BOM列表
     * 
     * @param baseMaterialBom 物料BOM
     * @return 物料BOM集合
     */
    public List<BaseMaterialBom> selectBaseMaterialBomList(BaseMaterialBom baseMaterialBom);

    /**
     * 新增物料BOM
     * 
     * @param baseMaterialBom 物料BOM
     * @return 结果
     */
    public int insertBaseMaterialBom(BaseMaterialBom baseMaterialBom);

    /**
     * 修改物料BOM
     * 
     * @param baseMaterialBom 物料BOM
     * @return 结果
     */
    public int updateBaseMaterialBom(BaseMaterialBom baseMaterialBom);

    /**
     * 删除物料BOM
     * 
     * @param id 物料BOM主键
     * @return 结果
     */
    public int deleteBaseMaterialBomById(Long id);

    /**
     * 批量删除物料BOM
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBaseMaterialBomByIds(Long[] ids);

    /**
     * 通过产品code查询BOM
     * @param productCode 产品CODE(物料编码)
     * @return 物料BOM集合
     */
    List<BaseMaterialBom> selectBaseMaterialBomListByProductCode(String productCode);
}
