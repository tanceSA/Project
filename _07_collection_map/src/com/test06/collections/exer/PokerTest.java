package com.test06.collections.exer;

import java.util.*;

/**
 * ClassName: PokerTest
 * Package: com.test06.collections.exer
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/4/13 下午 03:38
 * @Version 1.0
 */
public class PokerTest {
    public static void main(String[] args) {

        //1. 組成一副撲克牌
        System.out.println("組成一副撲克牌");
        String[] num = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] color = {"方塊", "梅花", "红心", "黑桃"};
        ArrayList poker = new ArrayList();

        for (int i = 0; i < color.length; i++) {
            for (int j = 0; j < num.length; j++) {
                poker.add(color[i] + num[j]);
            }
        }
        poker.add("大Joker");
        poker.add("小Joker");

        System.out.println(poker);

        //2. 洗牌
        System.out.println("洗牌");
        Collections.shuffle(poker);
        Collections.shuffle(poker);
        System.out.println(poker);

        //3. 發牌
        System.out.println("發牌");

        TreeSet player1Cards = new TreeSet();
        TreeSet player2Cards = new TreeSet();
        TreeSet player3Cards = new TreeSet();
        TreeSet baseCards = new TreeSet();

        for (int i = 0; i < poker.size(); i++) {
            int temp = i % 3;
            if (i >= poker.size() - 3) {
                baseCards.add(poker.get(i));
            } else if (temp == 0) {
                player1Cards.add(poker.get(i));

            } else if (temp == 1) {
                player2Cards.add(poker.get(i));

            } else {
                player3Cards.add(poker.get(i));
            }
        }
        //理牌


        //4.看牌
        System.out.println("看牌");
        System.out.println("player1Cards:" + player1Cards);
        System.out.println("player2Cards:" + player2Cards);
        System.out.println("player3Cards:" + player3Cards);
        System.out.println("baseCards:" + baseCards);

    }

}

