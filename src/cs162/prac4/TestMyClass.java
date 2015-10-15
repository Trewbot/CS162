package cs162.prac4;
public class TestMyClass {
	public static void main(String[] args){
		MyClass myObj1 = new MyClass(5),
				myObj2 = new MyClass(7);
		//	the errors aren't important
		myObj1.printX();
		myObj1.incrementCount();
		MyClass.incrementCount();
		myObj1.printCount();
		myObj2.printX();
		myObj2.printCount();
		myObj2.incrementCount();
		myObj1.printCount();
	}
}
