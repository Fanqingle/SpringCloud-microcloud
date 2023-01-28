package com.yootk.provider.action;

import com.yootk.common.dto.DeptDTO;
import com.yootk.service.IDeptService;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

/**
 * @author qingle
 * @description
 * @date 2023/1/27
 */
@Slf4j // 添加日志注解
@RestController
@RequestMapping("/provider/dept/*") // 微服务提供者父路径
public class DeptAction {
    @Autowired
    private IDeptService deptService;

    @ApiOperation(value = "部门查询", notes = "根据部门编号查询部门详细信息")
    @GetMapping("get/{id}")
    public Object get(@PathVariable("id") long id) {
        this.printRequestHeaders("get");
        return this.deptService.get(id);
    }

    @ApiOperation(value = "部门增加", notes = "增加新的部门详细信息")
    @PostMapping("add")
    public Object add(@RequestBody DeptDTO deptDTO) {  // 后面会修改参数模式为JSON
        this.printRequestHeaders("add");
        return this.deptService.add(deptDTO);
    }

    @ApiOperation(value = "部门列表", notes = "查询部门的完整详细信息")
    @GetMapping("list")
    public Object list() {
        this.printRequestHeaders("list");
        return this.deptService.list();
    }

    @ApiOperation(value = "部门分页查询", notes = "根据指定的数据库参数实现部门数据的分页加载")
    @GetMapping("split")
    public Object split(int cp, int ls, String col, String kw) {
        this.printRequestHeaders("split");
        return this.deptService.split(cp, ls, col, kw);
    }

    private void printRequestHeaders(String restName) { // 实现所有请求头信息的输出
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            log.info("【{}】头信息:{} = {}", restName, headerName, request.getHeader(headerName));

        }


    }

}
