package com.yootk.consumer.config;

import com.yootk.consumer.interceptor.MicroServiceHTTPInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

/**
 * @author qingle
 * @description
 * @date 2023/1/27
 */

@Configuration
public class RestTemplateConfig { // 实现RestTemplate的相关配置
    @Autowired
    private MicroServiceHTTPInterceptor interceptor; // 注入拦截器

    @Bean // 向Spring容器之中进行Bean注册
    public RestTemplate getRestTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setInterceptors(Collections.singletonList(this.interceptor));
        return restTemplate;
    }

}
