package com.test06.project.team.view;

import java.util.*;
/**
 *
 * @Description 項目中提供了TSUtility.java類，可用來方便地實現鍵盤訪問。
 * @author shkstart  Email:shkstart@126.com
 * @version
 * @date 2019年2月12日上午12:02:58
 *
 */
public class TSUtility {
    private static Scanner scanner = new Scanner(System.in);
    /**
     *
     * @Description 該方法讀取鍵盤，如果用戶鍵入’1’-’4’中的任意字符，則方法返回。返回值為用戶鍵入字符。
     * @author shkstart
     * @date 2019年2月12日上午12:03:30
     * @return
     */
    public static char readMenuSelection() {
        char c;
        for (; ; ) {
            String str = readKeyBoard(1, false);
            c = str.charAt(0);
            if (c != '1' && c != '2' &&
                    c != '3' && c != '4') {
                System.out.print("選擇錯誤，請重新輸入：");
            } else break;
        }
        return c;
    }
    /**
     *
     * @Description 該方法提示並等待，直到用戶按回車鍵後返回。
     * @author shkstart
     * @date 2019年2月12日上午12:03:50
     */
    public static void readReturn() {
        System.out.print("按Enter鍵繼續...");
        readKeyBoard(100, true);
    }
    /**
     *
     * @Description 該方法從鍵盤讀取一個長度不超過2位的整數，並將其作為方法的返回值。
     * @author shkstart
     * @date 2019年2月12日上午12:04:04
     * @return
     */
    public static int readInt() {
        int n;
        for (; ; ) {
            String str = readKeyBoard(2, false);
            try {
                n = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.print("數字輸入錯誤，請重新輸入：");
            }
        }
        return n;
    }
    /**
     *
     * @Description 從鍵盤讀取‘Y’或’N’，並將其作為方法的返回值。
     * @author shkstart
     * @date 2019年2月12日上午12:04:45
     * @return
     */
    public static char readConfirmSelection() {
        char c;
        for (; ; ) {
            String str = readKeyBoard(1, false).toUpperCase();
            c = str.charAt(0);
            if (c == 'Y' || c == 'N') {
                break;
            } else {
                System.out.print("選擇錯誤，請重新輸入：");
            }
        }
        return c;
    }

    private static String readKeyBoard(int limit, boolean blankReturn) {
        String line = "";

        while (scanner.hasNextLine()) {
            line = scanner.nextLine();
            if (line.length() == 0) {
                if (blankReturn) return line;
                else continue;
            }

            if (line.length() < 1 || line.length() > limit) {
                System.out.print("輸入長度（不大於" + limit + "）錯誤，請重新輸入：");
                continue;
            }
            break;
        }

        return line;
    }
}