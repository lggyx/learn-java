package com.lggyx;

import com.lggyx.controller.DeptController;
import com.lggyx.mapper.DeptMapper;
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

}
