package hello.spring.cloud.web.admin.feign.controller;

import hello.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: xiaohoo
 * @date: 2019/1/16 16:01
 * @email: 1126457667@qq.com
 */
@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/hi")
        public String sayHi(String message){
        return adminService.sayHi(message);
    }
}
