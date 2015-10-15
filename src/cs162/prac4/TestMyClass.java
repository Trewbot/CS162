package cs162.prac4;
public class TestMyClass {
	public static void main(String[] args){
		MyClass myObj1 = new MyClass(5),
				myObj2 = new MyClass(7);
		myObj1.printX();
		MyClass.incrementCount();
		MyClass.incrementCount();
		MyClass.printCount();
		myObj2.printX();
		MyClass.printCount();
		MyClass.incrementCount();
		MyClass.printCount();
	}
}
