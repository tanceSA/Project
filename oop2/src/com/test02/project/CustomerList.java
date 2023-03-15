package com.test02.project;

/**
 * ClassName: CustomerList
 * Package: com.test02.project
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/7 上午 09:54
 * @Version 1.0
 */
public class CustomerList {
    private Customer[] customers;//客戶列表
    private int total = 0;//

    //建構子
    public CustomerList(int totalCustomer) {
        customers = new Customer[totalCustomer];
    }

    //新增客戶
    public boolean addCustomer(Customer customer) {

        if (total >= customers.length) {
            return false;
        }

        customers[total] = customer;
        total++;
        return true;

    }

    //修改客戶
    public boolean replaceCustomer(int index, Customer cust) {

        if (index < 0 || index >= total) {
            return false;
        }

        customers[index] = cust;
        return true;

    }

    public boolean deleteCustomer(int index) {
        if (index < 0 || index >= total) {
            return false;
        }

        for (int i = index; i < total - 1; i++) {
            customers[i] = customers[i + 1];
        }

        customers[--total] = null;
        return true;
    }

    public Customer[] getAllCustomers() {
        Customer[] custs = new Customer[total];
        for (int i = 0; i < custs.length; i++) {
            custs[i] = customers[i];
        }
        return custs;
    }

    public Customer getCustomer(int index) {
        if (index < 0 || index >= total) {
            return null;
        }
        return customers[index];
    }

    public int getTotal() {
        return total;
    }
}
