package com.test05.communication;

/**
 * ClassName: PrintNumberTest
 * Package: com.test05.communication
 * Description:
 * 使用兩個執行緒列印1-100, 執行緒1與執行緒2交替列印
 *
 * @Author: TANCE
 * @Create 2023/3/31 下午 01:58
 * @Version 1.0
 */
class PrintNumber implements Runnable {
    private int number = 1;

    Object obj = new Object();
    //private final ReentrantLock lock = new ReentrantLock();
    @Override
    public void run() {
        while (true) {
            synchronized (obj) {
                obj.notify();
                if (number > 100)
                    break;
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + ":" + number++);

                try {
                    obj.wait(); //執行緒一旦執行此方法，就進入等待狀態。同時會釋放鎖定的物件
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class PrintNumberTest {
    public static void main(String[] args) {
        PrintNumber p = new PrintNumber();
        new Thread(p, "執行緒1").start();
        new Thread(p, "執行緒2").start();
    }
}
