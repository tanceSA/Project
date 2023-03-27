package com.test11.wrapper.interview;

/**
 * ClassName: InterviewTest3
 * Package: com.test11.wrapper.interview
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/23 下午 03:22
 * @Version 1.0
 */
public class InterviewTest3 {
    public static void main(String[] args) {
        Object obj = true? new Integer(1):new Double(2.0);
        System.out.println(obj);
    }
}
