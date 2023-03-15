package com.test04._override.test2;

import com.test04._override.test1.Order;

/**
 * ClassName: OrderTest
 * Package: com.test04._override.test2
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/8 下午 04:07
 * @Version 1.0
 */
public class OrderTest {
    public void method() {
        Order order = new Order();

        //order.orderPublic = 1;
        //order.orderDefault = 1;
        //order.orderProtected = 1;
        order.oderPublic = 1;

        //order.methodPrivate();
        //order.methodDefault();
        //order.methodProtected();
        order.methodPublic();

    }
}
