package com.test08._inner;

/**
 * ClassName: OuterClassTest
 * Package: com.test08._inner
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/17 下午 02:44
 * @Version 1.0
 */
public class OuterClassTest {
    public static void main(String[] args) {
        //1.靜態內部類實例
        Person.Dog dog = new Person.Dog();
        dog.eat();

        //2.動態內部類實例
        Person p = new Person();
        Person.Bird bird =  p.new Bird();
        bird.eat();
        bird.show("Main");
    }
}
class Person{
    String name= "Tom";
    int age = 18;
    //
    static class Dog{   //靜態成員內部類別
        public void eat(){
            System.out.println("Dog.eat()");
        }
    }

    class Bird{
        String name = "Bird";
        public void eat(){
            System.out.println("Bird.eat()");
        }

        public void show(String name){
            System.out.println("age = "+age);
            System.out.println(name);
            System.out.println(this.name);
            System.out.println(Person.this.name);


        }
    }

    public void method(){
        class InnerClass1{

        }
    }
}
