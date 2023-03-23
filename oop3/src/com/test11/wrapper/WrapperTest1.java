package com.test11.wrapper;

import org.junit.Test;

/**
 * ClassName: WrapperTest1
 * Package: com.test11.wrapper
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/23 下午 02:20
 * @Version 1.0
 */
public class WrapperTest1 {

    /*基本資料型態、封裝類別 -> String類型
        ①.調用String的靜態方法valueOf
        ②.使用連接符號
     */
    @Test
    public void test1(){
        //方式1
        int i1 = 10;
        String str1 = String.valueOf(i1);
        System.out.println(str1);

        boolean b1 = true;
        String str2 = String.valueOf(b1);
        System.out.println(str2);

        //方式2
        String str3 = i1+"";
        System.out.println(str3);

        String str4 = b1+"";
        System.out.println(str4);

    }

    /*
    String類型 -> 基本資料型態、封裝類別
    調用包裝類的靜態方法: parseXxx()
     */
    @Test
    public void test2(){
        String s1 = "123";
        int i1 = Integer.parseInt(s1);
        System.out.println(i1);

        String s2 = "false111";
        boolean b1 = Boolean.parseBoolean(s2);
        System.out.println(b1);

    }
}
