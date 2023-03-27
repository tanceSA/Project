package com.test06.polymorphism.test1;

/**
 * ClassName: Character
 * Package: com.test06.polymorphism.test1
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/13 上午 11:15
 * @Version 1.0
 */
public class Character {
    private String name;
    private String job;
    int id  = 1001;

    public void attack(){
        System.out.println("村民普通攻擊");
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public int getId() {
        return id;
    }
}
