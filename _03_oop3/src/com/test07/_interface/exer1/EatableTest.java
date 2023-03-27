package com.test07._interface.exer1;

/**
 * ClassName: EatableTest
 * Package: com.test07._interface.exer1
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/17 上午 11:25
 * @Version 1.0
 */
public class EatableTest {
    public static void main(String[] args) {
//        Eatable[] eatables = new Eatable[3];
//        eatables[0] = new Chinese();
//        eatables[1] = new American();
//        eatables[2] = new Indian();
//
//        for(int i=0;i<eatables.length;i++){
//            eatables[i].eat();
//        }

//        Eatable[] es = new Eatable[]{new Chinese(),new American(),new Indian()};
//        eat(es);

        EatableTest.eat(new Chinese(),new American(),new Indian());
    }
    public static void eat(Eatable ...eatables){
        for (Eatable e:eatables
             ) {
            e.eat();
        }
    }
}

interface Eatable{
    void eat();
}

class Chinese implements Eatable{
    @Override
    public void eat() {
        System.out.println("中國人用筷子吃飯");
    }
}

class  American implements Eatable{
    @Override
    public void eat() {
        System.out.println("美國人用刀叉吃飯");
    }
}

class Indian implements Eatable{
    @Override
    public void eat() {
        System.out.println("印度人用手抓飯");
    }
}