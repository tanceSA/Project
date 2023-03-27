package com.test05._super.test2;

/**
 * ClassName: A
 * Package: com.test05._super.test2
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/13 上午 10:01
 * @Version 1.0
 */
public class A {
    public A() {
        System.out.println("A");
    }
    public A(B b){
        this();
        System.out.println("AB");
    }
}
