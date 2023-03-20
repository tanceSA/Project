package com.test10.annotation;

/**
 * ClassName: AnnotationTest
 * Package: com.test10.annotation
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/20 上午 11:36
 * @Version 1.0
 */
public class AnnotationTest {
    public static void main(String[] args) {
        Student stu = new Student();
    }
}

class Person{
    String name;
    int age;

    public void eat(){
        System.out.println("Person eat");
    }
}

class Student extends Person{
    @Override
    public void eat() {
        System.out.println("Student eat");
    }
}
