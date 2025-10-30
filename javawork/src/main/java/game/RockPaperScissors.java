package game;

import java.util.Scanner;
// 1. 클래스(설계도) 선언
public class RockPaperScissors {
	int winCnt, loseCnt, drawCnt, userN, comN;
	
	public void start() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			// 가위 : 1, 바위 : 2, 보 : 3
			System.out.println("가위(1), 바위(2), 보(3)");
			System.out.println("0을 입력하면 게임을 종료합니다.");
			System.out.print("1,2,3 중 하나를 입력해주세요 : ");
			
			int userN = sc.nextInt();
			int comN = (int) (Math.random() * 3) + 1;
			
			if (userN == 0) {
				System.out.println("게임을 종료하겠습니다.");
				printFinalReport(winCnt, loseCnt, drawCnt);
				break;
			} else if (userN > 3 || userN < 0) {
				System.out.println("1~3 중 하나를 입력해주세요");
				continue;
			} else {
				result(comN, userN);
			}
		} // end while
		
	} // end start
	
	// 최종 결과 출력
	void printFinalReport(int winCnt, int loseCnt, int drawCnt) {
		System.out.printf("무승부 : %d, 승리 : %d, 패배 : %d", drawCnt, winCnt, loseCnt);
		System.out.println();
		System.out.printf("%.3f%%승률", ((float)winCnt / ((float)drawCnt + winCnt + loseCnt) * 100.0f));
		System.out.println();
	} // end printFinalReport
	
	// 승, 패, 무승부 판정
	void result(int comN, int userN) {
		System.out.println(comN);
		System.out.println(userN);
		int re = (comN - userN + 2) % 3;
		switch (re) {
		case (0):
			System.out.println("패배");
			loseCnt++;
			break;
		case (1):
			System.out.println("승리");
			winCnt++;
			break;
		case (2):
			System.out.println("무승부");
			drawCnt++;
			break;
		} // end switch
		
	} // end result
	
}
