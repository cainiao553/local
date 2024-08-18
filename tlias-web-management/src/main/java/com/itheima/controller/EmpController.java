package com.itheima.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.po.Emp;
import com.itheima.pojo.PageBean;
import com.itheima.pojo.Result;
import com.itheima.service.IEmpService;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 * 员工表 前端控制器
 * </p>
 *
 * @author zly
 * @since 2024-06-28
 */

@Slf4j
@RestController
@RequestMapping("/emps")
public class EmpController {

    @Autowired
    private IEmpService empService;


    @GetMapping
    public Result listEmps(
            String name,
            Integer gender,
            @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate begin,
            @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate end,
            @RequestParam(value = "page",defaultValue = "1") int pageNo,
            @RequestParam(value = "pageSize",defaultValue = "10") int pageSize){

        log.info("查询员工功能执行,name={},gender={},begin={},end={},pageNo{},pageSize={}",name,gender,begin,end,pageNo,pageSize);
        PageBean pageBean=empService.listEmps(name,gender,begin,end,pageNo,pageSize);
        return Result.success(pageBean);
    }

    @DeleteMapping("/{ids}")
    public Result deleteEmps(@PathVariable List<Integer> ids){

        log.info("批量删除员工功能执行,ids={}",ids);
        empService.removeByIds(ids);

        return Result.success();
    }


    @PostMapping
    public Result addEmp(@RequestBody Emp emp){

        log.info("添加员工功能执行,emp={}",emp);

        emp.setCreateTime(LocalDateTime.now());
        emp.setUpdateTime(LocalDateTime.now());
        empService.save(emp);
        return  Result.success();

    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id){
        log.info("根据员工ID查询功能执行,id={}",id);

        Emp emp = empService.getById(id);
        return  Result.success(emp);
    }

    @PutMapping
    public Result updataEmp(@RequestBody Emp emp){
        log.info("更新员工功能执行,emp={}",emp);

        emp.setUpdateTime(LocalDateTime.now());
        empService.updateById(emp);
        return Result.success();
    }


}
