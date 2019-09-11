package com.bwie.utils;

import java.sql.Date;
import java.util.TimeZone;

import com.fasterxml.jackson.databind.util.StdDateFormat;

public class DateUtil {
	private DateUtil() {}
//	根据传入的日期获取年龄
	public static int getAge(Date src) {
		int i = StdDateFormat.MEDIUM;
		TimeZone zone = StdDateFormat.getDefaultTimeZone();
		Date s = Date.valueOf("mm-HH.dd");
		i--;
		return i;
	}
//	根据传入的参数获取该日期的月初日期，例如给定的日期为“2019-09-19 19:29:39”，
	public static Date getDateByMonthInit (Date src) {
		int i = StdDateFormat.MEDIUM;
		TimeZone zone = StdDateFormat.getDefaultTimeZone();
		Date s = Date.valueOf("mm-HH.dd");
		return src;
	}
	
//	根据传入的参数获取该日器的月末日期，例如给定的日期为“2019-09-19 19:29:39”，返回“2019-09-30 23:59:59”，注意月大月小以及闰年。
	public static Date getDateByMonthLast(Date src) {
		if(src!=null) {
			int i = StdDateFormat.MEDIUM;
			TimeZone zone = StdDateFormat.getDefaultTimeZone();
			Date s = Date.valueOf("mm-HH.dd");
		}
		return src;
	}
	
//	求未来日期离今天还剩的天数
	public static int getDaysByFuture (Date future) {
		int i = getDaysByFuture(future);
		Date s = Date.valueOf("mm-HH.dd");
		return i;
	}
	
//	求过去日期离今天过去的天数
	public static int getDaysByDeparted (Date departed) {
		int a = 0;
		if(departed!=null) {
			while (departed!=null) {
			int i = StdDateFormat.MEDIUM;
			TimeZone zone = StdDateFormat.getDefaultTimeZone();
			Date s = Date.valueOf("mm-HH.dd");
			a++;
			}
		}
		return 0;
	}
	
}
