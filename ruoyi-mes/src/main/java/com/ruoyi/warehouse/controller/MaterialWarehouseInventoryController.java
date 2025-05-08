package com.ruoyi.warehouse.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.warehouse.vo.MaterialWarehouseInventoryVo;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.warehouse.domain.MaterialWarehouseInventory;
import com.ruoyi.warehouse.service.IMaterialWarehouseInventoryService;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 物料实时库存Controller
 * 
 * @author 蜗牛
 * @date 2025-05-08
 */
@RestController
@RequestMapping("/warehouse/inventory")
public class MaterialWarehouseInventoryController extends BaseController
{
    @Autowired
    private IMaterialWarehouseInventoryService materialWarehouseInventoryService;

    /**
     * 查询物料实时库存列表
     */
    @PreAuthorize("@ss.hasPermi('warehouse:inventory:list')")
    @GetMapping("/list")
    public TableDataInfo list(MaterialWarehouseInventoryVo materialWarehouseInventoryVo)
    {
        startPage();
        List<MaterialWarehouseInventoryVo> list = materialWarehouseInventoryService.selectMaterialWarehouseInventoryList(materialWarehouseInventoryVo);
        return getDataTable(list);
    }

    /**
     * 导出物料实时库存列表
     */
    @PreAuthorize("@ss.hasPermi('warehouse:inventory:export')")
    @Log(title = "物料实时库存", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, MaterialWarehouseInventory materialWarehouseInventory)
    {
//        List<MaterialWarehouseInventory> list = materialWarehouseInventoryService.selectMaterialWarehouseInventoryList(materialWarehouseInventory);
//        ExcelUtil<MaterialWarehouseInventory> util = new ExcelUtil<MaterialWarehouseInventory>(MaterialWarehouseInventory.class);
//        util.exportExcel(response, list, "物料实时库存数据");
    }

    /**
     * 获取物料实时库存详细信息
     */
    @PreAuthorize("@ss.hasPermi('warehouse:inventory:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(materialWarehouseInventoryService.selectMaterialWarehouseInventoryById(id));
    }

}
