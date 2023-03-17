package com.test07._interface.exer3;

/**
 * ClassName: ElectricVehicle
 * Package: com.test07._interface.exer3
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/17 下午 01:46
 * @Version 1.0
 */
public class ElectricVehicle extends Vehicle implements IPower{
    public ElectricVehicle(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void run() {
        System.out.println("ElectricVehicle.run()");
    }

    @Override
    public void power() {
        System.out.println("ElectricVehicle.power()");
    }
}
