package com.test01.throwable;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

/**
 * ClassName: ExceptionTest
 * Package: com.test01.throwable
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/27 下午 01:14
 * @Version 1.0
 */
public class ExceptionTest {

    //***RuntimeException***
    /*
    ArrayIndexOutOfBoundsException
    */
    @Test
    public void test1() {
        int[] arr = new int[10];
        System.out.println(arr[10]);
    }

    /*
    NullPointerException
     */
    @Test
    public void test2() {
        int[] arr = new int[10];
        arr = null;
        System.out.println(arr[1]);

    }

    /*
    ClassCastException
     */
    @Test
    public void test3() {
        Object obj = new String();
        Date date = (Date) obj;
    }

    /*
    NumberFormatException
     */
    @Test
    public void test4() {
        String str = "abc";
        int i = Integer.parseInt(str);
    }

    /*
    InputMismatchException
     */
    @Test
    public void test5() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(num);
    }

    /*
    ArithmeticException
     */
    @Test
    public void test6() {
        int num = 10;
        System.out.println(num / 0);
    }

    //*********************************
    //***Checked Exception***
    /*
    ClassNotFoundException
     */
    @Test
    public void test7() {
        //Class cls = Class.forName("java.lang.String");
    }

    /*
    FileNotFoundException
     */
    @Test
    public void test8() throws FileNotFoundException, IOException {
        File file = new File("D:\\Java\\workspace\\Project\\_04_exception\\src\\com\\test01\\throwable\\hello.txt");

        FileInputStream fis = new FileInputStream(file); //FileNotFoundException

        int data = fis.read(); //IOException
        while (data != -1) {
            System.out.print((char) data);
            data = fis.read();
        }
        fis.close();
    }
}

