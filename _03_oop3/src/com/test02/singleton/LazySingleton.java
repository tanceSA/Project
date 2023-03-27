package com.test02.singleton;

/**
 * ClassName: Singleton02
 * Package: package01
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/3 上午 09:17
 * @Version 1.0
 */
public class LazySingleton {
    public static void main(String[] args) {
        Lazy lazy1 = Lazy.getInstance();
        Lazy lazy2 = Lazy.getInstance();

        System.out.println("lazy1==lazy2 is "+(lazy1==lazy2));
    }
}

class Lazy {
    //1.
    private Lazy(){

    }

    //2.
    private static Lazy instance = null;

    //3.
    public static Lazy getInstance(){
        if(instance == null)
            instance = new Lazy();
        return instance;
    }
}