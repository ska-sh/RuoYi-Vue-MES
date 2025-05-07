package com.ruoyi.technology.service.impl;

import java.util.List;

import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.technology.mapper.BaseTechnologyConfigMapper;
import com.ruoyi.technology.domain.BaseTechnologyConfig;
import com.ruoyi.technology.service.IBaseTechnologyConfigService;

/**
 * 基础工艺Service业务层处理
 * 
 * @author 蜗牛
 * @date 2025-05-07
 */
@Service
public class BaseTechnologyConfigServiceImpl implements IBaseTechnologyConfigService 
{
    @Autowired
    private BaseTechnologyConfigMapper baseTechnologyConfigMapper;

    /**
     * 查询基础工艺
     * 
     * @param id 基础工艺主键
     * @return 基础工艺
     */
    @Override
    public BaseTechnologyConfig selectBaseTechnologyConfigById(Long id)
    {
        return baseTechnologyConfigMapper.selectBaseTechnologyConfigById(id);
    }

    /**
     * 查询基础工艺列表
     * 
     * @param baseTechnologyConfig 基础工艺
     * @return 基础工艺
     */
    @Override
    public List<BaseTechnologyConfig> selectBaseTechnologyConfigList(BaseTechnologyConfig baseTechnologyConfig)
    {
        return baseTechnologyConfigMapper.selectBaseTechnologyConfigList(baseTechnologyConfig);
    }

    /**
     * 新增基础工艺
     * 
     * @param baseTechnologyConfig 基础工艺
     * @return 结果
     */
    @Override
    public AjaxResult insertBaseTechnologyConfig(BaseTechnologyConfig baseTechnologyConfig)
    {
        BaseTechnologyConfig record = baseTechnologyConfigMapper.selectOneByCode(baseTechnologyConfig.getCode());
        if(record != null){
            return AjaxResult.error(baseTechnologyConfig.getCode()+"编号已存在!");
        }
        baseTechnologyConfig.setCreateTime(DateUtils.getNowDate());
        baseTechnologyConfig.setCreateBy(SecurityUtils.getLoginUser().getUsername());
        int rows = baseTechnologyConfigMapper.insertBaseTechnologyConfig(baseTechnologyConfig);
        return rows > 0 ? AjaxResult.success() : AjaxResult.error();
    }

    /**
     * 修改基础工艺
     * 
     * @param baseTechnologyConfig 基础工艺
     * @return 结果
     */
    @Override
    public int updateBaseTechnologyConfig(BaseTechnologyConfig baseTechnologyConfig)
    {
        baseTechnologyConfig.setUpdateTime(DateUtils.getNowDate());
        baseTechnologyConfig.setUpdateBy(SecurityUtils.getLoginUser().getUsername());
        return baseTechnologyConfigMapper.updateBaseTechnologyConfig(baseTechnologyConfig);
    }

    /**
     * 批量删除基础工艺
     * 
     * @param ids 需要删除的基础工艺主键
     * @return 结果
     */
    @Override
    public int deleteBaseTechnologyConfigByIds(Long[] ids)
    {
        return baseTechnologyConfigMapper.deleteBaseTechnologyConfigByIds(ids);
    }

    /**
     * 删除基础工艺信息
     * 
     * @param id 基础工艺主键
     * @return 结果
     */
    @Override
    public int deleteBaseTechnologyConfigById(Long id)
    {
        return baseTechnologyConfigMapper.deleteBaseTechnologyConfigById(id);
    }
}
