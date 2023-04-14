package com.test05.map;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * ClassName: PropertiesTest
 * Package: com.test05.map
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/4/13 上午 11:07
 * @Version 1.0
 */
public class PropertiesTest {
    public static void main(String[] args) {
        File file = new File("info.properties");
        //System.out.println(file.getAbsolutePath());
    }
    @Test
    public void test1() throws IOException {

        File file = new File("info.properties");

        FileInputStream fis = new FileInputStream(file);

        Properties properties = new Properties();
        properties.load(fis);

        String name = properties.getProperty("name");
        String pwd = properties.getProperty("password");

        System.out.println(name+":"+pwd);

        fis.close();
    }
}
