package com.test03.block;

/**
 * ClassName: BlockTest
 * Package: com.test03.block
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/14 下午 03:04
 * @Version 1.0
 */
public class BlockTest {
}
class Person{
    String name;
    int age;

    public Person(){

    }

    {
        System.out.println("動態Code Block");
    }

    static {
        System.out.println("靜態Code Block");
    }
}
