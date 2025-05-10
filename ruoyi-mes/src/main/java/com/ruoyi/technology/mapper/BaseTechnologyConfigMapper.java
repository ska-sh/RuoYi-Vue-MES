package com.ruoyi.technology.mapper;

import java.util.List;
import com.ruoyi.technology.domain.BaseTechnologyConfig;

/**
 * 基础工艺Mapper接口
 * 
 * @author 蜗牛
 * @date 2025-05-07
 */
public interface BaseTechnologyConfigMapper 
{
    /**
     * 查询基础工艺
     * 
     * @param id 基础工艺主键
     * @return 基础工艺
     */
    public BaseTechnologyConfig selectBaseTechnologyConfigById(Long id);

    /**
     * 查询基础工艺列表
     * 
     * @param baseTechnologyConfig 基础工艺
     * @return 基础工艺集合
     */
    public List<BaseTechnologyConfig> selectBaseTechnologyConfigList(BaseTechnologyConfig baseTechnologyConfig);

    /**
     * 通过工艺编号查询工艺信息
     * @param code
     * @return
     */
    BaseTechnologyConfig selectOneByCode(String code);

    /**
     * 查询基础工艺
     * @param name 工艺名称
     * @return 基础工艺
     */
    BaseTechnologyConfig selecOneByName(String name);

    /**
     * 新增基础工艺
     * 
     * @param baseTechnologyConfig 基础工艺
     * @return 结果
     */
    public int insertBaseTechnologyConfig(BaseTechnologyConfig baseTechnologyConfig);

    /**
     * 修改基础工艺
     * 
     * @param baseTechnologyConfig 基础工艺
     * @return 结果
     */
    public int updateBaseTechnologyConfig(BaseTechnologyConfig baseTechnologyConfig);

    /**
     * 删除基础工艺
     * 
     * @param id 基础工艺主键
     * @return 结果
     */
    public int deleteBaseTechnologyConfigById(Long id);

    /**
     * 批量删除基础工艺
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteBaseTechnologyConfigByIds(Long[] ids);
}
