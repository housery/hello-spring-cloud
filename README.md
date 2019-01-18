# Spring Cloud Finchley
基于spring cloud Finchley 的demo
### 1. 服务启动顺序
1. 注册中心（Eureka）
2. 分布式配置中心（spring-boot-config）
3. 服务提供者
4. 服务消费者
5. API网关（zuul）
6. 链路追踪服务（zipkin）or Spring Boot Admin
### 2. 端口分配
端口分配和项目名称如下：

| 类型           | 路径                               | 服务名称                           | 启动顺序 |
| -------------- | ---------------------------------- | ---------------------------------- | -------- |
| 注册中心       | http://localhost:8761              | hello-spring-cloud-eueka           | 1        |
| 分布式配置中心 | http://localhost:8888              | hello-spring-cloud-config          | 2        |
| 服务提供者     | http://llocalhost:8762             | hello-spring-cloud-service-admin   | 3        |
| 服务消费者     | http://localhost:8765              | hello-spring-cloud-web-admin-feign | 4        |
| API网关中心    | http://localhost:8769              | hello-spring-cloud-zuul            | 5        |
| 服务链路跟踪   | http://localhost:9411/zipkin/      | hello-spring-cloud-zipkin          | *        |
| 服务监控中心   | http://localhost:8084/applications | hello-spring-cloud-admin           | *        |

👉 * 为任意启动顺序

📦 服务提供者可以修改端口号启动多个实例



