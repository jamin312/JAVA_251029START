package day4;
// Runnable 인터페이스 상속
public class Job2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 101; i < 111 ; i++) {
			System.out.println(i);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
