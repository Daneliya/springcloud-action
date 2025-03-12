package com.xxl.springboot.dept.service;

import com.xxl.springboot.dept.dto.DeptDTO;

import java.util.List;

/**
 * @author xxl
 * @date 2025/3/8 22:32
 */
public interface IDeptService {

    public DeptDTO add(DeptDTO dto);        // 增加新部门

    public DeptDTO get(long deptno);    // 根据部门编号获取部门信息

    public List<DeptDTO> list();        // 部门信息列表
}
