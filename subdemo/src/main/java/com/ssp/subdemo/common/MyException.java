package com.ssp.subdemo.common;

/**
 * �๦������
 *
 * @Author wudongli
 * @Date 2020/1/1 15:41
 */
public class MyException extends Exception {

    public MyException() {
    }

    public MyException(String message) {
        super(message);
        System.out.println("IamMyException");
    }
}
