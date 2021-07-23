package javaUtil.exam;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class TimeExam {

	public static void main(String[] args) {
		LocalDateTime timePoint = LocalDateTime.now();
		
		System.out.println(timePoint);
		Month month = timePoint.getMonth();
		System.out.println(month);
		System.out.println(month.getValue());
		System.out.println(timePoint.getHour());
		
		LocalDate ld1 = LocalDate.of(2017, Month.OCTOBER, 30);
		System.out.println(ld1);
		LocalDate theDate = timePoint.toLocalDate();
		System.out.println(theDate);
		
		LocalTime lt1 = LocalTime.of(17, 18);
		System.out.println(lt1);
		LocalTime lt2 = LocalTime.parse("10:15:30");
		System.out.println(lt2);
		
	}

}
