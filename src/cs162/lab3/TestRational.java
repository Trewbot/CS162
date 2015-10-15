package cs162.lab3;

public class TestRational {
	public static void main(String args[]){
		Rational zero		= new Rational(),
				 half		= new Rational(1,2),
				 halfCopy	= new Rational(half);
		zero.setNumerator(1);
		zero.setDenominator(3);
		System.out.println("zero's numerator: " + zero.getNumerator());
		System.out.println("zero's denominator: " + zero.getDenominator());
		halfCopy.addWith(half);
		System.out.println("halfCopy:" + halfCopy);
	}
}
