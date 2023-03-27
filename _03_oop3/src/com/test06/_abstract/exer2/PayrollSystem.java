package com.test06._abstract.exer2;

import java.util.Scanner;

/**
 * ClassName: PayrollSystem
 * Package: com.test06._abstract.exer2
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/17 上午 09:55
 * @Version 1.0
 */
public class PayrollSystem {
    public static void main(String[] args) {
        Employee[] employees = new Employee[2];

        employees[0] = new SalariedEmployee("Asuka",101, new MyDate(1998,8,10),300000);
        employees[1] = new HourlyEmployee("Hikaru",102,new MyDate(2001,7, 10),1800, 160);

        Scanner scan = new Scanner(System.in);
        System.out.print("Input Month:");
        int month  = scan.nextInt();

        for (Employee employee:employees
             ) {
            System.out.println(employee.toString());
            if(month == employee.getBirthday().getMonth())
                System.out.println(employee.earings());
        }
    }
}
