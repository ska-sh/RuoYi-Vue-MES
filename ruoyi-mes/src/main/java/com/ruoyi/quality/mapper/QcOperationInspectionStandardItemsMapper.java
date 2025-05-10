package com.ruoyi.quality.mapper;

import java.util.List;
import com.ruoyi.quality.domain.QcOperationInspectionStandardItems;

/**
 * 工序检验项目明细Mapper接口
 * 
 * @author 蜗牛
 * @date 2025-05-10
 */
public interface QcOperationInspectionStandardItemsMapper 
{
    /**
     * 查询工序检验项目明细
     * 
     * @param id 工序检验项目明细主键
     * @return 工序检验项目明细
     */
    public QcOperationInspectionStandardItems selectQcOperationInspectionStandardItemsById(Long id);

    /**
     * 查询工序检验项目明细列表
     * 
     * @param qcOperationInspectionStandardItems 工序检验项目明细
     * @return 工序检验项目明细集合
     */
    public List<QcOperationInspectionStandardItems> selectQcOperationInspectionStandardItemsList(QcOperationInspectionStandardItems qcOperationInspectionStandardItems);

    /**
     * 新增工序检验项目明细
     * 
     * @param qcOperationInspectionStandardItems 工序检验项目明细
     * @return 结果
     */
    public int insertQcOperationInspectionStandardItems(QcOperationInspectionStandardItems qcOperationInspectionStandardItems);

    /**
     * 修改工序检验项目明细
     * 
     * @param qcOperationInspectionStandardItems 工序检验项目明细
     * @return 结果
     */
    public int updateQcOperationInspectionStandardItems(QcOperationInspectionStandardItems qcOperationInspectionStandardItems);

    /**
     * 删除工序检验项目明细
     * 
     * @param id 工序检验项目明细主键
     * @return 结果
     */
    public int deleteQcOperationInspectionStandardItemsById(Long id);

    /**
     * 批量删除工序检验项目明细
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteQcOperationInspectionStandardItemsByIds(Long[] ids);
}
