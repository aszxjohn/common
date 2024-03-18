package com.example.common.config;

import java.util.Arrays;
import java.util.Optional;

import lombok.AllArgsConstructor;
import lombok.Getter;


/**
 * 狀態回傳碼與訊息對應檔
 *
 * @author John
 * @since 2024-03-06
 */
@Getter
@AllArgsConstructor
public enum MessageCode implements ICode {
	
	// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	// 注意: 代碼用意只是讓先前帶入進來的程式模板能順利通過編譯，
	// 　　　不會造成編譯失敗，之後會再行移除!!
	// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    VALIDATE_ARGS_FAILED(400, "VALIDATE_ARGS_FAILED"),
    Forbidden(403, "FORBIDDEN"),
    NOT_FOUND(404, "NOT_FOUND"),
    FAILED(500, "INTERNAL_SERVER_ERROR"),
    // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    
	// 共用訊息相關(0-1000)
    SUCCESS(0, "SUCCESS"),
    UNAUTHORIZED(401, "UNAUTHORIZED"),
    FORBIDDEN(403, "FORBIDDEN"),
    
    // 帳號狀態相關(2000-31000)
    ACCOUNT_EXISTS(2000, "ACCOUNT_EXISTS"),
    ACCOUNT_DOES_NOT_EXIST(2001, "ACCOUNT_DOES_NOT_EXIST"),
    VERIFY_EMAIL_STILL_VALID(2002, "VERIFY_EMAIL_STILL_VALID")
    
    
    ;

	/**
	 * 狀態代碼
	 */
    private long code;
	
    /**
     * 狀態訊息
     */
    private String msg;

    
    /**
     * 透過 code 回傳對應的 Enum MessageCode
     * 
     * @param code 狀態代碼
     * @return MessageCode 狀態回傳碼與訊息對應 列舉物件
     */
    public static MessageCode getCodeEnum(long code) {
        Optional<MessageCode> messageCodeOpt = Arrays.stream(values())
                                                     .filter(mc -> mc.getCode() == code)
                                                     .findFirst();
        return (messageCodeOpt.isPresent() ? messageCodeOpt.get() : null);
    }
    
    /**
     * 透過 msg 回傳對應的 Enum MessageCode
     * 
     * @param msg 狀態訊息
     * @return MessageCode 狀態回傳碼與訊息對應 列舉物件
     */
    public static MessageCode getMsgEnum(String msg) {
        Optional<MessageCode> messageCodeOpt = Arrays.stream(values())
									                 .filter(mc -> mc.getMsg().equals(msg))
									                 .findFirst();
        return (messageCodeOpt.isPresent() ? messageCodeOpt.get() : null);
    }
    
}
