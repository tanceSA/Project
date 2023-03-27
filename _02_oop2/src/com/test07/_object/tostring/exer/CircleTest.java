package com.test07._object.tostring.exer;

/**
 * ClassName: CircleTest
 * Package: com.test07._object.tostring.exer
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/14 上午 10:57
 * @Version 1.0
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(3.0,"white",3.0);
        Circle c2 = new Circle(3.0,"white",3.0);

        System.out.println(c1.getColor().equals(c2.getColor()));   //判斷顏色是否相等
        System.out.println(c1.equals(c2));                  //調用equals判斷半徑是否相等
        System.out.println(c1.toString());                  //調用toString()輸出半徑

    }
}
