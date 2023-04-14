package com.test04.set;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * ClassName: TreeSetTest
 * Package: com.test04.set
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/4/12 上午 11:40
 * @Version 1.0
 */
public class TreeSetTest {
    @Test
    public void test1(){

        TreeSet set = new TreeSet();

        set.add("DD");
        set.add("BB");
        set.add("AA");
        set.add("EE");

        //set.add(87); ClassCastException: String cannot be cast to Integer

        Iterator it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

    //自然排序
    @Test
    public void test2(){
        TreeSet set = new TreeSet();

        User u1 = new User("Li",18);
        User u2 = new User("Chen",28);
        User u3 = new User("Lin",28);
        User u4 = new User("Yang",12);
        User u5 = new User("Wang",18);

        set.add(u1);
        set.add(u2);
        set.add(u3);
        set.add(u4);
        set.add(u5);

        Iterator it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
    //定制排序
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

        TreeSet set = new TreeSet(c);

        User u1 = new User("Li",18);
        User u2 = new User("Chen",28);
        User u3 = new User("Lin",28);
        User u4 = new User("Yang",12);
        User u5 = new User("Wang",18);

        set.add(u1);
        set.add(u2);
        set.add(u3);
        set.add(u4);
        set.add(u5);

        Iterator it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
