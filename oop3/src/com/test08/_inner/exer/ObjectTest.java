package com.test08._inner.exer;

/**
 * ClassName: ObjectTest
 * Package: com.test08._inner.exer
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/17 下午 03:59
 * @Version 1.0
 */
public class ObjectTest {
    public static void main(String[] args) {
        new Object(){
            public void test(){
                System.out.println("ObjectTest");
            }
        }.test();

    }
}
