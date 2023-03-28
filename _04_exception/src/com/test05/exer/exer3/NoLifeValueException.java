package com.test05.exer.exer3;

/**
 * ClassName: NoLifeValueException
 * Package: com.test05.exer.exer3
 * Description:
 * (1)自行定義例外類別NolifeValueException 繼承 RuntimeException
 * ①提供無參數和有參數的建構子
 * ②在有參數建構子中需調用父類別的參數構造，代入參數 *
 * @Author: TANCE
 * @Create 2023/3/28 上午 10:58
 * @Version 1.0
 */
public class NoLifeValueException extends RuntimeException{
    static final long serialVersionUID = -70348971907457669L;
    public NoLifeValueException() {
    }

    public NoLifeValueException(String message) {
        super(message);
    }
}
