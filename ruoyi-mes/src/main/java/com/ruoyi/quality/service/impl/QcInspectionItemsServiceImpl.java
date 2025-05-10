package com.ruoyi.quality.service.impl;

import java.util.List;

import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.SecurityUtils;
import org.apache.commons.collections4.CollectionUtils;
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
     * @param item 检验项目
     * @return 结果
     */
    @Override
    public AjaxResult insertQcInspectionItems(QcInspectionItems item)
    {

        QcInspectionItems query = new QcInspectionItems();
        query.setCode(item.getCode());
        List<QcInspectionItems> list = qcInspectionItemsMapper.selectQcInspectionItemsList(query);
        if(CollectionUtils.isNotEmpty(list)){
            return AjaxResult.error(item.getCode() + "编号已存在!");
        }

        QcInspectionItems items = qcInspectionItemsMapper.selectQcInspectionItemsByName(item.getName());
        if(items != null){
            return AjaxResult.error(item.getName() + "质检项已存在!");
        }

        item.setCreateTime(DateUtils.getNowDate());
        item.setCreateBy(SecurityUtils.getUsername());
        int rows = qcInspectionItemsMapper.insertQcInspectionItems(item);
        return rows > 0 ? AjaxResult.success() : AjaxResult.error();
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
        qcInspectionItems.setUpdateBy(SecurityUtils.getUsername());
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
