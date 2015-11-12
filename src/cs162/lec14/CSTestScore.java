package cs162.lec14;
import java.util.Scanner;
public class CSTestScore {
	static Scanner console = new Scanner(System.in);
	static final int NUM_COURSES = 3;
	public static void main(String[] args){
		//	begin given code
		System.out.print("enter the number of students: ");
		int numStudents = console.nextInt();
		double[][] scores = new double[numStudents][NUM_COURSES];
		for(int i = 0; i < numStudents; i++){
			System.out.println((i == numStudents - 1 ? "\\" : "+") + "-- enter student " + (i+1) + "'s scores:");
			for(int j = 0; j < NUM_COURSES; j++){
				System.out.print((i == numStudents - 1 ? " " : "|") + "   " + (j == NUM_COURSES - 1 ? "\\" : "+") + "-- score for course " + (j+1) + ": ");
				scores[i][j] = console.nextDouble();
			}
		}
		//	end given code
		
		/*
		 * You need to complete the following functions:
		 * 1) prompt the user to enter a specific student number,
		 *    then print his/her scores on all (three) courses.
		 * 2) prompt the user to enter a specific course number,
		 *    then print all students' scores on this course.
		 * 3) Print all students' scores on all (three) courses. 
		 *    The print format is:
		 *                Course1    Course2    Course3
		 *    Student1      86          75        93
		 *    Student2      90          82        78
		 *    Student3      74          80        83
		 *    ...
		 */
		
		System.out.print("\nenter specific student number:");
		int target = console.nextInt();
		int[] students = {target};
		System.out.print("\n");
		printStudentScores(scores,students);
		
		System.out.print("\nenter specific course number:");
		int course = console.nextInt();
		System.out.print("\n");
		printStudentScores(scores,course);
		
		System.out.println("\nall scores:\n");
		printStudentScores(scores);
	}
	public static void printStudentScores(double[][] scores){
		System.out.println("            Course1    Course2    Course3");
		for(int i = 0; i < scores.length; i++){
			System.out.printf("%-12s","Student"+(i+1));
			for(int j = 0; j < scores[i].length; j++)
				System.out.printf("  %-9.0f",scores[i][j]);
			System.out.print("\n");
		}
		System.out.print("\n");
	}
	public static void printStudentScores(double[][] scores, int[] students){
		System.out.println("            Course1    Course2    Course3");
		for(int i = 0; i < students.length; i++){
			System.out.printf("%-12s","Student"+students[i]);
			for(int j = 0; j < scores[students[i]-1].length; j++)
				System.out.printf("  %-9.0f",scores[students[i]-1][j]);
			System.out.print("\n");
		}
		System.out.print("\n");
	}
	public static void printStudentScores(double[][] scores, int course){
		System.out.println("            Course" + course);
		for(int i = 0; i < scores.length; i++){
			System.out.printf("%-12s  %-9.0f\n","Student"+(i+1),scores[i][course - 1]);
		}
		System.out.print("\n");
	}
}