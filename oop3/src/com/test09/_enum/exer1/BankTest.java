package com.test09._enum.exer1;

/**
 * ClassName: BankTest
 * Package: com.test09._enum.exer1
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/20 上午 10:53
 * @Version 1.0
 */
public class BankTest {
    public static void main(String[] args) {
        System.out.println(Bank.B1.toString());
    }

}

enum Bank{
    B1(20),
    B2(21);
    private int number;

    Bank(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
