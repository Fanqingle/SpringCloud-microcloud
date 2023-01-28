package com.yootk.test;

import com.yootk.common.dto.DeptDTO;
import com.yootk.provider.StartProviderDept8001Application;
import com.yootk.service.IDeptService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

@ExtendWith(SpringExtension.class)
@WebAppConfiguration
@SpringBootTest(classes = StartProviderDept8001Application.class)
public class TestDeptService {
    @Autowired
    private IDeptService deptService; // 注入业务接口对象

    @Test
    public void testGet() {
        System.out.println(this.deptService.get(1));
    }

    @Test
    public void testList() {
        System.out.println(this.deptService.list());
    }

    @Test
    public void testAdd() {
        DeptDTO deptDTO = new DeptDTO();
        deptDTO.setDname("公益部");
        //deptDTO.setLoc("洛阳");
        deptDTO.setLoc("yootk8001");
        System.out.println(this.deptService.add(deptDTO));
    }
}
