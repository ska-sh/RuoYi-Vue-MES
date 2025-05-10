package com.ruoyi.quality.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.quality.mapper.QcProductInspectionStandardItemsMapper;
import com.ruoyi.quality.domain.QcProductInspectionStandardItems;
import com.ruoyi.quality.service.IQcProductInspectionStandardItemsService;

/**
 * 成品检验项目明细Service业务层处理
 * 
 * @author 蜗牛
 * @date 2025-05-10
 */
@Service
public class QcProductInspectionStandardItemsServiceImpl implements IQcProductInspectionStandardItemsService 
{
    @Autowired
    private QcProductInspectionStandardItemsMapper qcProductInspectionStandardItemsMapper;

    /**
     * 查询成品检验项目明细
     * 
     * @param id 成品检验项目明细主键
     * @return 成品检验项目明细
     */
    @Override
    public QcProductInspectionStandardItems selectQcProductInspectionStandardItemsById(Long id)
    {
        return qcProductInspectionStandardItemsMapper.selectQcProductInspectionStandardItemsById(id);
    }

    /**
     * 查询成品检验项目明细列表
     * 
     * @param qcProductInspectionStandardItems 成品检验项目明细
     * @return 成品检验项目明细
     */
    @Override
    public List<QcProductInspectionStandardItems> selectQcProductInspectionStandardItemsList(QcProductInspectionStandardItems qcProductInspectionStandardItems)
    {
        return qcProductInspectionStandardItemsMapper.selectQcProductInspectionStandardItemsList(qcProductInspectionStandardItems);
    }

    /**
     * 新增成品检验项目明细
     * 
     * @param qcProductInspectionStandardItems 成品检验项目明细
     * @return 结果
     */
    @Override
    public int insertQcProductInspectionStandardItems(QcProductInspectionStandardItems qcProductInspectionStandardItems)
    {
        qcProductInspectionStandardItems.setCreateTime(DateUtils.getNowDate());
        return qcProductInspectionStandardItemsMapper.insertQcProductInspectionStandardItems(qcProductInspectionStandardItems);
    }

    /**
     * 修改成品检验项目明细
     * 
     * @param qcProductInspectionStandardItems 成品检验项目明细
     * @return 结果
     */
    @Override
    public int updateQcProductInspectionStandardItems(QcProductInspectionStandardItems qcProductInspectionStandardItems)
    {
        qcProductInspectionStandardItems.setUpdateTime(DateUtils.getNowDate());
        return qcProductInspectionStandardItemsMapper.updateQcProductInspectionStandardItems(qcProductInspectionStandardItems);
    }

    /**
     * 批量删除成品检验项目明细
     * 
     * @param ids 需要删除的成品检验项目明细主键
     * @return 结果
     */
    @Override
    public int deleteQcProductInspectionStandardItemsByIds(Long[] ids)
    {
        return qcProductInspectionStandardItemsMapper.deleteQcProductInspectionStandardItemsByIds(ids);
    }

    /**
     * 删除成品检验项目明细信息
     * 
     * @param id 成品检验项目明细主键
     * @return 结果
     */
    @Override
    public int deleteQcProductInspectionStandardItemsById(Long id)
    {
        return qcProductInspectionStandardItemsMapper.deleteQcProductInspectionStandardItemsById(id);
    }
}
