package com.test04._override.test3;

/**
 * ClassName: Person
 * Package: com.test04._override.test3
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/9 上午 09:56
 * @Version 1.0
 */
public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void sleep(){
        System.out.println("Person Sleep");
    }

    int sleep(int h){
        return h+1;
    }

    public Person() {
    }

    public Person info(){
        return null;
    }
}
