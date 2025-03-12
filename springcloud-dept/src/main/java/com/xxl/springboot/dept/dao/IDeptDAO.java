package com.xxl.springboot.dept.dao;

import com.xxl.springboot.dept.po.Dept;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author xxl
 * @date 2025/3/8 22:38
 */
@Mapper
public interface IDeptDAO {    // 包含有全部的基础Crud支持

    /**
     * 查询全部部门信息
     *
     * @return
     */
    @Select("SELECT deptno, dname FROM dept")
    List<Dept> findAll();

    /**
     * 保存
     *
     * @param po
     * @return
     */
    @Insert("INSERT INTO dept (deptno, dname, loc) VALUES (#{deptno}, #{dname}, #{loc})")
    Object save(Dept po);

    /**
     * 根据编码查询
     *
     * @param deptno
     * @return
     */
    @Select("SELECT deptno, dname, loc FROM dept WHERE deptno = #{deptno}")
    Dept getOne(long deptno);
}
