package com.lggyx.service;

import com.lggyx.pojo.Dept;

import java.util.List;

public interface DeptService {
    List<Dept> list();

    boolean delete(Integer id);

    boolean add(Dept dept);
}
