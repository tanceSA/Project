package com.test06._abstract.exer2;

/**
 * ClassName: MyDate
 * Package: com.test06._abstract.exer2
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/17 上午 09:42
 * @Version 1.0
 */
public class MyDate {
    private int year;
    private int month;
    private int day;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public MyDate() {
    }

    public String toDateString(){
        return  year + "/" + month + "/" + day;
    }
}
