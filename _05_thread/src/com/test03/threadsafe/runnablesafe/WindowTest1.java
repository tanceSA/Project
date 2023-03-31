package com.test03.threadsafe.runnablesafe;

/**
 * ClassName: WindowTest1
 * Package: com.test03.threadsafe.runnablesafe
 * Description:
 *  使用同步方法解決runnablesafe介面 執行緒安全問題
 *
 * @Author: TANCE
 * @Create 2023/3/30 下午 04:12
 * @Version 1.0
 */
class SaleTicket1 implements Runnable {
    int ticket = 100;
    Object object = new Object();
    MyObj myObj = new MyObj();

    boolean isFlag =true;
    @Override
    public void run() {

        while (isFlag) {
            sale();
        }
    }
    private synchronized void sale(){
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + "售票, 票號為:" + ticket);
            ticket--;
        } else {
            isFlag = false;
        }

    }
}


public class WindowTest1 {
    public static void main(String[] args) {
        SaleTicket1 s = new SaleTicket1();
        Thread t1 = new Thread(s, "窗口1");
        Thread t2 = new Thread(s, "窗口2");
        Thread t3 = new Thread(s, "窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
