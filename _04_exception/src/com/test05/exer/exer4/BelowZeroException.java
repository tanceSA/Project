package com.test05.exer.exer4;

/**
 * ClassName: BelowZeroException
 * Package: com.test05.exer.exer4
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/28 上午 11:31
 * @Version 1.0
 */
public class BelowZeroException extends Exception{
    static final long serialVersionUID = -3387516993124229L;
    public BelowZeroException() {
    }

    public BelowZeroException(String message) {
        super(message);
    }

    public BelowZeroException(String message, Throwable cause) {
        super(message, cause);
    }

    public BelowZeroException(Throwable cause) {
        super(cause);
    }

    public BelowZeroException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
