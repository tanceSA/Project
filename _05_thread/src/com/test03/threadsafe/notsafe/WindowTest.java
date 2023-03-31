package com.test03.threadsafe.notsafe;

/**
 * ClassName: WindowTest
 * Package: com.test03.threadsafe.notsafe
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/30 下午 02:49
 * @Version 1.0
 */
class SaleTicket implements Runnable{
     int ticket = 100;
    @Override
    public void run() {
        while (true){
            if(ticket>0){
                System.out.println(Thread.currentThread().getName()+"售票, 票號為:"+ticket);
                ticket--;
            }
            else {
                break;
            }
        }
    }
}
public class WindowTest {
    public static void main(String[] args) {

        SaleTicket s = new SaleTicket();
        Thread t1 = new Thread( s,  "窗口一");
        Thread t2 = new Thread( s,  "窗口二");
        Thread t3 = new Thread( s,  "窗口三");

        t1.start();
        t2.start();
        t3.start();

    }
}
