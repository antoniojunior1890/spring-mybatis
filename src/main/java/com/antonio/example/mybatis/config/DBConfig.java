package com.antonio.example.mybatis.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.antonio.example.mybatis.mapper")
public class DBConfig {
}