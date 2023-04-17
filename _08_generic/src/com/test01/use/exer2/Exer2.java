package com.test01.use.exer2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

/**
 * ClassName: Exer2
 * Package: com.test01.use.exer2
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/4/17 上午 10:04
 * @Version 1.0
 */
public class Exer2 {
    /*
    *   (1) 建立一個ArrayList集合,指定泛型為<Integer>

        (2) 新增5個[0,100)以內的隨機整數到集合中

        (3) 使用foreach 遍歷輸出5個整數

        (4)使用集合的removeIf()方法刪除偶數, 為Predicate介面指定泛型<Integer>

        (5) 再使用Iterator迭代器輸出剩下的元素，為Iterator介面指定泛型<Integer>
    */
    public static void main(String[] args) {
        //(1) 建立一個ArrayList集合,指定泛型為<Integer>
        ArrayList<Integer> integers = new ArrayList<>();

        //(2) 新增5個[0,100)以內的隨機整數到集合中
        integers.add((int) (Math.random() * 100));
        integers.add((int) (Math.random() * 100));
        integers.add((int) (Math.random() * 100));
        integers.add((int) (Math.random() * 100));
        integers.add((int) (Math.random() * 100));
        integers.add(0);

        //(3) 使用foreach 遍歷輸出5個整數
        for (Integer value : integers
        ) {
            System.out.println(value);
        }

        //(4)使用集合的removeIf()方法刪除偶數, 為Predicate介面指定泛型<Integer>
        integers.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer value) {
                return value % 2 == 0;
            }
        });
        System.out.println("-----");
        //(5) 再使用Iterator迭代器輸出剩下的元素，為Iterator介面指定泛型<Integer>
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
}
}
