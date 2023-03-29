package com.test06.project.team.service;


public class Data {
    public static final int EMPLOYEE = 10;
    public static final int PROGRAMMER = 11;
    public static final int DESIGNER = 12;
    public static final int ARCHITECT = 13;

    public static final int PC = 21;
    public static final int NOTEBOOK = 22;
    public static final int PRINTER = 23;

    //Employee  :  10, id, name, age, salary
    //Programmer:  11, id, name, age, salary
    //Designer  :  12, id, name, age, salary, bonus
    //Architect :  13, id, name, age, salary, bonus, stock
    public static final String[][] EMPLOYEES = {
            {"10", "1", "馬 雲", "22", "3000"},
            {"13", "2", "馬化騰", "32", "18000", "15000", "2000"},
            {"11", "3", "李彥宏", "23", "7000"},
            {"11", "4", "劉強東", "24", "7300"},
            {"12", "5", "雷 軍", "28", "10000", "5000"},
            {"11", "6", "任志強", "22", "6800"},
            {"12", "7", "柳傳志", "29", "10800","5200"},
            {"13", "8", "楊元慶", "30", "19800", "15000", "2500"},
            {"12", "9", "史玉柱", "26", "9800", "5500"},
            {"11", "10", "丁 磊", "21", "6600"},
            {"11", "11", "張朝陽", "25", "7100"},
            {"12", "12", "楊致遠", "27", "9600", "4800"}
    };

    //如下的EQUIPMENTS數組與上面的EMPLOYEES數組元素一一對應
    //PC      :21, model, display
    //NoteBook:22, model, price
    //Printer :23, name, type
    public static final String[][] EQUIPMENTS = {
            {},
            {"22", "聯想T4", "6000"},
            {"21", "戴爾", "NEC17寸"},
            {"21", "戴爾", "三星 17寸"},
            {"23", "佳能 2900", "激光"},
            {"21", "華碩", "三星 17寸"},
            {"21", "華碩", "三星 17寸"},
            {"23", "愛普生20K", "針式"},
            {"22", "惠普m6", "5800"},
            {"21", "戴爾", "NEC 17寸"},
            {"21", "華碩","三星 17寸"},
            {"22", "惠普m6", "5800"}
    };
}