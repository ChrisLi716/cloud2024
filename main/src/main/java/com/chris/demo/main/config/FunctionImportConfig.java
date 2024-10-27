package com.chris.demo.main.config;

import com.chris.demo.main.selector.FunctionImportBeanRegistrar;
import com.chris.demo.main.selector.FunctionImportSelector;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
// @Import(FunctionOneApplication.class) //通过@Import导入功能模块1[FunctionOneApplication]中的扫描起点
@Import(FunctionImportSelector.class) // 通过@Import导入ImportSelector的实现类，并获取其返回值，根据返回值指定的全限定类名引入相关的类，并初始化为Bean
// @Import(FunctionImportBeanRegistrar.class) // 通过@Import导入ImportSelector的实现类，并获取其返回值，根据返回值指定的全限定类名引入相关的类，并初始化为Bean
public class FunctionImportConfig {
}
