package com.test02.trycatchfinally;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * ClassName: FinallyTest
 * Package: com.test02.trycatchfinally
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/27 下午 03:01
 * @Version 1.0
 */
public class FinallyTest {
    @Test
    public void test1() {
        try {
            String str = "123";
            str = "abc";
            int i = Integer.parseInt(str);
            System.out.println(i);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println(1 / 0);
        } finally {
            System.out.println("end1");
        }
        System.out.println("end2");
    }

    @Test
    public void test2() {
        FileInputStream fis = null;
        try {
            File file = new File("D:\\Java\\workspace\\Project\\_04_exception\\src\\com\\test01\\throwable\\hello.txt");
            fis = new FileInputStream(file); //FileNotFoundException

            int data = fis.read(); //IOException
            while (data != -1) {
                System.out.print((char) data);
                data = fis.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //重點：將流資源關閉操作放在finally中
            try {
                if (fis != null) fis.close();//可能IOException
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
