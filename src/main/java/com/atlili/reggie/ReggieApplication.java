package com.atlili.reggie;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @ClassName:ReggieApplication
 * @Author atlili
 * @Description TODO
 * @Date 2024/3/8 21:54
 * @Version 1.0
 */
@Slf4j
@SpringBootApplication
@ServletComponentScan
// @EnableTransactionManagement
// @EnableCaching//开启springcach缓存注解的功能
public class ReggieApplication {
    public static void main(String[] args) {
        SpringApplication.run(ReggieApplication.class);
        log.info("项目启动成功");
    }
}
