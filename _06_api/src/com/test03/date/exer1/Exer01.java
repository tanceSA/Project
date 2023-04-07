package com.test03.date.exer1;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ClassName: Exer01
 * Package: com.test03.date.exer1
 * Description:
 * 如何將一個java.util.Date的類實例 轉換為 javasql.Date的實例
 * @Author: TANCE
 * @Create 2023/4/7 上午 11:42
 * @Version 1.0
 */
public class Exer01 {
    @Test
    public void test1(){
        Date date = new Date();
        java.sql.Date date1 = new java.sql.Date(date.getTime());
    }
    /*
     * 拓展:
     *      從控制台取得年月日的字串數據(例如:2023-04-07)，保存在資料庫中
     *      (簡化為得到java.sql.Date的對象,此對象對應的時間為2022-12-13)
     */

    @Test
    public void test2() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String str = "2023-04-07";
        Date date = sdf.parse(str);

        java.sql.Date sql_date = new java.sql.Date(date.getTime());

        System.out.println(sql_date);
    }

}
