package com.test03.threadsafe.exer;

/**
 * ClassName: AccountTest
 * Package: com.test03.threadsafe.exer
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/31 上午 08:47
 * @Version 1.0
 */
public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        Customer c1 = new Customer(account, "存戶A");
        Customer c2 = new Customer(account, "存戶B");

        c1.start();
        c2.start();
    }
}

class Account {
    private double balance;//共享數據

    public synchronized void deposit(double amt) {
        if (amt > 0) {
            balance += amt;
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "存錢" + amt + "元, 餘額為:" + balance + "元");
    }

    public Account() {
    }

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class Customer extends Thread {

    Account account;

    public Customer(Account account) {
        this.account = account;
    }

    public Customer(Account account, String name) {
        super(name);
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            account.deposit(1000);
        }
    }
}