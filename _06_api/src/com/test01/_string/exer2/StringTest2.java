package com.test01._string.exer2;

import org.junit.Test;

/**
 * ClassName: StringTest
 * Package: com.test01._string.exer3
 * Description:
 * 获取一个字符串在另一个字符串中出现的次数。
 *               比如：获取“ ab”在 “abkkcadkabkebfkabkskab” 中出现的次数
 * @Author: TANCE
 * @Create 2023/4/6 下午 03:17
 * @Version 1.0
 */
public class StringTest2 {
    @Test
    public void test1(){
        String str = "abkkcadkabkebfkabkskab";
        int count = getCount(str,"ab");
        System.out.println(count);
    }
    public int getCount(String str, String subStr) {
        if (str.length() >= subStr.length()) {
            int count = 0, index = 0;
            while ((index = str.indexOf(subStr, index))!=-1) {
                System.out.println(index);
                index += subStr.length();
                count++;
            }
            return count;
        } else {
            return 0;
        }


    }
}
