package com.test03._extends;

/**
 * ClassName: Student
 * Package: com.test03._extends
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/8 上午 11:18
 * @Version 1.0
 */
public class Student extends Person{
    String School;

    public void study(){
        System.out.println("Student Study");
    }

    public void showAge() {
        //System.out.println("Students age is "+age); //age' has private access
        System.out.println("Students age is "+getAge());
    }
}
