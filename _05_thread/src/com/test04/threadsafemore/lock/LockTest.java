package com.test04.threadsafemore.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * ClassName: WindowTest1
 * Package: com.test03.threadsafe.notsafe
 * Description:
 *  使用繼承Thread方式
 * @Author: TANCE
 * @Create 2023/3/30 下午 03:19
 * @Version 1.0
 */
class wSaleTicket extends Thread{
    static int ticket = 100;
    //1. 建立Lock實體, 需要確保多個執行緒共用同一個Lock實體,需要考慮將此變數宣告為static final
    private static final ReentrantLock lock = new ReentrantLock();
    public wSaleTicket(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true){
            try {
                //2. 執行lock()方法, 鎖定對共用資源存取
                lock.lock();

                if(ticket>0){
                    System.out.println(Thread.currentThread().getName()+"售票, 票號為:"+ticket);
                    ticket--;
                }
                else {
                    break;
                }
            } finally {
                //3. 執行unlock()方法,解除鎖定共用資源存取
                lock.unlock();
            }
        }
    }
}
public class LockTest {
    public static void main(String[] args) {
        wSaleTicket w1 = new wSaleTicket("窗口一");
        wSaleTicket w2 = new wSaleTicket("窗口二");
        wSaleTicket w3 = new wSaleTicket("窗口三");

        w1.start();
        w2.start();
        w3.start();

    }


}
