package com.test07._interface.exer3;

/**
 * ClassName: Bicycle
 * Package: com.test07._interface.exer3
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/17 下午 01:43
 * @Version 1.0
 */
public class Bicycle extends Vehicle{
    public Bicycle(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void run() {
        System.out.println("Bicycle.run()");
    }
}
