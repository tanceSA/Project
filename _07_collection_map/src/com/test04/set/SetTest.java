package com.test04.set;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * ClassName: SetTest
 * Package: com.test04.set
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/4/12 上午 10:44
 * @Version 1.0
 */
public class SetTest {
    @Test
    public void test1(){
        Set set = new HashSet();

        set.add("AA");
        set.add(new Person("Asuka",24));
        set.add("11");
        set.add("BB");

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    @Test
    public void test2(){
        Set set = new LinkedHashSet();

        set.add("AA");
        set.add(new Person("Asuka",24));
        set.add("11");
        set.add("BB");

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

