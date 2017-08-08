package cn.roc.mag.entity;

import java.math.BigDecimal;

public class DmCeoDesktopT {
    public static void main(String[] args) {
        BigDecimal decimal1 = new BigDecimal(33);
        BigDecimal decimal2 = new BigDecimal(12);
        BigDecimal decimal3 = new BigDecimal(21);
        BigDecimal decimal4 = decimal2.divide(decimal1,2,BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal("100"));
        BigDecimal decimal5 = decimal3.divide(decimal1,2,BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal("100"));

        System.out.println(decimal4);
        System.out.println(decimal5);
    }
    /**
     * 主键、自增
     */
    private Integer id;

    /**
     * 时间id
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
     * 订单总数
     */
    private Integer orderTotal;

    /**
     * 订单总金额
     */
    private BigDecimal orderTotalAmount;

    /**
     * 收款金额
     */
    private BigDecimal amountCollected;

    /**
     * 微信
     */
    private BigDecimal weChat;

    /**
     * 支付宝
     */
    private BigDecimal alipay;

    /**
     * 星链卡
     */
    private BigDecimal starChainCard;

    /**
     * 星链钱包
     */
    private BigDecimal starChainPurse;

    /**
     * 扫码支付
     */
    private BigDecimal scanCodePayment;

    /**
     * 本元支付
     */
    private BigDecimal yuanPayment;

    /**
     * 注册用户数
     */
    private Integer userNumber;

    /**
     * app下载次数
     */
    private Integer appNumber;

    /**
     * pv
     */
    private Integer pv;

    /**
     * uv
     */
    private Integer uv;

    /**
     * 业务类型（B2B2C：0 ，B2B：1）
     */
    private String businessType;

    /**
     * 主键、自增
     * @return id 主键、自增
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主键、自增
     * @param id 主键、自增
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 时间id
     * @return date_id 时间id
     */
    public Integer getDateId() {
        return dateId;
    }

    /**
     * 时间id
     * @param dateId 时间id
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
     * 订单总数
     * @return order_total 订单总数
     */
    public Integer getOrderTotal() {
        return orderTotal;
    }

    /**
     * 订单总数
     * @param orderTotal 订单总数
     */
    public void setOrderTotal(Integer orderTotal) {
        this.orderTotal = orderTotal;
    }

    /**
     * 订单总金额
     * @return order_total_amount 订单总金额
     */
    public BigDecimal getOrderTotalAmount() {
        return orderTotalAmount;
    }

    /**
     * 订单总金额
     * @param orderTotalAmount 订单总金额
     */
    public void setOrderTotalAmount(BigDecimal orderTotalAmount) {
        this.orderTotalAmount = orderTotalAmount;
    }

    /**
     * 收款金额
     * @return amount_collected 收款金额
     */
    public BigDecimal getAmountCollected() {
        return amountCollected;
    }

    /**
     * 收款金额
     * @param amountCollected 收款金额
     */
    public void setAmountCollected(BigDecimal amountCollected) {
        this.amountCollected = amountCollected;
    }

    /**
     * 微信
     * @return we_chat 微信
     */
    public BigDecimal getWeChat() {
        return weChat;
    }

    /**
     * 微信
     * @param weChat 微信
     */
    public void setWeChat(BigDecimal weChat) {
        this.weChat = weChat;
    }

    /**
     * 支付宝
     * @return alipay 支付宝
     */
    public BigDecimal getAlipay() {
        return alipay;
    }

    /**
     * 支付宝
     * @param alipay 支付宝
     */
    public void setAlipay(BigDecimal alipay) {
        this.alipay = alipay;
    }

    /**
     * 星链卡
     * @return star_chain_card 星链卡
     */
    public BigDecimal getStarChainCard() {
        return starChainCard;
    }

    /**
     * 星链卡
     * @param starChainCard 星链卡
     */
    public void setStarChainCard(BigDecimal starChainCard) {
        this.starChainCard = starChainCard;
    }

    /**
     * 星链钱包
     * @return star_chain_purse 星链钱包
     */
    public BigDecimal getStarChainPurse() {
        return starChainPurse;
    }

    /**
     * 星链钱包
     * @param starChainPurse 星链钱包
     */
    public void setStarChainPurse(BigDecimal starChainPurse) {
        this.starChainPurse = starChainPurse;
    }

    /**
     * 扫码支付
     * @return scan_code_payment 扫码支付
     */
    public BigDecimal getScanCodePayment() {
        return scanCodePayment;
    }

    /**
     * 扫码支付
     * @param scanCodePayment 扫码支付
     */
    public void setScanCodePayment(BigDecimal scanCodePayment) {
        this.scanCodePayment = scanCodePayment;
    }

    /**
     * 本元支付
     * @return yuan_payment 本元支付
     */
    public BigDecimal getYuanPayment() {
        return yuanPayment;
    }

    /**
     * 本元支付
     * @param yuanPayment 本元支付
     */
    public void setYuanPayment(BigDecimal yuanPayment) {
        this.yuanPayment = yuanPayment;
    }

    /**
     * 注册用户数
     * @return user_number 注册用户数
     */
    public Integer getUserNumber() {
        return userNumber;
    }

    /**
     * 注册用户数
     * @param userNumber 注册用户数
     */
    public void setUserNumber(Integer userNumber) {
        this.userNumber = userNumber;
    }

    /**
     * app下载次数
     * @return app_number app下载次数
     */
    public Integer getAppNumber() {
        return appNumber;
    }

    /**
     * app下载次数
     * @param appNumber app下载次数
     */
    public void setAppNumber(Integer appNumber) {
        this.appNumber = appNumber;
    }

    /**
     * pv
     * @return pv pv
     */
    public Integer getPv() {
        return pv;
    }

    /**
     * pv
     * @param pv pv
     */
    public void setPv(Integer pv) {
        this.pv = pv;
    }

    /**
     * uv
     * @return uv uv
     */
    public Integer getUv() {
        return uv;
    }

    /**
     * uv
     * @param uv uv
     */
    public void setUv(Integer uv) {
        this.uv = uv;
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
}