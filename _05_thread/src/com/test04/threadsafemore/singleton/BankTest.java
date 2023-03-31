package com.test04.threadsafemore.singleton;

import java.awt.*;

/**
 * ClassName: BankTest
 * Package: com.test04.threadsafemore.singleton
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/31 上午 09:18
 * @Version 1.0
 */
public class BankTest {

    static Bank b1 = null;
    static Bank b2 = null;

    public static void main(String[] args) {

        long time1 = System.currentTimeMillis();
        Thread t1 = new Thread("執行緒001") {
            @Override
            public void run() {
                b1 = Bank.getInstance();
            }
        };
        t1.start();

        Thread t2 = new Thread("執行緒002") {
            @Override
            public void run() {
                b2 = Bank.getInstance();
            }
        };
        t2.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1 == b2);

        System.out.println(System.currentTimeMillis() - time1);
    }
}

class Bank {
    public Bank() {
    }

    private static volatile Bank instance = null;
//    //方式一
//    public static synchronized Bank getInstance() { //利用synchronized修飾子，以同步方法的方式解決同步安全問題
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        if (instance == null) {
//            instance = new Bank();
//        }
//        return instance;
//    }

//    //方式二
//    public static Bank getInstance() {
//        synchronized (Window.class) {
//            if (instance == null) {
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//                instance = new Bank();
//            }
//        }
//        return instance;
//    }

    //方式三,相較於方式一跟方式二來講，效率更高，為了避免出現指定重排，需要將instance宣告為volatile
    public static Bank getInstance() {
        if (instance == null) {
            synchronized (Window.class) {
                if (instance == null) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    instance = new Bank();
                }
            }
        }
        return instance;
    }

}