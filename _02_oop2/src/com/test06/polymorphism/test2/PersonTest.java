package com.test06.polymorphism.test2;

/**
 * ClassName: PersonTest
 * Package: com.test06.polymorphism.test2
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/13 下午 01:51
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {

        instanceofTest(new Person(),new Man(), new Woman());

    }
    public static void instanceofTest(Person... ps){
        for (Person p:ps) {
            System.out.println(p);
            p.eat();
            if(p instanceof Man m){
                //((Man) p).playGame();
                m.playGame();;
            }else if(p instanceof Woman w){
                //((Woman) p).makeUp();
                w.makeUp();
            }
        }
    }
}
