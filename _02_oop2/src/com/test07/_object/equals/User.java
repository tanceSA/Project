package com.test07._object.equals;

import java.util.Objects;

/**
 * ClassName: User
 * Package: com.test07._object.equals
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/13 下午 04:59
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

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj instanceof User user) {
//            return name.equals(user.name) && age == user.age;
//        }
//        return false;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }
}
