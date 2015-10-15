/*
 *	Trevor Hoglund
 *	CSIS 162, Fall 2015
 *	Section 1
 *	PA1
 *	Sep 24, 2015
 *
 *	Computes billing for a consulting firm based on income, rate and time from an input file.
 */

package cs162.pa1;
import java.io.*;
import java.util.Scanner;

public class Accounting {
	public static Scanner in;
	public static PrintWriter out;
	public static void main(String args[]) throws FileNotFoundException {
		in	= new Scanner(new FileReader("inData.dat"));
		out	= new PrintWriter("outData.dat");
		double income, rate, time;
		while(in.hasNext()){
			income	= in.nextDouble();
			rate	= in.nextDouble();
			time	= in.nextDouble();
			if(income < 0 || rate < 0 || time < 0) 
				out.println("Invalid Data!");
			else
				out.printf(
					"The billing amount is: $" +
					"%.2f" +
					" based on: $" +
					"%.2f" +
					" of yearly income, " +
					"%.2f" + 
					" minutes of help and reduce rate of $" +
					"%.2f" + 
					" per hour.\n",
					bill(income,rate,time),
					income,
					time,
					rate
				);
		}
		in.close();
		out.close();
	}
	public static double bill(double income, double rate, double time){
		return income <= 25000
			? time <= 30
				? 0
				: (rate * 0.4) * ((time - 30)/60)
			: time <= 20
				? 0
				: (rate * 0.7) * ((time - 20)/60);
 	}
}
