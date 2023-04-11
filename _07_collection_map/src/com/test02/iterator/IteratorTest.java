package com.test02.iterator;

import com.test01.collection.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * ClassName: IteratorTest
 * Package: com.test02.iterator
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/4/11 下午 03:15
 * @Version 1.0
 */
public class IteratorTest {
    @Test
    public void test1() {
        Collection collection = new ArrayList();
        collection.add("AA");
        collection.add(128);
        collection.add(new String("滷蛋"));
        collection.add(new Person("name", 20));
        collection.add("AA");

        //取得迭代器物件
        Iterator iterator = collection.iterator();

        //方式1
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());//超出序列中物件個數會產生 NoSuchElementException例外

        //方式2
//        for(int i=0;i<collection.size();i++){
//            System.out.println(iterator.next());
//        }

        //方式3:
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    @Test
    public void test2() {

        Collection collection = new ArrayList();
        collection.add("AA");
        collection.add(128);
        collection.add(new String("滷蛋"));
        collection.add(new Person("name", 20));
        collection.add("AA");

        //方式1:錯誤的遍歷
//        Iterator iterator = collection.iterator();
//        while (collection.iterator()!=null){
//            System.out.println(iterator.next());
//        }

        //方式2:錯誤的遍歷
//        while (collection.iterator().hasNext()){
//            System.out.println(iterator.next());
//        }

    }
}
