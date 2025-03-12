package com.xxl.springboot.dept.dto;

import java.io.Serializable;

/**
 * @author xxl
 * @date 2025/3/8 22:37
 */
@SuppressWarnings("serial")
public class DeptDTO implements Serializable {
    private Long deptno;
    private String dname;
    private String loc;

    // setter、getter略
    public Long getDeptno() {
        return deptno;
    }

    public void setDeptno(Long deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
}

