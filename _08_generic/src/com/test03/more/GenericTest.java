package com.test03.more;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: GenericTest
 * Package: com.test03.more
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/4/18 下午 02:31
 * @Version 1.0
 */
public class GenericTest {
    @Test
    public void test1(){
        Object object = null;
        String string = null;
        object = string;

        Object[] objects = null;
        String[] strings = null;
        object = strings;

    }
    @Test
    public void test2(){
        ArrayList<Object> objectArrayList= null;
        ArrayList<String> stringArrayList = null;
        //objectArrayList = stringArrayList;

        /*
        * 反證法
        * */

    }
    @Test
    public void test3(){
        Person<Object> person1 = null;
        Person<String> person2 = null;

        //person1 = person2;

    }
    @Test
    public void test4(){
        List<String> list = null;
        ArrayList<String> arrayList = new ArrayList<>();

        list = arrayList;
    }


}
