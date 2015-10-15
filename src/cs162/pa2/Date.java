/*
 *	Trevor Hoglund
 *	CSIS 162, Fall 2015
 *	Section 1
 *	PA2
 *	Oct 6, 2015
 *
 *	An object to create and use a valid date.
 */

package cs162.pa2;
public class Date {
	private int month, day, year;
	final private int
		DEFAULT_MONTH = 1,
		DEFAULT_DAY	 = 1,
		DEFAULT_YEAR = 1900;
	//	new default date
	public Date(){
		month	= DEFAULT_MONTH;
		day		= DEFAULT_DAY;
		year	= DEFAULT_YEAR;
	}
	//	new date with parameters
	public Date(int m, int d, int y){
		month	= validMonth(m);
		year	= validYear(y);
		day		= validDay(d);
	}
	//	validate month
	private int validMonth(int m){
		return m >= 1 && m <= 12 ? m : DEFAULT_MONTH;
	}
	//	validate date
	private int validDay(int d){
		//	i couldn't get arrays to work...
		return d < 1
			? DEFAULT_DAY
			: (month == 1
			|| month == 3
			|| month == 5
			|| month == 7
			|| month == 8
			|| month == 10
			|| month == 12)
				? d > 31
					? DEFAULT_DAY
					: d
				: (month == 4
				|| month == 6
				|| month == 9
				|| month == 11)
					? d > 30
						? DEFAULT_DAY
						: d
					: month == 2
						? isLeapYear()
							? d > 29
								? DEFAULT_DAY
								: d
							: d > 28
								? DEFAULT_DAY
								: d
						: DEFAULT_DAY;
	}
	//	valid year
	private int validYear(int y){
		return y > 0 ? y : DEFAULT_YEAR;
	}
	//	check if leap year
	public boolean isLeapYear(){
		return year % 4 == 0 && (year % 400 == 0 || year % 100 != 0);
	}
	//	get month
	public int getMonth(){return month;}
	//	set month
	public void setMonth(int m){month = validMonth(m);}
	//	get date
	public int getDay(){return day;}
	//	set date
	public void setDay(int d){day = validDay(d);}
	//	get year
	public int getYear(){return year;}
	//	set year
	public void setYear(int y){year = validYear(y);}
	//	return date as string
	public String toString(){
		return String.format("%02d-%02d-%02d", month, day, year);
	}
	//	copies another date
	public void makeCopy(Date d){
		month	= validMonth(d.getMonth());
		year	= validYear(d.getYear());
		day		= validDay(d.getDay());
	}
	//	gets a reference to the date
	public Date getCopy(){
		return new Date(month,day,year);
	}
}
