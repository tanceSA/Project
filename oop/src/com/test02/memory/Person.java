package com.test02.memory;

/**
 * ClassName: Person
 * Package: com.test02.memory
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/3 下午 01:04
 * @Version 1.0
 */
public class Person{

    //屬性
    String name;//姓名
    int age=3;//年齡
    char gender;//性別

    //建構子
    public Person(){
        setAge(5);;
    }
    public Person(String s){
        setName(s);
        setAge(5);
    }

    //方法

    public void setName(){
        this.name = "NONAME";
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void eat(){

    }

    public void sleep(){

    }

    public void work(){

    }

}

