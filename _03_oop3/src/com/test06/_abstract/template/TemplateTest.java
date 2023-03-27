package com.test06._abstract.template;

/**
 * ClassName: Template
 * Package: com.test06._abstract.template
 * Description:
 *  抽像應用案例：模板方法的設計模式
 * @Author: TANCE
 * @Create 2023/3/16 下午 04:45
 * @Version 1.0
 */
public class TemplateTest {
    public static void main(String[] args) {
        PrintPrimeNumber p = new PrintPrimeNumber();
        p.spendTime();
    }
}

abstract  class  Template{

    public void spendTime(){
        long start = System.currentTimeMillis();
        code();
        long end = System.currentTimeMillis();

        System.out.println("code spend time is "+ (start-end));
    }
    public abstract void code();
}

class PrintPrimeNumber extends Template{
    @Override
    public void code() {
        for(int i = 2;i<=10000;i++){
            boolean isFlag = true;
            for(int j = 2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    isFlag = false;
                }
            }
            if(isFlag)
                System.out.println(i);
        }
    }
}
