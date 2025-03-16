package com.xxl.api.service;

import com.xxl.api.dto.DeptDTO;
import com.xxl.api.service.config.FeignClientConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @author xxl
 * @date 2025/3/16 20:45
 */
@FeignClient(value = "springcloud-dept-service", configuration = FeignClientConfig.class)
public interface IDeptService {
//    public DeptDTO add(DeptDTO dto);        // 增加新部门
//
//    public DeptDTO get(long deptno);    // 根据部门编号获取部门信息
//
//    public List<DeptDTO> list();        // 部门信息列表

    @PostMapping("/dept/add")
    public DeptDTO add(DeptDTO dto);                            // 增加新部门

    @GetMapping("/dept/get/{deptno}")
    public DeptDTO get(@PathVariable("deptno") long deptno);    // 根据部门编号获取部门信息

    @GetMapping("/dept/list")
    public List<DeptDTO> list();                                // 部门信息列表
}

