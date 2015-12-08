package cs162.lab6;
public class Dog {
	private String name;
	private int breedWeight;
	public Dog(String name){
		this.name = name;
		this.breedWeight = 5;
	}
	public String getName(){
		return name;
	}
	public String speak(){
		return "Woof";
	}
	public String toString(){
		return name;
	}
	public int avgBreedWeight(){
		return breedWeight;
	}
}
