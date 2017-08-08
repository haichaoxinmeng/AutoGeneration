package cn.roc.mag.entity;

import java.math.BigDecimal;
import java.util.Date;

public class DmOrderAreaSumF {
    /**
     * id
     */
    private Integer id;

    /**
     * 日期id
     */
    private Integer dateId;

    /**
     * 月id
     */
    private Integer monthId;

    /**
     * 年id
     */
    private Integer yearId;

    /**
     * 省份
     */
    private String province;

    /**
     * 是否主场（1：非主场、2：主场）
     */
    private Integer home;

    /**
     * 订单金额
     */
    private BigDecimal orderAmt;

    /**
     * 类型（1：非三好节、2：三好节）
     */
    private Integer orderType;

    /**
     * 业务类型（B2B2C：0 ，B2B：1）
     */
    private String businessType;

    /**
     * 最后更新时间
     */
    private Date dwLastUpdateDate;

    /**
     * id
     * @return id id
     */
    public Integer getId() {
        return id;
    }

    /**
     * id
     * @param id id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 日期id
     * @return date_id 日期id
     */
    public Integer getDateId() {
        return dateId;
    }

    /**
     * 日期id
     * @param dateId 日期id
     */
    public void setDateId(Integer dateId) {
        this.dateId = dateId;
    }

    /**
     * 月id
     * @return month_id 月id
     */
    public Integer getMonthId() {
        return monthId;
    }

    /**
     * 月id
     * @param monthId 月id
     */
    public void setMonthId(Integer monthId) {
        this.monthId = monthId;
    }

    /**
     * 年id
     * @return year_id 年id
     */
    public Integer getYearId() {
        return yearId;
    }

    /**
     * 年id
     * @param yearId 年id
     */
    public void setYearId(Integer yearId) {
        this.yearId = yearId;
    }

    /**
     * 省份
     * @return province 省份
     */
    public String getProvince() {
        return province;
    }

    /**
     * 省份
     * @param province 省份
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * 是否主场（1：非主场、2：主场）
     * @return home 是否主场（1：非主场、2：主场）
     */
    public Integer getHome() {
        return home;
    }

    /**
     * 是否主场（1：非主场、2：主场）
     * @param home 是否主场（1：非主场、2：主场）
     */
    public void setHome(Integer home) {
        this.home = home;
    }

    /**
     * 订单金额
     * @return order_amt 订单金额
     */
    public BigDecimal getOrderAmt() {
        return orderAmt;
    }

    /**
     * 订单金额
     * @param orderAmt 订单金额
     */
    public void setOrderAmt(BigDecimal orderAmt) {
        this.orderAmt = orderAmt;
    }

    /**
     * 类型（1：非三好节、2：三好节）
     * @return order_type 类型（1：非三好节、2：三好节）
     */
    public Integer getOrderType() {
        return orderType;
    }

    /**
     * 类型（1：非三好节、2：三好节）
     * @param orderType 类型（1：非三好节、2：三好节）
     */
    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    /**
     * 业务类型（B2B2C：0 ，B2B：1）
     * @return business_type 业务类型（B2B2C：0 ，B2B：1）
     */
    public String getBusinessType() {
        return businessType;
    }

    /**
     * 业务类型（B2B2C：0 ，B2B：1）
     * @param businessType 业务类型（B2B2C：0 ，B2B：1）
     */
    public void setBusinessType(String businessType) {
        this.businessType = businessType == null ? null : businessType.trim();
    }

    /**
     * 最后更新时间
     * @return dw_last_update_date 最后更新时间
     */
    public Date getDwLastUpdateDate() {
        return dwLastUpdateDate;
    }

    /**
     * 最后更新时间
     * @param dwLastUpdateDate 最后更新时间
     */
    public void setDwLastUpdateDate(Date dwLastUpdateDate) {
        this.dwLastUpdateDate = dwLastUpdateDate;
    }
}