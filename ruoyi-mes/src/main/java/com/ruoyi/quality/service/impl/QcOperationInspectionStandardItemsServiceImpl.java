package com.ruoyi.quality.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.quality.mapper.QcOperationInspectionStandardItemsMapper;
import com.ruoyi.quality.domain.QcOperationInspectionStandardItems;
import com.ruoyi.quality.service.IQcOperationInspectionStandardItemsService;

/**
 * 工序检验项目明细Service业务层处理
 * 
 * @author 蜗牛
 * @date 2025-05-10
 */
@Service
public class QcOperationInspectionStandardItemsServiceImpl implements IQcOperationInspectionStandardItemsService 
{
    @Autowired
    private QcOperationInspectionStandardItemsMapper qcOperationInspectionStandardItemsMapper;

    /**
     * 查询工序检验项目明细
     * 
     * @param id 工序检验项目明细主键
     * @return 工序检验项目明细
     */
    @Override
    public QcOperationInspectionStandardItems selectQcOperationInspectionStandardItemsById(Long id)
    {
        return qcOperationInspectionStandardItemsMapper.selectQcOperationInspectionStandardItemsById(id);
    }

    /**
     * 查询工序检验项目明细列表
     * 
     * @param qcOperationInspectionStandardItems 工序检验项目明细
     * @return 工序检验项目明细
     */
    @Override
    public List<QcOperationInspectionStandardItems> selectQcOperationInspectionStandardItemsList(QcOperationInspectionStandardItems qcOperationInspectionStandardItems)
    {
        return qcOperationInspectionStandardItemsMapper.selectQcOperationInspectionStandardItemsList(qcOperationInspectionStandardItems);
    }

    /**
     * 新增工序检验项目明细
     * 
     * @param qcOperationInspectionStandardItems 工序检验项目明细
     * @return 结果
     */
    @Override
    public int insertQcOperationInspectionStandardItems(QcOperationInspectionStandardItems qcOperationInspectionStandardItems)
    {
        qcOperationInspectionStandardItems.setCreateTime(DateUtils.getNowDate());
        return qcOperationInspectionStandardItemsMapper.insertQcOperationInspectionStandardItems(qcOperationInspectionStandardItems);
    }

    /**
     * 修改工序检验项目明细
     * 
     * @param qcOperationInspectionStandardItems 工序检验项目明细
     * @return 结果
     */
    @Override
    public int updateQcOperationInspectionStandardItems(QcOperationInspectionStandardItems qcOperationInspectionStandardItems)
    {
        qcOperationInspectionStandardItems.setUpdateTime(DateUtils.getNowDate());
        return qcOperationInspectionStandardItemsMapper.updateQcOperationInspectionStandardItems(qcOperationInspectionStandardItems);
    }

    /**
     * 批量删除工序检验项目明细
     * 
     * @param ids 需要删除的工序检验项目明细主键
     * @return 结果
     */
    @Override
    public int deleteQcOperationInspectionStandardItemsByIds(Long[] ids)
    {
        return qcOperationInspectionStandardItemsMapper.deleteQcOperationInspectionStandardItemsByIds(ids);
    }

    /**
     * 删除工序检验项目明细信息
     * 
     * @param id 工序检验项目明细主键
     * @return 结果
     */
    @Override
    public int deleteQcOperationInspectionStandardItemsById(Long id)
    {
        return qcOperationInspectionStandardItemsMapper.deleteQcOperationInspectionStandardItemsById(id);
    }
}
