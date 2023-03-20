package com.test09._enum.apply;

/**
 * ClassName: EmployeeTest
 * Package: com.test09._enum.apply
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/20 上午 10:29
 * @Version 1.0
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("E1",18,Status.EAT);
        System.out.println(e1);

        Employee e2 = new Employee("E2", 19, Status.SLEEP);
        System.out.println(e2);

    }
}
