package com.test05.exer.exer1;

/**
 * ClassName: Circle
 * Package: com.test07._interface.exer2
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/17 上午 11:43
 * @Version 1.0
 */
public class Circle {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
