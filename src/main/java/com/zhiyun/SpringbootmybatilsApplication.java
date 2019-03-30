package com.zhiyun;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
@Slf4j
@SpringBootApplication
@MapperScan("com.zhiyun.mapper")
public class SpringbootmybatilsApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run =  SpringApplication.run(SpringbootmybatilsApplication.class, args);
        String serverport = run.getEnvironment().getProperty("server.port");
        log.info("项目启动于: http://localhost:" + serverport);
    }

}
