package hello.spring.cloud.web.admin.feign.service.hystrix;

import hello.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.stereotype.Component;

/**
 * @author: xiaohoo
 * @date: 2019/1/16 17:28
 * @email: 1126457667@qq.com
 */
@Component
public class AdminServiceHystrix implements AdminService {

    @Override
    public String sayHi(String message) {
        return String.format("Hi your message is %s but request bed，请求不到，发生熔断", message);
    }
}
