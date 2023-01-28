package com.yootk.provider.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author qingle
 * @description
 * @date 2023/1/26
 */
@TableName("dept")
@Data
public class Dept {
    @TableId(type = IdType.AUTO)
    private Long deptno;
    private String dname;
    private String loc;
}
