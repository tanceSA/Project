package com.test01.create.exer1;

/**
 * ClassName: PrintNumberTest
 * Package: com.test01.create.exer1
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/30 上午 08:47
 * @Version 1.0
 */
public class PrintNumberTest {
    public static void main(String[] args) {
        //方式1
//        EvenNumberPrint t1 = new EvenNumberPrint();
//        OddNumberPrint t2 = new OddNumberPrint();
//
//        t1.start();
//        t2.start();

        //方式2 建立匿名子類的匿名方法
        new Thread(){
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    if (i % 2 == 0)
                        System.out.println(Thread.currentThread().getName()+":"+i);
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    if (i % 2 != 0)
                        System.out.println(Thread.currentThread().getName()+":"+i);
                }
            }
        }.start();

        //方式3 使用Runnable介面的方式
        new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    if (i % 2 != 0)
                        System.out.println(Thread.currentThread().getName()+":"+i);
                }
            }
        }).start();
    }
}

class EvenNumberPrint extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0)
                System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}

class OddNumberPrint extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0)
                System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}