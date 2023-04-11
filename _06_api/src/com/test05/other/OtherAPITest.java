package com.test05.other;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;

/**
 * ClassName: OtherAPITest
 * Package: com.test05.other
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/4/10 上午 09:58
 * @Version 1.0
 */
public class OtherAPITest {
    @Test
    public void test1() {
        String javaVersion = System.getProperty("java.version");
        System.out.println("java的version:" + javaVersion);

        String javaHome = System.getProperty("java.home");
        System.out.println("java的home:" + javaHome);

        String osName = System.getProperty("os.name");
        System.out.println("os的name:" + osName);

        String osVersion = System.getProperty("os.version");
        System.out.println("os的version:" + osVersion);

        String userName = System.getProperty("user.name");
        System.out.println("user的name:" + userName);

        String userHome = System.getProperty("user.home");
        System.out.println("user的home:" + userHome);

        String userDir = System.getProperty("user.dir");
        System.out.println("user的dir:" + userDir);
    }

    @Test
    public void test2() {
        Runtime runtime = Runtime.getRuntime();
        long initialMemory = runtime.totalMemory(); //获取虚拟机初始化时堆内存总量
        long maxMemory = runtime.maxMemory(); //获取虚拟机最大堆内存总量
        String str = ""; //模拟占用内存
        for (int i = 0; i < 10000; i++) {
            str += i;
        }
        long freeMemory = runtime.freeMemory(); //获取空闲堆内存总量
        System.out.println("总内存：" + initialMemory / 1024 / 1024 * 64 + "MB");
        System.out.println("总内存：" + maxMemory / 1024 / 1024 * 4 + "MB");
        System.out.println("空闲内存：" + freeMemory / 1024 / 1024 + "MB");
        System.out.println("已用内存：" + (initialMemory - freeMemory) / 1024 / 1024 + "MB");

    }

    @Test
    public void test3(){
        System.out.println(Math.round(12.4));//12
        System.out.println(Math.round(12.5));//13
        System.out.println(Math.round(-12.5));//-12
        System.out.println(Math.round(-12.6));//-13
    }

    @Test
    public void test4(){
        BigInteger bi = new BigInteger("12433241123");
        BigDecimal bd = new BigDecimal("12435.351");
        BigDecimal bd2 = new BigDecimal("11");
        System.out.println(bi);
        // System.out.println(bd.divide(bd2));
        System.out.println(bd.divide(bd2, BigDecimal.ROUND_HALF_UP));
        System.out.println(bd.divide(bd2, 15, BigDecimal.ROUND_HALF_UP));
    }

    @Test
    public void test5(){
        Random r = new Random();
        System.out.println("隨機整數：" + r.nextInt());
        System.out.println("隨機整數：" + r.nextInt(10)); //[0,10)
        System.out.println("隨機小數：" + r.nextDouble());
        System.out.println("隨機布林值：" + r.nextBoolean());
    }
}
