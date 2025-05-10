package com.ruoyi.technology.service;

import java.util.List;

import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.technology.domain.BaseTechnologyConfig;

/**
 * 基础工艺Service接口
 * 
 * @author 蜗牛
 * @date 2025-05-07
 */
public interface IBaseTechnologyConfigService 
{
    /**
     * 查询基础工艺
     * 
     * @param id 基础工艺主键
     * @return 基础工艺
     */
    public BaseTechnologyConfig selectBaseTechnologyConfigById(Long id);

    /**
     * 查询基础工艺
     * @param code 工艺编号
     * @return 基础工艺
     */
    BaseTechnologyConfig selectBaseTechnologyConfigByCode(String code);

    /**
     * 查询基础工艺列表
     * 
     * @param baseTechnologyConfig 基础工艺
     * @return 基础工艺集合
     */
    public List<BaseTechnologyConfig> selectBaseTechnologyConfigList(BaseTechnologyConfig baseTechnologyConfig);

    /**
     * 新增基础工艺
     * 
     * @param baseTechnologyConfig 基础工艺
     * @return 结果
     */
    public AjaxResult insertBaseTechnologyConfig(BaseTechnologyConfig baseTechnologyConfig);

    /**
     * 修改基础工艺
     * 
     * @param baseTechnologyConfig 基础工艺
     * @return 结果
     */
    public int updateBaseTechnologyConfig(BaseTechnologyConfig baseTechnologyConfig);

    /**
     * 批量删除基础工艺
     * 
     * @param ids 需要删除的基础工艺主键集合
     * @return 结果
     */
    public int deleteBaseTechnologyConfigByIds(Long[] ids);

    /**
     * 删除基础工艺信息
     * 
     * @param id 基础工艺主键
     * @return 结果
     */
    public int deleteBaseTechnologyConfigById(Long id);
}
