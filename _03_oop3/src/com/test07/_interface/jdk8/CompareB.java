package com.test07._interface.jdk8;

/**
 * ClassName: CompareB
 * Package: com.test07._interface.jdk8
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/17 下午 02:16
 * @Version 1.0
 */
public interface CompareB {
    public default void method2(){
        System.out.println("CompareB.method2()");
    }

    public default void method4(){
        System.out.println("Compareb.method4()");
    }
    public default void method5(){
        System.out.println("Compareb.method5()");
    }
}
