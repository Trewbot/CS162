package cs162.lec17;
public class SuperClass {
	private int a, b;
	public SuperClass(){
		a = 0;
		b = 0;
	}
	public void one(){
		System.out.println(a + b);
	}
	public void two(int x, int y){
		a = x;
		b = y;
	}
	public int getA(){return a;}
	public int getB(){return b;}
	//	you can treat a part-time employee as a person
	//	but you cannot treat a person as a part-time employee
}