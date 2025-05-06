package com.ruoyi.material.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.material.mapper.BaseMaterialMapper;
import com.ruoyi.material.domain.BaseMaterial;
import com.ruoyi.material.service.IBaseMaterialService;

/**
 * 物料管理Service业务层处理
 * 
 * @author 蜗牛
 * @date 2025-05-06
 */
@Service
public class BaseMaterialServiceImpl implements IBaseMaterialService 
{
    @Autowired
    private BaseMaterialMapper baseMaterialMapper;

    /**
     * 查询物料管理
     * 
     * @param id 物料管理主键
     * @return 物料管理
     */
    @Override
    public BaseMaterial selectBaseMaterialById(Long id)
    {
        return baseMaterialMapper.selectBaseMaterialById(id);
    }

    /**
     * 查询物料管理列表
     * 
     * @param baseMaterial 物料管理
     * @return 物料管理
     */
    @Override
    public List<BaseMaterial> selectBaseMaterialList(BaseMaterial baseMaterial)
    {
        return baseMaterialMapper.selectBaseMaterialList(baseMaterial);
    }

    /**
     * 新增物料管理
     * 
     * @param baseMaterial 物料管理
     * @return 结果
     */
    @Override
    public int insertBaseMaterial(BaseMaterial baseMaterial)
    {
        baseMaterial.setCreateTime(DateUtils.getNowDate());
        return baseMaterialMapper.insertBaseMaterial(baseMaterial);
    }

    /**
     * 修改物料管理
     * 
     * @param baseMaterial 物料管理
     * @return 结果
     */
    @Override
    public int updateBaseMaterial(BaseMaterial baseMaterial)
    {
        baseMaterial.setUpdateTime(DateUtils.getNowDate());
        return baseMaterialMapper.updateBaseMaterial(baseMaterial);
    }

    /**
     * 批量删除物料管理
     * 
     * @param ids 需要删除的物料管理主键
     * @return 结果
     */
    @Override
    public int deleteBaseMaterialByIds(Long[] ids)
    {
        return baseMaterialMapper.deleteBaseMaterialByIds(ids);
    }

    /**
     * 删除物料管理信息
     * 
     * @param id 物料管理主键
     * @return 结果
     */
    @Override
    public int deleteBaseMaterialById(Long id)
    {
        return baseMaterialMapper.deleteBaseMaterialById(id);
    }
}
