package com.capgemini.datetime.dateconcept;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Test {
	
	public static void main(String[] args) {
		LocalDate l=LocalDate.now();
		System.out.println(l);
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		String s1="2020-01-09";
		LocalDate d1=LocalDate.parse(s1);
		System.out.println(d1);
		System.out.println("----------------------");
		LocalDateTime p1=LocalDateTime.now();
		DateTimeFormatter df=DateTimeFormatter.ofPattern("E,dd/MMM/YYYY HH:MM:SS a");
		String s2=df.format(p1);
		System.out.println(s2);
		
		
	}
	
	

}
