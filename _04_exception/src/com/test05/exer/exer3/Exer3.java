package com.test05.exer.exer3;

import org.junit.Test;

/**
 * ClassName: Exer3
 * Package: com.test05.exer.exer3
 * Description:
 * 定義測試類別Exer3
 * ①使用帶參數建構子創建Person對象，生命值傳入一個負數
 * 由於一旦遇到例外，後面的程式碼將不再執行，所以需要注釋掉上面的程式碼
 * <p>
 * ②使用空參建構子創建Person對象
 * <p>
 * 執行SetLfeValue(int lifevalue)方法,傳入一個正數，執行程式
 * <p>
 * 執行SetLfeValue(int lifevalue)方法,傳入一個負數，執行程式
 * <p>
 * 分別對①和②執行 看效果
 *
 * @Author: TANCE
 * @Create 2023/3/28 上午 11:10
 * @Version 1.0
 */
public class Exer3 {
    public static void main(String[] args) {
//        Person  p1 = new Person("角色1", -30);
//
//        Person p2 = new Person();
//        p2.setName("角色2");
//        p2.setLifeValue(100);
//        p2.setLifeValue(-100);
    }

    @Test
    public void test1() {
        try{
            Person p1 = new Person("角色1", -30);
        }
        catch (NoLifeValueException e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void test2() {
        Person p2 = new Person();
        p2.setName("角色2");
        p2.setLifeValue(100);
        p2.setLifeValue(-100);
    }
}
