package org.baozi.common.util;

import org.apache.commons.lang3.ObjectUtils;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class TimeConvertUtil {
    /**
     * LocalDateTime转时间戳
     *
     * @param localDateTime
     * @return
     */
    public static Long localDateTimeToTimestamp(LocalDateTime localDateTime) {
        return ObjectUtils.isEmpty(localDateTime) ? 0L : localDateTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    /**
     * 时间戳转LocalDateTime
     *
     * @param timestamp
     * @return
     */
    public static LocalDateTime timestampToLocalDateTime(Long timestamp) {
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(timestamp), ZoneId.systemDefault());
    }

    /**
     * LocalDateTime转时间戳（秒）
     *
     * @param localDateTime
     * @return
     */
    public static Long localDateTimeToTimestampSec(LocalDateTime localDateTime) {
        return ObjectUtils.isEmpty(localDateTime) ? 0L : localDateTime.atZone(ZoneId.systemDefault()).toInstant().getEpochSecond();
    }

    /**
     * 时间戳转LocalDateTime（秒）
     *
     * @param timestampSec
     * @return
     */
    public static LocalDateTime timestampToLocalDateTimeSec(Long timestampSec) {
        return LocalDateTime.ofInstant(Instant.ofEpochSecond(timestampSec), ZoneId.systemDefault());
    }

    /**
     * LocalDate转时间戳
     *
     * @param localDate
     * @return
     */
    public static Long localDateToTimestamp(LocalDate localDate) {
        return ObjectUtils.isEmpty(localDate) ? 0L : localDate.atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    /**
     * 时间戳转LocalDate
     *
     * @param timestamp
     * @return
     */
    public static LocalDate timestampToLocalDate(Long timestamp) {
        return LocalDate.ofInstant(Instant.ofEpochMilli(timestamp), ZoneId.systemDefault());
    }

    /**
     * LocalDate转时间戳（秒）
     *
     * @param localDate
     * @return
     */
    public static Long localDateToTimestampSec(LocalDate localDate) {
        return ObjectUtils.isEmpty(localDate) ? 0L : localDate.atStartOfDay(ZoneId.systemDefault()).toInstant().getEpochSecond();
    }

    /**
     * 时间戳转LocalDate（秒）
     *
     * @param timestampSec
     * @return
     */
    public static LocalDate timestampToLocalDateSec(Long timestampSec) {
        return LocalDate.ofInstant(Instant.ofEpochSecond(timestampSec), ZoneId.systemDefault());
    }

}
