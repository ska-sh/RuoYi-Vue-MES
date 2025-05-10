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
import com.ruoyi.quality.domain.QcProductInspectionStandardItems;
import com.ruoyi.quality.service.IQcProductInspectionStandardItemsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 成品检验项目明细Controller
 * 
 * @author 蜗牛
 * @date 2025-05-10
 */
@RestController
@RequestMapping("/quality/product-items")
public class QcProductInspectionStandardItemsController extends BaseController
{
    @Autowired
    private IQcProductInspectionStandardItemsService qcProductInspectionStandardItemsService;

    /**
     * 查询成品检验项目明细列表
     */
    @PreAuthorize("@ss.hasPermi('quality:product-items:list')")
    @GetMapping("/list/{standardId}")
    public AjaxResult list(@PathVariable("standardId") Long standardId)
    {
        QcProductInspectionStandardItems items = new QcProductInspectionStandardItems();
        items.setStandardId(standardId);
        List<QcProductInspectionStandardItems> list = qcProductInspectionStandardItemsService.selectQcProductInspectionStandardItemsList(items);
        return AjaxResult.success(list);
    }

    /**
     * 导出成品检验项目明细列表
     */
    @PreAuthorize("@ss.hasPermi('quality:product-items:export')")
    @Log(title = "成品检验项目明细", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, QcProductInspectionStandardItems qcProductInspectionStandardItems)
    {
        List<QcProductInspectionStandardItems> list = qcProductInspectionStandardItemsService.selectQcProductInspectionStandardItemsList(qcProductInspectionStandardItems);
        ExcelUtil<QcProductInspectionStandardItems> util = new ExcelUtil<QcProductInspectionStandardItems>(QcProductInspectionStandardItems.class);
        util.exportExcel(response, list, "成品检验项目明细数据");
    }

    /**
     * 获取成品检验项目明细详细信息
     */
    @PreAuthorize("@ss.hasPermi('quality:product-items:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(qcProductInspectionStandardItemsService.selectQcProductInspectionStandardItemsById(id));
    }

    /**
     * 新增成品检验项目明细
     */
    @PreAuthorize("@ss.hasPermi('quality:product-items:add')")
    @Log(title = "成品检验项目明细", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody QcProductInspectionStandardItems qcProductInspectionStandardItems)
    {
        return toAjax(qcProductInspectionStandardItemsService.insertQcProductInspectionStandardItems(qcProductInspectionStandardItems));
    }

    /**
     * 修改成品检验项目明细
     */
    @PreAuthorize("@ss.hasPermi('quality:product-items:edit')")
    @Log(title = "成品检验项目明细", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody QcProductInspectionStandardItems qcProductInspectionStandardItems)
    {
        return toAjax(qcProductInspectionStandardItemsService.updateQcProductInspectionStandardItems(qcProductInspectionStandardItems));
    }

    /**
     * 删除成品检验项目明细
     */
    @PreAuthorize("@ss.hasPermi('quality:product-items:remove')")
    @Log(title = "成品检验项目明细", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(qcProductInspectionStandardItemsService.deleteQcProductInspectionStandardItemsByIds(ids));
    }
}
