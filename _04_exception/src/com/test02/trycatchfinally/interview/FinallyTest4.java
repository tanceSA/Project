package com.test02.trycatchfinally.interview;

/**
 * ClassName: FinallyTest4
 * Package: com.test02.trycatchfinally.interview
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/27 下午 03:26
 * @Version 1.0
 */
public class FinallyTest4 {
    public static void main(String[] args) {
        int result = test(10);
        System.out.println(result);
    }

    public static int test(int num) {
        try {
            return num;
        }catch (NumberFormatException e){
            return --num;
        }finally {
            System.out.println("Test End");
            return ++num;
        }
    }
}
