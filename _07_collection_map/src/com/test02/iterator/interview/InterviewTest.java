package com.test02.iterator.interview;

import org.junit.Test;

/**
 * ClassName: InterviewTest
 * Package: com.test02.iterator.interview
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/4/11 下午 03:44
 * @Version 1.0
 */
public class InterviewTest {
    @Test
    public void testFor(){
        String[] strings = new String[]{"AA","BB","CC"};

        //賦值操作1
//        for(int i=0;i<strings.length;i++){
//            strings[i]="ZZ";
//        }

        //賦值操作2
        for(String s:strings){
            s="ZZ";
        }

        for(String s:strings){
            System.out.println(s);
        }

    }
}
