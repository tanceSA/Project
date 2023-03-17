package com.test07._interface.exer2;

/**
 * ClassName: ComparableCircle
 * Package: com.test07._interface.exer2
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/17 上午 11:45
 * @Version 1.0
 */
public class ComparableCircle extends Circle implements CompareObject{

    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }
    //根據對象半徑大小比較大小
    @Override
    public int compareTo(Object o) {
        if(this == o)
            return 0;

//        if(o instanceof ComparableCircle c){
//            if(this.getRadius()>c.getRadius())
//                return 1;
//            else
//                return -1;
//        }
        if(o instanceof ComparableCircle c)
            return Double.compare(this.getRadius(),c.getRadius());
        else {
            //throw new RuntimeException("輸入類型錯誤");
            return 2;
        }

    }
}
