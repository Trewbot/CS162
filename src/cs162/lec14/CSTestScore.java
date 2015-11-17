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
			System.out.println((i == numStudents - 1 ? "\\" : "+") + "-- student " + (i+1) + ":");
			for(int j = 0; j < NUM_COURSES; j++){
				System.out.print((i == numStudents - 1 ? " " : "|") + "   " + (j == NUM_COURSES - 1 ? "\\" : "+") + "-- course " + (j+1) + ": ");
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

		System.out.print("\nenter specific student number:");
		target = console.nextInt();
		students[0] = target;
		System.out.print("\n");
		printStudentAverages(scores,students);
		
		System.out.println("\nall averages:\n");
		printStudentAverages(scores);
		
		System.out.print("\nenter specific course number:");
		course = console.nextInt();
		System.out.print("\n");
		printStudentAverages(scores,course);
	}
	public static void printStudentScores(double[][] scores){
		System.out.println("            course 1    course 2    course 3");
		for(int i = 0; i < scores.length; i++){
			System.out.printf("%-12s","Student"+(i+1));
			for(int j = 0; j < scores[i].length; j++)
				System.out.printf("   %-9.0f",scores[i][j]);
			System.out.print("\n");
		}
		System.out.print("\n");
	}
	public static void printStudentScores(double[][] scores, int[] students){
		System.out.println("            course 1    course 2    course 3");
		for(int i = 0; i < students.length; i++){
			System.out.printf("%-12s","student "+students[i]);
			for(int j = 0; j < scores[students[i]-1].length; j++)
				System.out.printf("   %-9.0f",scores[students[i]-1][j]);
			System.out.print("\n");
		}
		System.out.print("\n");
	}
	public static void printStudentScores(double[][] scores, int course){
		System.out.println("            course " + course);
		for(int i = 0; i < scores.length; i++){
			System.out.printf("%-12s   %-9.0f\n","student "+(i+1),scores[i][course - 1]);
		}
		System.out.print("\n");
	}
	public static double[] averageScores(double[][] scores, int[] students){
		double[] ret = new double[students.length];
		double sum = 0;
		for(int i = 0; i < students.length; i++){
			sum = 0;
			for(int j = 0; j < scores[students[i]-1].length; j++)
				sum += scores[students[i]-1][j];
			ret[i] = sum / scores[students[i]-1].length;
		}
		return ret;
	}
	public static double averageScores(double[][] scores, int course){
		double sum = 0;
		for(int i = 0; i < scores.length; i++)
			sum += scores[i][course - 1];
		return sum / scores.length;
	}
	public static void printStudentAverages(double[][] scores){
		System.out.println("            average ");
		int[] students = new int[scores.length];
		for(int i = 0; i < scores.length; i++)
			students[i] = i + 1;
		double[] avg = averageScores(scores,students);
		for(int i = 0; i < avg.length; i++){
			System.out.printf("%-12s   %-9.0f\n","student "+(i+1),avg[i]);
		}
		System.out.print("\n");
	}
	public static void printStudentAverages(double[][] scores, int[] students){
		System.out.println("            average ");
		double[] avg = averageScores(scores,students);
		for(int i = 0; i < avg.length; i++){
			System.out.printf("%-12s   %-9.0f\n","student "+students[i],avg[i]);
		}
		System.out.print("\n");
	}
	public static void printStudentAverages(double[][] scores, int course){
		System.out.println("            course "+course);
		System.out.printf("%-12s   %-9.0f\n","average",averageScores(scores,course));
		System.out.print("\n");
	}
}
