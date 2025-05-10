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
import com.ruoyi.quality.domain.QcInspectionItems;
import com.ruoyi.quality.service.IQcInspectionItemsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 检验项目Controller
 * 
 * @author 蜗牛
 * @date 2025-05-10
 */
@RestController
@RequestMapping("/quality/qualityItems")
public class QcInspectionItemsController extends BaseController
{
    @Autowired
    private IQcInspectionItemsService qcInspectionItemsService;

    /**
     * 查询检验项目列表
     */
    @PreAuthorize("@ss.hasPermi('quality:qualityItems:list')")
    @GetMapping("/list")
    public TableDataInfo list(QcInspectionItems qcInspectionItems)
    {
        startPage();
        List<QcInspectionItems> list = qcInspectionItemsService.selectQcInspectionItemsList(qcInspectionItems);
        return getDataTable(list);
    }

    /**
     * 查询检验项目列表
     */
    @PreAuthorize("@ss.hasPermi('quality:qualityItems:list')")
    @GetMapping("/listAll")
    public AjaxResult listAll()
    {
        return AjaxResult.success(qcInspectionItemsService.selectQcInspectionItemsList(null));
    }

    /**
     * 导出检验项目列表
     */
    @PreAuthorize("@ss.hasPermi('quality:qualityItems:export')")
    @Log(title = "检验项目", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, QcInspectionItems qcInspectionItems)
    {
        List<QcInspectionItems> list = qcInspectionItemsService.selectQcInspectionItemsList(qcInspectionItems);
        ExcelUtil<QcInspectionItems> util = new ExcelUtil<QcInspectionItems>(QcInspectionItems.class);
        util.exportExcel(response, list, "检验项目数据");
    }

    /**
     * 获取检验项目详细信息
     */
    @PreAuthorize("@ss.hasPermi('quality:qualityItems:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(qcInspectionItemsService.selectQcInspectionItemsById(id));
    }

    /**
     * 新增检验项目
     */
    @PreAuthorize("@ss.hasPermi('quality:qualityItems:add')")
    @Log(title = "检验项目", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody QcInspectionItems qcInspectionItems)
    {
        return qcInspectionItemsService.insertQcInspectionItems(qcInspectionItems);
    }

    /**
     * 修改检验项目
     */
    @PreAuthorize("@ss.hasPermi('quality:qualityItems:edit')")
    @Log(title = "检验项目", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody QcInspectionItems qcInspectionItems)
    {
        return toAjax(qcInspectionItemsService.updateQcInspectionItems(qcInspectionItems));
    }

    /**
     * 删除检验项目
     */
    @PreAuthorize("@ss.hasPermi('quality:qualityItems:remove')")
    @Log(title = "检验项目", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(qcInspectionItemsService.deleteQcInspectionItemsByIds(ids));
    }
}
