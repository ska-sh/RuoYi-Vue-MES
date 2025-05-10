package com.ruoyi.quality.service;

import java.util.List;

import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.quality.domain.QcProductInspectionStandards;

/**
 * 成品检验标准Service接口
 * 
 * @author 蜗牛
 * @date 2025-05-10
 */
public interface IQcProductInspectionStandardsService 
{
    /**
     * 查询成品检验标准
     * 
     * @param id 成品检验标准主键
     * @return 成品检验标准
     */
    public QcProductInspectionStandards selectQcProductInspectionStandardsById(Long id);

    /**
     * 查询成品检验标准列表
     * 
     * @param qcProductInspectionStandards 成品检验标准
     * @return 成品检验标准集合
     */
    public List<QcProductInspectionStandards> selectQcProductInspectionStandardsList(QcProductInspectionStandards qcProductInspectionStandards);

    /**
     * 新增成品检验标准
     * 
     * @param qcProductInspectionStandards 成品检验标准
     * @return 结果
     */
    public AjaxResult insertQcProductInspectionStandards(QcProductInspectionStandards qcProductInspectionStandards);

    /**
     * 修改成品检验标准
     * 
     * @param qcProductInspectionStandards 成品检验标准
     * @return 结果
     */
    public AjaxResult updateQcProductInspectionStandards(QcProductInspectionStandards qcProductInspectionStandards);

    /**
     * 批量删除成品检验标准
     * 
     * @param ids 需要删除的成品检验标准主键集合
     * @return 结果
     */
    public int deleteQcProductInspectionStandardsByIds(Long[] ids);

    /**
     * 删除成品检验标准信息
     * 
     * @param id 成品检验标准主键
     * @return 结果
     */
    public int deleteQcProductInspectionStandardsById(Long id);
}
