package com.test04.set.interview;

import java.util.HashSet;

/**
 * ClassName: HashSetDemo
 * Package: com.test04.set.interview
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/4/12 下午 02:34
 * @Version 1.0
 */
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        Person p1 = new Person(1001,"AA");
        Person p2 = new Person(1002,"BB");

        set.add(p1);
        set.add(p2);
        p1.name = "CC";
        set.remove(p1);
        System.out.println(set);

        set.add(new Person(1001,"CC"));
        System.out.println(set);

        set.add(new Person(1001,"AA"));
        System.out.println(set);
    }
}
