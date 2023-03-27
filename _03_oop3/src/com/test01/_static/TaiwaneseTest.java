package com.test01._static;

/**
 * ClassName: TaiwaneseTest
 * Package: com.test01._static
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/14 上午 11:49
 * @Version 1.0
 */
public class TaiwaneseTest {
    public static void main(String[] args) {

        System.out.println(Taiwanese.getCOUNTRY());

        Taiwanese t1 = new Taiwanese();
        Taiwanese t2 = new Taiwanese();

        t1.name = "張三";
        t1.age=18;

        t2.name = "李四";
        t2.age=28;

        System.out.println(t1.getCOUNTRY());
        System.out.println(t2.getCOUNTRY());


    }
}

class Taiwanese{
    //靜態變數
    private static String COUNTRY = "台灣";
    //動態變數
    String name;
    int age;

    @Override
    public String toString() {
        return "Taiwanese{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void show(){
        System.out.println(COUNTRY);;
    }

    public static String getCOUNTRY() {
        return COUNTRY;
    }
}