package com.lggyx;

import com.lggyx.controller.DeptController;
import com.lggyx.controller.EmpController;
import com.lggyx.mapper.DeptMapper;
import com.lggyx.pojo.Dept;
import com.lggyx.pojo.Result;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
class LggyxApplicationTests {
    @Autowired
    DeptController deptController;
    @Test
    void DeptList() {
        System.out.println(deptController.list());
    }
    @Test
    void DeptDelete() {
        System.out.println(deptController.delete(1));
    }
    @Test
    void DeptAdd() {
        Dept dept = new Dept();
        dept.setName("测试部");
        System.out.println(deptController.add(dept));
    }
    @Autowired
    EmpController empController;
    @Test
    void EmpPage(){
        String name="张";
        Short gender=1;
        LocalDate begin= LocalDate.of(2020,1,1);
        LocalDate end= LocalDate.of(2020,1,1);
        Integer page=1;
        Integer pageSize=10;
        Result result = empController.page(page,pageSize,name,gender,begin,end);
        System.out.println(result);
    }

}
