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
		String header = "First_Name   Last_Name    ";
		for(int i = 0; i < grades[0].getScores().length; i++)
			header += "Test" + (i + 1) + "  ";
		header += "Average Grade";
		out.println(header);
		for(int i = 0; i < grades.length; i++){
			grades[i].setLastName(in.next());
			grades[i].setFirstName(in.next());
			double[] scores = {
				in.nextDouble(),
				in.nextDouble(),
				in.nextDouble(),
				in.nextDouble(),
				in.nextDouble()
			};
			grades[i].setScores(scores);
			total += grades[i].getAverage();
		}
		double average = total / grades.length;
	}
	
	//	counts the amount of lines in a given file
	//	helpful to avoid having to input number of students
	public static int countLines(String filename) throws IOException {
	    LineNumberReader reader  = new LineNumberReader(new FileReader(filename));
		int cnt = 0;
		while (reader.readLine() != null){}
		cnt = reader.getLineNumber(); 
		reader.close();
		return cnt;
	}
}
