package com.test07._interface.exer3;

/**
 * ClassName: Car
 * Package: com.test07._interface.exer3
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/17 下午 01:45
 * @Version 1.0
 */
public class Car extends Vehicle implements IPower{
    private String carNumber;

    public Car(String brand, String color, String carNumber) {
        super(brand, color);
        this.carNumber = carNumber;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    @Override
    public void run() {
        System.out.println("Car.run()");
    }

    @Override
    public void power() {
        System.out.println("Car.power()");
    }
}
