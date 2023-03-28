package com.test05.exer.exer3;

/**
 * ClassName: Person
 * Package: com.test05.exer.exer3
 * Description:
 ①屬性, 名稱(name)和生命值(lifeValue)
 ②提供setter和getter方法
 在setLifeValue(int lifevalue)方法中, 首先判斷, 如果 liftValue為負數，就拋出NoliftValueException
 例外訊息為 生命值對能為負數: xx;
 然後再給成員liftValue賦值

 ③提供無參建構子

 ④提供有參數建供子，使用setxxx方法給name和lifeValue賦值
 * @Author: TANCE
 * @Create 2023/3/28 上午 11:02
 * @Version 1.0
 */
public class Person {
    private String name;
    private int lifeValue;

    public Person(String name, int lifeValue) {
        setName(name);
        setLifeValue(lifeValue);
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifeValue() {
        return lifeValue;
    }

    public void setLifeValue(int lifeValue) {
        if(lifeValue<0) {
            throw new NoLifeValueException("生命值不能為負數:" + lifeValue);
        }
        this.lifeValue = lifeValue;
    }
}
