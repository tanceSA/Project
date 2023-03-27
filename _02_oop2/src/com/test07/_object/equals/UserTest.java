package com.test07._object.equals;

/**
 * ClassName: UserTest
 * Package: com.test07._object.equals
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/13 下午 03:52
 */
public class UserTest {
    public static void main(String[] args) {

        User u1 = new User("喬治",17);
        User u2 = new User("喬治",17);

        System.out.println(u1.equals(u2));

        String s1 = new String("Hello");
        String s2 = new String("Hello");

        System.out.println(s1.equals(s2));
    }
}

