package com.itheima.service.impl;

import com.itheima.po.Dept;
import com.itheima.mapper.DeptMapper;
import com.itheima.service.IDeptService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 部门表 服务实现类
 * </p>
 *
 * @author zly
 * @since 2024-06-28
 */
@Service
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements IDeptService {

}
