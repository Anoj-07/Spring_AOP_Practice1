package com.Aspect.AOP_Practice;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.Aspect.AOP_Practice")
@EnableAspectJAutoProxy
public class Bean_Config {

}
