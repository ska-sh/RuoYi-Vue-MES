package com.ruoyi.quality.service.impl;

import java.util.List;

import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.SecurityUtils;
import com.ruoyi.material.domain.BaseMaterial;
import com.ruoyi.material.service.IBaseMaterialService;
import com.ruoyi.technology.domain.BaseTechnologyConfig;
import com.ruoyi.technology.service.IBaseTechnologyConfigService;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.quality.mapper.QcOperationInspectionStandardsMapper;
import com.ruoyi.quality.domain.QcOperationInspectionStandards;
import com.ruoyi.quality.service.IQcOperationInspectionStandardsService;

/**
 * 工序检验标准Service业务层处理
 * 
 * @author 蜗牛
 * @date 2025-05-10
 */
@Service
public class QcOperationInspectionStandardsServiceImpl implements IQcOperationInspectionStandardsService 
{
    @Autowired
    private QcOperationInspectionStandardsMapper qcOperationInspectionStandardsMapper;

    @Autowired
    private IBaseMaterialService baseMaterialService;

    @Autowired
    private IBaseTechnologyConfigService baseTechnologyConfigService;

    /**
     * 查询工序检验标准
     * 
     * @param id 工序检验标准主键
     * @return 工序检验标准
     */
    @Override
    public QcOperationInspectionStandards selectQcOperationInspectionStandardsById(Long id)
    {
        return qcOperationInspectionStandardsMapper.selectQcOperationInspectionStandardsById(id);
    }

    /**
     * 查询工序检验标准列表
     * 
     * @param qcOperationInspectionStandards 工序检验标准
     * @return 工序检验标准
     */
    @Override
    public List<QcOperationInspectionStandards> selectQcOperationInspectionStandardsList(QcOperationInspectionStandards qcOperationInspectionStandards)
    {
        return qcOperationInspectionStandardsMapper.selectQcOperationInspectionStandardsList(qcOperationInspectionStandards);
    }

    /**
     * 新增工序检验标准
     * 
     * @param qcOperationInspectionStandards 工序检验标准
     * @return 结果
     */
    @Override
    public AjaxResult insertQcOperationInspectionStandards(QcOperationInspectionStandards qcOperationInspectionStandards)
    {
        QcOperationInspectionStandards standards = new QcOperationInspectionStandards();
        standards.setCode(qcOperationInspectionStandards.getCode());
        standards.setOperationNumber(qcOperationInspectionStandards.getOperationNumber());
        List<QcOperationInspectionStandards> list = qcOperationInspectionStandardsMapper.selectQcOperationInspectionStandardsList(standards);

        if(CollectionUtils.isNotEmpty(list)){
            return AjaxResult.error("物料："+qcOperationInspectionStandards.getCode()+ "，工艺："+qcOperationInspectionStandards.getOperationName() + "质检标准已存在!");
        }

        BaseMaterial baseMaterial = baseMaterialService.selectBaseMaterialByCode(qcOperationInspectionStandards.getCode());
        if(baseMaterial == null){
            return AjaxResult.error(qcOperationInspectionStandards.getCode() + "物料不存在!");
        }

        BaseTechnologyConfig baseTechnologyConfig = baseTechnologyConfigService.selectBaseTechnologyConfigByCode(qcOperationInspectionStandards.getOperationNumber());
        if(baseTechnologyConfig == null){
            return AjaxResult.error(qcOperationInspectionStandards.getCode() + "工艺/工序不存在!");
        }

        BeanUtils.copyProperties(baseMaterial, qcOperationInspectionStandards);
        qcOperationInspectionStandards.setOperationName(baseTechnologyConfig.getName());
        qcOperationInspectionStandards.setOperationNumber(baseTechnologyConfig.getCode());
        qcOperationInspectionStandards.setCreateBy(SecurityUtils.getLoginUser().getUsername());
        qcOperationInspectionStandards.setCreateTime(DateUtils.getNowDate());
        int rows = qcOperationInspectionStandardsMapper.insertQcOperationInspectionStandards(qcOperationInspectionStandards);
        return rows > 0 ? AjaxResult.success() : AjaxResult.error();
    }

    /**
     * 修改工序检验标准
     * 
     * @param qcOperationInspectionStandards 工序检验标准
     * @return 结果
     */
    @Override
    public AjaxResult updateQcOperationInspectionStandards(QcOperationInspectionStandards qcOperationInspectionStandards)
    {
        if(qcOperationInspectionStandards.getId() == null){
            return AjaxResult.error("ID不能为空!");
        }
        long standardId = qcOperationInspectionStandards.getId();
        BaseMaterial baseMaterial = baseMaterialService.selectBaseMaterialByCode(qcOperationInspectionStandards.getCode());
        if(baseMaterial == null){
            return AjaxResult.error(qcOperationInspectionStandards.getCode() + "物料信息不存在!");
        }

        BaseTechnologyConfig baseTechnologyConfig = baseTechnologyConfigService.selectBaseTechnologyConfigByCode(qcOperationInspectionStandards.getOperationNumber());
        if(baseTechnologyConfig == null){
            return AjaxResult.error(qcOperationInspectionStandards.getCode() + "工艺/工序不存在!");
        }

        qcOperationInspectionStandards.setOperationName(baseTechnologyConfig.getName());
        qcOperationInspectionStandards.setOperationNumber(baseTechnologyConfig.getCode());
        qcOperationInspectionStandards.setId(standardId);
        qcOperationInspectionStandards.setUpdateBy(SecurityUtils.getLoginUser().getUsername());
        qcOperationInspectionStandards.setUpdateTime(DateUtils.getNowDate());
        int rows = qcOperationInspectionStandardsMapper.updateQcOperationInspectionStandards(qcOperationInspectionStandards);
        return rows > 0 ? AjaxResult.success() : AjaxResult.error();
    }

    /**
     * 批量删除工序检验标准
     * 
     * @param ids 需要删除的工序检验标准主键
     * @return 结果
     */
    @Override
    public int deleteQcOperationInspectionStandardsByIds(Long[] ids)
    {
        return qcOperationInspectionStandardsMapper.deleteQcOperationInspectionStandardsByIds(ids);
    }

    /**
     * 删除工序检验标准信息
     * 
     * @param id 工序检验标准主键
     * @return 结果
     */
    @Override
    public int deleteQcOperationInspectionStandardsById(Long id)
    {
        return qcOperationInspectionStandardsMapper.deleteQcOperationInspectionStandardsById(id);
    }
}
