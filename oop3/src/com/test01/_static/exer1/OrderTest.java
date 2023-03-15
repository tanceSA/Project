package com.test01._static.exer1;

/**
 * ClassName: OrderTest
 * Package: com.test01._static.exer1
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/14 下午 02:39
 * @Version 1.0
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order = null;
        order.hello();
        System.out.println(order.count);

        Order order1 = new Order();
        System.out.println(order.count);
    }
}
class Order{
    public static int count=0;

    public Order() {
        count++;
    }

    public static void hello(){
        System.out.println("hello!");
    }
}