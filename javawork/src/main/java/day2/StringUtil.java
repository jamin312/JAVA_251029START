package day2;

// p488
/**
 * @author Jeong Jae Min
 * @since java 21.0.7
 */
public class StringUtil {
	/**
	 * 
	 * @param id 주민번호
	 * @return 년도 4자리
	 */
	// 주민번호로 출생년도 추출
	public static String getYear(String id) {
		if (id == null) {
			return "";
		} else {
			String result = id.substring(0, 4);
			return result;
		}
	} // end getYear

	// 년, 월, 일 join
	public static String getDate(String ... date) {
		if (date == null) {
			return "";
		} else {
			return String.join("-", date);
		}
	}

	// y-m-d
	public static String getDate(String y, String m, String d) {
		return String.join("-", y, m, d);
	}
	
	// 
	public static String getSplitDate(String year) {
		String[] date = year.split("-");
		for(String d : date) {
			System.out.println(d);
		}
		return date[0];
	}

}// end class
