package com.test03.list.exer2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * ClassName: ListTest
 * Package: com.test03.list.exer2
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/4/12 上午 10:05
 * @Version 1.0
 */
public class ListTest {
    public static void main(String[] args) {

        //需求1:隨機產生30個字母，放到ArrayList中
        List list = new ArrayList<>();

        for (int i = 0; i < 30; i++) {

            list.add((char) (Math.random() * 26 + 97) + "");

        }
        System.out.println(list);

        System.out.println("a:"+listTest(list, "a"));
        System.out.println("b:"+listTest(list, "b"));
        System.out.println("c:"+listTest(list, "c"));

    }

    //需求2:用listTest統計，a、b、c、x元素的出現次數
    public static int listTest(Collection list, String s) {

        int count=0;

        Iterator it = list.iterator();

        while (it.hasNext()) {
            Object o = it.next();
            if(s.equals(o)){
                count++;
            }
        }
        return count;
    }
}
