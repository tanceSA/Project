package com.test02.selfdefine.exer1;

import java.util.*;

/**
 * ClassName: DAO
 * Package: com.test02.selfdefine.exer1
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/4/17 下午 04:28
 * @Version 1.0
 */
public class DAO<T> {
    Map<String, T> map = new HashMap<>();


    public void save(String id, T entity) {
        if(!map.containsKey(id))
        map.put(id, entity);
    }

    public T get(String id) {
        return map.get(id);
    }

    public void update(String id, T entity) {
        if(map.containsKey(id))
            map.put(id, entity);
    }

    public List<T> list() {
        //方式1
//        List<T> list = new ArrayList<>();
//        list.addAll(map.values());
//        return list;

        //方式2
        return new ArrayList<T>(map.values());
    }

    public void delete(String id) {
        map.remove(id);
    }
}
