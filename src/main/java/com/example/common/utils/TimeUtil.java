package com.example.common.utils;

import java.sql.Timestamp;
import java.time.LocalDateTime;


public class TimeUtil {

	/**
	 * 計算過期時間
	 * @param second
	 * @return
	 */
    public static Timestamp getExpiredTime(Long second) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime expiredTime = now.plusSeconds(second);
        Timestamp timestamp = Timestamp.valueOf(expiredTime);
        return timestamp;
    }
   
}

