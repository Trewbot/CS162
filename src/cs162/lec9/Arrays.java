package cs162.lec9;
public class Arrays {
	public static void main(String[] args){

		//	an array of 5,5,5,...
		int[] fives = new int[10];
		for(int i = 0; i < fives.length; i++)
			fives[i] = 5;
		System.out.print("fives:   ");
		for(int i = 0; i < fives.length; i++)
			System.out.print(fives[i] + (i < fives.length - 1 ? ", " : ""));
		System.out.print('\n');
		
		//	an array of 1,2,3,...,10
		int[] numbers = new int[10];
		for(int i = 0; i < numbers.length; i++)
			numbers[i] = i;
		System.out.print("numbers: ");
		for(int i = 0; i < numbers.length; i++)
			System.out.print(numbers[i] + (i < numbers.length - 1 ? ", " : ""));
		System.out.print('\n');
		
		//	an array of 0,2,4,...,18
		int[] evens = new int[10];
		for(int i = 0; i < evens.length; i++)
			evens[i] = i * 2;
		System.out.print("evens:   ");
		for(int i = 0; i < evens.length; i++)
			System.out.print(evens[i] + (i < evens.length - 1 ? ", " : ""));
		System.out.print('\n');
		
		//	an array of 1,3,5,...,19
		int[] odds = new int[10];
		for(int i = 0; i < odds.length; i++)
			odds[i] = i * 2 + 1;
		System.out.print("odds:    ");
		for(int i = 0; i < odds.length; i++)
			System.out.print(odds[i] + (i < odds.length - 1 ? ", " : ""));
		System.out.print('\n');

		//	an array of animals
		String[] animals = {
			"monkey",
			"lion",
			"panda",
			"elephant",
			"tiger"
		};
		System.out.println(animals[0]);
		System.out.println(animals[2]);
		String largerAnimal = animals[0].length() > animals[animals.length - 1].length()
			? animals[0]
			: animals[animals.length - 1];
		System.out.println(largerAnimal);
		

		CupCake[] tasty	= new CupCake[6];
		for(int i = 0; i < tasty.length; i++)
			tasty[i] = new CupCake();
		System.out.println(tasty[0].getFlavor());
		
		char[] random = {
			'A',
			'r',
			'*',
			'H',
			'o',
			')'
		};
		System.out.print("a real word: \"");
		for(int i = 0; i < random.length; i++)
			System.out.print(random[i]);
		System.out.print("\"\n");
	}
}
