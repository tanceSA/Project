package com.test03.list;

import com.test01.collection.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ClassName: ListTest
 * Package: com.test03.list
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/4/11 下午 04:17
 * @Version 1.0
 */
public class ListTest {
    /*
    增
        add(Object obj)
        addAll(Collection coll)
    刪
        remove(Object obj)
        remove(int index)
    改
        set(int index, Object ele)
    查
        Object get(int index)
    插
        void add(int index, Object ele)
        boolean addAll(int index, Collection eles)
    長度
        size()
    遍歷
        iterator():使用迭代器
        增強for循環
        一般for循環
     */
    @Test
    public void test1(){
        List list = new ArrayList();

        // add(Object obj)
        list.add("AA");
        list.add("BB");
        list.add(333);
        list.add(new Person("P1",30));

        System.out.println(list);

        //void add(int index, Object ele)
        list.add(2,"CC");

        System.out.println(list);

        //boolean addAll(int index, Collection eles)
        list.addAll(3,Arrays.asList(111,222));

        System.out.println(list);
    }

    @Test
    public void test2(){

        List list = new ArrayList();

        list.add("AA");
        list.add("BB");
        list.add(333);
        list.add(2);
        list.add(new Person("P1",30));

        //list.remove(2);
        //System.out.println(list);

        list.remove(Integer.valueOf(2));
        System.out.println(list);

    }

    @Test
    public void test3(){

        List list = new ArrayList();

        list.add("AA");
        list.add("BB");
        list.add(333);
        list.add(2);
        list.add(new Person("P1",30));

        //遍歷方式1:使用迭代器
//        Iterator it = list.iterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }

        //遍歷方式2:增強for循環
//        for(Object o:list){
//            System.out.println(o);
//        }

        //遍歷方式3:一般for循環
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }
}
