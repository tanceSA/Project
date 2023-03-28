package com.test04._throw;

/**
 * ClassName: ThrowTest
 * Package: com.test04._throw
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/28 上午 09:20
 * @Version 1.0
 */
public class ThrowTest {
    public static void main(String[] args) {
        Student student = new Student();
        try {
            student.method1(10);
            student.method1(-10);
            System.out.println(student);
        }catch (RuntimeException e){
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }

        try {
            student.method2(10);
            student.method2(-10);
            System.out.println(student);
        }catch (Exception e){
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }

        try {
            student.method3(10);
            student.method3(-10);
            System.out.println(student);
        }catch (Exception e){
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}

class Student{
    int id;

    public void method1(int id){
        if(id>0){
            this.id = id;
        }else{
            //手動拋出例外
            throw new RuntimeException("RuntimeException");
        }
    }
    public void method2(int id) throws Exception{
        if(id>0){
            this.id = id;
        }else{
            //手動拋出例外
            throw new Exception("Exception");
        }
    }

    public void method3(int id) throws Exception{
        if(id>0){
            this.id = id;
        }else{
            //手動拋出例外
            throw new BelowZeroException("BelowZeroException");
        }
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}