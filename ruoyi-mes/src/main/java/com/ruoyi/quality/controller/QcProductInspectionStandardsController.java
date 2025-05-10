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
import com.ruoyi.quality.domain.QcProductInspectionStandards;
import com.ruoyi.quality.service.IQcProductInspectionStandardsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 成品检验标准Controller
 * 
 * @author 蜗牛
 * @date 2025-05-10
 */
@RestController
@RequestMapping("/quality/product-standards")
public class QcProductInspectionStandardsController extends BaseController
{
    @Autowired
    private IQcProductInspectionStandardsService qcProductInspectionStandardsService;

    /**
     * 查询成品检验标准列表
     */
    @PreAuthorize("@ss.hasPermi('quality:product-standards:list')")
    @GetMapping("/list")
    public TableDataInfo list(QcProductInspectionStandards qcProductInspectionStandards)
    {
        startPage();
        List<QcProductInspectionStandards> list = qcProductInspectionStandardsService.selectQcProductInspectionStandardsList(qcProductInspectionStandards);
        return getDataTable(list);
    }

    /**
     * 导出成品检验标准列表
     */
    @PreAuthorize("@ss.hasPermi('quality:product-standards:export')")
    @Log(title = "成品检验标准", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, QcProductInspectionStandards qcProductInspectionStandards)
    {
        List<QcProductInspectionStandards> list = qcProductInspectionStandardsService.selectQcProductInspectionStandardsList(qcProductInspectionStandards);
        ExcelUtil<QcProductInspectionStandards> util = new ExcelUtil<QcProductInspectionStandards>(QcProductInspectionStandards.class);
        util.exportExcel(response, list, "成品检验标准数据");
    }

    /**
     * 获取成品检验标准详细信息
     */
    @PreAuthorize("@ss.hasPermi('quality:product-standards:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(qcProductInspectionStandardsService.selectQcProductInspectionStandardsById(id));
    }

    /**
     * 新增成品检验标准
     */
    @PreAuthorize("@ss.hasPermi('quality:product-standards:add')")
    @Log(title = "成品检验标准", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody QcProductInspectionStandards qcProductInspectionStandards)
    {
        return qcProductInspectionStandardsService.insertQcProductInspectionStandards(qcProductInspectionStandards);
    }

    /**
     * 修改成品检验标准
     */
    @PreAuthorize("@ss.hasPermi('quality:product-standards:edit')")
    @Log(title = "成品检验标准", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody QcProductInspectionStandards qcProductInspectionStandards)
    {
        return qcProductInspectionStandardsService.updateQcProductInspectionStandards(qcProductInspectionStandards);
    }

    /**
     * 删除成品检验标准
     */
    @PreAuthorize("@ss.hasPermi('quality:product-standards:remove')")
    @Log(title = "成品检验标准", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(qcProductInspectionStandardsService.deleteQcProductInspectionStandardsByIds(ids));
    }
}
