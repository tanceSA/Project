package com.test10.annotation;

/**
 * ClassName: MyAnnotation
 * Package: com.test10.annotation
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/20 下午 01:32
 * @Version 1.0
 */
public @interface MyAnnotation {
    String value() default "null";
}
