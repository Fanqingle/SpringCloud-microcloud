package com.yoot.test;

import com.yootk.common.dto.DeptDTO;
import com.yootk.common.util.DeepBeanUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qingle
 * @description
 * @date 2023/1/26
 */

public class TestCopy {

    public static void main(String[] args) {
        List<DeptDTO> sources = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            DeptDTO deptDTO = new DeptDTO();
            deptDTO.setDeptno(10L + i);
            deptDTO.setDname("沐言科技 - " + i);
            deptDTO.setLoc("北京");
            sources.add(deptDTO);
        }
        List<DeptDTO> copy = DeepBeanUtils.copyListProperties(sources, DeptDTO::new);
        System.out.println(copy);
    }
}
