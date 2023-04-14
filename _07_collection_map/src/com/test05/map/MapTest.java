package com.test05.map;

import com.test04.set.User;
import org.junit.Test;

import java.util.*;

/**
 * ClassName: MapTest
 * Package: com.test05.map
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/4/12 下午 02:53
 * @Version 1.0
 */
public class MapTest {
    /*
     * 測試Map中的實現類別
     * */
    @Test
    public void test1() {
        Map map = new HashMap();

        map.put(null, null);

        System.out.println(map);

    }

    @Test
    public void test2() {
        Map map = new Hashtable();

//        map.put(null,null);//NullPointerException
//        map.put(null,20);//NullPointerException
//        map.put(20,null);//NullPointerException
        map.put(20, 20);

        System.out.println(map);

    }

    @Test
    public void test3() {
        Map map = new LinkedHashMap();

        map.put("CC", 20);
        map.put(20, "CC");
        map.put("11", 50);
        map.put("78", 60);

        System.out.println(map);

        Map map1 = new HashMap();
    }

    /*
     * 測試Map中的常用方法
     *
        增:
            put(Object key,Object value)
            putAll(Map m)
        刪:
            Object remove(Object key)
        改:
            put(Object key,Object value)    //修改相同key的value值
            putAll(Map m)
        查::
            Object get(Object key)
        長度:
            int size()
        遍歷:
            Set keySet()
            Collection values()
            Set entrySet()
     */
    @Test
    public void test4() {
        HashMap map = new HashMap();

        //新增: put(Object key,Object value)
        map.put("A", 60);
        map.put("B", 74);
        map.put(3, 88);
        map.put(new Person("Jack", 22), 67);

        System.out.println(map);
        //size()
        System.out.println("map.size() return: " + map.size());

        //Object remove(Object key)
        Object removeValue = map.remove("B");
        System.out.println("map.remove(\"B\") return: " + removeValue);
        System.out.println(map);

        //修改: put(Object key,Object value)
        Object oldValue = map.put("A", 72);
        System.out.println("map.put(\"A\", 72) return: " + oldValue);
        System.out.println(map);

        //Object get(Object key)
        Object value = map.get(3);
        System.out.println("map.get(3) return: " + value);

    }

    //map的遍歷操作
    @Test
    public void test5() {
        HashMap map = new HashMap();

        //新增: put(Object key,Object value)
        map.put("A", 60);
        map.put("B", 74);
        map.put(3, 88);
        map.put(new Person("Jack", 22), 67);

        Set keySet = map.keySet();
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            Object key = it.next();
            System.out.println(key);
        }

        //遍歷value
        Collection values = map.values();

        for (Object o : values
        ) {
            System.out.println(o);
        }

    }

    @Test
    public void test6() {
        HashMap map = new HashMap();

        com.test04.set.User u1 = new com.test04.set.User("Li",18);
        com.test04.set.User u2 = new com.test04.set.User("Chen",28);
        com.test04.set.User u3 = new com.test04.set.User("Lin",28);
        com.test04.set.User u4 = new com.test04.set.User("Yang",12);
        com.test04.set.User u5 = new User("Wang",18);


        map.put("A", 60);
        map.put("B", 74);
        map.put(3, 88);
        map.put(new Person("Jack", 22), 67);

        Set entrySet = map.entrySet();
        Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            System.out.println(entry.getKey() + "-->" + entry.getKey());
        }
    }
}
