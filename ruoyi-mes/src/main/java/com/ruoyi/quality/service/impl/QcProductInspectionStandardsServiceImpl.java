package com.ruoyi.quality.service.impl;

import java.util.List;

import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.material.domain.BaseMaterial;
import com.ruoyi.material.service.IBaseMaterialService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.quality.mapper.QcProductInspectionStandardsMapper;
import com.ruoyi.quality.domain.QcProductInspectionStandards;
import com.ruoyi.quality.service.IQcProductInspectionStandardsService;

/**
 * 成品检验标准Service业务层处理
 * 
 * @author 蜗牛
 * @date 2025-05-10
 */
@Service
public class QcProductInspectionStandardsServiceImpl implements IQcProductInspectionStandardsService 
{
    @Autowired
    private QcProductInspectionStandardsMapper qcProductInspectionStandardsMapper;

    @Autowired
    private IBaseMaterialService baseMaterialService;

    /**
     * 查询成品检验标准
     * 
     * @param id 成品检验标准主键
     * @return 成品检验标准
     */
    @Override
    public QcProductInspectionStandards selectQcProductInspectionStandardsById(Long id)
    {
        return qcProductInspectionStandardsMapper.selectQcProductInspectionStandardsById(id);
    }

    /**
     * 查询成品检验标准列表
     * 
     * @param qcProductInspectionStandards 成品检验标准
     * @return 成品检验标准
     */
    @Override
    public List<QcProductInspectionStandards> selectQcProductInspectionStandardsList(QcProductInspectionStandards qcProductInspectionStandards)
    {
        return qcProductInspectionStandardsMapper.selectQcProductInspectionStandardsList(qcProductInspectionStandards);
    }

    /**
     * 新增成品检验标准
     * 
     * @param qcProductInspectionStandards 成品检验标准
     * @return 结果
     */
    @Override
    public AjaxResult insertQcProductInspectionStandards(QcProductInspectionStandards qcProductInspectionStandards)
    {
        BaseMaterial baseMaterial = baseMaterialService.selectBaseMaterialByCode(qcProductInspectionStandards.getCode());
        if(baseMaterial == null){
            return AjaxResult.error(qcProductInspectionStandards.getCode() + "物料信息不存在!");
        }
        BeanUtils.copyProperties(baseMaterial, qcProductInspectionStandards);
        qcProductInspectionStandards.setCreateTime(DateUtils.getNowDate());
        int rows = qcProductInspectionStandardsMapper.insertQcProductInspectionStandards(qcProductInspectionStandards);
        return rows > 0 ? AjaxResult.success() : AjaxResult.error();
    }

    /**
     * 修改成品检验标准
     * 
     * @param qcProductInspectionStandards 成品检验标准
     * @return 结果
     */
    @Override
    public AjaxResult updateQcProductInspectionStandards(QcProductInspectionStandards qcProductInspectionStandards)
    {
        if(qcProductInspectionStandards.getId() == null){
            return AjaxResult.error("ID不能为空!");
        }
        long standardId = qcProductInspectionStandards.getId();
        BaseMaterial baseMaterial = baseMaterialService.selectBaseMaterialByCode(qcProductInspectionStandards.getCode());
        if(baseMaterial == null){
            return AjaxResult.error(qcProductInspectionStandards.getCode() + "物料信息不存在!");
        }

        BeanUtils.copyProperties(baseMaterial, qcProductInspectionStandards);
        qcProductInspectionStandards.setId(standardId);
        qcProductInspectionStandards.setUpdateTime(DateUtils.getNowDate());
        int rows = qcProductInspectionStandardsMapper.updateQcProductInspectionStandards(qcProductInspectionStandards);
        return rows > 0 ? AjaxResult.success() : AjaxResult.error();
    }

    /**
     * 批量删除成品检验标准
     * 
     * @param ids 需要删除的成品检验标准主键
     * @return 结果
     */
    @Override
    public int deleteQcProductInspectionStandardsByIds(Long[] ids)
    {
        return qcProductInspectionStandardsMapper.deleteQcProductInspectionStandardsByIds(ids);
    }

    /**
     * 删除成品检验标准信息
     * 
     * @param id 成品检验标准主键
     * @return 结果
     */
    @Override
    public int deleteQcProductInspectionStandardsById(Long id)
    {
        return qcProductInspectionStandardsMapper.deleteQcProductInspectionStandardsById(id);
    }
}
