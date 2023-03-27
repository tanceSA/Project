package com.test06._abstract.exer2;

/**
 * ClassName: SalariedEmployee
 * Package: com.test06._abstract.exer2
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/17 上午 09:48
 * @Version 1.0
 */
public class SalariedEmployee  extends Employee{
    private int monthlySalary;


    public SalariedEmployee() {
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public SalariedEmployee(String name, int number, MyDate birthday, int monthlySalary) {
        super(name, number, birthday);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double earings() {
        return monthlySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{"+super.toString()+"}";
    }
}
