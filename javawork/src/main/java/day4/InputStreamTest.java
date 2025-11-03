package day4;

import java.io.FileOutputStream;
import java.io.IOException;

/*
 * InputStream, OutputStream
 * */
public class InputStreamTest {
	// 상위타입인 IOException으로 예외 처리
	public static void main(String[] args) throws IOException {
		
		// try catch 예외 처리 , throws 예외 처리
		FileOutputStream fw = new FileOutputStream("c:/Temp/data.txt");
		
		int readByte;
		// read() => 한 번에 읽을 수 있는 byte가 있음
		// 읽을 내용이 없으면 return -1
		// Windows 전통: Ctrl+Z가 EOF 신호
		while((readByte = System.in.read()) != -1) { // Ctrl + Z
			fw.write(readByte);
		} // end while
		
		fw.close();
		
	} // end main
} // end class
