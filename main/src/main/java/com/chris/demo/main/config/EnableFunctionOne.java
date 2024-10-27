package com.chris.demo.main.config;

import com.chris.demo.function.one.FunctionOneApplication;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 结合@Import注解，实现注解控制功能模块1是否启用
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(FunctionOneApplication.class)
public @interface EnableFunctionOne {
}
