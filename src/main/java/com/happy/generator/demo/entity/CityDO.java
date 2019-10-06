package com.happy.generator.demo.entity;

import java.io.Serializable;

/**
 * <p>
 * 市区级表
 * </p>
 *
 * @author lubosson
 * @since 2019-10-06
 * @see com.happy.generator.demo.entity.CityDO
 */
public class CityDO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    /**
     * 父级省
     */
    private String parent;

    /**
     * 市、区级代码
     */
    private String code;

    /**
     * 市、区级名
     */
    private String name;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
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
        return "CityDO{" +
            "id=" + id +
            ", parent=" + parent +
            ", code=" + code +
            ", name=" + name +
            "}";
    }
}
