package com.test03.block.exer;

/**
 * ClassName: UserTest
 * Package: com.test03.block.exer
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/14 下午 03:31
 * @Version 1.0
 */
public class UserTest {
    public static void main(String[] args) {
        User u1 = new User();
        System.out.println(u1.getInfo());

        User u2 = new User("Tom","233456");
        System.out.println(u2.getInfo());
    }
}
