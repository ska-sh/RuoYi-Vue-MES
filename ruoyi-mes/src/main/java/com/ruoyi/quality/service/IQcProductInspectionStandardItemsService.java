package com.ruoyi.quality.service;

import java.util.List;
import com.ruoyi.quality.domain.QcProductInspectionStandardItems;

/**
 * 成品检验项目明细Service接口
 * 
 * @author 蜗牛
 * @date 2025-05-10
 */
public interface IQcProductInspectionStandardItemsService 
{
    /**
     * 查询成品检验项目明细
     * 
     * @param id 成品检验项目明细主键
     * @return 成品检验项目明细
     */
    public QcProductInspectionStandardItems selectQcProductInspectionStandardItemsById(Long id);

    /**
     * 查询成品检验项目明细列表
     * 
     * @param qcProductInspectionStandardItems 成品检验项目明细
     * @return 成品检验项目明细集合
     */
    public List<QcProductInspectionStandardItems> selectQcProductInspectionStandardItemsList(QcProductInspectionStandardItems qcProductInspectionStandardItems);

    /**
     * 新增成品检验项目明细
     * 
     * @param qcProductInspectionStandardItems 成品检验项目明细
     * @return 结果
     */
    public int insertQcProductInspectionStandardItems(QcProductInspectionStandardItems qcProductInspectionStandardItems);

    /**
     * 修改成品检验项目明细
     * 
     * @param qcProductInspectionStandardItems 成品检验项目明细
     * @return 结果
     */
    public int updateQcProductInspectionStandardItems(QcProductInspectionStandardItems qcProductInspectionStandardItems);

    /**
     * 批量删除成品检验项目明细
     * 
     * @param ids 需要删除的成品检验项目明细主键集合
     * @return 结果
     */
    public int deleteQcProductInspectionStandardItemsByIds(Long[] ids);

    /**
     * 删除成品检验项目明细信息
     * 
     * @param id 成品检验项目明细主键
     * @return 结果
     */
    public int deleteQcProductInspectionStandardItemsById(Long id);
}
