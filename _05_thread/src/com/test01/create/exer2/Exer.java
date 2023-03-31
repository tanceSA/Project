package com.test01.create.exer2;

/**
 * ClassName: Exer
 * Package: com.test01.create.exer2
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/30 上午 09:42
 * @Version 1.0
 */
public class Exer {
    public static void main(String[] args) {
        A a  = new A();
        a.start(); //啟動執行緒，執行

        B b = new B(a);
        b.start();

    }
}

class A extends Thread{
    @Override
    public void run() {
        System.out.println("A.run()");
    }
}

class B extends Thread{
    private A a;

    public B(A a) {
        super(a);
    }

    @Override
    public void run() {
        System.out.println("B.run()");
    }
}
