package com.test11.wrapper;

import org.junit.Test;

/**
 * ClassName: WrapperTest
 * Package: com.test11.wrapper
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/23 下午 01:41
 * @Version 1.0
 */
public class WrapperTest {

    /*
    基本資料型態 ->封裝類別
     */
    @Test
    public void test1(){
        int i1 = 10;
        //Integer ii1 = new Integer(i1);  //'Integer(int)' is deprecated and marked for removal
        Integer ii1 = Integer.valueOf(i1);
        System.out.println(ii1);

        String s1 = "20";
        //Integer is1 = new Integer(s1); //'Integer(int)' is deprecated and marked for removal
        Integer is1 = Integer.valueOf(s1);
        System.out.println(is1);

        String s2 = "12.8";
        Float fs2 = Float.valueOf(s2);
        System.out.println(fs2);
    }

    /*
    封裝類別 -> 基本資料型態
    */
    @Test
    public void test2(){
        Integer ii1 = Integer.valueOf(11);
        int i1 = ii1.intValue();
        i1++;
        System.out.println(i1);
    }

    /*
    基本資料型態 與 封裝類別 初始值的差異
     */
    @Test
    public void test3(){
        Account account = new Account();
        System.out.println(account.isFlag1);;
        System.out.println(account.isFlags2);
    }
    /*
    jdk5.0 自動裝箱、拆箱
     */
    @Test
    public void test4(){
        int i1 = 10;
        Integer ii1 = i1; //自動裝箱
        Integer ii2 = 12; //自動裝箱

        Float fload1 = 12.3F;//自動裝箱
        float f1 = fload1;   //自動拆箱
    }
}


class Account{
    boolean isFlag1;
    Boolean isFlags2;
}