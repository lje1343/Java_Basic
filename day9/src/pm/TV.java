package pm;

public interface TV {	// 추상클래스는 상속, 인터페이스는 구현이다.
	
	public int MIN_VOLUME=0;	// 상수처럼..
    public int Max_VOLUME=100;
	
	public void turnOn();
	public void turnOff();
	public void changeVolume(int volume);
	public void changeChannel(int channel);

}
