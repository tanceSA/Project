package com.test01.use.exer1;

/**
 * ClassName: MyDate
 * Package: com.test01.use.exer1
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/4/14 下午 04:55
 * @Version 1.0
 */
public class MyDate implements Comparable<MyDate>{
    private int year;
    private int month;
    private int day;

    public MyDate() {
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

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

    @Override
    public String toString() {
        return ""+year + "\\"+ month + "\\" +day;
    }

    @Override
    public int compareTo(MyDate o) {
        int yearDstince  = this.getYear() - o.getYear();
        if(yearDstince!=0){
            return yearDstince;
        }
        int monthDstince = this.getMonth() - o.getMonth() ;
        if(monthDstince!=0){
            return monthDstince;
        }
        return  this.getDay() - o.getDay();
    }
}
