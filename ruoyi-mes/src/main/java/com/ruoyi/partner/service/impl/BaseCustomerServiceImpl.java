package com.ruoyi.partner.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.partner.mapper.BaseCustomerMapper;
import com.ruoyi.partner.domain.BaseCustomer;
import com.ruoyi.partner.service.IBaseCustomerService;

/**
 * 客户信息Service业务层处理
 * 
 * @author 蜗牛
 * @date 2025-05-07
 */
@Service
public class BaseCustomerServiceImpl implements IBaseCustomerService 
{
    @Autowired
    private BaseCustomerMapper baseCustomerMapper;

    /**
     * 查询客户信息
     * 
     * @param id 客户信息主键
     * @return 客户信息
     */
    @Override
    public BaseCustomer selectBaseCustomerById(Long id)
    {
        return baseCustomerMapper.selectBaseCustomerById(id);
    }

    /**
     * 查询客户信息列表
     * 
     * @param baseCustomer 客户信息
     * @return 客户信息
     */
    @Override
    public List<BaseCustomer> selectBaseCustomerList(BaseCustomer baseCustomer)
    {
        return baseCustomerMapper.selectBaseCustomerList(baseCustomer);
    }

    /**
     * 新增客户信息
     * 
     * @param baseCustomer 客户信息
     * @return 结果
     */
    @Override
    public int insertBaseCustomer(BaseCustomer baseCustomer)
    {
        baseCustomer.setCreateTime(DateUtils.getNowDate());
        baseCustomer.setCreateBy(SecurityUtils.getLoginUser().getUsername());
        return baseCustomerMapper.insertBaseCustomer(baseCustomer);
    }

    /**
     * 修改客户信息
     * 
     * @param baseCustomer 客户信息
     * @return 结果
     */
    @Override
    public int updateBaseCustomer(BaseCustomer baseCustomer)
    {
        baseCustomer.setUpdateTime(DateUtils.getNowDate());
        baseCustomer.setUpdateBy(SecurityUtils.getLoginUser().getUsername());
        return baseCustomerMapper.updateBaseCustomer(baseCustomer);
    }

    /**
     * 批量删除客户信息
     * 
     * @param ids 需要删除的客户信息主键
     * @return 结果
     */
    @Override
    public int deleteBaseCustomerByIds(Long[] ids)
    {
        return baseCustomerMapper.deleteBaseCustomerByIds(ids);
    }

    /**
     * 删除客户信息信息
     * 
     * @param id 客户信息主键
     * @return 结果
     */
    @Override
    public int deleteBaseCustomerById(Long id)
    {
        return baseCustomerMapper.deleteBaseCustomerById(id);
    }
}
