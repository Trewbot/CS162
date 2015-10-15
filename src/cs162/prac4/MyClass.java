package cs162.prac4;
public class MyClass {
	private int x;
	private static int count;
	//	default constuctor: intitialize instance variable to 0
	public MyClass(){x = 0;}
	//	alternative constructor: initialize instance variable to a
	public MyClass(int a){x = a;}
	//	copy constructor: initialize instance variable to the corresponding instance variable of other
	public MyClass(MyClass other){x = other.x;}
	//	method to return x value
	public void printX(){System.out.println("x = " + x);}
	//	method to print count
	public static void printCount(){System.out.println("count = " + count);}
	//	method to increment count by 1
	public static int incrementCount(){return ++count;}
}
