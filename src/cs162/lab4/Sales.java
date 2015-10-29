package cs162.lab4;
import java.util.Scanner;
public class Sales {
	public static Scanner input = new Scanner(System.in);
	public static void main(String args[]){
		System.out.print("Number of sales people: ");
		int salesPeople = input.nextInt(),
			total		= 0,
			max			= 0;
		System.out.print("\n");
		int[] sales	= new int[salesPeople];
		for(int i = 0; i < sales.length; i++){
			System.out.print("Salesperson #" + (i + 1) + "'s sales: ");
			sales[i] = input.nextInt();
			total += sales[i];
			if(sales[i] > max)
				max = sales[i];
		}
		double average = (double)(total) / (double)(sales.length);
		System.out.print("\nSaleperson(s) who performed below average: ");
		for(int i = 0; i < sales.length; i++)
			if(average > (double)(sales[i]))
				System.out.print(i + 1 + " ");
		System.out.print("\n\nSalesperson(s) with most sales: ");
		for(int i = 0; i < sales.length; i++)
			if(sales[i] == max)
				System.out.print(i + 1 + " ");
		System.out.print("\nMost sales: " + max);
	}
}
