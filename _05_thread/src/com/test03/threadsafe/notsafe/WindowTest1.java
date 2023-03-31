package com.test03.threadsafe.notsafe;

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

    public wSaleTicket(String name) {
        super(name);
    }

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
public class WindowTest1 {
    public static void main(String[] args) {
        wSaleTicket w1 = new wSaleTicket("窗口一");
        wSaleTicket w2 = new wSaleTicket("窗口二");
        wSaleTicket w3 = new wSaleTicket("窗口三");

        w1.start();
        w2.start();
        w3.start();

    }


}
