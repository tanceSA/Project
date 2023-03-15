package com.test04._override.test3;

/**
 * ClassName: Student
 * Package: com.test04._override.test3
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/9 上午 09:56
 * @Version 1.0
 */
public class Student extends Person{
    protected void sleep(){
        System.out.println("Student Sleep");
    }

    public int sleep(int h){
        return h+2;
    }

    public Student info(){
        return null;
    }
}
