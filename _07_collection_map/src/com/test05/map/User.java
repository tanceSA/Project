package com.test05.map;

/**
 * ClassName: Person
 * Package: com.test01.collection
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/4/11 下午 03:17
 * @Version 1.0
 */
public class User implements Comparable {
    public String name;
    int age;

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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (this == o) {
            return 0;
        }
        if (o instanceof User u) {
            int value = this.age-u.age;
            if(value!=0){
                return value;
            }
            return this.name.compareTo(u.name);
        }
        else
            throw new RuntimeException("類型不匹配");
    }
}

