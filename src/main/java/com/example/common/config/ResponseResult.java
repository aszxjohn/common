package com.example.common.config;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


public class ResponseResult<T> extends ResponseEntity<T> {

	public ResponseResult(HttpStatus status) {
		super(status);
	}

	public ResponseResult(T body, HttpStatus status) {
		super(body, status);
	}

	/**
	 * 成功返回结果
	 *
	 * @param data 獲取的數據
	 */
	public static <T> ResponseEntity<Object> accpeted(HttpBody<T> data) {
		return new ResponseResult<>(data, HttpStatus.ACCEPTED);
	}

	public static <T> ResponseEntity<Object> accpeted(PageData<T> data) {
		return new ResponseResult<>(data, HttpStatus.ACCEPTED);
	}
	
	public static <T> ResponseEntity<Object> ok(HttpBody<T> data) {
		return new ResponseResult<>(data, HttpStatus.OK);
	}

	public static <T> ResponseEntity<Object> ok(PageData<T> data) {
		return new ResponseResult<>(data, HttpStatus.OK);
	}

	public static <T> ResponseEntity<Object> created(HttpBody<T> data) {
		return new ResponseResult<>(data, HttpStatus.CREATED);
	}

	public static <T> ResponseEntity<Object> badRequest(HttpBody<T> data) {
		return new ResponseResult<>(data, HttpStatus.BAD_REQUEST);
	}
	
	
	/**
	 * 未登錄返回结果
	 */
	public static <T> ResponseEntity<T> unauthorized(T data) {
		return new ResponseEntity<>(data, HttpStatus.UNAUTHORIZED);
	}

	/**
	 * 未授權返回结果
	 */
	public static <T> ResponseEntity<T> forbidden(T data) {
		return new ResponseEntity<>(data, HttpStatus.FORBIDDEN);
	}
	
	public static <T> ResponseEntity<Object> forbidden(HttpBody<T> data) {
	    return new ResponseResult<>(data, HttpStatus.FORBIDDEN);
	}


	/**
	 *
	 */
	public static <T> ResponseEntity<T> validateArgsFailed(T data) {
		return new ResponseEntity<>(data, HttpStatus.BAD_REQUEST);
	}

	/**
	 *
	 */
	public static <T> ResponseEntity<T> failed(T data) {
		return new ResponseEntity<>(data, HttpStatus.INTERNAL_SERVER_ERROR);
	}

    /**
     * 226
     */
    public static <T> ResponseEntity<T> imUsed(T data) {
        return new ResponseEntity<>(data, HttpStatus.IM_USED);
    }
    
	/**
	 * 404
	 */
    public static <T> ResponseEntity<T> notFound(T data) {
        return new ResponseEntity<>(data, HttpStatus.NOT_FOUND);
    }
    
}
