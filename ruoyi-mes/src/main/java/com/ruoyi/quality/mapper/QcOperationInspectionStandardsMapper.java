package com.ruoyi.quality.mapper;

import java.util.List;
import com.ruoyi.quality.domain.QcOperationInspectionStandards;

/**
 * 工序检验标准Mapper接口
 * 
 * @author 蜗牛
 * @date 2025-05-10
 */
public interface QcOperationInspectionStandardsMapper 
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
    public int insertQcOperationInspectionStandards(QcOperationInspectionStandards qcOperationInspectionStandards);

    /**
     * 修改工序检验标准
     * 
     * @param qcOperationInspectionStandards 工序检验标准
     * @return 结果
     */
    public int updateQcOperationInspectionStandards(QcOperationInspectionStandards qcOperationInspectionStandards);

    /**
     * 删除工序检验标准
     * 
     * @param id 工序检验标准主键
     * @return 结果
     */
    public int deleteQcOperationInspectionStandardsById(Long id);

    /**
     * 批量删除工序检验标准
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteQcOperationInspectionStandardsByIds(Long[] ids);
}
