package com.bwie.test;

import java.sql.Date;

import com.bwie.utils.DateUtil;


public class Test {
	private  DateUtil da;
	public static void main(String[] args) {
		Date src = Date.valueOf("2019-9-11");
		DateUtil.getAge(src);
		DateUtil.getDateByMonthInit(src);
		DateUtil.getDateByMonthLast(src);
		DateUtil.getDaysByDeparted(src);
		DateUtil.getDaysByFuture(src);
	}
	
}
