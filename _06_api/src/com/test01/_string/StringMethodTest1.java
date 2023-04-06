package com.test01._string;

import org.junit.Test;

/**
 * ClassName: StringMethodTest1
 * Package: com.test01._string
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/4/6 下午 01:40
 * @Version 1.0
 */
public class StringMethodTest1 {
    /**
     * （1）boolean isEmpty()：字符串是否為空
     * （2）int length()：返回字符串的長度
     * （3）String concat(xx)：拼接
     * （4）boolean equals(Object obj)：比較字符串是否相等，區分大小寫
     * （5）boolean equalsIgnoreCase(Object obj)：比較字符串是否相等，不區分大小寫
     * （6）int compareTo(String other)：比較字符串大小，區分大小寫，按照Unicode編碼值比較大小
     * （7）int compareToIgnoreCase(String other)：比較字符串大小，不區分大小寫
     * （8）String toLowerCase()：將字符串中大寫字母轉為小寫
     * （9）String toUpperCase()：將字符串中小寫字母轉為大寫
     * （10）String trim()：去掉字符串前後空白符
     * （11）public String intern()：結果在常量池中共享
     */
    @Test
    public void test1() {
        String s1 = "";
        String s2 = new String();
        String s3 = new String("");

        System.out.println(s1.isEmpty());

        String s4 = null;
        //System.out.println(s4.isEmpty());//NullPointerException

        String s5 = "hello";
        System.out.println(s5.length());

    }

    @Test
    public void test2() {
        String s1 = "hello";
        String s2 = "HELLO";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        String s3 = "acBe";
        String s4 = "acbe";

        System.out.println(s3.compareTo(s4));
        System.out.println(s3.compareToIgnoreCase(s4));

        String s5 = "張ab";
        String s6 = "李ab";
        System.out.println(s5.compareTo(s6));

        String s7 = "  h el    l     o *   ";
        System.out.println(s7.trim());

    }

    /**
     * （12）boolean contains(xx)：是否包含xx
     * （13）int indexOf(xx)：从前往后找当前字符串中xx，即如果有返回第一次出现的下标，要是没有返回-1
     * （14）int indexOf(String str, int fromIndex)：返回指定子字符串在此字符串中第一次出现处的索引，从指定的索引开始
     * （15）int lastIndexOf(xx)：从后往前找当前字符串中xx，即如果有返回最后一次出现的下标，要是没有返回-1
     * （16）int lastIndexOf(String str, int fromIndex)：返回指定子字符串在此字符串中最后一次出现处的索引，从指定的索引开始反向搜索。
     */
    @Test
    public void test3() {
        String s1 = "斯普斯普斯普斯普";
        System.out.println(s1.contains("普"));//true

        System.out.println(s1.indexOf("普通"));//-1

        System.out.println(s1.indexOf("普"));//1
        System.out.println(s1.indexOf("普", 4));//5

        System.out.println(s1.lastIndexOf("普"));//7
        System.out.println(s1.lastIndexOf("普", 4));//3

    }

    /**
     * （17）String substring(int beginIndex) ：返回一个新的字符串，它是此字符串的从beginIndex开始截取到最后的一个子字符串。
     * （18）String substring(int beginIndex, int endIndex) ：返回一个新字符串，它是此字符串从beginIndex开始截取到endIndex(不包含)的一个子字符串。
     */
    @Test
    public void test4() {
        String s1 = "0123456789";
        System.out.println(s1.substring(4));
        System.out.println(s1.substring(3, 6));//[3,6)

    }

    /**
     * （19）char charAt(index)：返回[index]位置的字符
     * （20）char[] toCharArray()： 将此字符串转换为一个新的字符数组返回
     * （21）static String valueOf(char[] data)  ：返回指定数组中表示该字符序列的 String
     * （22）static String valueOf(char[] data, int offset, int count) ： 返回指定数组中表示该字符序列的 String
     * （23）static String copyValueOf(char[] data)： 返回指定数组中表示该字符序列的 String
     * （24）static String copyValueOf(char[] data, int offset, int count)：返回指定数组中表示该字符序列的 String
     * （25）boolean startsWith(xx)：测试此字符串是否以指定的前缀开始
     * （26）boolean startsWith(String prefix, int toffset)：测试此字符串从指定索引开始的子字符串是否以指定前缀开始
     * （27）boolean endsWith(xx)：测试此字符串是否以指定的后缀结束
     */
    @Test
    public void test5() {
        String s1 = "0123456789";
        System.out.println(s1.charAt(3));

        String s2 = String.valueOf(new char[]{97, 98, 99});
        String s3 = String.copyValueOf(new char[]{97, 98, 99});
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s2 == s3);//false

        System.out.println(s1.startsWith("012"));//ture
        System.out.println(s1.startsWith("12"));//false
        System.out.println(s1.startsWith("12",1));//ture

    }
    /**
     * （28）String replace(char oldChar, char newChar)：返回一个新的字符串，它是通过用 newChar 替换此字符串中出现的所有 oldChar 得到的。 不支持正则。
     * （29）String replace(CharSequence target, CharSequence replacement)：使用指定的字面值替换序列替换此字符串所有匹配字面值目标序列的子字符串。
     * （30）String replaceAll(String regex, String replacement)：使用给定的 replacement 替换此字符串所有匹配给定的正则表达式的子字符串。
     * （31）String replaceFirst(String regex, String replacement)：使用给定的 replacement 替换此字符串匹配给定的正则表达式的第一个子字符串。
     */
    @Test
    public void test6(){
        String s1 = "0123456789";
        String s2 = s1.replace("6","b");
        System.out.println(s1);
        System.out.println(s2);

        String s3 = s1.replace("012","210");
        System.out.println(s3);

    }

}
