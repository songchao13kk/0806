package com.offcn.crm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
@MapperScan(value="com.offcn.crm.mapper")
@EnableTransactionManagement
@SpringBootApplication//自动配置spring  创建spring的核心配置文件   扫描加了注解的该包 及子包
public class MainConfig {
	public static void main(String[] args) {
		SpringApplication.run(MainConfig.class, args);
	}
}
