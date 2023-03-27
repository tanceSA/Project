package com.test05.method_more;

/**
 * ClassName: Recursion
 * Package: com.test05.method_more
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/6 上午 10:04
 * @Version 1.0
 */
public class RecursionTest {
    public static void main(String[] args) {

        RecursionTest R1 = new RecursionTest();

        int num = 5;
        //System.out.println(R1.getSum(num));

        int n = 10;
        R1.f(n);
    }

    public int getSum(int num){
        int sum = 0;
        if(num == 1){
            return 1;
        }
        else{
            sum = num+getSum(num-1);
            System.out.println("sum = "+sum);
            return sum;
        }
    }
    //f(n) = f(n-1)+f(n-2);
    public int f(int n){
        if(n<3)
            return 1;
        else{
            int sum = f(n - 1)+f(n - 2);
            return sum;
        }
    }
    /*
    f(10) = f(9)+f(8);  34 + 21 = 55
    f(9) = f(8)+f(7);   21 + 13 =34
    f(8) = f(7)+f(6);   13 + 8 = 21
    f(7) = f(6)+f(5);   8 + 5 = 13
    f(6) = f(5)+f(4);   5 + 3 = 8
    f(5) = f(4)+f(3);   3 + 2 = 5
    f(4) = f(3)+f(2);   2 + 1 = 3
    f(3) = f(2)+f(1);   1 + 1 = 2
    f(2) = 1;
    f(1) = 1;
     */
}


