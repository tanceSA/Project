package com.test05._super.test2;

/**
 * ClassName: InheritTest
 * Package: com.test05._super.test2
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/13 上午 10:25
 * @Version 1.0
 */
public class InheritTest {
    public static void main(String[] args) {
        Class3 c3 = new Class3(4);
    }
}

    class Class1 {
    String info = "Class1";
        Class1() {
            System.out.println(info);
        }
    }

    class Class2 extends Class1 {
        //String info = "Class2";
        Class2() {
            System.out.println(info);
        }
    }

    class Class3 extends Class2 {
        String info = "Class3";
        Class3() {
            System.out.println(info);
        }
        Class3(int value){
            System.out.println("Value");
        }
    }
