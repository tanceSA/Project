package com.test01.create.runnable;

/**
 * ClassName: EvenNumberTest
 * Package: com.test01.create.runnable
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/30 上午 09:09
 * @Version 1.0
 */
public class EvenNumberTest {

    public static void main(String[] args) {
        //③ 宣告當前實現類別的物件變數
        EvenNumberPrint print = new EvenNumberPrint();
        //④ 將此物件作為參數傳遞到Thread類別的建構子中，建立Thread類別的實體
        Thread t1 = new Thread(print);
        //⑤ Thread類別的的實體執行start():1.啟動執行緒 2.執行當前執行緒的run()方法
        t1.start();

        //再建立一個執行緒
        new Thread(print);

        //main方法對應的主執行緒的操作
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0)
                System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}

//① 建立一個實現Runnable介面的類別
class EvenNumberPrint implements Runnable {
    //② 實現介面中的run()方法
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0)
                System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}