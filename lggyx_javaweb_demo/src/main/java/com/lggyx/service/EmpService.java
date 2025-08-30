package com.lggyx.service;

import com.lggyx.pojo.PageBean;

public interface EmpService {
    PageBean page(Integer page, Integer pageSize);
}
