package com.test06.project.team.junit;

import com.test06.project.team.domain.Employee;
import com.test06.project.team.service.NameListService;
import com.test06.project.team.service.TeamException;
import org.junit.Test;

/**
 * ClassName: NameListServiceTest
 * Package: com.test06.project.team.junit
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/28 下午 04:12
 * @Version 1.0
 */
public class NameListServiceTest {
    @Test
    public void testGetAllEmployees(){
        NameListService nameListService= new NameListService();
        Employee[] employees = nameListService.getAllEmployees();
        for(int i=0;i<employees.length;i++){
            System.out.println(employees[i]);
        }
    }

    @Test
    public void testGetEmployee(){
        try {
            NameListService nameListService= new NameListService();
            int id  = 3;
            Employee employee = nameListService.getEmployee(id);
            System.out.println(employee);
        } catch (TeamException e) {
            System.out.println(e.getMessage());
        }
    }
}
