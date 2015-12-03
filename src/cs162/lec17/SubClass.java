package cs162.lec17;
public class SubClass extends SuperClass {
	private int z;
	public SubClass(){
		super();
		z = 0;
	}
	public void one(){
		super.two(10,15);
		z = 30;
		System.out.println(super.getA() + super.getB() + z);
	}
}