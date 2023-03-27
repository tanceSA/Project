package com.test01._this.exer1;

/**
 * ClassName: Customer
 * Package: com.test01._this.exer1
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/6 下午 04:07
 * @Version 1.0
 */
public class Customer {

    private String firstName;
    private String lastName;
    private Account account;

    public Customer(String f, String l) {
        this.firstName = f;
        this.lastName = l;
    }

    public void setAccount(Account acct) {
        this.account = acct;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }
}
