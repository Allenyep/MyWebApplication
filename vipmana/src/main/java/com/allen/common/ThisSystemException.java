package com.allen.common;

/**
 * Created by allen on 2017/5/10.
 */
public class ThisSystemException extends RuntimeException{
    public ThisSystemException(String message) {
        super(message);
    }

    public ThisSystemException(String message, Throwable cause) {
        super(message, cause);
    }
}
