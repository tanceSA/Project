package com.test04.objarr;

/**
 * ClassName: Student
 * Package: com.test04.objarr
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/3 下午 03:11
 * @Version 1.0
 */
public class Student {
    public int number;
    int state;
    int score;

    public String show(){
        return "Number = " + number + ", state = " + state + ", score = " + score;
    }
}
