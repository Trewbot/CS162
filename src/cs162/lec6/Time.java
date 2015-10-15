package cs162.lec6;

public class Time {
	private int
		hour,
		minute,
		second;
	public Time(){
		hour	= 12;
		minute	= 0;
		second	= 0;}
	public Time(int pHour, int pMinute, int pSecond){
		hour	= pHour;
		minute	= pMinute;
		second	= pSecond;
	}
	public String toString(){
		return hour + ":" + minute + ":" + second;
	}
	public int getHour(){
		return hour;
	}
	public void setHour(int hr){
		hour = hr;
	}
}
