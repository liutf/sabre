package com.sabre.common.aop;

import java.lang.annotation.*;

/**
 * FileName: ControllerLog
 * Description: 自定义注解 拦截Controller
 * Version: v1.0.0
 * Author: liutf
 * Date: 2017-02-21
 */
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ControllerLog {

    String description() default "";

}
