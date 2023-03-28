package com.test05.exer.exer1;

/**
 * ClassName: ComparableCircle
 * Package: com.test07._interface.exer2
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/17 上午 11:45
 * @Version 1.0
 */
public class ComparableCircle extends Circle implements CompareObject {

    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }
    //根據對象半徑大小比較大小
    @Override
    public int compareTo(Object o) throws Exception {
        if(this == o)
            return 0;
        if(o instanceof ComparableCircle c)
            return Double.compare(this.getRadius(),c.getRadius());
        else {
            throw new Exception("輸入類型錯誤");
        }

    }
}
