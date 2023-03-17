package com.test07._interface.jdk8;

/**
 * ClassName: SubClassTest
 * Package: com.test07._interface.jdk8
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/17 下午 02:05
 * @Version 1.0
 */
public class SubClassTest {
    public static void main(String[] args) {
        CompareA.method1();;
        SubClass s = new SubClass();
        //s.method1();  //Static method may be invoked on containing interface class only
        s.method2();
        s.method3();    //實現兩個介面中有相同定義的方法時，必須重寫
        s.method4();    //類別優先於介面:父類別與介面有相同定義的方法時，會執行父類別中的方法
        s.method();    //透過 super 及 介面名稱.super 關鍵字執行 被重寫的方法
    }
}
