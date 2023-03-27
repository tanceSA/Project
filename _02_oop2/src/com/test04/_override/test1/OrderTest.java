package com.test04._override.test1;

/**
 * ClassName: OrderTest
 * Package: com.test04._override.test1
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/8 下午 02:19
 * @Version 1.0
 */
public class OrderTest {
    public void method1(){
        Order order = new Order();

        //order.orderPrivate = 1;   //Only in class
        order.oderDefault = 1;      //In Package
        order.oderProtected = 1;    //subclass
        order.oderPublic = 1;       //All

        //order.methodPrivate();
        order.methodDefault();
        order.methodProtected();
        order.methodPublic();
    }
}
