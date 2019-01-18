package com.funtl.hello.spring.cloud.web.admin.ribbon.controller;

import com.funtl.hello.spring.cloud.web.admin.ribbon.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: xiaohoo
 * @date: 2019/1/16 15:09
 * @email: 1126457667@qq.com
 */
@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("hi")
    public String sayHi(String message){
        return adminService.sayHi(message);
    }
}
