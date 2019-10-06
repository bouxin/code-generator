package com.happy.generator.demo.entity;

import java.io.Serializable;

/**
 * <p>
 * 地区省份表
 * </p>
 *
 * @author lubosson
 * @since 2019-10-06
 * @see com.happy.generator.demo.entity.ProvinceDO
 */
public class ProvinceDO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    /**
     * 省份简写
     */
    private String simple;

    /**
     * 全国代码
     */
    private String code;

    /**
     * 省份中文
     */
    private String name;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSimple() {
        return simple;
    }

    public void setSimple(String simple) {
        this.simple = simple;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ProvinceDO{" +
            "id=" + id +
            ", simple=" + simple +
            ", code=" + code +
            ", name=" + name +
            "}";
    }
}
