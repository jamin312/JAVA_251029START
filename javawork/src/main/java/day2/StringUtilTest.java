package day2;

import java.util.Scanner;

public class StringUtilTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("출생년도 4자리를 입력하시오 : ");
		String birth = sc.nextLine();
		
		String year = StringUtil.getYear(birth);
		System.out.println(year);
		
		String test = StringUtil.getDate("2025","2025","2025");
		System.out.println(test);
		
		String regDate = "2025-10-10";
		String[] result = regDate.split("-");
		System.out.println(result[0]);
		
		String what = StringUtil.getSplitDate("2027-12-13");
		System.out.println("년도는 : " + what);
		
		
	} // end main
}// end class
