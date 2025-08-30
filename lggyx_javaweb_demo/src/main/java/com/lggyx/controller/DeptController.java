package com.lggyx.controller;

import com.lggyx.pojo.Dept;
import com.lggyx.pojo.Result;
import com.lggyx.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;
    public Result list() {
        log.info("部门列表数据查询");
        List<Dept> list = deptService.list();
        return Result.success(list);
    }
}