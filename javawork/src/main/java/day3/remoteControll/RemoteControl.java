package day3.remoteControll;
/*
 *  인터페이스 = 상수 + 추상메소드
 * */
public interface RemoteControl {
	
	// public static final 생략 가능 / 상수(final)
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// public abstract 생략 가능 / 추상 메소드
	public abstract void turnOn();
	void turnOff();
	void setVolume(int volume);
	
} // end interface
