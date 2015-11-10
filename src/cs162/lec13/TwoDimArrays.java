package cs162.lec13;

public class TwoDimArrays {
	public static void main(String[] args){
		int[][] arr = new int[3][5];
		int i = 101;
		for(int j = 0; j < arr.length; j++)
			for(int k = 0; k < arr[j].length; k++, i++)
				arr[j][k] = i;
	}
}
