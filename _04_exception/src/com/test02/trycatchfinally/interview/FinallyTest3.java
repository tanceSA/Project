package com.test02.trycatchfinally.interview;

/**
 * ClassName: FinallyTest3
 * Package: com.test02.trycatchfinally.interview
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/27 下午 03:24
 * @Version 1.0
 */
public class FinallyTest3 {
    public static void main(String[] args) {
        int result = test("a");
        System.out.println(result);
    }

    public static int test(String str){
        try{
            Integer.parseInt(str);
            return 1;
        }catch (NumberFormatException e){
            return -1;
        }finally {
            System.out.println("Test End");
            return 0;
        }
    }
}
