package day1;

import java.util.Set;
import java.util.TreeSet;

public class 로또번호 {
	public static void main(String[] args) {
		// 리스트 변수 선언 => 중복값 제거 Set 이용
		Set<Integer> lotto = new TreeSet<Integer>();
		
		// while(list.size() < 6)
		while(lotto.size() < 6) {
			
			// 난수 생성(1~45)
			int num = (int)(Math.random() * 45) + 1;
			
			// 리스트에 추가 (add())
			lotto.add(num);
		} // end while
		
		// 결과 출력
		for(int luck : lotto) {
			System.out.println(luck);
		} // end for
				
		
	} // end main
}
