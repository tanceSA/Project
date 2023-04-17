package com.test02.selfdefine;

/**
 * ClassName: SubOrder5
 * Package: com.test02.selfdefine
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/4/17 上午 11:42
 * @Version 1.0
 */
public class SubOrder5<T,E> extends Order<T>{
    E e;

    public SubOrder5() {
    }

    public SubOrder5(T t, int orderId, E e) {
        super(t, orderId);
        this.e = e;
    }
}
