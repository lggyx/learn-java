package com.lggyx.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.lggyx.mapper.EmpMapper;
import com.lggyx.pojo.Emp;
import com.lggyx.pojo.PageBean;
import com.lggyx.service.EmpService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    @Override
    public PageBean page(Integer page, Integer pageSize){
        // 设置分页参数
        PageHelper.startPage(page, pageSize);
        // 执行分页查询
        Page<Emp> p = (Page<Emp>) empMapper.list();
        //封装PageBean
        PageBean pageBean = new PageBean(p.getTotal(), p.getResult());
        return pageBean;
    }
    /*@Override
    public PageBean page(Integer page, Integer pageSize) {
        //1、获取总记录数
        Long count = empMapper.count();
        //2、获取分页查询结果列表
        Integer start = (page - 1) * pageSize; //计算起始索引 , 公式: (页码-1)*页大小
        List<Emp> empList = empMapper.list(start, pageSize);
        //3、封装PageBean对象
        PageBean pageBean = new PageBean(count , empList);
        return pageBean;
    }*/
}
