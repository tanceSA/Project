package com.test01.create.thread;

/**
 * ClassName: EvenNumberTest
 * Package: com.test01.create.thread
 * Description:
 * 建立一個子執行緒1，用於遍歷100以內的偶數
 *
 * @Author: TANCE
 * @Create 2023/3/30 上午 08:24
 * @Version 1.0
 */
public class EvenNumberTest {
    public static void main(String[] args) {
        //③ 建立當前Thread的子類的物件
        printNumber t1 = new printNumber();

        //④ 通過物件執行start()
        t1.start();

        //t1.run()無法替代t1.start()
        t1.run();

        //不能讓已經start()的執行緒再次執行start()，會產生例外IllegalThreadStateException
//        try {
//            t1.start();
//        } catch (IllegalThreadStateException e) {
//            e.printStackTrace();
//        }

        printNumber t2 = new printNumber();
        t2.start();

        //main執行緒 執行的操作
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0)
                System.out.println(Thread.currentThread().getName()+":"
                        +Thread.currentThread().getPriority()+":"+i);

            if(i == 20){
                try {
                    t2.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

//① 建立一個繼承於Thread類別的子類別
class printNumber extends Thread {
    //② 重寫Thread類別的run()方法 ---> 將此執行緒要執行的操作寫在此方法中
    @Override
    public void run() {

        for (int i = 1; i <= 100; i++) {
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (i % 2 == 0)
                System.out.println(Thread.currentThread().getName()+":"
                        +Thread.currentThread().getPriority()+":"+i);
        }
    }
}