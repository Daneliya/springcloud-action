package com.xxl.springboot.feign.controller;

import com.xxl.api.dto.DeptDTO;
import com.xxl.api.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xxl
 * @date 2025/3/8 22:31
 */
@RestController
public class DeptController {

    @Autowired
    private IDeptService deptService;            // 注入远程业务接口对象


    @GetMapping("/consumer/dept/list")
    public Object listDeptRest() {
        return this.deptService.list();        // 调用Restful业务方法
    }

    @GetMapping("/consumer/dept/get")
    public Object getDeptRest(long deptno) {
        return this.deptService.get(deptno);    // 调用Restful业务方法
    }

    @GetMapping("/consumer/dept/add")
    public Object addDeptRest(DeptDTO dept) {    // 传输DeptDTO对象
        return this.deptService.add(dept);        // 调用Restful业务方法
    }

}

