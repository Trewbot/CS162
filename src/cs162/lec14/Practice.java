package cs162.lec14;

public class Practice {
	public static void main(String[] args){
		//	1.	write the java statements that do the following:
		//		a.	declare an array alpha of 10 rows and 20 columns of type int
					int[][] alpha = new int[10][20];
		//		b.	initialize each element of the array alpha to 5
					for(int i = 0; i < alpha.length; i++)
						for(int j = 0; j < alpha[i].length; j++)
							alpha[i][j] = 5;
					printArray(alpha);
		//		c.	store 1 in the first row and 2 in the remaining rows
					for(int i = 0; i < alpha.length; i++)
						for(int j = 0; j < alpha[i].length; j++)
							alpha[i][j] = i == 0 ? 1 : 2;
					printArray(alpha);
		//		d. store 2 in the first column, and the value in each remaining column is twice the value of the revious column
					for(int i = 0; i < alpha.length; i++)
						for(int j = 0; j < alpha[i].length; j++)
							alpha[i][j] = j == 0 ? 2 : alpha[i][j - 1] * 2;
					printArray(alpha);
		
		//	2.	consider the following declaration:
			int[][] beta = new int[3][3];
		//	what is stored in beta after each of the following statements executes?
		//		a.
					for(int i = 0; i < 3; i++)
						for(int j = 0; j < 3; j++)
							beta[i][j] = 0;
					printArray(beta);
		//		b.
					for(int i = 0; i < 3; i++)
						for(int j = 0; j < 3; j++)
							beta[i][j] = i + j;
					printArray(beta);
	}
	public static void printArray(int[][] arr){
		int len = 0;
		for(int i = 0; i < arr.length; i ++)
			len = Math.max(len, arr[i].length);
		for(int i = 0; i < (len * 5) - 2; i++)
			System.out.print("-");
		System.out.print("\n");
		for(int j = 0; j < arr.length; j++){
			for(int k = 0; k < arr[j].length; k++)
				System.out.printf("%-4d ",arr[j][k]);
			System.out.print("\n");
		}
		System.out.print("\n");
	}
}
