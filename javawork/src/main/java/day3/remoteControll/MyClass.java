package day3.remoteControll;

public class MyClass {
	
	// 필드 선언
	RemoteControl rc;
	
	// 생성자
	public MyClass(RemoteControl rc) {
		this.rc = rc;
	}
	
	// 메소드
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}
	
	// 객체에 따라 실행됨 / TV, Audio
	void methodB() {
		rc.turnOn();
		rc.setVolume(3);
	}
	
	void methodC() {
		rc.turnOff();
	}
	
}// end class
