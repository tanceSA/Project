package com.test07._object.equals.apply;

/**
 * ClassName: CustomerTest
 * Package: com.test07._object.equals.apply
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/13 下午 04:33
 * @Version 1.0
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer c1 = new Customer("Tom",12,new Account(2000));
        Customer c2 = new Customer("Tom",12,new Account(2000));

        System.out.println(c1.equals(c2));
    }
}
