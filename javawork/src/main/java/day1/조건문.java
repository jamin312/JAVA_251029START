package day1;
/*
 * 근무시간(9~18) 맞으면 Y / N
 * */
public class 조건문 {
	public static void main(String[] args) {
		int workTime = 10;
		if(workTime >= 9 && workTime <= 18) {
			System.out.println("Y");
		} else {
			System.out.println("N");
		}
		
		if(workTime > 8) {
			System.out.println("당신은 헬조선에서 근무 중 입니다.");
		} else {
			System.out.println("개꿀빠시네요");
		}
		
		int sTime = 10;
		int eTime = 20; // 점심시간 1시간 제외
		// 총 근무 시간이 8시간 이상이면 "초과 근무" 출력
		
		if(eTime - sTime -1 >= 8) {
			System.out.println(eTime - sTime -9 + " 시간 초과 근무");
		} else {
			System.out.println("정시 퇴근");
		}
	}
}
