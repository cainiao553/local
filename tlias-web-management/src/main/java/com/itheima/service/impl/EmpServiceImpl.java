package com.itheima.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.po.Emp;
import com.itheima.mapper.EmpMapper;
import com.itheima.pojo.PageBean;
import com.itheima.service.IEmpService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.time.LocalDate;

/**
 * <p>
 * 员工表 服务实现类
 * </p>
 *
 * @author zly
 * @since 2024-06-28
 */
@Service
public class EmpServiceImpl extends ServiceImpl<EmpMapper, Emp> implements IEmpService {

    public PageBean listEmps(String name, Integer gender, LocalDate begin, LocalDate end, int pageNo, int pageSize){

        /**
         * 分页查询员工
         */

        Page page=new Page(pageNo,pageSize);

        LambdaQueryWrapper<Emp> lambdaQueryWrapper=new LambdaQueryWrapper<>();
        lambdaQueryWrapper.like(!StringUtils.isEmpty(name),Emp::getName,name);
        lambdaQueryWrapper.eq(gender!=null,Emp::getGender,gender);
        lambdaQueryWrapper.between(begin!=null&&end!=null,Emp::getEntrydate,begin,end);
        lambdaQueryWrapper.orderByDesc(Emp::getEntrydate);

        this.page(page,lambdaQueryWrapper);

        PageBean pageBean =new PageBean();
        pageBean.setRows(page.getRecords());
        pageBean.setTotal(page.getTotal());

        return  pageBean;
    }
}
