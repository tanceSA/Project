package com.test05.map;

import org.junit.Test;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * ClassName: TreeMapTest
 * Package: com.test05.map
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/4/13 上午 10:38
 * @Version 1.0
 */
public class TreeMapTest {
    @Test
    public void test1(){
        Map map = new TreeMap();

        map.put("CC",83);
        map.put("DD",65);
        map.put("AA",83);
        map.put("EE",58);
        map.put("BB",95);

        Set entrySet = map.entrySet();
        for(Object entry:entrySet){
            System.out.println(entry);
        }
    }

    @Test
    public void test2(){

        Map map = new TreeMap();

        User u1 = new User("Li",18);
        User u2 = new User("Chen",28);
        User u3 = new User("Lin",28);
        User u4 = new User("Yang",12);
        User u5 = new User("Wang",18);

        map.put(u1,83);
        map.put(u2,65);
        map.put(u3,83);
        map.put(u4,58);
        map.put(u5,95);

        Set entrySet = map.entrySet();
        for(Object entry:entrySet){
            System.out.println(entry);
        }
    }
    /*
    * 定制排序 Comparator
    * */
    @Test
    public void test3(){
        Comparator c = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 == o2){
                    return 0;
                }
                if(o1 instanceof User u1 && o2 instanceof  User u2){
                    int value = u1.name.compareTo(u2.name);
                    if(value!=0){
                        return value;
                    }
                    return u1.age- u2.age;
                }
                throw new RuntimeException("類型不匹配");
            }
        };


        Map map = new TreeMap(c);

        User u1 = new User("Li",18);
        User u2 = new User("Chen",28);
        User u3 = new User("Lin",28);
        User u4 = new User("Yang",12);
        User u5 = new User("Wang",18);

        map.put(u1,83);
        map.put(u2,65);
        map.put(u3,83);
        map.put(u4,58);
        map.put(u5,95);

        Set entrySet = map.entrySet();
        for(Object entry:entrySet){
            System.out.println(entry);
        }

    }
}
