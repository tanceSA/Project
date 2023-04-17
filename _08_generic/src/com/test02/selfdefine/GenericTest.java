package com.test02.selfdefine;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * ClassName: GenericTest
 * Package: com.test02.selfdefine
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/4/17 上午 10:24
 * @Version 1.0
 */
public class GenericTest {
    @Test
    public void test1() {
        Person p1 = new Person();
        //Person<String> p1= new Person<>();

    }

    @Test
    public void test2() {
        //泛型參數在指明時，不可使用基本資料型態，但可以使用封裝類別替代
        //Order<int> order1 = new Order<>();

        //實體化時，可以宣告泛型參數的型態，宣告型態後，在泛型類別內使用到泛型參數的位置，都替換為宣告的型態
        Order<Integer> order2 = new Order<>();
        order2.setT(123);
        Integer t = order2.getT();

        Order<String> order3 = new Order<>();
        order3.setT("AA");
        String s = order3.getT();
    }

    //測試Order的子類別
    //public class SubOrder1 extends Order
    @Test
    public void test3() {
        //實體化SubOrder1
        //SubOrder1<Integer> sub1 = new SubOrder1<>(); //SubOrder1不是泛型類別，編譯錯誤
        SubOrder1 sub1 = new SubOrder1();
        Object obj = sub1.getT();   //繼承Oder時未定指定泛型資料型態，預設為Object

    }

    //public class SubOrder2 extends Order<Integer>
    @Test
    public void test4() {
        //SubOrder2<Integer> = new SubOrder2<>();   //SubOrder2不是泛型類別，編譯錯誤
        SubOrder2 sub2 = new SubOrder2();
        Integer i = sub2.getT();    //繼承Oder時指定泛型資料型態為Integer
    }

    //public class SubOrder3 <T> extends Order<T>
    @Test
    public void test5() {
        SubOrder3<Integer> sub3 = new SubOrder3<>();
        sub3.show(123);

        var sub3S = new SubOrder3<String>();
        sub3S.show("AA");

        SubOrder4<String> sub4 = new SubOrder4<>();
        Integer t = sub4.getT();
        String e = sub4.getE();
    }

    //public class SubOrder5<T,E> extends Order<T>
    @Test
    public void test6(){
        SubOrder5<String,Integer> sub5 = new SubOrder5<>("AA",33,123);
    }

    //測試泛型方法
    @Test
    public void test7(){
        Order<String> order = new Order<>();
       Integer[] intArr = new Integer[]{1,4,8,7};
       ArrayList<Integer> list = order.copyArrayToList(intArr);
       list.add(9);

       Iterator<Integer> it = list.iterator();
       while (it.hasNext()){
           System.out.println(it.next());
       }
    }
}
