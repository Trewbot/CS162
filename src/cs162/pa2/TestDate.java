/*
 *	Trevor Hoglund
 *	CSIS 162, Fall 2015
 *	Section 1
 *	PA2
 *	Oct 6, 2015
 *
 *	Tests the Date object.
 */

package cs162.pa2;
public class TestDate {
	public static void main(String args[]){
		Date d1 = new Date();
		System.out.println("The default date [1] is " + d1);
		Date d2 = new Date(10,1,2015);
		System.out.println("The date [2] is " + d2);
		System.out.println("The month [2] is " + d2.getMonth());
		System.out.println("The day [2] is " + d2.getDay());
		System.out.println("The year [2] is " + d2.getYear());
		System.out.println("Is the year [2] a leap year? " + (d2.isLeapYear()?"yes":"no"));
		Date d3 = new Date(-1,-1,-1);
		System.out.println("The result of invalid arguments [3] is " + d3);
		Date d4 = new Date(2,29,4000);
		System.out.println("The date [4] is " + d4);
		System.out.println("Is the year [4] a leap year? " + (d4.isLeapYear()?"yes":"no"));
		d1.makeCopy(d4);
		System.out.println("The date [1] is now " + d1 + " [4]");
		Date d5 = d2.getCopy();
		System.out.println("The date [5] is " + d5 + " a copy of the date [2]");
		Date d6 = new Date(2,29,2001);
		System.out.println("The result of all valid arguments except a leap year date on a non leap year [6] is " + d6);
		d6.setYear(2000);
		d6.setDay(29);
		System.out.println("The date [6] is now " + d6);
	}
}
