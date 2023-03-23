package com.test11.wrapper.exer1;

import java.util.Scanner;
import java.util.Vector;

/**
 * ClassName: ScoreTest
 * Package: com.test11.wrapper.exer1
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/23 下午 02:34
 * @Version 1.0
 */
public class ScoreTest {
    public static void main(String[] args) {
        //1.建立Vector對象
        Vector vector = new Vector();

        //2.從鍵盤獲取多個學生成績，存放到Vector對象中(輸入負值為結束)
        Scanner scanner = new Scanner(System.in);
        int maxScore = 0;
        while (true) {
            System.out.println("請輸入學生成績(以負數代表結束):");
            int inputScore = scanner.nextInt();
            //Integer score = Integer.valueOf(inputScore);

            if (inputScore < 0) {
                break;
            }

            //自動裝箱
            vector.addElement(inputScore);

            //3.獲得學生成績的最大值
            if (maxScore < inputScore)
                maxScore = inputScore;
        }
        System.out.println("max score is "+maxScore);
        //4.依次獲得所有學生成威並與最高分比較後分級
        for (int i = 0; i < vector.size(); i++) {
            Object obj = vector.elementAt(i);

            //方式1
//            Integer integerScore = (Integer) obj;
//            int score = integerScore.intValue();

            //方式2
            int score = (Integer) obj;

            char grade;
            if (maxScore - score <= 10) {
                grade = 'A';
            } else if (maxScore - score <= 20) {
                grade = 'B';
            } else if (maxScore - score <= 30) {
                grade = 'C';
            } else {
                grade = 'D';
            }
            System.out.println("Student " + i + " score is " + score + " grade is " + grade);

        }

        scanner.close();
    }
}
