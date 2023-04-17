package com.test01.use.exer1;

/**
 * ClassName: Employee
 * Package: com.test01.use.exer1
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/4/14 下午 04:55
 * @Version 1.0
 */
public class Employee implements Comparable<Employee>{
    private String name;
    private int age;
    private MyDate brithday;
    public Employee() {
    }

    public Employee(String name, int age, MyDate brithday) {
        this.name = name;
        this.age = age;
        this.brithday = brithday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MyDate getBrithday() {
        return brithday;
    }

    public void setBrithday(MyDate brithday) {
        this.brithday = brithday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", brithday=" + brithday +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.getName());
    }
}
