package com.ruoyi.technology.controller;

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
import com.ruoyi.technology.domain.BaseTechnologyConfig;
import com.ruoyi.technology.service.IBaseTechnologyConfigService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 基础工艺Controller
 * 
 * @author 蜗牛
 * @date 2025-05-07
 */
@RestController
@RequestMapping("/technology/config")
public class BaseTechnologyConfigController extends BaseController
{
    @Autowired
    private IBaseTechnologyConfigService baseTechnologyConfigService;

    /**
     * 查询基础工艺列表
     */
    @PreAuthorize("@ss.hasPermi('technology:config:list')")
    @GetMapping("/list")
    public TableDataInfo list(BaseTechnologyConfig baseTechnologyConfig)
    {
        startPage();
        List<BaseTechnologyConfig> list = baseTechnologyConfigService.selectBaseTechnologyConfigList(baseTechnologyConfig);
        return getDataTable(list);
    }

    /**
     * 导出基础工艺列表
     */
    @PreAuthorize("@ss.hasPermi('technology:config:export')")
    @Log(title = "基础工艺", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, BaseTechnologyConfig baseTechnologyConfig)
    {
        List<BaseTechnologyConfig> list = baseTechnologyConfigService.selectBaseTechnologyConfigList(baseTechnologyConfig);
        ExcelUtil<BaseTechnologyConfig> util = new ExcelUtil<BaseTechnologyConfig>(BaseTechnologyConfig.class);
        util.exportExcel(response, list, "基础工艺数据");
    }

    /**
     * 获取基础工艺详细信息
     */
    @PreAuthorize("@ss.hasPermi('technology:config:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(baseTechnologyConfigService.selectBaseTechnologyConfigById(id));
    }

    /**
     * 新增基础工艺
     */
    @PreAuthorize("@ss.hasPermi('technology:config:add')")
    @Log(title = "基础工艺", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody BaseTechnologyConfig baseTechnologyConfig)
    {
        return baseTechnologyConfigService.insertBaseTechnologyConfig(baseTechnologyConfig);
    }

    /**
     * 修改基础工艺
     */
    @PreAuthorize("@ss.hasPermi('technology:config:edit')")
    @Log(title = "基础工艺", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody BaseTechnologyConfig baseTechnologyConfig)
    {
        return toAjax(baseTechnologyConfigService.updateBaseTechnologyConfig(baseTechnologyConfig));
    }

    /**
     * 删除基础工艺
     */
    @PreAuthorize("@ss.hasPermi('technology:config:remove')")
    @Log(title = "基础工艺", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(baseTechnologyConfigService.deleteBaseTechnologyConfigByIds(ids));
    }
}
