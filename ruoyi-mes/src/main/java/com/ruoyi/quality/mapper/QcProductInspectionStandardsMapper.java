package com.ruoyi.quality.mapper;

import java.util.List;
import com.ruoyi.quality.domain.QcProductInspectionStandards;

/**
 * 成品检验标准Mapper接口
 * 
 * @author 蜗牛
 * @date 2025-05-10
 */
public interface QcProductInspectionStandardsMapper 
{
    /**
     * 查询成品检验标准
     * 
     * @param id 成品检验标准主键
     * @return 成品检验标准
     */
    public QcProductInspectionStandards selectQcProductInspectionStandardsById(Long id);

    /**
     * 查询成品检验标准
     * @param code 物料CODE
     * @return 成品检验标准
     */
    QcProductInspectionStandards selectQcProductInspectionStandardsByCode(String code);

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
    public int insertQcProductInspectionStandards(QcProductInspectionStandards qcProductInspectionStandards);

    /**
     * 修改成品检验标准
     * 
     * @param qcProductInspectionStandards 成品检验标准
     * @return 结果
     */
    public int updateQcProductInspectionStandards(QcProductInspectionStandards qcProductInspectionStandards);

    /**
     * 删除成品检验标准
     * 
     * @param id 成品检验标准主键
     * @return 结果
     */
    public int deleteQcProductInspectionStandardsById(Long id);

    /**
     * 批量删除成品检验标准
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteQcProductInspectionStandardsByIds(Long[] ids);
}
