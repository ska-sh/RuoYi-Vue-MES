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
import com.ruoyi.quality.domain.QcOperationInspectionStandards;
import com.ruoyi.quality.service.IQcOperationInspectionStandardsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 工序检验标准Controller
 * 
 * @author 蜗牛
 * @date 2025-05-10
 */
@RestController
@RequestMapping("/quality/operation-standards")
public class QcOperationInspectionStandardsController extends BaseController
{
    @Autowired
    private IQcOperationInspectionStandardsService qcOperationInspectionStandardsService;

    /**
     * 查询工序检验标准列表
     */
    @PreAuthorize("@ss.hasPermi('quality:operation-standards:list')")
    @GetMapping("/list")
    public TableDataInfo list(QcOperationInspectionStandards qcOperationInspectionStandards)
    {
        startPage();
        List<QcOperationInspectionStandards> list = qcOperationInspectionStandardsService.selectQcOperationInspectionStandardsList(qcOperationInspectionStandards);
        return getDataTable(list);
    }

    /**
     * 导出工序检验标准列表
     */
    @PreAuthorize("@ss.hasPermi('quality:operation-standards:export')")
    @Log(title = "工序检验标准", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, QcOperationInspectionStandards qcOperationInspectionStandards)
    {
        List<QcOperationInspectionStandards> list = qcOperationInspectionStandardsService.selectQcOperationInspectionStandardsList(qcOperationInspectionStandards);
        ExcelUtil<QcOperationInspectionStandards> util = new ExcelUtil<QcOperationInspectionStandards>(QcOperationInspectionStandards.class);
        util.exportExcel(response, list, "工序检验标准数据");
    }

    /**
     * 获取工序检验标准详细信息
     */
    @PreAuthorize("@ss.hasPermi('quality:operation-standards:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(qcOperationInspectionStandardsService.selectQcOperationInspectionStandardsById(id));
    }

    /**
     * 新增工序检验标准
     */
    @PreAuthorize("@ss.hasPermi('quality:operation-standards:add')")
    @Log(title = "工序检验标准", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody QcOperationInspectionStandards qcOperationInspectionStandards)
    {
        return qcOperationInspectionStandardsService.insertQcOperationInspectionStandards(qcOperationInspectionStandards);
    }

    /**
     * 修改工序检验标准
     */
    @PreAuthorize("@ss.hasPermi('quality:operation-standards:edit')")
    @Log(title = "工序检验标准", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody QcOperationInspectionStandards qcOperationInspectionStandards)
    {
        return qcOperationInspectionStandardsService.updateQcOperationInspectionStandards(qcOperationInspectionStandards);
    }

    /**
     * 删除工序检验标准
     */
    @PreAuthorize("@ss.hasPermi('quality:operation-standards:remove')")
    @Log(title = "工序检验标准", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(qcOperationInspectionStandardsService.deleteQcOperationInspectionStandardsByIds(ids));
    }
}
