package cs162.lab6;
public class Labrador extends Dog {
	private String color;
	private int breedWeight;
	public Labrador(String name){
		super(name);
		this.color = "Gold";
		this.breedWeight = 75;
	}
	public Labrador(String name, String color){
		super(name);
		this.color = color;
		this.breedWeight = 75;
	}
	public String speak(){
		return "WOOF";
	};
	public int avgBreedWeight(){
		return breedWeight;
	}
	public String toString(){
		return super.getName() + " (labrador)";
	}
}
