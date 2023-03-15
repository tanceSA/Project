package com.test07._object.equals.apply;

/**
 * ClassName: Account
 * Package: com.test07._object.equals.apply
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/13 下午 04:31
 * @Version 1.0
 */
public class Account {

    private double balance;//餘額

    public Account(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Double.compare(account.balance, balance) == 0;
    }

    public Account() {
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
