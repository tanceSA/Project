package com.test04.field;

/**
 * ClassName: FieldTest
 * Package: com.test04.field
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/14 下午 03:42
 * @Version 1.0
 */
public class FieldTest {
    public static void main(String[] args) {
        Order order = new Order();
        System.out.println(order.orderId);
    }
}
class Order{
    int orderId = 1;
    static int orderId2;

    {
        orderId = 2;
    }
    public Order(){
        orderId = 3;
    }
}
