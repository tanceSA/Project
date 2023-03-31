package com.test03.threadsafe.threadsafe;

/**
 * ClassName: WindowTest1
 * Package: com.test03.threadsafe.notsafe
 * Description:
 * 使用繼承Thread方式
 *
 * @Author: TANCE
 * @Create 2023/3/30 下午 03:19
 * @Version 1.0
 */
class wSaleTicket1 extends Thread {
    static int ticket = 100;
    static boolean isFlag = true;

    public wSaleTicket1(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (isFlag) {
            sale();
        }
    }

     private static synchronized void sale(){ //此時同步監視器:當前類別本身 即為windows.class

         if (ticket > 0) {
             try {
                 Thread.sleep(10);
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }
             System.out.println(Thread.currentThread().getName() + "售票, 票號為:" + ticket);
             ticket--;
         } else {
             isFlag = false;
         }

    }
}

public class WindowTest1 {
    public static void main(String[] args) {
        wSaleTicket1 w1 = new wSaleTicket1("窗口1");
        wSaleTicket1 w2 = new wSaleTicket1("窗口2");
        wSaleTicket1 w3 = new wSaleTicket1("窗口3");

        w1.start();
        w2.start();
        w3.start();

    }
}