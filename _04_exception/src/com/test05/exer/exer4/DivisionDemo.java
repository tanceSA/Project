package com.test05.exer.exer4;

import com.test04._throw.BelowZeroException;

/**
 * ClassName: DivisionDemo
 * Package: com.test05.exer.exer4
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/28 上午 11:27
 * @Version 1.0
 */
public class DivisionDemo {
    public static void main(String[] args) {
        try {
            int m = Integer.parseInt(args[0]);
            int n = Integer.parseInt(args[1]);
            int result = divide(m, n);
            System.out.println(m+"除以"+ n + " 結果為: "+result);
        } catch (BelowZeroException e) {
            System.out.println(e.getMessage());
        }catch (NumberFormatException e){
            System.out.println("數據類型不一致");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("缺少命令列參數");
        }catch (ArithmeticException e){
            System.out.println("除數不能為0");
        }
    }

    public static int divide(int m, int n) throws BelowZeroException {
        if (m < 0 || n < 0)
            throw new BelowZeroException("輸入不得為負值");

        return m / n;
    }
}
