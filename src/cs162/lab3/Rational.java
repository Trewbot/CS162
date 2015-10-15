package cs162.lab3;

public class Rational {
	private int numerator, denominator;
	//	default constructor
	public Rational(){
		numerator = 0;
		denominator = 1;
		//	denominator initialized to one to avoid division by zero
	}
	//	alternative constructor
	public Rational(int numerator, int denominator){
		this.numerator = numerator;
		this.denominator = denominator;
	}
	//	copy constructor
	public Rational(Rational other){
		numerator = other.numerator;
		denominator = other.denominator;
	}
	//	get the numerator
	public int getNumerator(){return numerator;}
	//	set the numerator
	public void setNumerator(int numerator){this.numerator = numerator;}
	//	get the denominator
	public int getDenominator(){return denominator;}
	//	set the denominator (ensuring that it is != 0)
	public void setDenominator(int denominator){this.denominator = denominator == 0 ? 1 : denominator;}
	//	get rational as a string
	public String toString(){return numerator + "/" + denominator;}
	//	add another rational to this one
	public void addWith(Rational r){
		int num = numerator,
			den = denominator;
		numerator = num * r.denominator + den * r.numerator;
		denominator = den * r.denominator;
	}
}
