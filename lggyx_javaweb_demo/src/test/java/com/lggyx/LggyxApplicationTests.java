package com.lggyx;

import com.lggyx.controller.DeptController;
import com.lggyx.mapper.DeptMapper;
import com.lggyx.pojo.Dept;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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

}
