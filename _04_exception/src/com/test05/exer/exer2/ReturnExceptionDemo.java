package com.test05.exer.exer2;

/**
 * ClassName: RunTimeExceptionDemo
 * Package: com.test05.exer.exer2
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/28 上午 10:10
 * @Version 1.0
 */
public class ReturnExceptionDemo {
    public static void main(String[] args) {
        try {
            methodA();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        methodB();
    }
    static void methodA() throws Exception{
        try{
            System.out.println("進入方法A");
            throw new Exception("創造例外");
        }finally {
            System.out.println("執行A方法的finally");
        }
    }

    static void methodB(){
        try {
            System.out.println("進入方法B");
            return;
        }finally {
            System.out.println("執行B方法的finally");
        }
    }
}
