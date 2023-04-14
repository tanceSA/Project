package com.test01.use;

import org.junit.Test;

import java.util.*;

/**
 * ClassName: CollectionMapTest
 * Package: com.test01.use
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/4/14 下午 04:14
 * @Version 1.0
 */
public class CollectionMapTest {
    /*
     * 未使用泛型的例子
     * */
    @Test
    public void test1() {

        List list = new ArrayList();
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        //問題1: 資料型態不安全，因為add()的參數是Object類型，任何類型都可以添加成功
        list.add("AA");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            //問題2: 需要使用強轉，繁瑣，還有可能導致ClassCastException
            int score = (Integer) iterator.next();
            System.out.println(score);

        }

    }

    /*
     * 泛型在List中使用的例子
     * */
    @Test
    public void test2() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        //編譯不通過，保證類型的安全
        //list.add("AA");

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            //增加的類型都是Integer類型，避免了強轉操作
            int score = iterator.next();
            System.out.println(score);
        }
    }

    /*
     * 泛型在Map中使用的例子
     * */
    @Test
    public void test3() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("AA", 78);
        map.put("BB", 37);
        map.put("CC", 62);

//        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
//        Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();

        var entrySet = map.entrySet();
        var iterator = entrySet.iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+"-->"+value);
        }

    }
}
