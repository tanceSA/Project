package com.test01._this.exer1;

/**
 * ClassName: Account
 * Package: com.test01._this.exer1
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/6 下午 03:55
 * @Version 1.0
 */
public class Account {

    private double balance;

    public Account(double init_balance) {
        this.balance = init_balance;
    }

    public double getBalance() {
        return balance;
    }

    //存款
    public void deposit(double amt) {

        if (amt < 0) {
            System.out.println("輸入金額錯誤!");
        } else {
            balance += amt;
        }

    }

    //提款
    public void withdraw(double amt) {

        if (amt < 0) {
            System.out.println("輸入金額錯誤!");
        } else if (balance < amt) {
            System.out.println("餘額不足!");
        } else {
            balance -= amt;
        }

    }
}
