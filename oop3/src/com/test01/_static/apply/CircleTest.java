package com.test01._static.apply;

/**
 * ClassName: CircleTest
 * Package: com.test01._static.apply
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/14 下午 02:20
 * @Version 1.0
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1.getId());

        Circle c2 = new Circle();
        System.out.println(c2.getId());

        Circle c3 = new Circle();
        System.out.println(c3.getId());

        Circle.showTotal();

    }
}
class Circle{
    private static int total;
    private  double radius;

    public int getId() {
        return id;
    }

    public double getRadius() {
        return radius;
    }

    public static void showTotal() {
        System.out.println(total);
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    private int id;

    private static int init = 1001;
    public Circle() {
        this.id = init++;
        total++;
    }
}
