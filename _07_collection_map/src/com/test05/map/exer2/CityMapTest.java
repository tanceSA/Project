package com.test05.map.exer2;

import java.util.*;

/**
 * ClassName: ProvinceTest
 * Package: com.test05.map.exer2
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/4/13 下午 01:33
 * @Version 1.0
 */
class CityMap {
    public static Map model = new HashMap();

    static {
        model.put("台北市", new String[]{"中正區", "大同區", "中山區", "松山區", "大安區", "萬華區", "信義區", "士林區", "北投區", "內湖區",
                "南港區", "文山區"});
        model.put("新北市", new String[]{"萬里區", "金山區", "板橋區", "汐止區", "深坑區", "石碇區", "瑞芳區", "平溪區", "雙溪區", "貢寮區",
                "新店區", "坪林區", "烏來區", "永和區", "中和區", "土城區", "三峽區", "樹林區", "鶯歌區", "三重區",
                "新莊區", "泰山區", "林口區", "蘆洲區", "五股區", "八里區", "淡水區", "三芝區", "石門區"});
        model.put("桃園市", new String[]{"中壢區", "平鎮區", "龍潭區", "楊梅區", "新屋區", "觀音區", "桃園區", "龜山區", "八德區", "大溪區",
                "復興區", "大園區", "蘆竹區"});
    }
}

public class CityMapTest {
    public static void main(String[] args) {

        //1. 取得Map，並遍歷Map中所有的Key
        Map map = CityMap.model;

        Set cities = map.keySet();

        for (Object city : cities) {
            System.out.print(city + "\t\t");
        }


        //2. 從鍵盤取得城市名稱，判斷是否存在，如果存在就遍歷value中的各行政區
        //   如果不存在提示用戶重新輸入
        Scanner scan = new Scanner(System.in);
        String[] states;
        while (true) {
            System.out.println("\n請輸入您所在的城市");
            String inputCity = scan.next();

            states = (String[]) map.get(inputCity);
            if (states == null || states.length == 0) {
                System.out.print("輸入城市名稱錯誤，請重新輸入!");
            } else {
                break;
            }
        }

        //3. 從鍵盤取得行政區名稱，遍歷各行政區構成的String[]，判斷行政區是否存在
        //   如果存在，顯示登記完成，如果不存在提示用戶重新輸入
        for (int i = 0; i < states.length; i++
        ) {
            System.out.print(states[i] + "\t\t");
            if (i % 10 == 0 && i != 0) {
                System.out.println();
            }
        }

        while (true){
            System.out.println("\n請輸入您所在的行政區");
            String inputState = scan.next();

            if(containsState(states,inputState)){
                System.out.println("登記完成");
                break;
            }
            else {
                System.out.print("輸入行程區名稱錯誤，請重新輸入!");
            }
        }

        scan.close();

    }
    public static boolean containsState(String[] states, String state){
        for(int i=0;i<states.length;i++){
            if(states[i].equals(state)){
                return true;
            }
        }
        return false;
    }
}

