package com.test03._extends;

/**
 * ClassName: Person
 * Package: com.test03._extends
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/8 上午 11:18
 * @Version 1.0
 */
public class Person {
    String name;
    private int age = 3;

    public void sleep(){
        System.out.println("Person Sleep");
    }

    public int getAge() {
        return age;
    }
}
