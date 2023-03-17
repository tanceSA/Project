package com.test06._abstract.exer2;

/**
 * ClassName: HourlyEmployee
 * Package: com.test06._abstract.exer2
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/17 上午 09:52
 * @Version 1.0
 */
public class HourlyEmployee extends Employee{
    private double wage;
    private int hour;

    public HourlyEmployee(String name, int number, MyDate birthday, double wage, int hour) {
        super(name, number, birthday);
        this.wage = wage;
        this.hour = hour;
    }

    public HourlyEmployee() {
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public double earings() {
        return wage*hour;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{"+super.toString()+"}";
    }
}
