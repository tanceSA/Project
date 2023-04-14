package com.test06.collections;

import org.junit.Test;

import java.util.*;

/**
 * ClassName: CollectionsTest
 * Package: com.test06.collections
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/4/13 下午 02:40
 * @Version 1.0
 */
public class CollectionsTest {
    /*
    * 排序操作：
        reverse(List)：反转 List 中元素的顺序
        shuffle(List)：对 List 集合元素进行随机排序
        sort(List)：根据元素的自然顺序对指定 List 集合元素按升序排序
        sort(List，Comparator)：根据指定的 Comparator 产生的顺序对 List 集合元素进行排序
        swap(List，int， int)：将指定 list 集合中的 i 处元素和 j 处元素进行交换
    * */
    @Test
    public void test1() {
        List list = Arrays.asList(78, 69, 70, 88, 85, 40, 38, 59, 100, 77);
        System.out.println(list);

        //反轉
        Collections.reverse(list);
        System.out.println(list);

        //隨機排列
        Collections.shuffle(list);
        System.out.println(list);

        //自然排序
        Collections.sort(list);
        System.out.println(list);

        //定制排序
        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 == o2) {
                    return 0;
                }
                if (o1 instanceof Integer i1 && o2 instanceof Integer i2) {
                    return i2.compareTo(i1);
                }
                throw new RuntimeException("類型錯誤");
            }
        });
        System.out.println(list);
    }

    /*
    * 查找
        Object max(Collection)：根据元素的自然顺序，返回给定集合中的最大元素
        Object max(Collection，Comparator)：根据 Comparator 指定的顺序，返回给定集合中的最大元素
        Object min(Collection)：根据元素的自然顺序，返回给定集合中的最小元素
        Object min(Collection，Comparator)：根据 Comparator 指定的顺序，返回给定集合中的最小元素
        int binarySearch(List list,T key)在List集合中查找某个元素的下标，但是List的元素必须是T或T的子类对象，而且必须是可比较大小的，即支持自然排序的。而且集合也事先必须是有序的，否则结果不确定。
        int binarySearch(List list,T key,Comparator c)在List集合中查找某个元素的下标，但是List的元素必须是T或T的子类对象，而且集合也事先必须是按照c比较器规则进行排序过的，否则结果不确定。
        int frequency(Collection c，Object o)：返回指定集合中指定元素的出现次数
    * */
    @Test
    public void test2() {
        List list = Arrays.asList(78, 69, 70, 88, 85, 40, 38, 59, 100, 77);
        System.out.println(list);

        System.out.println(Collections.max(list));

        System.out.println(Collections.max(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 == o2) {
                    return 0;
                }
                if (o1 instanceof Integer i1 && o2 instanceof Integer i2) {
                    return i2.compareTo(i1);
                }
                throw new RuntimeException("類型錯誤");
            }
        }));
    }

    @Test
    public void test3() {
        List src = Arrays.asList(78, 69, 70, 88, 85, 40, 38, 59, 100, 77);

        //錯誤的寫法
//        List dest = new ArrayList();
//        Collections.copy(dest,src);//java.lang.IndexOutOfBoundsException: Source does not fit in dest

        //正確的寫法
        List dest = Arrays.asList(src.size());
        Collections.copy(dest, src);
    }

    @Test
    public void test4() {
        //提供了多个unmodifiableXxx()方法，该方法返回指定 Xxx的不可修改的视图。

        List list = new ArrayList();
        //list可以寫入數據
        list.add(12);
        list.add(34);
        list.add(56);
        System.out.println("list");
        System.out.println(list);
        System.out.println("list.add(78)");
        list.add(78);
        System.out.println(list);

        System.out.println("listCopy = Collections.unmodifiableList(list);");
        List listCopy = Collections.unmodifiableList(list);
        System.out.println(listCopy);

        System.out.println("listCopy.add(9);");
        //listCopy.add(9); UnsupportedOperationException
    }

    @Test
    public void test5(){
        List list = new ArrayList();
        //list可以寫入數據
        list.add(12);
        list.add(34);
        list.add(56);

        List syncronizedlist = Collections.synchronizedList(list);
    }
}
