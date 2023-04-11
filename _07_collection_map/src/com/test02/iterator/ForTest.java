package com.test02.iterator;

import com.test01.collection.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ClassName: ForTest
 * Package: com.test02.iterator
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/4/11 下午 03:36
 * @Version 1.0
 */
public class ForTest {
    @Test
    public void test1(){
        Collection collection = new ArrayList();
        collection.add("AA");
        collection.add(128);
        collection.add(new String("滷蛋"));
        collection.add(new Person("name", 20));
        collection.add("AA");

        for (Object obj:collection
             ) {
            System.out.println(obj);
        }
    }
}
