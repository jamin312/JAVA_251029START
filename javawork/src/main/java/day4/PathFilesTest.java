package day4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/*
 * File -> Paths, Files
 * */

public class PathFilesTest {
	
	Path path = Paths.get("c:/Temp");
	Path file = Paths.get("c:/Temp", "data.txt");
	
	// 파일 목록
	@Test
	@DisplayName("Files List")
	public void test1() throws IOException {
		// return 타입 Stream
		Files.walk(path)
		//.forEach(System.out::println);
		.forEach(s -> System.out.println(s));
		
	}// end test1
	
	// 파일 읽기
	@Test
	@DisplayName("read File")
	public void test2() throws IOException {
		List<String> lines = Files.readAllLines(file);
		lines.stream().forEach(l -> System.out.println(l));
		
	} // end test2
	
	// 파일 정보 읽기(크기, 생성(변경)시간)
	@Test
	@DisplayName("read FileInfo")
	public void test3() throws IOException {
		System.out.println("파일 크기 : " + Files.size(file) + "바이트");
		System.out.println("파일 수정일 : " + Files.getLastModifiedTime(file));
	}
	
	
	// 파일 저장
	@Test
	@DisplayName("rename File")
	public void test4() throws IOException {
		Path newFile = Paths.get("c:/Temp", "path.txt");
		Files.write(newFile, Arrays.asList("Hello", "Java"));
		
	}// end test4
	
	// 파일 변경
	
	// 파일 삭제
	
	
}
