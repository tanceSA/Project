package com.test06.polymorphism.test1;

/**
 * ClassName: Senshi
 * Package: com.test06.polymorphism.test1
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/13 上午 11:18
 * @Version 1.0
 */
public class Senshi extends Character{
    @Override
    public int getId() {
        return id;
    }

    private int id  = 1002;
    public void attack(){
        System.out.println("戰士揮劍攻擊");
    }
}
