package com.test01._string;

import org.junit.Test;

/**
 * ClassName: StringDemo1
 * Package: com.test01._string
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/4/6 上午 10:45
 * @Version 1.0
 */
public class StringDemo1 {
    @Test
    public void test1() {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        String s4 = new String("hello");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s3 == s4);

        System.out.println(s1.equals(s4));
    }

    @Test
    public void test2() {
        Person p1 = new Person();
        Person p2 = new Person();
        p1.name = "Tom";
        p2.name = "Tom";

        p1.name = "jerry";

        System.out.println(p2.name);
    }

    /**
     * 測試String 連接符號:+
     */
    @Test
    public void test3() {
        String s1 = "hello";
        String s2 = "world";

        String s3 = "helloworld";
        String s4 = "hello" + "world";
        String s5 = s1 + "world";
        String s6 = "hello" + s2;
        String s7 = s1 + s2;

        System.out.println(s3 == s4);
        System.out.println(s3 == s5);
        System.out.println(s3 == s6);
        System.out.println(s5 == s6);
        System.out.println(s5 == s7);
        System.out.println();
        String s8 = s5.intern();
        System.out.println(s3 == s8);
    }

    public void test4() {
        final String s1 = "hello";
        final String s2 = "world";

        String s3 = "helloworld";
        String s4 = "hello" + "world";
        String s5 = s1 + "world";
        String s6 = "hello" + s2;
        String s7 = s1 + s2;

        System.out.println(s3 == s4);
        System.out.println(s3 == s5);
        System.out.println(s3 == s6);
        System.out.println(s5 == s6);
        System.out.println(s5 == s7);
        System.out.println();
        String s8 = s5.intern();
        System.out.println(s3 == s8);
    }

    @Test
    public void test5() {
        String s1 = "hello";
        String s2 = "world";

        String s3 = s1.concat(s2);
        String s4 = "hello".concat("world");
        String s5 = s1.concat("world");

        System.out.println(s3 == s4);
        System.out.println(s3 == s5);
        System.out.println(s4 == s5);
    }

}

class Person {

    String name;
}