package com.test09._enum.exer2;

/**
 * ClassName: ColorTest
 * Package: com.test09._enum.exer2
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/20 上午 11:01
 * @Version 1.0
 */
public class ColorTest {
    public static void main(String[] args) {
        System.out.println(Color.BLUE.toString());
    }

}

enum Color{
    RED(255,0,0,"紅"),
    ORANGE(255,128,0,"橙"),
    YELLOW(255,255,0,"黃"),
    GREEN(0,255,0,"綠"),
    BLUE(0,0,255,"藍"),
    INDIGO(43,0,255,"靛"),
    PURPLE(87,0,255,"紫");
    ;
    private final int red;
    private final int green;
    private final int blue;
    private final String description;

    Color(int red, int green, int blue, String description) {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.description = description;
    }

    @Override
    public String toString() {
        return  name()+"(" + red +
                "," + green +
                "," + blue +
                ")->" + description + "色";
    }
}