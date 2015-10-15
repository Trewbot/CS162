package cs162.lab2;

public class TestCircle {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		System.out.println(
			"The circle [1] has radius of " 
			+ c1.getRadius()
			+ ", area of "
			+ c1.getArea()
			+ " and color "
			+ c1.getColor()
		);
		Circle c2 = new Circle(2.0);
		System.out.println(
			"The circle [2] has radius of " 
			+ c2.getRadius()
			+ " and area of "
			+ c2.getArea()
		);
		Circle c3 = new Circle(3.0, "green");
		System.out.println(
			"The circle [3] has a radius of "
			+ c3.getRadius()
			+ " and area of "
			+ c3.getArea()
		);
		c1.setRadius(5.0);
		c1.setColor("blue");
		System.out.println(
			"The circle [1] now has a radius of "
			+ c1.getRadius()
			+ " and color "
			+ c1.getColor()
		);
		System.out.println("Circle [1]\n" + c1.toString());
		System.out.println("Circle [2]\n" + c2);
		System.out.println("Circle [3]\n" + c3);
	}
}
