package com.test01._string.exer3;

import java.util.Scanner;

/**
 * ClassName: UserTest
 * Package: com.test01._string.exer3
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/4/6 下午 04:33
 * @Version 1.0
 */
public class UserTest {
    public static void main(String[] args) {
        //建立用戶列表陣列
        User[] users = new User[]{
                new User("songhk", "123"),
                new User("Tom", "8888"),
                new User("Jerry", "6666")};

        System.out.println("系統內的用戶有:");
        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i].toString());
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入用戶名稱:");
        String userName = scanner.next();
        System.out.print("請輸入用戶密碼:");
        String passWord = scanner.next();
        scanner.close();

        boolean isFlag = true;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getName().equals(userName)) {
                isFlag = false;
                if (users[i].getPassword().equals(passWord)) {
                    System.out.println("登錄成功!");
                } else {
                    System.out.println("密碼錯誤!");
                }
                break;
            }
        }
        if (isFlag) {
            System.out.println("找不到該用戶!");
        }
    }
}
