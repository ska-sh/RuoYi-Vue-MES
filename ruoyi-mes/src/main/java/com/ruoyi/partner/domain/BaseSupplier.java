package com.ruoyi.partner.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 供应商信息对象 base_supplier
 * 
 * @author 蜗牛
 * @date 2025-05-07
 */
public class BaseSupplier extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 客户编码 */
    @Excel(name = "客户编码")
    private String code;

    /** 客户名称 */
    @Excel(name = "客户名称")
    private String name;

    /** 地址 */
    @Excel(name = "地址")
    private String address;

    /** 电话 */
    @Excel(name = "电话")
    private String phone;

    /** 传真 */
    @Excel(name = "传真")
    private String fax;

    /** 销售类型 */
    @Excel(name = "销售类型")
    private String saleType;

    /** 纳税识别码 */
    @Excel(name = "纳税识别码")
    private String identifyCode;

    /** 银行名称 */
    @Excel(name = "银行名称")
    private String bankName;

    /** 银行账号 */
    @Excel(name = "银行账号")
    private String accountNumber;

    /** 状态（0正常 1停用） */
    @Excel(name = "状态", readConverterExp = "0=正常,1=停用")
    private String status;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }

    public void setCode(String code) 
    {
        this.code = code;
    }

    public String getCode() 
    {
        return code;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }

    public void setAddress(String address) 
    {
        this.address = address;
    }

    public String getAddress() 
    {
        return address;
    }

    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }

    public void setFax(String fax) 
    {
        this.fax = fax;
    }

    public String getFax() 
    {
        return fax;
    }

    public void setSaleType(String saleType) 
    {
        this.saleType = saleType;
    }

    public String getSaleType() 
    {
        return saleType;
    }

    public void setIdentifyCode(String identifyCode) 
    {
        this.identifyCode = identifyCode;
    }

    public String getIdentifyCode() 
    {
        return identifyCode;
    }

    public void setBankName(String bankName) 
    {
        this.bankName = bankName;
    }

    public String getBankName() 
    {
        return bankName;
    }

    public void setAccountNumber(String accountNumber) 
    {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() 
    {
        return accountNumber;
    }

    public void setStatus(String status) 
    {
        this.status = status;
    }

    public String getStatus() 
    {
        return status;
    }

    public void setDelFlag(String delFlag) 
    {
        this.delFlag = delFlag;
    }

    public String getDelFlag() 
    {
        return delFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("code", getCode())
            .append("name", getName())
            .append("address", getAddress())
            .append("phone", getPhone())
            .append("fax", getFax())
            .append("saleType", getSaleType())
            .append("identifyCode", getIdentifyCode())
            .append("bankName", getBankName())
            .append("accountNumber", getAccountNumber())
            .append("status", getStatus())
            .append("delFlag", getDelFlag())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
