package com.test07._object.tostring.exer;

/**
 * ClassName: GeometricObject
 * Package: com.test07._object.tostring.exer
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/14 上午 10:40
 * @Version 1.0
 */
public class GeometricObject {
    protected String color;
    protected double weight;

    public GeometricObject() {
        this.color = "white";
        this.weight = 1.0;
    }

    public GeometricObject(String color, double weight) {
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
}
