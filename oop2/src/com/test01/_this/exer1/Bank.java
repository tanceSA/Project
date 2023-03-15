package com.test01._this.exer1;

/**
 * ClassName: Bank
 * Package: com.test01._this.exer1
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/6 下午 04:12
 * @Version 1.0
 */
public class Bank {
    private Customer[] customers;
    private int numberOfCustomer;

    public Bank() {
        customers = new Customer[20];
    }

    public Customer getCustomer(int index) {
        if (index < 0 || index >= numberOfCustomer) {
            return null;
        }
        return customers[index];
    }

    public int getNumOfCustomer() {
        return numberOfCustomer;
    }

    public void addCustomer(String f, String l) {
        Customer customer = new Customer(f, l);
        customers[numberOfCustomer++] = customer;
    }
}
