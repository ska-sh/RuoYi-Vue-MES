package com.ruoyi.material.vo;

import com.ruoyi.common.core.domain.TreeSelect;
import com.ruoyi.material.domain.BaseMaterialBom;

import java.io.Serializable;
import java.util.stream.Collectors;

/**
 * @author songkaiang
 */
public class BomTreeSelectVo extends TreeSelect implements Serializable {

    private static final long serialVersionUID = 6060672473084059409L;

    public BomTreeSelectVo(){

    }

    public BomTreeSelectVo(BaseMaterialBom bom){
        super(bom.getId(), bom.getName()+"("+bom.getCode()+")", null, bom.getChildren().stream().map(BomTreeSelectVo::new).collect(Collectors.toList()));
    }

}
