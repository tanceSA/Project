package com.test04._override.test3;

/**
 * ClassName: OrverrideTest
 * Package: com.test04._override.test2
 * Description:
 * 方法重寫規則
 * ① 方法名稱與參數需相同
 * ② 子類權限修飾子不小於父類權限
 *    ->無法重寫父類宣告為private的方法
 * ③ 返回值規則
 *    -> 父類別被重寫的方法權限為void，則子類別方法返回值必須是void
 *    ->            基本資料型態                   必須與父類別相同
 *    ->            參考資料型態                   與父類別相同或子類別
 *
 * @Author: TANCE
 * @Create 2023/3/9 上午 09:41
 * @Version 1.0
 */
public class OrverrideTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.sleep();
        System.out.println(person.sleep(1));


        Student student = new Student();
        student.sleep();
        student.sleep();
        System.out.println(student.sleep(1));
    }
}
