package com.test11.wrapper.interview;

/**
 * ClassName: InterviewTest1
 * Package: com.test11.wrapper.interview
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/23 下午 03:00
 * @Version 1.0
 */
public class InterviewTest1 {
    public static void main(String[] args) {
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i==j);

        Integer m = 1;//Integer.valueOf(1);
        Integer n = 1;//Integer.valueOf(1);
        System.out.println(m==n);

        Integer x = 128;
        Integer y = 128;
        System.out.println(x==y);
    }
}
