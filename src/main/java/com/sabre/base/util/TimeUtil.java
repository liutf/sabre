package com.sabre.base.util;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by liutf on 2016/8/3.
 */
public class TimeUtil {

    public static final String PATTERNY_YYYMMDDHHMMSS = "yyyyMMddHHmmss";
    public static final String DATE_PATTERN_MMDDYYYY_HHMMSS = "MM/dd/yyyy HH:mm:ss";
    public static final String DATE_PATTERN_YYYY_MMDD_HHMMSS = "yyyy-MM-dd HH:mm:ss";

    /**
     * 获取当前时间
     * @return
     */
    public static String getSysDate(){
        DateTimeFormatter format = DateTimeFormatter.ofPattern(DATE_PATTERN_MMDDYYYY_HHMMSS);
        return LocalDateTime.now().format(format);
    }

    /**
     * 获取当前时间
     * @return
     */
    public static String getFormatSysDate(){
        DateTimeFormatter format = DateTimeFormatter.ofPattern(DATE_PATTERN_YYYY_MMDD_HHMMSS);
        return LocalDateTime.now().format(format);
    }

    public static Timestamp getSysDateTimeStamp(){
        return Timestamp.valueOf(getFormatSysDate());
    }

    /**
     * 获取当前时间 , yyyyMMddHHmmss
     * @return
     */
    public static String getSysDateStr(){
        DateTimeFormatter format = DateTimeFormatter.ofPattern(PATTERNY_YYYMMDDHHMMSS);
        return LocalDateTime.now().format(format);
    }

}
