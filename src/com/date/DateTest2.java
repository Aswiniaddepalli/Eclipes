package com.date;

import java.time.LocalDate;

public class DateTest2 {

	public static void main(String[] args) {
		LocalDate date =LocalDate.of(2024,  1, 29);
		System.out.println(date);
		System.out.println(date.getDayOfWeek());

	}

}
