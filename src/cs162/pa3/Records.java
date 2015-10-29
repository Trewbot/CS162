package cs162.pa3;
public class Records {
	public static double
		GRADE_A_CUTOFF = 90,
		GRADE_B_CUTOFF = 80,
		GRADE_C_CUTOFF = 70,
		GRADE_D_CUTOFF = 60;
	private String firstName, lastName;
	private double[] scores = {0,0,0,0,0};
	//	default constructor
	public Records(){
		firstName	= "John";
		lastName	= "Doe";
	}
	//	standard constructor
	public Records(String firstName, String lastName, double[] scores){
		this.firstName = firstName;
		this.lastName = lastName;
		this.scores = scores;
	}
	//	alternate constructor w/o scores
	public Records(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	//	copy constructor
	public Records(Records records){
		this.firstName = records.firstName;
		this.lastName = records.lastName;
		this.scores = records.scores;
	}
	
	//	regular getters
	public String getFirstName(){return firstName;}
	public String getLastName(){return lastName;}
	public double[] getScores(){return scores;}
	public double getScore(int index){return scores[index];};
	
	//	get total of all scores
	public double getTotal(){
		double total = 0;
		for(int i = 0; i < scores.length; i++)
			total += scores[i];
		return total;
	}
	//	get average of all scores
	public double getAverage(){
		return this.getTotal() / (double)(scores.length);
	}
	//	get letter grade
	public char getGrade(){
		double avg = this.getAverage();
		return avg >= GRADE_A_CUTOFF
			? 'A'
			: avg >= GRADE_B_CUTOFF
				? 'B'
				: avg >= GRADE_C_CUTOFF
					? 'C'
					: avg >= GRADE_D_CUTOFF
						? 'D'
						: 'F';
	}
	
	//	regular setters
	public void setFirstName(String firstName){this.firstName = firstName;}
	public void setLastName(String lastName){this.lastName = lastName;}
	public void setScores(double[] scores){this.scores = scores;}
	public void setScore(int index, double score){this.scores[index] = score;}
}
