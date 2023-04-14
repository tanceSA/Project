package com.test03.list.interview;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: interviewTest
 * Package: com.test03.list.interview
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/4/12 上午 10:37
 * @Version 1.0
 */
public class interviewTest {
    @Test
    public void testListRemove(){
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        updateList(list);
        System.out.println(list);

    }

    private static void updateList(List list){
        list.remove(2);
    }
}
