package com.example.common.config;

/**
 *
 * @author john
 *
 */
public class CodeImpl implements ICode {

	private long code;
	private String msg;

	public CodeImpl(long code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	@Override
	public long getCode() {
		return this.code;
	}

	@Override
	public String getMsg() {
		return this.msg;
	}

}
