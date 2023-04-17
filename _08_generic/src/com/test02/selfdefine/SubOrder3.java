package com.test02.selfdefine;

/**
 * ClassName: SubOrder3
 * Package: com.test02.selfdefine
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/4/17 上午 11:26
 * @Version 1.0
 */
public class SubOrder3 <T> extends Order<T>{
    public void show(T t){
        System.out.println(t);
    }
}
