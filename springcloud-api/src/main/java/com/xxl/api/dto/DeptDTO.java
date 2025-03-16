package com.xxl.api.dto;

import java.io.Serializable;

/**
 * @author xxl
 * @date 2025/3/16 20:45
 */
@SuppressWarnings("serial")
public class DeptDTO implements Serializable {
    private Long deptNo;
    private String deptName;
    private String loc;

    public Long getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(Long deptNo) {
        this.deptNo = deptNo;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
}

