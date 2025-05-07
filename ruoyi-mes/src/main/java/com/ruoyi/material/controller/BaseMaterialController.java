package com.ruoyi.material.controller;

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
import com.ruoyi.material.domain.BaseMaterial;
import com.ruoyi.material.service.IBaseMaterialService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 物料管理Controller
 * 
 * @author 蜗牛
 * @date 2025-05-06
 */
@RestController
@RequestMapping("/material/material")
public class BaseMaterialController extends BaseController
{
    @Autowired
    private IBaseMaterialService baseMaterialService;

    /**
     * 查询物料管理列表
     */
    @PreAuthorize("@ss.hasPermi('material:material:list')")
    @GetMapping("/list")
    public TableDataInfo list(BaseMaterial baseMaterial)
    {
        startPage();
        List<BaseMaterial> list = baseMaterialService.selectBaseMaterialList(baseMaterial);
        return getDataTable(list);
    }

    /**
     * 导出物料管理列表
     */
    @PreAuthorize("@ss.hasPermi('material:material:export')")
    @Log(title = "物料管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BaseMaterial baseMaterial)
    {
        List<BaseMaterial> list = baseMaterialService.selectBaseMaterialList(baseMaterial);
        ExcelUtil<BaseMaterial> util = new ExcelUtil<BaseMaterial>(BaseMaterial.class);
        util.exportExcel(response, list, "物料管理数据");
    }

    /**
     * 获取物料管理详细信息
     */
    @PreAuthorize("@ss.hasPermi('material:material:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(baseMaterialService.selectBaseMaterialById(id));
    }

    /**
     * 新增物料管理
     */
    @PreAuthorize("@ss.hasPermi('material:material:add')")
    @Log(title = "物料管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BaseMaterial baseMaterial)
    {
        return baseMaterialService.insertBaseMaterial(baseMaterial);
    }

    /**
     * 修改物料管理
     */
    @PreAuthorize("@ss.hasPermi('material:material:edit')")
    @Log(title = "物料管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BaseMaterial baseMaterial)
    {
        return toAjax(baseMaterialService.updateBaseMaterial(baseMaterial));
    }

    /**
     * 删除物料管理
     */
    @PreAuthorize("@ss.hasPermi('material:material:remove')")
    @Log(title = "物料管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(baseMaterialService.deleteBaseMaterialByIds(ids));
    }
}
