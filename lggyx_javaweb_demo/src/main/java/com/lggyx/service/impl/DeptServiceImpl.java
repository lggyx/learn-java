package com.lggyx.service.impl;

import com.lggyx.mapper.DeptMapper;
import com.lggyx.pojo.Dept;
import com.lggyx.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> list() {
        List<Dept> list = deptMapper.list();
        return list;
    }

    @Override
    public boolean delete(Integer id) {
        int count = deptMapper.delete(id);
        return count == 1;
    }

    @Override
    public boolean add(Dept dept) {
        dept.setCreateTime(LocalDateTime.now());
        dept.setUpdateTime(LocalDateTime.now());
        int count = deptMapper.add(dept);
        return count == 1;
    }
}
