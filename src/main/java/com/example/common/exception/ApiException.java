package com.example.common.exception;

import com.example.common.config.ICode;

/**
 * 自定義API異常
 */
public class ApiException extends RuntimeException {
    private ICode errorCode;

    public ApiException(ICode errorCode) {
        super(errorCode.getMsg());
        this.errorCode = errorCode;
    }

    public ApiException(String message) {
        super(message);
    }


    public ApiException(Throwable cause) {
        super(cause);
    }

    public ApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public ICode getErrorCode() {
        return errorCode;
    }
}
