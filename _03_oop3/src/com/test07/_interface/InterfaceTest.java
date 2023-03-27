package com.test07._interface;

/**
 * ClassName: InterfaceTest
 * Package: com.test07._interface
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/17 上午 10:24
 * @Version 1.0
 */
public class InterfaceTest {
    public static void main(String[] args) {
        InterfaceInheritTest i = new InterfaceInheritTest();
        i.methodA();
    }
}

interface Flyable {
    //屬性
    public static final int MIN_SPEED = 0;

    //可以省略public static final
    int MAX_SPEED = 6000;

    //方法可以省略 public abstract
    void fly();
}

interface Attackable{
    void attack();
}

abstract class Plane implements Flyable{

}

class Bullet implements Flyable{

    @Override
    public void fly() {
        System.out.println("讓子彈飛");
    }
}
//interfce 的繼承性
interface InterfaceA{
    void methodA();
}
interface InterfaceB{
    void methodB();
}
interface InterfaceC extends InterfaceA,InterfaceB{

}
class InterfaceInheritTest implements InterfaceC{
    @Override
    public void methodA() {

    }

    @Override
    public void methodB() {

    }
}