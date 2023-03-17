package com.test07._interface.exer3;

/**
 * ClassName: VehicleTest
 * Package: com.test07._interface.exer3
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/17 下午 01:53
 * @Version 1.0
 */
public class VehicleTest {
    public static void main(String[] args) {
        Developer developer = new Developer();
        Vehicle[] vehicles = new Vehicle[]{
                             new Bicycle("捷安特","紅色"),
                             new ElectricVehicle("特斯拉","黑色"),
                             new Car("賓士","銀灰色","AA-8888")};

        for (Vehicle v:vehicles
             ) {
            developer.takingVehicle(v);
            if(v instanceof IPower iPower)
                iPower.power();
        }
    }
}
