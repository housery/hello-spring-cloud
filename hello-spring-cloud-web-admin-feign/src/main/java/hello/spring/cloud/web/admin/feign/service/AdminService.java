package hello.spring.cloud.web.admin.feign.service;

import hello.spring.cloud.web.admin.feign.service.hystrix.AdminServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: xiaohoo
 * @date: 2019/1/16 15:57
 * @email: 1126457667@qq.com
 */
@FeignClient(value = "hello-spring-cloud-service-admin", fallback = AdminServiceHystrix.class)
public interface AdminService {

    @GetMapping("/hi")
    public String sayHi(@RequestParam("message") String message);
}
