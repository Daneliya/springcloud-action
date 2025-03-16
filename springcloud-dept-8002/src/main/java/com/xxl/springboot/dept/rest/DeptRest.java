package com.xxl.springboot.dept.rest;

import com.xxl.api.dto.DeptDTO;
import com.xxl.api.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author xxl
 * @date 2025/3/8 22:31
 */
@RestController
public class DeptRest {

    @Autowired
    private IDeptService deptService;            // 注入部门业务

    @Resource
    private DiscoveryClient client;    // 进行Eureka的发现服务

    /**
     * 直接返回发现服务信息
     *
     * @return
     */
    @RequestMapping("/dept/discover")
    public Object discover() {
        return this.client;
    }

    /**
     * 增加部门信息
     *
     * @param dept
     * @return
     */
    @PostMapping("/dept/add")
    public Object get(@RequestBody DeptDTO dept) {
        return this.deptService.add(dept);
    }

    /**
     * 查询部门信息
     *
     * @param deptno
     * @return
     */
    @GetMapping("/dept/get/{deptno}")
    public Object get(@PathVariable("deptno") long deptno) {
        return this.deptService.get(deptno);
    }

    /**
     * 部门信息列表
     *
     * @return
     */
    @GetMapping("/dept/list")
    public Object list() {
        return this.deptService.list();
    }
}

