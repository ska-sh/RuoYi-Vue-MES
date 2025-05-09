package com.ruoyi.material.service;

import java.util.List;

import com.ruoyi.common.core.domain.TreeSelect;
import com.ruoyi.material.domain.BaseMaterialBom;

/**
 * 物料BOMService接口
 * 
 * @author 蜗牛
 * @date 2025-05-09
 */
public interface IBaseMaterialBomService 
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
     * 通过产品code查询BOM
     * @param productCode 产品CODE(物料编码)
     * @return 物料BOM集合
     */
    List<BaseMaterialBom> selectBaseMaterialBomList(String productCode);

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
     * 批量删除物料BOM
     * 
     * @param ids 需要删除的物料BOM主键集合
     * @return 结果
     */
    public int deleteBaseMaterialBomByIds(Long[] ids);

    /**
     * 删除物料BOM信息
     * 
     * @param id 物料BOM主键
     * @return 结果
     */
    public int deleteBaseMaterialBomById(Long id);

    /**
     * 通过productCode（即是物料编码）查询bom相关数据
     * @param productCode 产品CODE
     * @return 返回物料Tree
     */
    List<TreeSelect> selectBomTreeList(String productCode);

    /**
     * 构建前端所需要下拉树结构
     *
     * @param baseMaterialBom 部门列表
     * @return 下拉树结构列表
     */
    List<TreeSelect> buildBomTreeSelect(BaseMaterialBom baseMaterialBom);
}
