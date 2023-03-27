package com.test05._super.test1;

/**
 * ClassName: Student
 * Package: com.test04._override.test3
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/9 上午 09:56
 * @Version 1.0
 */
public class Student extends Person {
   int age = 3;
   public Student(int age){
       super(age);
   }
    protected void sleep(){
        System.out.println("Student Sleep");
    }
    public void sleep1()
    {
        super.sleep();
    }

    public int sleep(int h){
        return h+2;
    }


    public Student info(){
        return null;
    }

    public int getAge(){
        return this.age;
    }

    public int getAge2(){
        return super.age;
    }
}
