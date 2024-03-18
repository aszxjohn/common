package com.example.common.config;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class HttpBody<T> {
    private long code;

    private String msg;

    private T data;

    protected HttpBody() {
    }

    protected HttpBody(long code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    protected HttpBody(ICode commonCode, T data) {
        this.code = commonCode.getCode();
        this.msg = commonCode.getMsg();
        this.data = data;
    }

    public static <T> HttpBody<T> build(ICode iCode, T data) {
    	return new HttpBody<>(iCode, data);
    }

    public static <T> HttpBody<T> build(long code, String msg, T data) {
    	return new HttpBody<>(code, msg, data);
    }


}
