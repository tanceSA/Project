package com.test06._abstract;

/**
 * ClassName: Person
 * Package: com.test06._abstract
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/16 上午 10:17
 * @Version 1.0
 */
public abstract class Person {
    String name;
    int age;
    public Person() {
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected abstract void eat();
    protected void sleep(){}
}

