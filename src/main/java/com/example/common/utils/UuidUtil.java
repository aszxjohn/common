package com.example.common.utils;

import java.util.UUID;

import org.springframework.stereotype.Component;


@Component
public class UuidUtil {

	/**
	 * 產生一般的 UUID
	 * (例: 27dca2a3-8a64-4e95-af11-23aa94fa5080)
	 * 
	 * @return 36碼 UUID 編號
	 */
	public static String uuidGenerate() {
		UUID uuid = UUID.randomUUID();
		return uuid.toString();
	}
	
}
