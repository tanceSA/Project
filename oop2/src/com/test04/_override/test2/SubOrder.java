package com.test04._override.test2;

import com.test04._override.test1.Order;

/**
 * ClassName: SubOrder
 * Package: com.test04._override.test2
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/8 下午 02:26
 * @Version 1.0
 */
public class SubOrder extends Order {
    public void method1() {

        //orderPrivate;
        //orderDefault;
        oderProtected = 1;
        oderPublic = 1;

        //methodPrivate();
        // methodDefault();
        methodProtected();
        methodPublic();
    }
}
