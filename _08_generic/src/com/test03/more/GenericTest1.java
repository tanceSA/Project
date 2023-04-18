package com.test03.more;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: GenericTest1
 * Package: com.test03.more
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/4/18 下午 03:00
 * @Version 1.0
 */
public class GenericTest1 {
    /*
     * ?的使用
     * */
    @Test
    public void test1() {

        List<?> list = null;
        List<Object> objectList = null;
        List<String> stringList = null;

        list = objectList;
        list = stringList;

        method(objectList);
        method(stringList);
    }

    public static void method(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    @Test
    public void test2() {
        List<?> list = null;
        List<String> stringList = null;

        stringList.add("AA");

        list = stringList;

        //讀取資料(以集合為例說明)
        Object o = list.get(0);
        System.out.println(o);

        //寫入資料(以集合為例說明)
        //寫入資料失敗
//        list.add("BB");
        //特例:可以將null寫入集合中
        list.add(null);
    }

    /*
     * 測試有限制條件的通配符
     * ? extends A
     * ? super A
     * */
    @Test
    public void test3() {
        List<? extends Father> list = null;
        List<Object> objectList = null;
        List<Father> fatherList = null;
        List<Son> sonList = null;

//        list = objectList;
        list = fatherList;
        list = sonList;

    }


    /*
     * ? extends A 的讀寫
     * */
    @Test
    public void test3_1(){
        List<? extends Father> list = null;

        List<Father> fatherList = new ArrayList<>();
        fatherList.add(new Father());
        list = fatherList;

        //讀取
        Father father = list.get(0);

        //寫入:不可以
        list.add(null);
//        list.add(new Father());
//        list.add(new Son());
    }


    @Test
    public void test4() {
        List<? super Father> list = null;
        List<Object> objectList = null;
        List<Father> fatherList = null;
        List<Son> sonList = null;

        list = objectList;
        list = fatherList;
//        list = sonList;
    }

    @Test
    public void test4_1(){
        List<? super Father> list = null;
        List<Father> fatherList = null;
        fatherList.add(new Father());

        list = fatherList;

        //讀取
        Object object = list.get(0);

        //寫入:可以將Father及其子類增加
//        list.add(new Object());
        list.add(new Father());
        list.add(new Son());
    }

}
