package cs162.lab5;
import java.util.Scanner;
public class Sales {
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args) {
		//	1.	ask the manager to enter the number of sales people and manufacturers
		System.out.print("enter the number of sales people: ");
		int numSalespeople = console.nextInt();
		System.out.print("enter the number of manufacturers: ");
		int numManufacturers = console.nextInt();
		//	2.	ask the manager to enter the number of cars from different manufacturers sold by each sales person
		int[][] sales = new int[numSalespeople][numManufacturers];
		for(int i = 0; i < sales.length; i++){
			System.out.println((i == sales.length - 1 ? "\\" : "+") + "-- sales person " + (i+1) + ":");
			for(int j = 0; j < sales[i].length; j++){
				System.out.print((i == sales.length - 1 ? " " : "|") + "   " + (j == sales[i].length - 1 ? "\\" : "+") + "-- manufacturer " + (j+101) + ": ");
				sales[i][j] = console.nextInt();
			}
		}
		System.out.println("\n");
		//	3.	output the total number of cars sold by each sales person
		for(int i = 0; i < sales.length; i++){
			int total = 0;
			for(int j = 0; j < sales[i].length; j++)
				total += sales[i][j];
			System.out.printf("Salesperson %d sold %d cars.\n",i+1,total);
		}
		System.out.println("\n");
		//	4.	output the total number of cars sold from each manufacturer
		for(int i = 0; i < sales[0].length; i++){
			int total = 0;
			for(int j = 0; j < sales.length; j++)
				total += sales[j][i];
			System.out.printf("The number of sold cars from manufacturer %d is %d.\n",i+101,total);
		}
		//	5.	output the total number of cars sold at the end of the month
		int allCars = 0;
		for(int i = 0; i < sales.length; i++)
			for(int j = 0; j < sales[i].length; j++)
				allCars += sales[i][j];
		System.out.printf("The total number of cars sold this month is %d.\n",allCars);
		System.out.println("\n");
		//	6.	output the manufacturer with most sold cars from salesperson 1
		int max = 0;
		for(int i = 0; i < sales[0].length; i++)
			if(sales[0][i] > max)
				max = sales[0][i];
		System.out.printf("Salseperson %d sold the most cars (%d) from manufacturer(s)",1,max);
		for(int i = 0; i < sales[0].length; i++)
			if(sales[0][i] == max)
				System.out.print(" "+(i+101));
		System.out.println(".\n");
		//	7.	output the salesperson who sold the most cars from manufacturer 101
		max = 0;
		for(int i = 0; i < sales.length; i++)
			if(sales[i][0] > max)
				max = sales[i][0];
		System.out.printf("The most cars from manufacturer %d (%d) were sold by salesperson(s)",101,max);
		for(int i = 0; i < sales.length; i++)
			if(sales[i][0] == max)
				System.out.print(" "+(i+1));
		System.out.println(".\n");
		//	b1.	find the sales champions and output their numbers
		max = 0;
		for(int i = 0; i < sales.length; i++){
			int total = 0;
			for(int j = 0; j < sales[i].length; j++)
				total += sales[i][j];
			if(total > max)
				max = total;
		}
		System.out.printf("The salesperson(s) who sold the most cars (%d) is/are",max);
		for(int i = 0; i < sales.length; i++){
			int total = 0;
			for(int j = 0; j < sales[i].length; j++)
				total += sales[i][j];
			if(total == max)
				System.out.print(" " + (i+1));
		}
		System.out.println(".\n");
		//	b2.	find the most popular manufacturers and output their numbers
		max = 0;
		for(int i = 0; i < sales[0].length; i++){
			int total = 0;
			for(int j = 0; j < sales.length; j++)
				total += sales[j][i];
			if(total > max)
				max = total;
		}
		System.out.printf("The most popular manufacturer(s) (selling %d cars this month) is/are",max);
		for(int i = 0; i < sales[0].length; i++){
			int total = 0;
			for(int j = 0; j < sales.length; j++)
				total += sales[j][i];
			if(total == max)
				System.out.print(" " + (i + 101));
		}
		System.out.println(".\n");
	}
}
