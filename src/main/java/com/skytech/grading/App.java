package com.skytech.grading;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Classname App
 * @Description TODO
 * @Date 2019/4/29 9:21
 * @Created by huangdasheng
 */
@Slf4j
@SpringBootApplication
@MapperScan(basePackages = {"com.skytech.grading.business.dao"})
//@ComponentScan(basePackages = {"com.skytech.grading.business","com.skytech.grading.config"})
public class App extends SpringBootServletInitializer {
    @Override
    public SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        log.info("---------begin application-------");
        return builder.sources(App.class);
    }
}
