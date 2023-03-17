package com.test06._abstract.exer2;

/**
 * ClassName: Employee
 * Package: com.test06._abstract.exer2
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/17 上午 09:40
 * @Version 1.0
 */
public abstract class Employee {
    private String name;
    private int number;

    private MyDate birthday;


    public Employee() {
    }

    public Employee(String name, int number, MyDate birthday) {
        this.name = name;
        this.number = number;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public abstract double earings();

    public String toString() {
        return "name = " + name + ", number =" + number + ", birthday = " + birthday.toDateString();
    }
}
