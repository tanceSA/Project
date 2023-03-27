package com.test01._this.exer1;

/**
 * ClassName: BankTest
 * Package: com.test01._this.exer1
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/6 下午 04:19
 * @Version 1.0
 */
public class BankTest {
    public static void main(String[] args) {

        Bank bank = new Bank();
        bank.addCustomer("Jack", "chen");
        bank.addCustomer("Allen", "zoo");

        bank.getCustomer(0).setAccount(new Account(2000));
        bank.getCustomer(1).setAccount(new Account(100));
        getBalance(bank, 0);

        bank.getCustomer(0).getAccount().deposit(200);
        getBalance(bank, 0);


    }

    static void getBalance(Bank bank, int index) {
        System.out.println(bank.getCustomer(index).getFirstName() +
                " " + bank.getCustomer(index).getLastName() +
                "的帳戶餘額為" +
                bank.getCustomer(index).getAccount().getBalance() +
                "元。");
    }
}
