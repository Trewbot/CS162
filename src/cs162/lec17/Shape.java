package cs162.lec17;
class Shape {
	String color;
	public Shape(){
		color = "blue";
	}
	public Shape(String color){
		this.color = color;
	}
}

class Rectangle extends Shape {
	double width, height;
	public Rectangle(){
		super();
		width = 0;
		height = 0;
	}
	public Rectangle(String color, double width, double height){
		super(color);
		this.width = width;
		this.height = height;
	}
	public Rectangle(String color, double[] size){
		super(color);
		this.width = size[0];
		this.height = size[1];
	}
	public void setSize(double width, double height){this.width = width; this.height = height;}
	public void setSize(double[] size){width = size[0]; height = size[1];}
	public void setWidth(double width){this.width = width;}
	public void setHeight(double height){this.height = height;}
	public double[] getSize(){double[] size = {width,height}; return size;}
	public double getWidth(){return width;}
	public double getHeight(){return height;}
}

class Square extends Shape {
	double side;
	//	really dumb
}