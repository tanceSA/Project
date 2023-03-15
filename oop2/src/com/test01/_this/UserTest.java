package com.test01._this;

/**
 * ClassName: UserTest
 * Package: com.test01._this
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/6 下午 02:40
 * @Version 1.0
 */
public class UserTest {
    public static void main(String[] args) {
        User u1 = new User("Lewis",20,"u1@email.com");
        System.out.println(u1.getName());
        System.out.println(u1.getAge());
        System.out.println(u1.getEmailAddress());
    }


}

class User {
    private String name;
    private int age;
    private String emailAddress;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public User() {

    }

    public User(String name) {
        this.name = name;
    }

    public User(String name, int age) {
        this(name);//this()必須寫在首行
        this.age = age;
    }

    public User(String name, int age, String emailAddress) {
        this(name, age);
        this.emailAddress = emailAddress;
    }
}
