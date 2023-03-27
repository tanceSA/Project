package com.test03.method;

/**
 * ClassName: MethodTest
 * Package: com.test03.method
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/3 下午 01:44
 * @Version 1.0
 */
public class MethodTest {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.name = "Jhon";
        p1.age = 27;
        p1.gender = '男';
        p1.show();
        String info = p1.interests("打球");
        System.out.println(info);
        p1.addAge(2);
        p1.show();

    }
}

class Person{

    String name;
    int age;
    char gender;

    public void eat(){

    }

    public void sleep(int hour){

    }

    public String interests(String hobby){

        return "hobby is "+hobby;

    }

    public int getAge(){
        return age;
    }

    public void show(){
        System.out.println("name = "+name +", age= " + age + ", gender = " + gender);
    }

    public void addAge(int addage){
        age += addage;
    }
}
