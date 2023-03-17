package com.test06._abstract.exer1;

/**
 * ClassName: Circle
 * Package: com.test06.polymorphism.test3
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/13 下午 02:08
 * @Version 1.0
 */
public class Circle extends GeometricObject {
    private double radius;

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return 3.14 * radius * radius;
    }
}
