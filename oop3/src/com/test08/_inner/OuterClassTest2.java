package com.test08._inner;

/**
 * ClassName: OuterClassTest2
 * Package: com.test08._inner
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/17 下午 04:06
 * @Version 1.0
 */
public class OuterClassTest2 {
    public static void main(String[] args) {
        //提供了介面A的實現類別SubA的對象a
        SubA a = new SubA();
        a.method();

        //提供了介面A的實現類別SubA的匿名對象
        new SubA().method();

        //提供了介面A的匿名實現類別的對象a1
        A a1 = new A(){
            @Override
            public void method() {
                System.out.println(this.getClass());
            }
        };
        a1.method();

        //提供了介面A的匿名實現類別的匿名對象
        new A(){
            @Override
            public void method() {
                System.out.println(getClass());
            }
        }.method();


        //繼承於抽象類 B 的匿名子類的的對象 b
        B b = new B(){
            @Override
            public void method() {
                System.out.println(getClass());
            }
        };
        b.method();

        //繼承於抽象類 B 的匿名子類的的匿名對象
        new B(){
            @Override
            public void method() {
                System.out.println(getClass());
            }
        }.method();

    }
}
interface A{
    public void method();
}
abstract class B{
    public abstract void method();
}
class SubA implements A{

    @Override
    public void method() {
        System.out.println(this.getClass());
    }
}

