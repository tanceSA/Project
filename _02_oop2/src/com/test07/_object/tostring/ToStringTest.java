package com.test07._object.tostring;


/**
 * ClassName: ToStringTest
 * Package: com.test07._object.tostring
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/13 下午 04:57
 * @Version 1.0
 */
public class ToStringTest {
    public static void main(String[] args) {
        User u1 = new User("Jack",18);
        System.out.println(u1.toString());//com.test07._object.equals.User@3b9a45b3
        System.out.println(u1);           //com.test07._object.equals.User@3b9a45b3
    }
}
