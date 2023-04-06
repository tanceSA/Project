package com.test01._string;

import org.junit.Test;

import java.io.UnsupportedEncodingException;

/**
 * ClassName: StringConstructorTest
 * Package: com.test01._string
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/4/6 上午 11:40
 * @Version 1.0
 */
public class StringMethodTest {
    @Test
    public void test1() {
        String s1 = new String();
        String s2 = new String("");
        String s3 = new String(new char[]{'a', 'b', 'c'});//abc
        String s4 = new String(new byte[]{97, 98, 99});//abc
    }

    /**
     * String 與 常見的其他結構之間的轉換
     * <p>
     * 1.String與基本資料型態、類別型態之間的轉換(複習)
     * <p>
     * 2.String與char[]之間的轉換
     *
     * 3.String與byte[]之間的轉換
     */
    @Test
    public void test2() {
        //基本資料型態 -> String
        int num = 20;
        //方式1
        String s1 = num + "";
        //方式2
        String s2 = String.valueOf(num);

        //String -> 基本資料型態
        String s3 = "20";
        int i1 = Integer.parseInt(s3);


    }

    @Test
    public void test3(){
        String s1 = "hello";

        //String --> char[]
        char[] arr = s1.toCharArray();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }

        System.out.println();

        //char[] --> String
        String s2 = new String(arr);
        System.out.println(s2);
    }

    /**
     * 在utf-8字元集中 一個漢字佔用3個byte, 一個字母佔用1個byte
     * 在gbk字元集中   一個漢字佔用2個byte
     *
     * utf-8 或 gbk都向下相容ascii
     *
     * 編碼與解碼
     *  編碼： Sting ---> 字元或字元陣列
     *  解碼： 字元或字元陣列 ---> String
     * 要求：解碼時使用的字元集, 必須與編碼使用的字元集相同
     */
    @Test
    public void test4() throws UnsupportedEncodingException {
        String s1 = "hello台灣";

        byte[] arr = s1.getBytes();
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        byte[] arr1 = s1.getBytes("gbk");
        for (int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }

        String s2 = new String(arr);
    }
}


