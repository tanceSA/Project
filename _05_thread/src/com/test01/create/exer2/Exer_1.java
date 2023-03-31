package com.test01.create.exer2;

/**
 * ClassName: Exer_1
 * Package: com.test01.create.exer2
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/30 上午 09:58
 * @Version 1.0
 */
public class Exer_1 {
    public static void main(String[] args) {
        BB b = new BB();
        new Thread(b).start();
        new Thread(b){
            @Override
            public void run() {
                System.out.println("CC");
            }
        }.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("DD");
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("DD");
            }
        }){
            @Override
            public void run() {
                System.out.println("EE");
            }
        }.start();
    }
}

class AA extends Thread{
    @Override
    public void run() {
        System.out.println("AA");
    }
}

class BB implements Runnable{
    @Override
    public void run() {
        System.out.println("BB");
    }
}