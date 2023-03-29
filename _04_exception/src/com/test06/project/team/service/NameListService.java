package com.test06.project.team.service;

import com.test06.project.team.domain.*;

import static com.test06.project.team.service.Data.*;

/**
 * ClassName: NameListService
 * Package: com.test06.project.team.service
 * Description:
 * 负责将Data中的数据封装到Employee[]数组中，同时提供相关操作Employee[]的方法。
 *
 * @Author: TANCE
 * @Create 2023/3/28 下午 03:21
 * @Version 1.0
 */
public class NameListService {
    private Employee[] employees;

    public NameListService() {
        employees = new Employee[Data.EMPLOYEES.length];

        for (int i = 0; i < employees.length; i++) {
            //獲取通用屬性
            int type = Integer.parseInt(EMPLOYEES[i][0]);
            int id = Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            double salary = Double.parseDouble(EMPLOYEES[i][4]);
            Equipment equipment;
            double bonus;
            int stock;
//            根据项目提供的Data类构建相应大小的employees数组
//            再根据Data类中的数据构建不同的对象，包括Employee、Programmer、Designer和Architect对象，以及相关联的Equipment子类的对象
//                    将对象存于数组中
//            package com.test06.project.team.service;
            switch (type) {
                case EMPLOYEE:
                    employees[i] = new Employee(id, name, age, salary);
                    break;

                case PROGRAMMER:
                    equipment = createEquipment(i);
                    employees[i] = new Programmer(id, name, age, salary, equipment);
                    break;

                case DESIGNER:
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    employees[i] = new Designer(id, name, age, salary, equipment, bonus);
                    break;

                case ARCHITECT:
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    stock = Integer.parseInt(EMPLOYEES[i][6]);
                    employees[i] = new Architect(id, name, age, salary,equipment,bonus,stock);
                    break;
            }
        }
    }

    public Employee[] getAllEmployees() {
        return employees;
    }

    public Employee getEmployee(int id) throws TeamException {
        for(int i=0;i<employees.length;i++){
            if(id == employees[i].getId()){
                return employees[i];
            }
        }
        //
        throw new TeamException("找不到指定員工");
    }

    private Equipment createEquipment(int index) {
        int equipmentType = Integer.parseInt(EQUIPMENTS[index][0]);
        String modelName = EQUIPMENTS[index][1];
        String displayPriceType = EQUIPMENTS[index][2];
        switch (equipmentType) {
            case PC:
                return new PC(modelName, displayPriceType);
            case NOTEBOOK:
                return new NoteBook(modelName, Double.parseDouble(displayPriceType));
            case PRINTER:
                return new Printer(modelName, displayPriceType);
        }
        return null;
    }
}
