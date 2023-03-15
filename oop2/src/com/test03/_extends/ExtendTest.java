package com.test03._extends;

/**
 * ClassName: ExtendTest
 * Package: com.test03._extends
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/8 上午 11:20
 * @Version 1.0
 */
public class ExtendTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.sleep();
        System.out.println(p1.toString());

        Student s1 = new Student();
        s1.sleep();
        s1.showAge();


    }
}
