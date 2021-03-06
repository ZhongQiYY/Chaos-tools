package com.jk.common.annotation;

import java.lang.annotation.*;

/**
 * 忽略Token验证注解
 *
 * @author 缪隽峰
 * @version 1.0
 * @date 2019年12月25日
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface KrtIgnoreAuth {

    /**
     * 忽略Token参数 (有token就验证 没有就不验证)
     */
    boolean ignoreToken() default true;
}
