package com.test06.polymorphism.test1;

/**
 * ClassName: CharacterTest
 * Package: com.test06.polymorphism.test1
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/13 上午 11:21
 * @Version 1.0
 */
public class CharacterTest {
    public static void main(String[] args) {
        CharacterTest test = new CharacterTest();
        test.adopt(new Senshi());
        test.adopt(new Touzoku());
    }

    public void adopt(Character character){
        character.attack();
    }
}
