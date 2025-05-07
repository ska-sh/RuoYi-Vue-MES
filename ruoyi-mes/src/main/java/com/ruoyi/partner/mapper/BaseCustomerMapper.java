package com.ruoyi.partner.mapper;

import java.util.List;
import com.ruoyi.partner.domain.BaseCustomer;

/**
 * 客户信息Mapper接口
 * 
 * @author 蜗牛
 * @date 2025-05-07
 */
public interface BaseCustomerMapper 
{
    /**
     * 查询客户信息
     * 
     * @param id 客户信息主键
     * @return 客户信息
     */
    public BaseCustomer selectBaseCustomerById(Long id);

    /**
     * 查询客户信息列表
     * 
     * @param baseCustomer 客户信息
     * @return 客户信息集合
     */
    public List<BaseCustomer> selectBaseCustomerList(BaseCustomer baseCustomer);

    /**
     * 新增客户信息
     * 
     * @param baseCustomer 客户信息
     * @return 结果
     */
    public int insertBaseCustomer(BaseCustomer baseCustomer);

    /**
     * 修改客户信息
     * 
     * @param baseCustomer 客户信息
     * @return 结果
     */
    public int updateBaseCustomer(BaseCustomer baseCustomer);

    /**
     * 删除客户信息
     * 
     * @param id 客户信息主键
     * @return 结果
     */
    public int deleteBaseCustomerById(Long id);

    /**
     * 批量删除客户信息
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBaseCustomerByIds(Long[] ids);
}
