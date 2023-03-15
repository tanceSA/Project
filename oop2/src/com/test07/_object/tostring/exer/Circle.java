package com.test07._object.tostring.exer;

/**
 * ClassName: Circle
 * Package: com.test07._object.tostring.exer
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/14 上午 10:46
 * @Version 1.0
 */
public class Circle extends GeometricObject {
    private double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, double weight) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea() {   //計算圓的面積
        return Math.PI * 3.14 * 3.14;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0;
    }

}
