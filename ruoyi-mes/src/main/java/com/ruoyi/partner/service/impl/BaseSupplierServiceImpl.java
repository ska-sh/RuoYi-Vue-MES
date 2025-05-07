package com.ruoyi.partner.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.partner.mapper.BaseSupplierMapper;
import com.ruoyi.partner.domain.BaseSupplier;
import com.ruoyi.partner.service.IBaseSupplierService;

/**
 * 供应商信息Service业务层处理
 * 
 * @author 蜗牛
 * @date 2025-05-07
 */
@Service
public class BaseSupplierServiceImpl implements IBaseSupplierService 
{
    @Autowired
    private BaseSupplierMapper baseSupplierMapper;

    /**
     * 查询供应商信息
     * 
     * @param id 供应商信息主键
     * @return 供应商信息
     */
    @Override
    public BaseSupplier selectBaseSupplierById(Long id)
    {
        return baseSupplierMapper.selectBaseSupplierById(id);
    }

    /**
     * 查询供应商信息列表
     * 
     * @param baseSupplier 供应商信息
     * @return 供应商信息
     */
    @Override
    public List<BaseSupplier> selectBaseSupplierList(BaseSupplier baseSupplier)
    {
        return baseSupplierMapper.selectBaseSupplierList(baseSupplier);
    }

    /**
     * 新增供应商信息
     * 
     * @param baseSupplier 供应商信息
     * @return 结果
     */
    @Override
    public int insertBaseSupplier(BaseSupplier baseSupplier)
    {
        baseSupplier.setCreateTime(DateUtils.getNowDate());
        baseSupplier.setCreateBy(SecurityUtils.getLoginUser().getUsername());
        return baseSupplierMapper.insertBaseSupplier(baseSupplier);
    }

    /**
     * 修改供应商信息
     * 
     * @param baseSupplier 供应商信息
     * @return 结果
     */
    @Override
    public int updateBaseSupplier(BaseSupplier baseSupplier)
    {
        baseSupplier.setUpdateTime(DateUtils.getNowDate());
        baseSupplier.setUpdateBy(SecurityUtils.getLoginUser().getUsername());
        return baseSupplierMapper.updateBaseSupplier(baseSupplier);
    }

    /**
     * 批量删除供应商信息
     * 
     * @param ids 需要删除的供应商信息主键
     * @return 结果
     */
    @Override
    public int deleteBaseSupplierByIds(Long[] ids)
    {
        return baseSupplierMapper.deleteBaseSupplierByIds(ids);
    }

    /**
     * 删除供应商信息信息
     * 
     * @param id 供应商信息主键
     * @return 结果
     */
    @Override
    public int deleteBaseSupplierById(Long id)
    {
        return baseSupplierMapper.deleteBaseSupplierById(id);
    }
}
