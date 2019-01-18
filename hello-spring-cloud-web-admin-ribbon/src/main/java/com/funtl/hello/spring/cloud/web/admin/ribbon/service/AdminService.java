package com.funtl.hello.spring.cloud.web.admin.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author: xiaohoo
 * @date: 2019/1/16 14:58
 * @email: 1126457667@qq.com
 */
@Service
public class AdminService {

    @Autowired
    private RestTemplate restTemplate;

    public String sayHi(String message){
        return restTemplate.getForObject("http://hello-spring-cloud-service-admin/hi?message=" + message, String.class);
    }
}
