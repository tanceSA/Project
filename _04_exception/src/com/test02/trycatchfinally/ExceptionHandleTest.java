package com.test02.trycatchfinally;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * ClassName: ExceptionHandleTest
 * Package: com.test02.trycatchfinally
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/27 下午 02:24
 * @Version 1.0
 */
public class ExceptionHandleTest {
    @Test
    public void test1() {
        try {
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            System.out.println(num);
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException");
        }
    }

    @Test
    public void test2() {
        try {
            String str = "abc";
            int i = Integer.parseInt(str);
        }catch (NumberFormatException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void test3(){
        try{
            File file = new File("D:\\Java\\workspace\\Project\\_04_exception\\src\\com\\test01\\throwable\\hello1.txt");

            FileInputStream fis = new FileInputStream(file); //FileNotFoundException

            int data = fis.read(); //IOException
            while (data != -1) {
                System.out.print((char) data);
                data = fis.read();
            }

            fis.close();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
