package day4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import org.junit.Ignore;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FileCopyTest {
		 
		// Test : 원래는 src/test/java에서 진행
		// Ignore Test 무시
		@Ignore
		// Test는 JUnit 하기 위해
		@Test
		// DisplayName은 테스트 이름을 직관적으로 이해할 수 있도록
		@DisplayName("파일복사")
		public void copy() throws IOException {
			FileOutputStream fw = new FileOutputStream("c:/Temp/copy.txt");
			InputStream inputStream = new FileInputStream("c:/Temp/data.txt");
			
			int readByte;
			// read 인수가 없는 read는 한 글자씩 읽기
			while((readByte = inputStream.read()) != -1) {
				fw.write(readByte);
			} // end while
			
			fw.close();
		} // end copy()
		
		// 하나만 하려면 run as => run configurations => method => search 해서 선택
		@Ignore
		@Test
		@DisplayName("Reader 복사")
		public void copy2() throws IOException {
			FileWriter fw = new FileWriter("c:/Temp/copy3.txt");
			FileReader fr = new FileReader("c:/Temp/data.txt");
			
			int bytesRead = 0;
			// 배열로 한 번에 여러 글자 읽기
			char[] readByte = new char[5];
			while( (bytesRead = fr.read(readByte)) != -1) {
				// 버퍼 전체를 매번 써서 마지막 루프에서 이전 글자가 섞여들어감 방지
				fw.write(readByte, 0, bytesRead);
			} // end while
			
			fw.close();
			fr.close();
		} // end copy2()
		
		// BufferedReader을 이용해 readLine 해보기 (한 줄 씩 읽기)
		@Ignore
		@Test
		@DisplayName("버퍼를 통해서 라인 입력")
		public void test2() throws IOException {
			BufferedReader fr = new BufferedReader(new FileReader("c:/Temp/emp.txt"));
			
			String str = null;
			while ((str = fr.readLine()) != null) {
				System.out.println(str);
			}			
			
			fr.close();
		} // end test2
		
		@Test
		@DisplayName("스캐너를 통해서 라인 입력")
		public void test3() throws IOException {
			Scanner sc = new Scanner(new File("c:/Temp/emp.txt"));
			String emp = sc.nextLine();
			
			// ,를 구분하여 이름 출력
			String[] empInfo = emp.split(",");
			if(empInfo != null) {
				System.out.println(empInfo[1]);				
			}
			sc.close();
		} // end test3
		

} // end class
