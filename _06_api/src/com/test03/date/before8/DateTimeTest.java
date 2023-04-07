package com.test03.date.before8;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * ClassName: DateTimeTest
 * Package: com.test03.date.before8
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/4/7 上午 10:53
 * @Version 1.0
 */
public class DateTimeTest {
    /**
     * Date類別的使用
     *
     * |--java.util.Date
     *    > 兩個建構子的使用
     *    > 兩個方法的使用 ① toString() ② getTime()
     *      |----java.sql.Date //對應資料庫中的Date類型
     */
    @Test
    public void test1(){
        Date date1 = new Date(); //建立一個基於目前系統時間的Date實例
        System.out.println(date1);

        long milliTimes = date1.getTime();
        System.out.println("對應的毫秒數為:"+milliTimes);

        Date date2 = new Date(1670836272574L); //建立一個基於指定時間戳的Date實例
        System.out.println(date2);
    }

    @Test
    public void test2(){
        java.sql.Date date1 = new java.sql.Date(1670836272574L);
        System.out.println(date1);

        System.out.println(date1.getTime());
    }

    /** java.text.SimpleDateFormat 用於日期時間的格式化和解析
     *
     *  格式化: 日期 --> 字串
     *  解析:   字串 --> 日期
     *
     */
    @Test
    public void test3() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat();
        Date date1 = new Date();
        String strDate = sdf.format(date1);
        System.out.println(strDate);

        Date date2 = sdf.parse("2023/4/7 上午11:09");
    }

    @Test
    public void test4() throws ParseException {
        SimpleDateFormat sdf1 = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //格式化
        Date date1 = new Date();
        String strDate = sdf1.format(date1);
        System.out.println(strDate);
        String strDate2 = sdf2.format(date1);
        System.out.println(strDate2);

        //解析
        Date date2 = new Date();
        date2 = sdf2.parse("2023-04-07 11:21:17");
        System.out.println(date2);
    }

    /**
     * Calendar 抽象類別
     * ①實例化: 由於Calendar是一個抽象類別, 需要建立其子類別的實例, 通過靜態方法getInstance()即可取得
     *
     * ②常用方法:get(int field) / set(int field, xx) / add(int field, xx)
     *          addInt(int field, xx) / getTime() / setTime()
     */
    @Test
    public void test5(){
        Calendar calendar = Calendar.getInstance();

        //測試方法
        //get(int field)
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));

        //set(int field, xx)
        calendar.set(Calendar.DAY_OF_MONTH, 15);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

        //add(int field, xx)
        calendar.add(Calendar.DAY_OF_MONTH, 15);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

        //getTime()
        Date date = calendar.getTime();
        System.out.println(date);

        //setTime()
        Date date1 = new Date();
        calendar.setTime(date1);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
    }
}
