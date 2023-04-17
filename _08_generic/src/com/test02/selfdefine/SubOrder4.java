package com.test02.selfdefine;

/**
 * ClassName: SubOrder4
 * Package: com.test02.selfdefine
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/4/17 上午 11:38
 * @Version 1.0
 */
public class SubOrder4<E> extends Order<Integer> {
    E e;

    public SubOrder4() {
    }

    public SubOrder4(E e) {
        this.e = e;
    }

    public SubOrder4(Integer integer, int orderId, E e) {
        super(integer, orderId);
        this.e = e;
    }

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }
}
