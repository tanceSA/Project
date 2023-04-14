package com.test03.list.exer1;

import java.util.Objects;

/**
 * ClassName: Student
 * Package: com.test03.list.exer1
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/4/12 上午 09:03
 * @Version 1.0
 */
public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
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
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age);
//    }
}
