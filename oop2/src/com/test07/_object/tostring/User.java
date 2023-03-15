package com.test07._object.tostring;

/**
 * ClassName: User
 * Package: com.test07._object.tostring
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/14 上午 10:32
 * @Version 1.0
 */
public class User {
    private String name;
    private int age;
    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

//手動
    //    @Override
//    public String toString() {
//        return "User{ name = "+ name + ", age = " + age +" }";
//    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
