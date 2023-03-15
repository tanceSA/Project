package com.test02.singleton;

/**
 * ClassName: Singleton01
 * Package: package01
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/3 上午 09:17
 * @Version 1.0
 */
public class GreedSingleton {
    public static void main(String[] args) {
        Greed bank1 = Greed.getInstance();
        Greed bank2 = Greed.getInstance();

        System.out.println("bank1==bank2  is "+(bank1==bank2));
    }
}
class Greed {
    private Greed(){

    }

    private static Greed instance = new Greed();

    public static Greed getInstance(){
        return instance;
    }
}