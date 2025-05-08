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
 * @date 2025-05-08
 */
@RestController
@RequestMapping("/material/bom")
public class BaseMaterialBomController extends BaseController
{
    @Autowired
    private IBaseMaterialService baseMaterialService;

    /**
     * 查询物料管理列表
     */
    @PreAuthorize("@ss.hasPermi('material:bom:list')")
    @GetMapping("/list")
    public TableDataInfo list(BaseMaterial baseMaterial)
    {
        startPage();
        List<BaseMaterial> list = baseMaterialService.selectBaseMaterialList(baseMaterial);
        return getDataTable(list);
    }
}
