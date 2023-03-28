package com.test04._throw;

/**
 * ClassName: BelowZeroException
 * Package: com.test04._throw
 * Description:
 *
 * @Author: TANCE
 * @Create 2023/3/28 上午 09:53
 * @Version 1.0
 */
//自定義例外類別
public class BelowZeroException extends Exception{
    static final long serialVersionUID = -338751L;//需獨立不重複
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
