package com.test03.threadsafe.runnablesafe;

/**
 * ClassName: WindowsTest
 * Package: com.test03.threadsafe.runnablesafe
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/30 下午 03:48
 * @Version 1.0
 */
class SaleTicket implements Runnable {
    int ticket = 100;
    Object object = new Object();
    MyObj myObj = new MyObj();

    @Override
    public void run() {
        while (true) {
            //synchronized (object) {
            //synchronized (myObj) {
            synchronized (this) {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + "售票, 票號為:" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}

public class WindowsTest {
    public static void main(String[] args) {

        SaleTicket s = new SaleTicket();
        Thread t1 = new Thread(s, "窗口1");
        Thread t2 = new Thread(s, "窗口2");
        Thread t3 = new Thread(s, "窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}

class MyObj {

}