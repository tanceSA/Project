package com.test06.createmore.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * ClassName: CallableTest
 * Package: com.test06.createmore.callable
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/31 下午 04:16
 * @Version 1.0
 */
public class CallableTest {
    public static void main(String[] args) {

        //
        EvenNumberPrint evenNumberPrint= new EvenNumberPrint();

        FutureTask futureTask = new FutureTask(new EvenNumberPrint());

        Thread t1 = new Thread(futureTask);
        t1.start();

        try {
            Object sum = futureTask.get();
            System.out.println(Thread.currentThread().getName() + ":"+sum);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}

class EvenNumberPrint implements Callable {
    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
                sum += i;
            }
        }
        return sum;
    }
}