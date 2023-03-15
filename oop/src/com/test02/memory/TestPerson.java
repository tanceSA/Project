package com.test02.memory;

/**
 * ClassName: TestPerson
 * Package: com.test02.memory
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/3 下午 01:08
 * @Version 1.0
 */
public class TestPerson {
    public static void main(String[] args) {

        Person p1 = new Person(); //p1:stack
        //p1.name = "Jack"; //heap:
        p1.setName("Jack");
        //p1.age = 30;//heap
        p1.setAge(30);
        //p1.gender ='男';//heap
        p1.setGender('男');

        System.out.println("p1 = " + p1);
        System.out.println("name = " + p1.name + ", age= " + p1.age + ", gender = " + p1.gender);

        Person p2 = new Person();
        p2.name = "Mary";
        p2.age = 20;
        p2.gender = '女';
        System.out.println("p2 = " + p2);
        System.out.println("name = " + p2.name + ", age= " + p2.age + ", gender = " + p2.gender);

        Person p3 = p1;
        System.out.println("p3 = " + p3);
        System.out.println("name = " + p3.name + ", age= " + p3.age + ", gender = " + p3.gender);

        Person p4 = new Person();
        p4.name = p2.name;
        p4.age = p2.age;
        p4.gender = p2.gender;
        System.out.println("p4 = " + p4);
        System.out.println("name = " + p4.name + ", age= " + p4.age + ", gender = " + p4.gender);

        Person p5 = new Person("Allen");
        System.out.println("name = " + p5.name + ", age= " + p5.age + ", gender = " + p5.gender);

        Person p6 = new Person();
        p6.setName();
        System.out.println("name = " + p6.name + ", age= " + p6.age + ", gender = " + p6.gender);


    }
}
