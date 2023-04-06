package com.test01._string.exer2;

import org.junit.Test;

import java.util.Arrays;

/**
 * ClassName: StringTest
 * Package: com.test01._string.exer4
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/4/6 下午 03:39
 * @Version 1.0
 */
public class StringTest3 {
    @Test
    public void test1() {
        String str1 = "abcwerthelloyuiodef";
        String str2 = "cvhellobnm";
        String str3  = "abcwerthelloyuiodefabcwerthcvhellobnmyuiodef";

        String str = getMaxSameSubString(str1,str2);
        System.out.println(str);

        String[] strArr = getMaxSameSubString1(str3,str2);
        System.out.println(Arrays.toString(strArr));
    }

    public String getMaxSameSubString(String str1, String str2) {

        if (str1 != null && str2 != null) {
            String longStr, shortStr;
            if (str1.length() >= str2.length()) {
                longStr = str1;
                shortStr = str2;
            } else {
                longStr = str2;
                shortStr = str1;
            }
            int len = shortStr.length();
            for (int i = 0; i < len; i++) {
                for (int x = 0, y = len - i; y < len; x++, y++) {
                    if (longStr.contains(shortStr.substring(x, y))) {
                        return shortStr.substring(x, y);
                    }
                }
            }
        }
        return null;
    }

    public String[] getMaxSameSubString1(String str1, String str2) {

        if (str1 != null && str2 != null) {
            String longStr, shortStr;
            if (str1.length() > str2.length()) {
                longStr = str1;
                shortStr = str2;
            } else {
                longStr = str2;
                shortStr = str1;
            }
            int len = shortStr.length();
            System.out.println("len = "+len);
            StringBuffer strBuffer = new StringBuffer();
            for (int i = 0; i < len; i++) {
                for (int x = 0, y = len - i; y < len; x++, y++) {
                    String subStr = shortStr.substring(x, y+1);
                    System.out.println(subStr);
                    if (longStr.contains(subStr)) {
                        strBuffer.append(subStr+",");
                    }
                }
                if (strBuffer.length() != 0) {
                    break;
                }
            }
            return strBuffer.toString().split("\\,");
        }
        return null;
    }    
}
