package com.itheima.controller;


import com.itheima.po.Dept;
import com.itheima.pojo.Result;
import com.itheima.service.IDeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 部门表 前端控制器
 * </p>
 *
 * @author zly
 * @since 2024-06-28
 */
@Slf4j
@RestController
@RequestMapping("/depts")
public class DeptController {

    @Autowired
    private IDeptService deptService;

    @GetMapping
    public Result listDept(){
        List<Dept> deptList = deptService.list();
        log.info("查询部门Dept功能执行了");
        return Result.success(deptList);
    }


    @DeleteMapping("/{id}")
    public Result deleteDept(@PathVariable Integer id){

        log.info("根据id删除部门，id={}", id);
        deptService.removeById(id);
        return Result.success();
    }

    @PostMapping
    public Result addDept(@RequestBody Dept dept){

        log.info("根据dept.name添加部门，name={}", dept);
        dept.setCreateTime(LocalDateTime.now());
        dept.setUpdateTime(LocalDateTime.now());
        deptService.save(dept);
        return Result.success();
    }

    @GetMapping("/{id}")
    public Result getBtId(@PathVariable Integer id){
        log.info("根据id查询部门，id={}", id);
        Dept dept = deptService.getById(id);

        return Result.success(dept);
    }

    @PutMapping
    private Result updataDept(@RequestBody Dept dept){
        log.info("根据id修改部门名称，id={}  name={}", dept.getId(),dept.getName());

        dept.setCreateTime(LocalDateTime.now());
        deptService.updateById(dept);
        return Result.success();
    }


}
