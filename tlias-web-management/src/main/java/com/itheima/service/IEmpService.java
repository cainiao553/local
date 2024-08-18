package com.itheima.service;

import com.itheima.po.Emp;
import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.pojo.PageBean;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

/**
 * <p>
 * 员工表 服务类
 * </p>
 *
 * @author zly
 * @since 2024-06-28
 */
public interface IEmpService extends IService<Emp> {
    public PageBean listEmps(String name, Integer gender, LocalDate begin, LocalDate end, int pageNo, int pageSize);
}
