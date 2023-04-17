package com.test01.use.exer1;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * ClassName: EmployeeTest
 * Package: com.test01.use.exer1
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/4/17 上午 08:55
 * @Version 1.0
 */
public class EmployeeTest {
    /*
    * 實現 Comparable介面，並按name排序
    * */
    @Test
    public void test1() {
        TreeSet<Employee> employees = new TreeSet<>();
        Employee e1 = new Employee("Haruka", 21, new MyDate(2001, 8, 8));
        Employee e2 = new Employee("Hikaru", 21, new MyDate(2001, 7, 10));
        Employee e3 = new Employee("Asuka", 24, new MyDate(1998, 8, 10));
        Employee e4 = new Employee("Erika", 26, new MyDate(1997, 1, 22));
        Employee e5 = new Employee("Ayame", 18, new MyDate(2004, 6, 8));

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);

        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
    /*
    * 建立TreeSet時傳入Comparator對象，按生日年月日排序
    * */
    @Test
    public void test2(){
        Comparator<Employee> c = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                int birthdayDstince = o1.getBrithday().compareTo(o2.getBrithday());
                if(birthdayDstince!=0){
                    return birthdayDstince;
                }
                return o1.getName().compareTo(o2.getName());
            }
        };

        TreeSet<Employee> employees = new TreeSet<>(c);
        Employee e1 = new Employee("Haruka", 21, new MyDate(2001, 8, 8));
        Employee e2 = new Employee("Hikaru", 21, new MyDate(2001, 7, 10));
        Employee e3 = new Employee("Asuka", 24, new MyDate(1998, 8, 10));
        Employee e4 = new Employee("Erika", 26, new MyDate(1997, 1, 22));
        Employee e5 = new Employee("Ayame", 18, new MyDate(2004, 6, 8));
        Employee e6 = new Employee("Ayames", 18, new MyDate(2004, 6, 8));

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        employees.add(e6);

        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
