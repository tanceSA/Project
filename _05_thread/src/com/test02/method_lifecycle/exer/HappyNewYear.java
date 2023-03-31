package com.test02.method_lifecycle.exer;

/**
 * ClassName: HappyNewYear
 * Package: com.test02.method_lifecycle.exer
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/30 下午 04:44
 * @Version 1.0
 */
public class HappyNewYear {
    public static void main(String[] args) {

        new Thread(new HappyNewYearThread()).start();

    }
}

class HappyNewYearThread implements Runnable {
    @Override
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("新年快樂!");
    }
}
