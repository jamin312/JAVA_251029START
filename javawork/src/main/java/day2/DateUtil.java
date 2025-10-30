package day2;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;

public class DateUtil {
	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		
		System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
		
		LocalDate date = LocalDate.now();
		
		System.out.println(date);
		
		LocalDate birth = LocalDate.of(1999, 9, 26);
		
		int age = Period.between(birth, date).getYears();
		
		System.out.println(age);
	}
}
