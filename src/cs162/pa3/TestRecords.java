/*
 *	Trevor Hoglund
 *	CSIS 162, Fall 2015
 *	Section 1
 *	PA3
 *	Nov 03, 2015
 *
 *	Tests the Records class.
 */

package cs162.pa3;

import java.io.*;
import java.util.Scanner;

public class TestRecords {
	public static Scanner in;
	public static PrintWriter out;
	public static void main(String[] args) throws IOException {
		in	= new Scanner(new FileReader("StudentTests.dat"));
		out	= new PrintWriter("StudentGrades.dat");
		double total = 0;	//	the total of all grades
		Records[] grades = new Records[countLines("StudentTests.dat")];
		String header = "First_Name  Last_Name   ";
		for(int i = 0; i < 5; i++)
			header += "Test" + (i + 1) + "  ";
		header += "Average Grade";
		out.println(header);
		//	doesn't use EOF because it is based on line counts already
		for(int i = 0; i < grades.length; i++){
			grades[i] = new Records();
			grades[i].setFirstName(in.next());
			grades[i].setLastName(in.next());
			double[] scores = {
				in.nextInt(),
				in.nextInt(),
				in.nextInt(),
				in.nextInt(),
				in.nextInt()
			};
			grades[i].setScores(scores);
			total += grades[i].getAverage();
			out.printf(
				"%-12s%-12s%-7.2f%-7.2f%-7.2f%-7.2f%-7.2f%-8.2f  %c  \n",
				grades[i].getFirstName(),
				grades[i].getLastName(),
				grades[i].getScore(0),
				grades[i].getScore(1),
				grades[i].getScore(2),
				grades[i].getScore(3),
				grades[i].getScore(4),
				grades[i].getAverage(),
				grades[i].getGrade()
			);
		}
		double average = total / grades.length;
		out.printf("\nClass average = %.2f",average);
		in.close();
		out.close();
	}
	
	//	counts the amount of lines in a given file
	//	helpful to avoid having to input number of students
	public static int countLines(String filename) throws IOException {
	    LineNumberReader reader  = new LineNumberReader(new FileReader(filename));
		int lines = 0;
		while (reader.readLine() != null){}
		lines = reader.getLineNumber(); 
		reader.close();
		return lines;
	}
}
