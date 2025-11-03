package day4;
/*
 * Thread 상속형: 생성자에서 super("job1") 또는 setName("job1")
 * Runnable 형: new Thread(new Job2(), "job2") 처럼 Thread 생성 시 이름 지정
 * */

public class ThreadTest {
	public static void main(String[] args) throws InterruptedException {
		// JVM 예외 처리 : throws InterruptedException => 멈춰버림
		
		// job1은 스레드임
		Job1 job1 = new Job1();
		// start()는 새 스레드를 만들고 그 스레드가 run()을 호출
		job1.start();
		
		// job2는 스레드가 아님
		Thread thread = new Thread(new Job2());
		thread.start();
		
		// 익명 클래스 (선언과 동시에 사용)
		Thread thread2 = new Thread(() -> {
				for(int i = 201; i < 211; i++) {
					System.out.println(i);
					
					try {
						Thread.sleep(400);
					} catch (InterruptedException e) {
						e.printStackTrace();
					} // end try / catch
				} // end for
			}); // end thread2
		thread2.start();
		
		Runnable run = () -> {
			for(int i = 301; i < 311; i++) {
				System.out.println(i);
				
				try {
					Thread.sleep(400);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} // end try / catch
			} // end for
		}; // end run
		
		Thread thread3 = new Thread(run);
		thread3.start();
		
	} // end main
} // end class
