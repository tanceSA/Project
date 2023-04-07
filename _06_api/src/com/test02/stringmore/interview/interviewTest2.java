package com.test02.stringmore.interview;

/**
 * ClassName: interveiwTest2
 * Package: com.test02.stringmore.interview
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/4/7 上午 10:19
 * @Version 1.0
 */
public class interviewTest2 {
    public static void stringReplace(String text){ //text =  textString = "java".addr
        text =text.replace('j','i');//text = "iava".addr, textString = "java".addr
    }
    public static void bufferReplace(StringBuffer text){ //text = textBuffer = "java".addr
        text.append("C"); //text = textBuffer = "javaC".addr
        text = new StringBuffer("Hello"); //text = "Hello".addr , textBuffer = "javaC".addr
        text.append("World!"); //text = "HelloWorld".addr , textBuffer = "javaC".addr
    }

    public static void main(String[] args) {
        String textString = new String("java");
        StringBuffer textBuffer = new StringBuffer("java");

        stringReplace(textString);//java
        bufferReplace(textBuffer); //javaC

        System.out.println(textString + textBuffer); //javajavaC
    }
}
