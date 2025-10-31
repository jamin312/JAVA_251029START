package day3.remoteControll;

public class Audio implements RemoteControl{
	private int volume;
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Audio ON");
	} // end turnOn

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Audio OFF");
	}// end turnOff

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if(volume > MAX_VOLUME) {
			volume = MAX_VOLUME;
		} else if (volume < MIN_VOLUME){
			volume = MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		
		System.out.println("SET VOL : " + this.volume);
		
	} // end setVolume

}// end class
