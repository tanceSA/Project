package com.test04.set.exer2;

import java.util.HashSet;
import java.util.Set;

/**
 * ClassName: RandomValueTest
 * Package: com.test04.set.exer2
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/4/12 下午 02:14
 * @Version 1.0
 */
public class RandomValueTest {
    public static void main(String[] args) {
        System.out.println(createRandomList(1,20,10));
    }

    public static Set createRandomList(int minValue, int maxValue, int amount) {
        if((maxValue-minValue+1)<amount){
            throw new RuntimeException("資料範圍小於數量");
        }

        Set set = new HashSet();
        while (true){
            set.add((int)(Math.random()*(maxValue-minValue+1)+minValue));

            if(set.size()==amount){
                return set;
            }
        }
    }
}
