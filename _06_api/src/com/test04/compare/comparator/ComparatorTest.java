package com.test04.compare.comparator;

import com.test04.compare.Product;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * ClassName: ComparatorTest
 * Package: com.test04.compare.comparator
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/4/7 下午 04:40
 * @Version 1.0
 */
public class ComparatorTest {
    @Test
    public void test1() {
        Product[] products = new Product[]{
                new Product("Sony", 26800),
                new Product("Samsung", 28900),
                new Product("Apple", 30900),
                new Product("HTC", 19800),
                new Product("Google", 26800)
        };
        Comparator productPriceComparator = new Comparator() {
            /*
             * 重寫Comparator()的compare(Object o1, Object o2)方法
             * 在方法中指明比較大小的標準
             * */
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Product p1 && o2 instanceof Product p2) {
                    return Double.compare(p1.getPrice(), p2.getPrice());
                }
                throw new RuntimeException("類型不匹配");
            }
        };

        Arrays.sort(products, productPriceComparator);
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i].toString());
        }

    }

    @Test
    public void test2() {
        String[] arr = new String[]{"Sony", "Samsung", "Apple", "HTC", "Google"};
        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof String s1 && o2 instanceof String s2) {
                    return -s1.compareTo(s2);
                }
                throw new RuntimeException("類型錯誤");
            }
        });
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
