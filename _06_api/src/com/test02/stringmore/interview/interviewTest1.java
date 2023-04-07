package com.test02.stringmore.interview;

/**
 * ClassName: interviewTest1
 * Package: com.test02.stringmore.interview
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/4/7 上午 10:12
 * @Version 1.0
 */
public class interviewTest1 {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("A");
        StringBuilder b = new StringBuilder("B");

        operate(a, b);

        System.out.println(a + "," + b); //ABx,B
    }

    public static void operate(StringBuilder x, StringBuilder y) {
        x.append(y); // x = a = "A" -> "AB"
        y = x;       // y = x = a = "AB"
        y.append('x'); // y = x = a = ABx
    }
}


