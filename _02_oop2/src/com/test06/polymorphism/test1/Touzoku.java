package com.test06.polymorphism.test1;

/**
 * ClassName: Touzoku
 * Package: com.test06.polymorphism.test1
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/13 上午 11:19
 * @Version 1.0
 */
public class Touzoku extends Character{
    private int id  = 1003;

    @Override
    public int getId() {
        return id;
    }

    public void attack(){
        System.out.println("盜賊短刀刺擊");
    }
}
