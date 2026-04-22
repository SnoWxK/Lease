package com.snowxk.lease.common.mybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.snowxk.lease.web.*.mapper")
public class MybatisPlusConfiguration {

}