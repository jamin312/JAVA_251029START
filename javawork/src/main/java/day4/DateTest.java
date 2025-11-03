package day4;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTest {
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalDate birth = //LocalDate.of(1999, 9, 26);
				LocalDate.parse("1999-09-26");
		System.out.println(birth);
		
		Period preriod = Period.between(birth, date);
		System.out.println("나이는 " + preriod.getYears() + "년 " 
							+ preriod.getMonths() + "월 " 
							+ preriod.getDays() +"일");
		
		long days = ChronoUnit.DAYS.between(birth, date);		
		System.out.println("총 일수(오늘 미포함): " + days + "일");
		
		// 시간
		LocalTime stime = LocalTime.of(8, 40);
		LocalTime etime = LocalTime.of(18, 0);
		
		Duration duration = Duration.between(stime, etime);
		System.out.println(duration.toHours() + "시간 ");
		System.out.println(duration.toMinutes() + "분");
		
	} // end main
}// end class
