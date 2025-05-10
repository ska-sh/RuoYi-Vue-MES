package com.ruoyi.quality.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.quality.mapper.QcInspectionItemsMapper;
import com.ruoyi.quality.domain.QcInspectionItems;
import com.ruoyi.quality.service.IQcInspectionItemsService;

/**
 * 检验项目Service业务层处理
 * 
 * @author 蜗牛
 * @date 2025-05-10
 */
@Service
public class QcInspectionItemsServiceImpl implements IQcInspectionItemsService 
{
    @Autowired
    private QcInspectionItemsMapper qcInspectionItemsMapper;

    /**
     * 查询检验项目
     * 
     * @param id 检验项目主键
     * @return 检验项目
     */
    @Override
    public QcInspectionItems selectQcInspectionItemsById(Long id)
    {
        return qcInspectionItemsMapper.selectQcInspectionItemsById(id);
    }

    /**
     * 查询检验项目列表
     * 
     * @param qcInspectionItems 检验项目
     * @return 检验项目
     */
    @Override
    public List<QcInspectionItems> selectQcInspectionItemsList(QcInspectionItems qcInspectionItems)
    {
        return qcInspectionItemsMapper.selectQcInspectionItemsList(qcInspectionItems);
    }

    /**
     * 新增检验项目
     * 
     * @param qcInspectionItems 检验项目
     * @return 结果
     */
    @Override
    public int insertQcInspectionItems(QcInspectionItems qcInspectionItems)
    {
        qcInspectionItems.setCreateTime(DateUtils.getNowDate());
        return qcInspectionItemsMapper.insertQcInspectionItems(qcInspectionItems);
    }

    /**
     * 修改检验项目
     * 
     * @param qcInspectionItems 检验项目
     * @return 结果
     */
    @Override
    public int updateQcInspectionItems(QcInspectionItems qcInspectionItems)
    {
        qcInspectionItems.setUpdateTime(DateUtils.getNowDate());
        return qcInspectionItemsMapper.updateQcInspectionItems(qcInspectionItems);
    }

    /**
     * 批量删除检验项目
     * 
     * @param ids 需要删除的检验项目主键
     * @return 结果
     */
    @Override
    public int deleteQcInspectionItemsByIds(Long[] ids)
    {
        return qcInspectionItemsMapper.deleteQcInspectionItemsByIds(ids);
    }

    /**
     * 删除检验项目信息
     * 
     * @param id 检验项目主键
     * @return 结果
     */
    @Override
    public int deleteQcInspectionItemsById(Long id)
    {
        return qcInspectionItemsMapper.deleteQcInspectionItemsById(id);
    }
}
