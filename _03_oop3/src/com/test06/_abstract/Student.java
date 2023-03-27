package com.test06._abstract;

/**
 * ClassName: Student
 * Package: com.test06._abstract
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/16 下午 02:25
 * @Version 1.0
 */
public class Student extends Person{
    String School;

    public Student(String name, int age, String school) {
        super(name, age);
        School = school;
    }

    public Student() {
    }

    @Override
    public void sleep() {
        super.sleep();
    }


    public void eat() {
        System.out.println("Student eat");
    }

    public void study(){}
}
