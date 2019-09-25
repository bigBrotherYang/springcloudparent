package com.xtkj.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class Blog implements Serializable {
    private static final long serialVersionUID = -7602897172029258179L;
    private BigDecimal bId;

    private String bName;

    private String bContext;

    public BigDecimal getbId() {
        return bId;
    }

    public void setbId(BigDecimal bId) {
        this.bId = bId;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName == null ? null : bName.trim();
    }

    public String getbContext() {
        return bContext;
    }

    public void setbContext(String bContext) {
        this.bContext = bContext == null ? null : bContext.trim();
    }
}