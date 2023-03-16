package com.test05._final;

/**
 * ClassName: FinalTest
 * Package: com.test05._final
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/16 上午 09:01
 * @Version 1.0
 */
public class FinalTest {
    public static void main(String[] args) {
        E e = new E();

        System.out.println(e.MIN_SCORE);
        //e.MIN_SCORE = 4;    //Cannot assign a value to final variable 'MIN_SCORE'
    }
}

class A{

}

final class B extends A{

}


//class C extends B{  //Cannot inherit from final 'com.test05._final.B
//
//}

class C{
    public void method(){

    }

     public final void method1(){

    }
}

class D extends C {
    public void method() {

    }
}
//    public void method1(){  //'method1()' cannot override 'method1()' in 'com.test05._final.C'; overridden method is final
//
//    }

class E{
    final int MIN_SCORE = 0;
    final int MAX_SCORE;
    final int LEFT;
    //final int RIGHT;

    {
        MAX_SCORE = 100;
    }

    public E(){
        LEFT = 1;
    }
    public E(int left){
        LEFT = 1;
    }

//    public void setRight(int right)
//    {
//        RIGHT = right;  //Cannot assign a value to final variable 'RIGHT'
//    }
}

class F{
    public void method(){
        final int num;
        num = 10;
    }
}