package com.ruoyi.partner.mapper;

import java.util.List;
import com.ruoyi.partner.domain.BaseSupplier;

/**
 * 供应商信息Mapper接口
 * 
 * @author 蜗牛
 * @date 2025-05-07
 */
public interface BaseSupplierMapper 
{
    /**
     * 查询供应商信息
     * 
     * @param id 供应商信息主键
     * @return 供应商信息
     */
    public BaseSupplier selectBaseSupplierById(Long id);

    /**
     * 查询供应商信息列表
     * 
     * @param baseSupplier 供应商信息
     * @return 供应商信息集合
     */
    public List<BaseSupplier> selectBaseSupplierList(BaseSupplier baseSupplier);

    /**
     * 新增供应商信息
     * 
     * @param baseSupplier 供应商信息
     * @return 结果
     */
    public int insertBaseSupplier(BaseSupplier baseSupplier);

    /**
     * 修改供应商信息
     * 
     * @param baseSupplier 供应商信息
     * @return 结果
     */
    public int updateBaseSupplier(BaseSupplier baseSupplier);

    /**
     * 删除供应商信息
     * 
     * @param id 供应商信息主键
     * @return 结果
     */
    public int deleteBaseSupplierById(Long id);

    /**
     * 批量删除供应商信息
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBaseSupplierByIds(Long[] ids);
}
