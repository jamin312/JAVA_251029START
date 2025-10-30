package game;

import java.util.Scanner;

public class GameTest {
	public static void main(String[] args) {
		// 2. 클래스를 객체로 생성
		RockPaperScissors rps = new RockPaperScissors();
		GuessNum gn = new GuessNum();
		
		
		Scanner sc = new Scanner(System.in);

		game: while (true) {
			System.out.println("게임선택: 1.가위바위보  2.숫자맞추기  0:종료");
			int menu = sc.nextInt();
			// 3. 객체 사용
			switch (menu) {
			case 1:
				rps.start();
				break;
			case 2:
				gn.start();
				break;
			case 0:
				break game;
			}
		}
		System.out.println("게임종료");
		
	} // end main
}
