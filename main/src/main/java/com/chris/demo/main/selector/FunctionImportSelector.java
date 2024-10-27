package com.chris.demo.main.selector;

import cn.hutool.json.JSONUtil;
import com.chris.demo.function.one.FunctionOneApplication;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

@Slf4j
public class FunctionImportSelector implements ImportSelector {
    /**
     * 自定义导入某些类的逻辑
     *
     * @param importingClassMetadata 表示被标注@Import注解的类的元数据信息
     * @return 将需要导入的类的全限定名放在字符串数据返回，则会导入返回的数组中指定的类
     */
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        log.info("begin select import, importingClassMetadata:{}", JSONUtil.toJsonStr(importingClassMetadata));
        String[] importClsNames = new String[]{FunctionOneApplication.class.getName()};
        log.info("importClsNames:{}", JSONUtil.toJsonStr(importClsNames));
        return importClsNames;
    }
}
