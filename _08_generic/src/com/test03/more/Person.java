package com.test03.more;

import java.util.Objects;

/**
 * ClassName: Person
 * Package: com.test03.more
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/4/18 下午 02:35
 * @Version 1.0
 */
public class Person <T>{
    private String name;
    private int age;
    private T t;

    public Person() {
    }

    public Person(String name, int age, T t) {
        this.name = name;
        this.age = age;
        this.t = t;
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

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", t=" + t +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person<?> person = (Person<?>) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(t, person.t);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, t);
    }
}
