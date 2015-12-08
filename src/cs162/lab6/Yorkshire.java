package cs162.lab6;
public class Yorkshire extends Dog {
	private String color;
	public Yorkshire(String name){
		super(name);
	}
	public String speak(){
		return "woof";
	};
	public String toString(){
		return super.getName() + " (yorkshire)";
	}
}
