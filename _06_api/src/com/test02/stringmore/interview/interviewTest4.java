package com.test02.stringmore.interview;

/**
 * ClassName: interviewTest4
 * Package: com.test02.stringmore.interview
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/4/7 上午 10:38
 * @Version 1.0
 */
public class interviewTest4 {
    public static void main(String[] args) {
        String str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str); //append(null) = appendNull() = "Null:

        System.out.println(sb.length()); //4

        System.out.println(sb); //"null"

        StringBuffer sb1 = new StringBuffer(str); //NullPointerException: Cannot invoke "String.length()" because "str" is null
        System.out.println(sb1);
    }

}
