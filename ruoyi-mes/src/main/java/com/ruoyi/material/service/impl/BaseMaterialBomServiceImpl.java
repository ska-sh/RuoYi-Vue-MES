package com.ruoyi.material.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.ruoyi.common.core.domain.TreeSelect;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.material.domain.BaseMaterial;
import com.ruoyi.material.service.IBaseMaterialService;
import com.ruoyi.material.vo.BomTreeSelectVo;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.material.mapper.BaseMaterialBomMapper;
import com.ruoyi.material.domain.BaseMaterialBom;
import com.ruoyi.material.service.IBaseMaterialBomService;

/**
 * 物料BOMService业务层处理
 * 
 * @author 蜗牛
 * @date 2025-05-09
 */
@Service
public class BaseMaterialBomServiceImpl implements IBaseMaterialBomService 
{
    @Autowired
    private BaseMaterialBomMapper baseMaterialBomMapper;

    @Autowired
    private IBaseMaterialService baseMaterialService;

    /**
     * 查询物料BOM
     * 
     * @param id 物料BOM主键
     * @return 物料BOM
     */
    @Override
    public BaseMaterialBom selectBaseMaterialBomById(Long id)
    {
        return baseMaterialBomMapper.selectBaseMaterialBomById(id);
    }

    /**
     * 查询物料BOM列表
     * 
     * @param baseMaterialBom 物料BOM
     * @return 物料BOM
     */
    @Override
    public List<BaseMaterialBom> selectBaseMaterialBomList(BaseMaterialBom baseMaterialBom)
    {
        return baseMaterialBomMapper.selectBaseMaterialBomList(baseMaterialBom);
    }

    @Override
    public List<BaseMaterialBom> selectBaseMaterialBomList(String productCode) {
        return baseMaterialBomMapper.selectBaseMaterialBomListByProductCode(productCode);
    }

    /**
     * 新增物料BOM
     * 
     * @param baseMaterialBom 物料BOM
     * @return 结果
     */
    @Override
    public int insertBaseMaterialBom(BaseMaterialBom baseMaterialBom)
    {
        baseMaterialBom.setCreateTime(DateUtils.getNowDate());
        return baseMaterialBomMapper.insertBaseMaterialBom(baseMaterialBom);
    }

    /**
     * 修改物料BOM
     * 
     * @param baseMaterialBom 物料BOM
     * @return 结果
     */
    @Override
    public int updateBaseMaterialBom(BaseMaterialBom baseMaterialBom)
    {
        baseMaterialBom.setUpdateTime(DateUtils.getNowDate());
        return baseMaterialBomMapper.updateBaseMaterialBom(baseMaterialBom);
    }

    /**
     * 批量删除物料BOM
     * 
     * @param ids 需要删除的物料BOM主键
     * @return 结果
     */
    @Override
    public int deleteBaseMaterialBomByIds(Long[] ids)
    {
        return baseMaterialBomMapper.deleteBaseMaterialBomByIds(ids);
    }

    /**
     * 删除物料BOM信息
     * 
     * @param id 物料BOM主键
     * @return 结果
     */
    @Override
    public int deleteBaseMaterialBomById(Long id)
    {
        return baseMaterialBomMapper.deleteBaseMaterialBomById(id);
    }

    @Override
    public List<TreeSelect> selectBomTreeList(String productCode) {
        BaseMaterial baseMaterial = baseMaterialService.selectBaseMaterialByCode(productCode);
        BaseMaterialBom bom = new BaseMaterialBom();
        BeanUtils.copyProperties(baseMaterial, bom);
        bom.setProductCode(productCode);
        return buildBomTreeSelect(bom);
    }

    @Override
    public List<TreeSelect> buildBomTreeSelect(BaseMaterialBom baseMaterialBom) {
        List<BaseMaterialBom> returnList = new ArrayList<>();

        List<BaseMaterialBom> list = selectBaseMaterialBomList(baseMaterialBom.getProductCode());
        if(CollectionUtils.isNotEmpty(list)){
            baseMaterialBom.setChildren(list);
            for(BaseMaterialBom bom : list){
                bom.setChildren(selectBaseMaterialBomList(bom.getCode()));
            }
        }
        returnList.add(baseMaterialBom);

        return returnList.stream().map(BomTreeSelectVo::new).collect(Collectors.toList());
    }
}
