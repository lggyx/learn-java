package com.lggyx.controller;

import com.lggyx.pojo.Dept;
import com.lggyx.pojo.Result;
import com.lggyx.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;
    @GetMapping("/depts")
    public Result list() {
        log.info("部门列表数据查询");
        List<Dept> list = deptService.list();
        return Result.success(list);
    }
    @DeleteMapping("/depts/{id}")
    public Result delete(@PathVariable Integer id) {
        log.info("部门删除"+ id.toString());
        return deptService.delete(id) ? Result.success() : Result.error("部门删除失败");
    }
}