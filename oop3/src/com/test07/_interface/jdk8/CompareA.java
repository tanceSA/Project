package com.test07._interface.jdk8;

/**
 * ClassName: CompareA
 * Package: com.test07._interface.jdk8
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/17 下午 02:03
 * @Version 1.0
 */
public interface CompareA {
    //屬性 宣告為public static final

    //方法:jdk8之前只能宣告為抽象方法

    //方法
    public static void method1(){
        System.out.println("CompareA.method1()");
    }

    //方法:jdk8中 預設方法
    public default void method2(){
        System.out.println("CompareA.method2()");
    }
    public default void method3(){
        System.out.println("CompareA.method3()");
    }

    //jdk9新特性 private方法
    private void method5(){
        System.out.println("CompareA.method5()");
    }
}

