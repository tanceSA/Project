package com.test03.threadsafe.threadsafe;

import java.awt.*;

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
    static Object obj = new Object();
    public wSaleTicket(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true){
            //synchronized (this) {
            //synchronized (obj) {
            synchronized (Window.class) {
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
}
public class WindowTest {
    public static void main(String[] args) {
        wSaleTicket w1 = new wSaleTicket("窗口1");
        wSaleTicket w2 = new wSaleTicket("窗口2");
        wSaleTicket w3 = new wSaleTicket("窗口3");

        w1.start();
        w2.start();
        w3.start();

    }


}
class MyObj {

}