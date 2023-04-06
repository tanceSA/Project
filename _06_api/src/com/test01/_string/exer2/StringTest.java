package com.test01._string.exer2;

import org.junit.Test;

/**
 * ClassName: StringTest
 * Package: com.test01._string.exer2
 * Description:
 * 将一个字符串进行反转。将字符串中指定部分进行反转。比如“ab`cdef`g”反转为”ab`fedc`g”
 * @Author: TANCE
 * @Create 2023/4/6 下午 02:37
 * @Version 1.0
 */
public class StringTest {
    @Test
    public void test1() {
        String s1 = "abcdefg";
        String s2 = reverse(s1, 2, 5);
        String s3 = reverse1(s1, 2, 5);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }

    public String reverse(String str, int start, int end) {
        if (str != null) {
            char[] src_arr = str.toCharArray();
            for (int i = start, j = end; i < j; i++, j--) {
                char temp = src_arr[i];
                src_arr[i] = src_arr[j];
                src_arr[j] = temp;
            }
            return new String(src_arr);
        }
        return null;
    }

    public String reverse1(String str, int start, int end) {
        StringBuffer buffer = new StringBuffer(str.substring(0, start));
        //buffer.append(new StringBuffer(str.substring(start, end + 1)).reverse());
        for(int i=end;i>=start;i--){
            buffer.append(str.charAt(i));
        }
        buffer.append(str.substring(end + 1, str.length()));
        return buffer.toString();
    }
}
