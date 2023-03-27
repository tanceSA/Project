package com.test05._super.test1;

/**
 * ClassName: StudentTest
 * Package: com.test05._super
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/9 上午 10:49
 * @Version 1.0
 */
public class SuperTest {
    public static void main(String[] args) {
        Student student = new Student(25);
        int age;
        age = student.getAge();
        System.out.println(age);
        age = student.getAge2();
        System.out.println(age);
    }
}
