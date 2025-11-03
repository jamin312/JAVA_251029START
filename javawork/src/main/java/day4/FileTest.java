package day4;

import java.io.File;

// jupiter가 5버전
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/*
 *  폴더=파일 시스템 API (구분 안 함)
 *  생성, 삭제, 이름변경, 정보 ...
 * */
public class FileTest {
	
	//@Test
	@DisplayName("폴더 목록 조회")
	public void test1() {
		File file = new File("c:/Temp");
		String[] files = file.list();
		for(String f : files) {
			System.out.println(f);			
		}
	} // end test1
	
	//@Test
	@DisplayName("파일 삭제")
	public void test2() {
		File file = new File("c:/Temp/copy3.txt");
		if(file.delete()) {
			System.out.println("copy3 삭제 성공");
		} else {
			System.out.println("삭제 실패");
		}
	} // end test2
	
	@Test
	@DisplayName("파일 정보")
	public void test3() {
		File file = new File("c:/Temp/", "emp.txt");
		// 파일 크기 출력
		System.out.println("파일 크기 : " + file.length() + "바이트");
		System.out.println("파일 이름 : " + file.getName());
		
		// 확장자 출력
		String ext = file.getName().substring(file.getName().indexOf(".") + 1);
		System.out.println("파일 확장자 : " + ext);
		 
	}
	
}
