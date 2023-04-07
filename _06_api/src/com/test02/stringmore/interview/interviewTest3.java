package com.test02.stringmore.interview;

/**
 * ClassName: interviewTest3
 * Package: com.test02.stringmore.interview
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/4/7 上午 10:34
 * @Version 1.0
 */
public class interviewTest3 {
    public static void change(String s, StringBuffer sb) {
        s = "aaaa";
        sb.setLength(0);
        sb.append("aaaa");
    }

    public static void main(String[] args) {
        String s = "bbbb";
        StringBuffer sb = new StringBuffer("bbbb");
        change(s, sb);
        System.out.println(s + sb); //bbbbaaaa
    }
}
