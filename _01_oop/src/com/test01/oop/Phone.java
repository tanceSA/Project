package com.test01.oop;

/**
 * ClassName: phone
 * Package: com.test.oop
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/3 上午 11:40
 * @Version 1.0
 */
public class Phone {

    //屬性
    String name;
    double price;

    //方法
    public void call(){
        System.out.println("撥打電話");
    }

    public void sendMessage(){
        System.out.println("傳簡訊");
    }

    public void playMusic(){
        System.out.println("聽音樂");
    }
}
