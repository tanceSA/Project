package com.test03._throws;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * ClassName: ThrowsTest
 * Package: com.test03._throws
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/27 下午 04:19
 * @Version 1.0
 */
public class ThrowsTest {
    public static void main(String[] args) {
        method3();
    }
    public static void  method1() throws FileNotFoundException, IOException {
        File file = new File("D:\\Java\\workspace\\Project\\_04_exception\\hello.txt");

        FileInputStream fis = new FileInputStream(file); //FileNotFoundException

        int data = fis.read(); //IOException
        while (data != -1) {
            System.out.print((char) data);
            data = fis.read();
        }
        fis.close();
    }
    public static void method2() throws FileNotFoundException, IOException{
        method1();
    }

    public static void method3(){
        try{
            method2();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
