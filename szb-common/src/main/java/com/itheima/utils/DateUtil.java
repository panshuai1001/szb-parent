package com.itheima.utils;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

/**
 * @author lujun
 * @date 2020/5/6 17:36
 * 日期工具类
 */
public final class DateUtil {
    /**
     * LocalDateTime转换为Date
     *
     * @param dateTime
     * @return
     */
    public static Date localDateTimeToDate(LocalDateTime dateTime) {
        return Date.from(dateTime.atZone(ZoneId.systemDefault()).toInstant());
    }

    /**
     * Date转换为LocalDateTime
     *
     * @param date
     * @return
     */
    public static LocalDateTime dateToLocalDateTime(Date date) {
        return LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
    }

    /**
     * 在指定日期时间上添加days天,返回新的日期时间Date对象
     *
     * @param dateTime
     * @param days     添加的天数
     * @return 新的日期时间Date对象
     */
    public static Date plusDays(LocalDateTime dateTime, int days) {
        LocalDateTime newTime = dateTime.plusDays(days);
        return DateUtil.localDateTimeToDate(newTime);
    }
    /**
     * 在指定日期时间上添加days天,返回新的日期时间Date对象
     *
     * @param date
     * @param days     添加的天数
     * @return 新的日期时间Date对象
     */
    public static Date plusDays(Date date, int days) {
        LocalDateTime localDateTime = DateUtil.dateToLocalDateTime(date);
        LocalDateTime newTime = localDateTime.plusDays(days);
        return DateUtil.localDateTimeToDate(newTime);
    }
    /**
     * 返回2个日期时间相差的分钟数
     *
     * @param date1 第1个日期时间
     * @param date2 第2个日期时间
     * @return d1和d2相差的分钟数
     */
    public static long getDuration(Date date1, Date date2) {
        LocalDateTime d1 = DateUtil.dateToLocalDateTime(date1);
        LocalDateTime d2 = DateUtil.dateToLocalDateTime(date2);
        Duration duration = Duration.between(d1, d2);
        return duration.toMinutes();
    }
}
