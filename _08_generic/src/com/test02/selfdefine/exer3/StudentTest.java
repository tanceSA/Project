package com.test02.selfdefine.exer3;

/**
 * ClassName: StudentTest
 * Package: com.test02.selfdefine.exer3
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/4/18 下午 02:24
 * @Version 1.0
 */
public class StudentTest {
    public static void main(String[] args) {
        Student<String> s1 = new Student<>("Asuka","優秀");
        Student<Double> s2 = new Student<>("Hikaru",98.3);
        Student<Character> s3 = new Student<>("Haruka",'B');

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }
}
