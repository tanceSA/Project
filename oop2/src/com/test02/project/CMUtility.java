package com.test02.project;

import java.util.Scanner;

/**
 * ClassName: CMUtility
 * Package: com.test02.project
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/7 下午 02:47
 * @Version 1.0
 */
public class CMUtility {
    public static Scanner scanner = new Scanner(System.in);

    public static char readMenuSelection() {
        for (; ; ) {
            String str = readKeyBoard(1,false);
            char c = str.charAt(0);
            switch (c){
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                    return c;
                default:
                    System.out.print("選擇錯誤, 請重新輸入: ");
            }
        }
    }

    public static char readConfirmSelection(){
        for (; ; ) {
            String str = readKeyBoard(1,false).toUpperCase();
            char c = str.charAt(0);
            switch (c){
                case 'Y':
                case 'N':
                    return c;
                default:
                    System.out.print("選擇錯誤, 請重新輸入: ");
            }
        }
    }
    public static String readString(int limit){
        String str = readKeyBoard(limit, false);
        return str;
    }

    public static char readChar(){
        String str  = readKeyBoard(1, false);
        return str.charAt(0);
    }

    public static int readInt(){
        int n;
        while (true){
            String str = readKeyBoard(3, false);
            try {
                n = Integer.parseInt(str);
                break;
            }
            catch (NumberFormatException e){
                System.out.print("格式錯誤, 請重新輸入: ");
            }
        }
        return n;
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
