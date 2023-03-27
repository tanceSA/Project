package com.test05._super.test1;

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

    public Person() {
        this.age = 4;
    }

    public Person(int age) {
        this.age = age;
    }

    int age = 1;

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
}
