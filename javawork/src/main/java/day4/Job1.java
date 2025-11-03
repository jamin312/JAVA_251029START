package day4;
// 멀티스레드 테스트를 위해 상속 진행
public class Job1 extends Thread{

	@Override
	public void run() {
		for(int i = 1; i < 11 ; i++) {
			System.out.println(i);
			try {
				// 밀리세컨드 -> 1000이 1초
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
} // end class
