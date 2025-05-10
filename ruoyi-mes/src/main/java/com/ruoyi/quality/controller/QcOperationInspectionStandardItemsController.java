package com.ruoyi.quality.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.quality.domain.QcOperationInspectionStandardItems;
import com.ruoyi.quality.service.IQcOperationInspectionStandardItemsService;
import com.ruoyi.common.utils.poi.ExcelUtil;

/**
 * 工序检验项目明细Controller
 * 
 * @author 蜗牛
 * @date 2025-05-10
 */
@RestController
@RequestMapping("/quality/operation-items")
public class QcOperationInspectionStandardItemsController extends BaseController
{
    @Autowired
    private IQcOperationInspectionStandardItemsService qcOperationInspectionStandardItemsService;

    /**
     * 查询工序检验项目明细列表
     */
    @PreAuthorize("@ss.hasPermi('quality:operation-items:list')")
    @GetMapping("/list/{standardId}")
    public AjaxResult list(@PathVariable("standardId") Long standardId)
    {
        QcOperationInspectionStandardItems items = new QcOperationInspectionStandardItems();
        items.setStandardId(standardId);
        List<QcOperationInspectionStandardItems> list = qcOperationInspectionStandardItemsService.selectQcOperationInspectionStandardItemsList(items);
        return AjaxResult.success(list);
    }

    /**
     * 导出工序检验项目明细列表
     */
    @PreAuthorize("@ss.hasPermi('quality:operation-items:export')")
    @Log(title = "工序检验项目明细", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, QcOperationInspectionStandardItems qcOperationInspectionStandardItems)
    {
        List<QcOperationInspectionStandardItems> list = qcOperationInspectionStandardItemsService.selectQcOperationInspectionStandardItemsList(qcOperationInspectionStandardItems);
        ExcelUtil<QcOperationInspectionStandardItems> util = new ExcelUtil<QcOperationInspectionStandardItems>(QcOperationInspectionStandardItems.class);
        util.exportExcel(response, list, "工序检验项目明细数据");
    }

    /**
     * 获取工序检验项目明细详细信息
     */
    @PreAuthorize("@ss.hasPermi('quality:operation-items:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(qcOperationInspectionStandardItemsService.selectQcOperationInspectionStandardItemsById(id));
    }

    /**
     * 新增工序检验项目明细
     */
    @PreAuthorize("@ss.hasPermi('quality:operation-items:add')")
    @Log(title = "工序检验项目明细", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody QcOperationInspectionStandardItems qcOperationInspectionStandardItems)
    {
        return toAjax(qcOperationInspectionStandardItemsService.insertQcOperationInspectionStandardItems(qcOperationInspectionStandardItems));
    }

    /**
     * 修改工序检验项目明细
     */
    @PreAuthorize("@ss.hasPermi('quality:operation-items:edit')")
    @Log(title = "工序检验项目明细", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody QcOperationInspectionStandardItems qcOperationInspectionStandardItems)
    {
        return toAjax(qcOperationInspectionStandardItemsService.updateQcOperationInspectionStandardItems(qcOperationInspectionStandardItems));
    }

    /**
     * 删除工序检验项目明细
     */
    @PreAuthorize("@ss.hasPermi('quality:operation-items:remove')")
    @Log(title = "工序检验项目明细", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(qcOperationInspectionStandardItemsService.deleteQcOperationInspectionStandardItemsByIds(ids));
    }
}
