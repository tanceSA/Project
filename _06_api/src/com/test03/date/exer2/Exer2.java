package com.test03.date.exer2;

import org.junit.Test;

import java.time.LocalDateTime;
import java.util.Calendar;

/**
 * ClassName: Exer2
 * Package: com.test03.date.exer2
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/4/7 下午 02:52
 * @Version 1.0
 */
public class Exer2 {
    /*
    * 使用Calendar取得當前時間, 把這個時間設置為你的生日, 再取得你出生100天後的日期
    * */
    @Test
    public void test1(){
        Calendar calendar = Calendar.getInstance();
        System.out.println("生日為:"+calendar.getTime());
        calendar.add(Calendar.DAY_OF_YEAR, 100);
        System.out.println("100天後為:"+calendar.getTime());
    }
    /*
    * 使用LocalDateTime取得當前時間, 把這個時間設置為你的生日, 再取得你出生100天後的日期
    * */
    @Test
    public void test2(){
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("生日為: "+localDateTime);
        LocalDateTime localDateTime1 = localDateTime.plusDays(100);
        System.out.println("100天後為:"+localDateTime1);
    }
}
