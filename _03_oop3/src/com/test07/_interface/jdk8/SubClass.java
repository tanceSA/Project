package com.test07._interface.jdk8;

/**
 * ClassName: SubClass
 * Package: com.test07._interface.jdk8
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/17 下午 02:05
 * @Version 1.0
 */
public class SubClass extends SuperClass implements CompareA,CompareB{
    @Override
    public void method2() {
        CompareA.super.method2();
    }

    @Override
    public void method3() {
        System.out.println("SubClass.method3()");
    }
    public void method5() {
        System.out.println("SubClass.method5()");
    }

    public void method(){
        super.method5();
        CompareB.super.method5();
        this.method5();
    }
}
