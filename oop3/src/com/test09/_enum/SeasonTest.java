package com.test09._enum;

/**
 * ClassName: SeasonTest
 * Package: com.test09._enum
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/20 上午 09:03
 * @Version 1.0
 */
public class SeasonTest {
    public static void main(String[] args) {
        System.out.println(Season.SPRING.getSeasonName());
    }
}

//jdk5.0之前定義枚舉類的方式
class Season{
    //2.宣告當前類別的實例變數
    private final String SEASONNAME;
    private final String SEASONDESC;

    //1.私有化建構子
    public Season(String seasonName, String seasonDesc) {
        this.SEASONNAME = seasonName;
        this.SEASONDESC = seasonDesc;
    }

    // 3.提供實例變數的get方法
    public String getSeasonName() {
        return SEASONNAME;
    }

    public String getSeasonDesc() {
        return SEASONDESC;
    }

    //4.建立當前類別的實例
    public static final Season SPRING = new Season("春天","1");
    public static final Season SUMMER = new Season("夏天","2");
    public static final Season AUTUMN = new Season("秋天","3");
    public static final Season WINTER = new Season("冬天","4");
}
//