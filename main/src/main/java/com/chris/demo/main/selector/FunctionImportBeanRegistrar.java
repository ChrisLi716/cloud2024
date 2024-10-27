package com.chris.demo.main.selector;

import com.chris.demo.function.one.FunctionOneApplication;
import com.chris.demo.function.two.FunctionTwoApplication;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class FunctionImportBeanRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        ImportBeanDefinitionRegistrar.super.registerBeanDefinitions(importingClassMetadata, registry);
        // 注册两个功能模块中标注了@ComponentScan的类为Bean
        // 定义一个Bean定义对象，传入第一个模块的@ComponentScan配置类
        GenericBeanDefinition functionOneScanBean = new GenericBeanDefinition();
        functionOneScanBean.setBeanClass(FunctionOneApplication.class);

        // 表示第二个模块的Bean定义对象
        GenericBeanDefinition functionTwoScanBean = new GenericBeanDefinition();
        functionTwoScanBean.setBeanClass(FunctionTwoApplication.class);

        // 将两个定义对象进行注册，这样上述两个类就会被注册为Bean
        registry.registerBeanDefinition("functionOneComponentScan", functionOneScanBean);
        registry.registerBeanDefinition("functionTwoComponentScan", functionTwoScanBean);
    }
}
