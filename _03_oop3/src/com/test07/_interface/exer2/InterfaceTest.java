package com.test07._interface.exer2;

/**
 * ClassName: InterfaceTest
 * Package: com.test07._interface.exer2
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/17 下午 01:33
 * @Version 1.0
 */
public class InterfaceTest {
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(5);
        ComparableCircle c2 = new ComparableCircle(2.2);
        System.out.println(c1.compareTo(c2));
    }
}
