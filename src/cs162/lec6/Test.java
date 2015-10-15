package cs162.lec6;

public class Test {
	public static void main(String args[]){
		Address schoolAddress	= new Address();
		Address homeAddress		= new Address(8851, "Broderick Blvd.", "Inver Grove Heights", "MN", "55076");
		Address areaAddress		= new Address("Eagan", "MN", "55213");
		
		System.out.println(schoolAddress);
		System.out.println(homeAddress);
		System.out.println(areaAddress);
		
		System.out.print("\n\n");
		
		Time myTime		= new Time();
		Time yourTime	= new Time(22,40,15);
		System.out.println("myTime.hour = " + myTime.getHour());
		System.out.println("yourTime.hour = " + yourTime.getHour());
		System.out.println("yourTime = " + yourTime);
	}
}
