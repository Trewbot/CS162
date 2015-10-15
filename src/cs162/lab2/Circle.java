package cs162.lab2;
public class Circle {           

	private double radius;
	private String color;
	//	create default circle
	public Circle() {
		radius = 1.0;
		color = "red";
	}
	//	create new circle with radius
	public Circle(double r) {
		radius = r;
		color = "red";
	}
	//	create new circle with radius and color
	public Circle(double r, String c){
		radius = r;
		color = c;
	}
	//	gets the circle radius
	public double getRadius(){return radius;}
	//	sets the circle radius
	public void setRadius(double r){radius = r;}
	//	gets the circle area
	public double getArea(){return radius*radius*Math.PI;}
	//	gets the circle color
	public String getColor(){return color;}
	//	sets the circle color
	public void setColor(String c){color = c;}
	//	returns a string of the circle information
	public String toString(){return "Circle: radius=" + radius + " color=" + color;}
}