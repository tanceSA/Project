package com.test04.set.exer1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * ClassName: Exer01
 * Package: com.test04.set.exer1
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/4/12 下午 01:58
 * @Version 1.0
 */
public class Exer01 {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add(12);
        list.add(12);
        list.add(16);
        list.add(18);
        list.add(18);
        list.add(18);
        list.add(24);
        list.add(26);
        list.add(26);
        list.add(26);
        list.add(28);

        List newList = duplicateList(list);

        System.out.println(list);
        System.out.println(newList);


    }
    public static List duplicateList(List list){
//        Set set = new HashSet(list);
//        return new ArrayList(set);
        return  new ArrayList(new HashSet(list));
    }
}
