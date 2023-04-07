package com.test04.compare.comparable;

import com.test04.compare.Product;
import org.junit.Test;

import java.util.Arrays;

/**
 * ClassName: ComparableTest
 * Package: com.test04.compare.comparable
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/4/7 下午 03:55
 * @Version 1.0
 */
public class ComparableTest {
    @Test
    public void test1() {
        String[] arr = new String[]{"Sony", "Samsung", "Apple", "HTC", "Google"};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    @Test
    public void test2() {
        Product[] products = new Product[]{
                new Product("Sony", 26800),
                new Product("Samsung", 28900),
                new Product("Apple", 30900),
                new Product("HTC", 19800),
                new Product("Google", 26800)
        };
        Arrays.sort(products);
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i].toString());
        }
    }
}

