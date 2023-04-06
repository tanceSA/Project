package com.test01._string;

import org.junit.Test;

/**
 * ClassName: StringDemo
 * Package: com.test01._string
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/4/6 上午 10:01
 * @Version 1.0
 */
public class StringDemo {
    @Test
    public void test1() {
        String s1 = "hello"; //字串的定義方式
        String s2 = "hello";
        System.out.println(s1 == s2);
    }

    /**
     * String的不可變特性
     * ① 當對字串變數重新賦值時, 需要重新指定一個字串位址進行賦值
     * ② 當對現有自字進行拼接操作時,需重新開辟空間保存拼接的字串
     * ③ 使用String.replace()替換現有的某個字元時，需重新開辟空間保存拼接的字串
     */
    @Test
    public void test2() {
        String s1 = "hello";
        String s2 = "hello";
        s2 = "hi";

        System.out.println(s1);
    }

    @Test
    public void test3() {
        String s1 = "hello";
        String s2 = "hello";

        s2 += "world";

        System.out.println(s2);
    }

    @Test
    public void test4() {
        String s1 = "hello";
        String s2 = "hello";

        String s3 = s2.replace("l","w");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}


