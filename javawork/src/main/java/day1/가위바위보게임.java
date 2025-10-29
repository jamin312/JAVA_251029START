package day1;

import java.util.Scanner;

public class 가위바위보게임 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 가위 : 1, 바위 : 2, 보 : 3
		System.out.println("가위 : 1, 바위 : 2, 보 : 3");

		int winCnt = 0;
		int loseCnt = 0;
		int drawCnt = 0;
		while (true) {
			System.out.println("0을 입력하면 게임을 종료합니다.");
			System.out.print("1,2,3 중 하나를 입력해주세요 : ");
			int userN = Integer.parseInt(sc.nextLine());
			int comN = (int) (Math.random() * 3) + 1;
			int re = (comN - userN + 2) % 3;
			if (userN == 0) {
				System.out.println("게임을 종료하겠습니다.");
				break;
			} else if (userN > 3 || userN < 0) {
				System.out.println("1~3 중 하나를 입력해주세요");
				continue;
			} else {
				System.out.println(comN);
				System.out.println(userN);
				switch (re) {
				case (0):
					System.out.println("패배");
					loseCnt++;
					continue;
				case (1):
					System.out.println("승리");
					winCnt++;
					continue;
				case (2):
					System.out.println("무승부");
					drawCnt++;
					continue;

				}
			}
		} // end while
		System.out.printf("무승부 : %d, 승리 : %d, 패배 : %d", drawCnt, winCnt, loseCnt);
		System.out.println();

		System.out.printf("%.3f%%승률", ((float)winCnt / ((float)drawCnt + winCnt + loseCnt) * 100.0f));

	}// end main
}
