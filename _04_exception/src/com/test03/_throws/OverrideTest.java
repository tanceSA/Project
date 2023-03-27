package com.test03._throws;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * ClassName: OverrideTest
 * Package: com.test03._throws
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/27 下午 04:33
 * @Version 1.0
 */
public class OverrideTest {
    public static void main(String[] args) {
        Father f = new Son();
        try {
            f.method1();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Father {
    public void method1() throws IOException {

    }

    public void method2() {

    }

    public void method3() {

    }
}

class Son extends Father {

    @Override
    public void method1() throws FileNotFoundException {

    }

    @Override
    public void method2() {
    }

    @Override
    public void method3() throws RuntimeException {
    }
}