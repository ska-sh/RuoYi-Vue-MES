package com.ruoyi.quality.service;

import java.util.List;

import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.quality.domain.QcInspectionItems;

/**
 * 检验项目Service接口
 * 
 * @author 蜗牛
 * @date 2025-05-10
 */
public interface IQcInspectionItemsService 
{
    /**
     * 查询检验项目
     * 
     * @param id 检验项目主键
     * @return 检验项目
     */
    public QcInspectionItems selectQcInspectionItemsById(Long id);

    /**
     * 查询检验项目列表
     * 
     * @param qcInspectionItems 检验项目
     * @return 检验项目集合
     */
    public List<QcInspectionItems> selectQcInspectionItemsList(QcInspectionItems qcInspectionItems);

    /**
     * 新增检验项目
     * 
     * @param qcInspectionItems 检验项目
     * @return 结果
     */
    public AjaxResult insertQcInspectionItems(QcInspectionItems qcInspectionItems);

    /**
     * 修改检验项目
     * 
     * @param qcInspectionItems 检验项目
     * @return 结果
     */
    public int updateQcInspectionItems(QcInspectionItems qcInspectionItems);

    /**
     * 批量删除检验项目
     * 
     * @param ids 需要删除的检验项目主键集合
     * @return 结果
     */
    public int deleteQcInspectionItemsByIds(Long[] ids);

    /**
     * 删除检验项目信息
     * 
     * @param id 检验项目主键
     * @return 结果
     */
    public int deleteQcInspectionItemsById(Long id);
}
