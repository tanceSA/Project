package com.test09._enum.apply;

/**
 * ClassName: Employee
 * Package: com.test09._enum.apply
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/20 上午 10:24
 * @Version 1.0
 */
public class Employee {

    private String name;
    private int age;
    private Status status;

    public Employee() {
    }

    public Employee(String name, int age, Status status) {
        this.name = name;
        this.age = age;
        this.status = status;

    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", name=" + name +
                ", status=" + status +
                '}';
    }
}
