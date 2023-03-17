package com.test08._inner;

/**
 * ClassName: OuterClassTest1
 * Package: com.test08._inner
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/17 下午 03:32
 * @Version 1.0
 */
public class OuterClassTest1 {
    public static void main(String[] args) {
        System.out.println(getInstance());
    }

    //區域內部類別的使用
    public void method1(){
        class A{

        }
    }

    //開發中常用方法
    public static Comparable getInstance(){
        //提供實現了 Comparable 的類別

//        //方式1: 提供了介面的實現類別的對象
//        class  MyComparable implements Comparable{
//
//            @Override
//            public int compareTo(Object o) {
//                return 0;
//            }
//        }
//        MyComparable m = new MyComparable();
//        return m;

//        //方式2 提供了介面的實現類別的匿名對象
//        class  MyComparable implements Comparable{
//
//            @Override
//            public int compareTo(Object o) {
//                return 0;
//            }
//        }
//        return new MyComparable();

//        //方式3: 提供了介面的匿名實現類別的對象
//        Comparable c = new Comparable() {
//            @Override
//            public int compareTo(Object o) {
//                return 0;
//            }
//        };
//        return c;

        //方式4: 提供了介面的匿名實現類別的匿名對象
        return new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }
}
