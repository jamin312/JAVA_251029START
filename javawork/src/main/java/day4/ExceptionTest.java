package day4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
	public static int menuInput() throws InputMismatchException, MenuException {
		Scanner sc = new Scanner(System.in);
		System.out.print("가위(1), 바위(2), 보(3), 종료(0): ");
		
		int user;
		
		user = sc.nextInt();
		
		// 프로그램 로직 상 업무 규칙 위배 
		if(user > 3 || user < 0) {
			throw new MenuException("입력 범위 오류");
		}
		
//		try {
//			user = sc.nextInt();					
//		} catch (Exception e) {
//			// Exception : 에러의 종류 중 최상위 타입
//			System.out.println(e.getMessage());
//			user = 0;
//		} // end try / catch
		
		return user;
		
	} // end menuInput()
	
	public static void main(String[] args) {
		
		int menu = 0;
		// throws 에러를 던지면 호출한 곳에서 에러 처리
		try {
			menu = menuInput();
		} catch (InputMismatchException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
			menu = 0;
		} catch (MenuException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
			menu = 1;
		} catch (Exception e) {
			// 마지막 catch는 if else 처럼 else라고 생각
			System.out.println(e.getMessage());
		}
				
		System.out.println(menu);
		System.out.println("게임 종료");
		
		
	} // end main
} // end class
