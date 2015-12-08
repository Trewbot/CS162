package cs162.lab6;
public class TestDog {
	public static void main(String[] args){
		Dog dog = new Dog("Spike");
		System.out.println(dog.getName() + " says " + dog.speak());
		Labrador max = new Labrador("Max");
		System.out.println(max.getName() + " says " + max.speak());
		Yorkshire lola = new Yorkshire("Lola");
		System.out.println(lola.getName() + " says " + lola.speak());
		poke(dog);
		poke(max);
		poke(lola);
	}
	public static void poke(Dog d){
		System.out.println(d + " says " + d.speak());
		System.out.println(" and its average weight is " + d.avgBreedWeight());
	}
}
