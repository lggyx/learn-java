package com.lggyx.service;

import com.lggyx.pojo.PageBean;

import java.time.LocalDate;

public interface EmpService {
    PageBean page(Integer page, Integer pageSize,String name, Short gender,LocalDate begin,LocalDate end);
//    PageBean page(Integer page, Integer pageSize);
}
