package com.company.sample.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.chile.core.annotations.MetaProperty;
import javax.persistence.Transient;

@NamePattern("%s %s|code,name")
@Table(name = "SAMPLE_PRODUCT")
@Entity(name = "sample$Product")
public class Product extends StandardEntity {
    private static final long serialVersionUID = -3102434946883189519L;

    @Column(name = "CODE", nullable = false)
    protected String code;

    @Column(name = "NAME", nullable = false)
    protected String name;

    @Column(name = "PRICE")
    protected BigDecimal price;

    @Transient
    @MetaProperty
    public String getCodeName() {
        return getInstanceName();
    }


    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }


}