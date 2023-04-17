package com.test02.selfdefine.apply;

import java.sql.Date;

/**
 * ClassName: Customer
 * Package: com.test02.selfdefine.apply
 * Description:
 *  ORM 物件關聯對映 (object relational mapping)
 *  資料庫中的一個sheet 與 java中的一個類別對應
 *  row    與 java中的一個物件對應
 *  column 與 java中的一個屬性對應
 * @Author: TANCE
 * @Create 2023/4/17 下午 02:44
 * @Version 1.0
 */
public class Customer {
    int id;
    String name;
    String email;
    Date birth;
}
