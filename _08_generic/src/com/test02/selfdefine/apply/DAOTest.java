package com.test02.selfdefine.apply;

import org.junit.Test;

/**
 * ClassName: DAOTest
 * Package: com.test02.selfdefine.apply
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/4/17 下午 03:07
 * @Version 1.0
 */
public class DAOTest {
    @Test
    public void test1() {
        CustomerDAO dao1 = new CustomerDAO();
        dao1.insert(new Customer());
        Customer customer = dao1.deleteById(1);

        OrderDAO dao2 = new OrderDAO();
        dao2.insert(new Order());
        Order order = dao2.queryForInstance();
    }

}

