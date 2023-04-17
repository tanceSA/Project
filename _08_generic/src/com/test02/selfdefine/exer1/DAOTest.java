package com.test02.selfdefine.exer1;

import org.junit.Test;

/**
 * ClassName: DAOTest
 * Package: com.test02.selfdefine.exer1
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/4/17 下午 04:48
 * @Version 1.0
 */
public class DAOTest {
    @Test
    public void test1(){
        DAO<User> userDAO = new DAO<>();

        userDAO.save("1001",new User(1,21,"hikaru"));
        userDAO.save("1002",new User(2,24,"Asuka"));
        for (User u:userDAO.list()
             ) {
            System.out.println(u);
        }

        userDAO.update("1002",new User(3,21,"Haruka"));
        for (User u:userDAO.list()
        ) {
            System.out.println(u);
        }

        userDAO.delete("1002");
        for (User u:userDAO.list()
        ) {
            System.out.println(u);
        }

    }
}
