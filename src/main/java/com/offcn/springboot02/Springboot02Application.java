package com.offcn.springboot02;

import com.offcn.springboot02.properties.CompanyProperties;
import com.offcn.springboot02.properties.CourseProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

//启动类
@SpringBootApplication
//开启配置参数类
@EnableConfigurationProperties({CompanyProperties.class, CourseProperties.class})
public class Springboot02Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot02Application.class, args);
    }

}
