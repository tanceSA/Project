package com.test03.list.exer1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ClassName: StudentTest
 * Package: com.test03.list.exer1
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/4/12 上午 09:06
 * @Version 1.0
 */
public class StudentTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List studentList = new ArrayList();


        System.out.println("請輸入學生資料:");


        while (true){

            System.out.println("1:繼續輸入  0:結束輸入");
            int selection  = scanner.nextInt();

            if (selection==0){
                break;
            }
            System.out.print("請輸入學生姓名:");
            String name = scanner.next();

            System.out.print("請輸入學生年齡:");
            int age = scanner.nextInt();

            studentList.add(new Student(name,age));

        }
        System.out.println("遍歷學生資料:");
        for (Object o:studentList
             ) {
            System.out.println(o.toString());
        }
        scanner.close();
    }
}
