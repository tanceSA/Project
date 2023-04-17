package com.test02.selfdefine;

import java.util.ArrayList;

/**
 * ClassName: Order
 * Package: com.test02.selfdefine
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/4/17 上午 10:34
 * @Version 1.0
 */
public class Order <T>{

    //宣告類的泛型參數以後，就可以在類別內部使用此泛型參數
    T t;
    int orderId;

    public Order() {
    }

    public Order(T t, int orderId) {
        this.t = t;
        this.orderId = orderId;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "t=" + t +
                ", orderId=" + orderId +
                '}';
    }

//    public static void method(){
//        System.out.println(t);
//    }

    public <E>E method (E e){
        E result = null;
        return result;
    }

    public <E> ArrayList<E> copyArrayToList (E[] arr){
        ArrayList<E> list = new ArrayList<>();
        for (E e: arr
             ) {
            list.add(e);
        }
        return list;
    }
}
