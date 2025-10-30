package game;

import java.util.Scanner;

public class GuessNum {
	public void start() {
		// 컴퓨터 1~100 난수 생성, 크고 작은지 같은지, 축하 메시지 시도횟수
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		boolean run2 = true;
		while (run) {
			System.out.println("숫자의 범위 최대값을 입력해주시오.");
			int max = Integer.parseInt(sc.nextLine());

			int comN = (int) (Math.random() * max) + 1;
			int cnt = 0;

			while (run2) {
				System.out.print("숫자를 입력하시오 :");
				int userN = Integer.parseInt(sc.nextLine());
				cnt++;
				if (userN > comN) {
					System.out.println("숫자가 큽니다.");

				} else if (userN < comN) {
					System.out.println("숫자가 작습니다.");

				} else if (userN == comN) {

					System.out.printf("정답입니다. 시도횟수는 %d회 입니다.", cnt);
					System.out.println("게임을 재시작하고 싶으면 0을 입력해주세요");
					String retry = sc.nextLine();
					if (Integer.parseInt(retry) == 0) {
						break;
					} else {
						run2 = false;
						run = false;
					}

				}

			} // 안 while

		} // 밖 while
	}
}
