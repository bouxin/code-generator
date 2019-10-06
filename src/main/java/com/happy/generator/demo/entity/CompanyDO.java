package com.happy.generator.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 企业信息表
 * </p>
 *
 * @author lubosson
 * @since 2019-10-06
 * @see com.happy.generator.demo.entity.CompanyDO
 */
public class CompanyDO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * PK
     */
    private Integer id;

    /**
     * 公司名
     */
    private String name;

    /**
     * 法人代表
     */
    private String representative;

    /**
     * 公司地址
     */
    private String address;

    /**
     * 所属地区(省)
     */
    private String region;

    /**
     * 城市
     */
    private String city;

    /**
     * 区/县
     */
    private String district;

    /**
     * 经纬度，json -> {"lat": "30.18484477830133", "long": "120.06383340659741"}
     */
    private String latLong;

    /**
     * 经营状态
     */
    private String bizStatus;

    /**
     * 统一社会信用代码
     */
    private String creditCode;

    /**
     * 注册号
     */
    private String registerCode;

    /**
     * 电话
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 成立时间
     */
    private String setupTime;

    /**
     * 所属行业
     */
    private String industry;

    /**
     * 经营范围
     */
    private String bizScope;

    /**
     * 公司类型
     */
    private String companyType;

    /**
     * 注册资本
     */
    private String registeredCapital;

    /**
     * 实缴资本
     */
    private String actualCapital;

    /**
     * 纳税人识别号
     */
    private String taxpayerCode;

    /**
     * 组织机构代码
     */
    private String organizationCode;

    /**
     * 公司英文名
     */
    private String englishName;

    /**
     * 登记机关
     */
    private String authorization;

    /**
     * 公司官网
     */
    private String homepage;

    /**
     * 公司曾用名
     */
    private String usedName;

    /**
     * 搜索关键字
     */
    private String searchKey;

    /**
     * 插入时间
     */
    private LocalDateTime createAt;

    /**
     * 最后操作时间
     */
    private LocalDateTime modifyAt;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRepresentative() {
        return representative;
    }

    public void setRepresentative(String representative) {
        this.representative = representative;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getLatLong() {
        return latLong;
    }

    public void setLatLong(String latLong) {
        this.latLong = latLong;
    }

    public String getBizStatus() {
        return bizStatus;
    }

    public void setBizStatus(String bizStatus) {
        this.bizStatus = bizStatus;
    }

    public String getCreditCode() {
        return creditCode;
    }

    public void setCreditCode(String creditCode) {
        this.creditCode = creditCode;
    }

    public String getRegisterCode() {
        return registerCode;
    }

    public void setRegisterCode(String registerCode) {
        this.registerCode = registerCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSetupTime() {
        return setupTime;
    }

    public void setSetupTime(String setupTime) {
        this.setupTime = setupTime;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getBizScope() {
        return bizScope;
    }

    public void setBizScope(String bizScope) {
        this.bizScope = bizScope;
    }

    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }

    public String getRegisteredCapital() {
        return registeredCapital;
    }

    public void setRegisteredCapital(String registeredCapital) {
        this.registeredCapital = registeredCapital;
    }

    public String getActualCapital() {
        return actualCapital;
    }

    public void setActualCapital(String actualCapital) {
        this.actualCapital = actualCapital;
    }

    public String getTaxpayerCode() {
        return taxpayerCode;
    }

    public void setTaxpayerCode(String taxpayerCode) {
        this.taxpayerCode = taxpayerCode;
    }

    public String getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getAuthorization() {
        return authorization;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public String getUsedName() {
        return usedName;
    }

    public void setUsedName(String usedName) {
        this.usedName = usedName;
    }

    public String getSearchKey() {
        return searchKey;
    }

    public void setSearchKey(String searchKey) {
        this.searchKey = searchKey;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public LocalDateTime getModifyAt() {
        return modifyAt;
    }

    public void setModifyAt(LocalDateTime modifyAt) {
        this.modifyAt = modifyAt;
    }

    @Override
    public String toString() {
        return "CompanyDO{" +
            "id=" + id +
            ", name=" + name +
            ", representative=" + representative +
            ", address=" + address +
            ", region=" + region +
            ", city=" + city +
            ", district=" + district +
            ", latLong=" + latLong +
            ", bizStatus=" + bizStatus +
            ", creditCode=" + creditCode +
            ", registerCode=" + registerCode +
            ", phone=" + phone +
            ", email=" + email +
            ", setupTime=" + setupTime +
            ", industry=" + industry +
            ", bizScope=" + bizScope +
            ", companyType=" + companyType +
            ", registeredCapital=" + registeredCapital +
            ", actualCapital=" + actualCapital +
            ", taxpayerCode=" + taxpayerCode +
            ", organizationCode=" + organizationCode +
            ", englishName=" + englishName +
            ", authorization=" + authorization +
            ", homepage=" + homepage +
            ", usedName=" + usedName +
            ", searchKey=" + searchKey +
            ", createAt=" + createAt +
            ", modifyAt=" + modifyAt +
            "}";
    }
}
