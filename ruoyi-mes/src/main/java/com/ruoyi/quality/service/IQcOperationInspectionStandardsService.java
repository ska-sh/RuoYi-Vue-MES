package com.ruoyi.quality.service;

import java.util.List;

import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.quality.domain.QcOperationInspectionStandards;

/**
 * 工序检验标准Service接口
 * 
 * @author 蜗牛
 * @date 2025-05-10
 */
public interface IQcOperationInspectionStandardsService 
{
    /**
     * 查询工序检验标准
     * 
     * @param id 工序检验标准主键
     * @return 工序检验标准
     */
    public QcOperationInspectionStandards selectQcOperationInspectionStandardsById(Long id);

    /**
     * 查询工序检验标准列表
     * 
     * @param qcOperationInspectionStandards 工序检验标准
     * @return 工序检验标准集合
     */
    public List<QcOperationInspectionStandards> selectQcOperationInspectionStandardsList(QcOperationInspectionStandards qcOperationInspectionStandards);

    /**
     * 新增工序检验标准
     * 
     * @param qcOperationInspectionStandards 工序检验标准
     * @return 结果
     */
    public AjaxResult insertQcOperationInspectionStandards(QcOperationInspectionStandards qcOperationInspectionStandards);

    /**
     * 修改工序检验标准
     * 
     * @param qcOperationInspectionStandards 工序检验标准
     * @return 结果
     */
    public AjaxResult updateQcOperationInspectionStandards(QcOperationInspectionStandards qcOperationInspectionStandards);

    /**
     * 批量删除工序检验标准
     * 
     * @param ids 需要删除的工序检验标准主键集合
     * @return 结果
     */
    public int deleteQcOperationInspectionStandardsByIds(Long[] ids);

    /**
     * 删除工序检验标准信息
     * 
     * @param id 工序检验标准主键
     * @return 结果
     */
    public int deleteQcOperationInspectionStandardsById(Long id);
}
