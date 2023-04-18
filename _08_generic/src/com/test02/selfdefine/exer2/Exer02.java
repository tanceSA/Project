package com.test02.selfdefine.exer2;

import org.junit.Test;

import java.util.Arrays;

/**
 * ClassName: Exer02
 * Package: com.test02.selfdefine.exer2
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/4/18 下午 02:02
 * @Version 1.0
 */
public class Exer02 {

    //编写一个泛型方法，实现任意引用类型数组指定位置元素交换。
    public static <E> void method1(E[] e, int a, int b) {
        E temp = e[a];
        e[a] = e[b];
        e[b] = temp;
    }
    @Test
    public void test1(){
        Integer[] integers = new Integer[]{0,1,2,3,4,5,6};
        method1(integers, 2,5);
        System.out.println(Arrays.toString(integers));

        String[] strings =  new String[]{"6","5","4","3","2","1","0"};
        method1(strings, 6,2);
        System.out.println(Arrays.toString(strings));
    }

    //编写一个泛型方法，接收一个任意引用类型的数组，并反转数组中的所有元素
    public static <E> void method2( E[] e){
        for(int i=0,j=e.length-1;i<j;i++,j--){
            E temp = e[i];
            e[i] = e[j];
            e[j] = temp;
        }
    }
    @Test
    public void test2(){
        Integer[] integers = new Integer[]{0,1,2,3,4,5,6};
        method2(integers);
        System.out.println(Arrays.toString(integers));

        String[] strings =  new String[]{"6","5","4","3","2","1","0"};
        method2(strings);
        System.out.println(Arrays.toString(strings));
    }
}
