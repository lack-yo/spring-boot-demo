package com.lou.exception;

/**
 * 控制层异常
 * @author loufeng
 * @date 2018/9/14 上午9:46
 */
public class WebException extends Exception {
    public WebException(String msg) {
        super(msg);
    }
}
