package com.date;

import java.util.Date;
import java.util.Calendar;
import java.util.Locale;
import java.text.DateFormat;

public class DateTest {

	public static void main(String[] args) {
		Date date =new Date();
//		Calendar date =Calendar.getInstance();
//		
//		date.set(2000, 8, 20);
//		System.out.println(date.getTime());
//		System.out.println(date.get(Calendar.MONTH)+" "+date.get(Calendar.YEAR));
//		
		DateFormat df1,df2,df3,df4;
		df1=DateFormat.getDateInstance(DateFormat.LONG,Locale.ITALIAN );
		System.out.println(df1.format(date.getTime()));
		df2=DateFormat.getDateInstance(DateFormat.FULL,Locale.ITALIAN );
		System.out.println(df2.format(date.getTime()));
		df3=DateFormat.getDateInstance(DateFormat.MEDIUM,Locale.ITALIAN );
		System.out.println(df3.format(date.getTime()));
	}

}



