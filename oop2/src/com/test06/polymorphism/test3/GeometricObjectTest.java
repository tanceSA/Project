package com.test06.polymorphism.test3;

/**
 * ClassName: GeometricObjectTest
 * Package: com.test06.polymorphism.test3
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/13 下午 02:16
 * @Version 1.0
 */
public class GeometricObjectTest {
    public static void main(String[] args) {
        GeometricObjectTest test = new GeometricObjectTest();
        Circle c1 = new Circle("red",3.0, 3.0);
        Circle c2 = new Circle("red",3.0, 3.0);
        Circle c3 = new Circle("red",3.0, 4.0);
        MyRectangle m1 = new MyRectangle("red",3.0,3.0,3.0);

        test.displayGeometricObject(c1);
        test.displayGeometricObject(c2);
        test.displayGeometricObject(c3);
        test.displayGeometricObject(m1);

        if(test.equalsAreo(c1, m1)){
            System.out.println("面積相同");
        }
        else {
            System.out.println("面積不相同");
        }

    }
    public boolean equalsAreo(GeometricObject obj1, GeometricObject obj2){
        return obj1.findArea() == obj2.findArea();
    }
    public void displayGeometricObject(GeometricObject obj)
    {
        System.out.println(obj.findArea());
    }
}
