package com.test01.collection;

import org.junit.Test;

import java.util.*;

/**
 * ClassName: CollectionTest
 * Package: com.tance.collection
 * Description: Test Collection method
 *
 * @Author: TANCE
 * @Create 2023/3/3 上午 10:07
 * @Version 1.0
 */
public class CollectionTest {
    /*
    （1）add(E obj)：添加元素对象到当前集合中 （
    2）addAll(Collection other)：添加other集合中的所有元素对象到当前集合中，即this = this ∪ other
     */
    @Test
    public void test() {
        Collection collection = new ArrayList();
        collection.add("AA");
        collection.add(123);
        collection.add(new Object() {
            @Override
            public String toString() {
                return "Object";
            }
        });
        collection.add(new Person("name", 20));

        System.out.println(collection);
        System.out.println(collection.size());

        Collection collection1 = new ArrayList();
        collection1.add("BB");
        collection1.add(888);

        collection.addAll(collection1);

        System.out.println(collection);
        System.out.println(collection.size());
    }
    /*
    （3）int size()：获取当前集合中实际存储的元素个数
    （4）boolean isEmpty()：判断当前集合是否为空集合
    （5）boolean contains(Object obj)：判断当前集合中是否存在一个与obj对象equals返回true的元素
    （6）boolean containsAll(Collection coll)：判断coll集合中的元素是否在当前集合中都存在。即coll集合是否是当前集合的“子集”
    （7）boolean equals(Object obj)：判断当前集合与obj是否相等
     */

    @Test
    public void test2() {
        Collection collection = new ArrayList();
        collection.add("AA");
        collection.add(128);
        collection.add(new String("滷蛋"));
        collection.add(new Person("name", 20));

        System.out.println(collection.isEmpty());

        System.out.println(collection.contains("AA"));
        System.out.println(collection.contains(128));
        System.out.println(collection.contains(new String("滷蛋")));
        System.out.println(collection.contains(new Person("name", 20)));

        Collection collection1 = new ArrayList();
        collection1.add("AA");
        collection1.add(new String("滷蛋"));

        System.out.println(collection.containsAll(collection1));


    }

    /*
    （8）void clear()：清空集合元素
    （9） boolean remove(Object obj) ：从当前集合中删除第一个找到的与obj对象equals返回true的元素。
    （10）boolean removeAll(Collection coll)：从当前集合中删除所有与coll集合中相同的元素。即this = this - this ∩ coll
    （11）boolean retainAll(Collection coll)：从当前集合中删除两个集合中不同的元素，
         使得当前集合仅保留与coll集合中的元素相同的元素，即当前集合中仅保留两个集合的交集，即this = this ∩ coll；
     */
    @Test
    public void test3() {
        Collection collection = new ArrayList();
        collection.add("AA");
        collection.add("AA");
        collection.add(128);
        String s1 = new String("滷蛋");
        collection.add(s1);
        Person p1 = new Person("name", 20);
        collection.add(p1);
        System.out.println(collection);

//        collection.clear();
//        System.out.println(collection);
//        System.out.println(collection.size());//0

        //remove(Object obj
        collection.remove(p1);
        System.out.println(collection);

        collection.remove("AA");
        System.out.println(collection);

        Collection collection1 = new ArrayList();
        collection1.add("AA");
        collection1.add("AA");
        collection1.add(128);

        collection.removeAll(collection1);
        System.out.println(collection);

    }
    /*
    （12）Object[] toArray()：返回包含当前集合中所有元素的数组
    （13）hashCode()：获取集合对象的哈希值
    （14）iterator()：返回迭代器对象，用于集合遍历
     */
    @Test
    public void test4(){
        Collection collection = new ArrayList();
        collection.add("AA");
        collection.add(123);
        collection.add(new String("滷蛋"));
        collection.add(new Person("name", 20));

        Object[] objects = collection.toArray();
        System.out.println(Arrays.toString(objects));

        System.out.println(collection.hashCode());
    }

    @Test
    public void test5(){
      String[] arr = new String[]{"AA","BB","CC"};
        Collection list  = Arrays.asList(arr);
        System.out.println(list);
    }

    @Test
    public void test6(){
        Integer[] integers = new Integer[]{1,2,3};
        List list1 = Arrays.asList(integers);
        System.out.println(list1.size());//3

        int[] ints = new int[]{1,2,3};
        List list2 = Arrays.asList(ints);
        System.out.println(list2.size());//1

    }

}

