package com.yootk.common.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author qingle
 * @description
 * @date 2023/1/26
 */

@Data // Lombok
public class DeptDTO implements Serializable { //定义数据传输类
    private Long deptno;
    private String dname;
    private String loc;
}
