package com.test06._abstract.exer1;

/**
 * ClassName: GeometricObject
 * Package: com.test06.polymorphism.test3
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/13 下午 02:06
 * @Version 1.0
 */
public abstract class GeometricObject {
    protected String color;
    protected double weight;

    protected GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public abstract double findArea();
}
