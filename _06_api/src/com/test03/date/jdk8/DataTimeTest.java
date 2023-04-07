package com.test03.date.jdk8;

import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Calendar;
import java.util.Date;

/**
 * ClassName: DataTimeTest
 * Package: com.test03.date.jdk8
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/4/7 下午 01:59
 * @Version 1.0
 */
public class DataTimeTest {
    /*
     * JDK8之前Date與Calendar面臨的問題
     *
     * 可变性：像日期和时间这样的类应该是不可变的。
     * 偏移性： Date 中的年份是从 1900 开始的，而月份都从 0 开始。
     * 格式化：格式化只对 Date 有用， Calendar 则不行。
     * 此外， 它们也不是线程安全的；不能处理闰秒等。
     * */

    //可變性
    @Test
    public void test1() {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        c.add(Calendar.DAY_OF_MONTH, 3);
        System.out.println(c.getTime());
    }

    //偏移性
    @Test
    public void test2() {
        Date date = new Date(2023, 04, 07);
        System.out.println(date); //Mon May 07 00:00:00 CST 3923
    }

    /*
     * LocalDate / LocalTime / LocalDateTime
     * */
    @Test
    public void test3() {
        //now(): 取得現在時間的實例
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        //of():取得指定時間的實例
        LocalDate localDate1 = LocalDate.of(2023, 4, 7);
        LocalDateTime localDateTime1 = LocalDateTime.of(2023, 4, 7, 14, 13);

        System.out.println(localDate1);
        System.out.println(localDateTime1);

        LocalDateTime localDateTime2 = LocalDateTime.now();
        System.out.println(localDateTime2.getMonth());

        LocalDateTime localDateTime3 = localDateTime2.withDayOfMonth(20);
        System.out.println(localDateTime3); //2023-04-20T14:18:33.220745700
        System.out.println(localDateTime2); //2023-04-07T14:18:33.220745700

        LocalDateTime localDateTime4 = localDateTime2.plusDays(20);
        System.out.println(localDateTime4);



    }

    /*
     * JDK8的api: Instant
     * */
    @Test
    public void test4(){
        Instant instant = Instant.now();
        System.out.println(instant); //UTC+0

        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);//UTC+8

        Instant instant1 = Instant.ofEpochMilli(1480849418843L);
        System.out.println(instant1);

    }

    /*
    * DataTimeFormatter 自定義格式
    * */
    @Test
    public void test5(){
        //格式化
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String str = dateTimeFormatter.format(LocalDateTime.now());
        System.out.println(str);//2023/04/07 14:45:54

        //解析
        String str1 = "2023/05/18 18:00:00";
        TemporalAccessor temporalAccessor = dateTimeFormatter.parse(str1);
        LocalDateTime localDateTime = LocalDateTime.from(temporalAccessor);
        System.out.println(localDateTime);

    }
}
