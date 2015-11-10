package cs162.lec13;

public class TwoDimArrays {
	public static void main(String[] args){
		int[][] arr = new int[3][5];
		//	count
		System.out.println("Counting along rows");
		int i = 101;
		for(int j = 0; j < arr.length; j++)
			for(int k = 0; k < arr[j].length; k++, i++)
				arr[j][k] = i;
		printArr(arr);
		//	set all to 100
		System.out.println("\nAn array of all 100s");
		i = 100;
		for(int j = 0; j < arr.length; j++)
			for(int k = 0; k < arr[j].length; k++)
				arr[j][k] = i;
		printArr(arr);
		//	count the other direction
		System.out.println("\nCounting along columns");
		i = 101;
		for(int j = 0; j < arr[0].length; j++)
			for(int k = 0; k < arr.length; k++, i++)
				arr[k][j] = i;
		printArr(arr);
		//	do to other thing
		System.out.println("\n100 * row + odd column");
		i = 101;
		for(int j = 0; j < arr.length; j++, i = (j + 1) * 100 + 1)
			for(int k = 0; k < arr[j].length; k++, i += 2)
				arr[j][k] = i;
		printArr(arr);
		
		//	not square
		System.out.println("\nA not square array");
		int[][] temp = {
			new int[3],
			new int[4],
			new int[2]
		}; 
		int k = 1;
		for(i = 0; i < temp.length; i++)
			for(int j = 0; j < temp[i].length; j++, k++)
				temp[i][j] = k * 10;
		printArr(temp);
	}
	public static void printArr(int[][] arr){
		int len = 0;
		for(int i = 0; i < arr.length; i ++)
			len = Math.max(len, arr[i].length);
		for(int i = 0; i < (len * 5) - 2; i++)
			System.out.print("-");
		System.out.print("\n");
		for(int j = 0; j < arr.length; j++){
			for(int k = 0; k < arr[j].length; k++)
				System.out.printf("%-5d",arr[j][k]);
			System.out.print("\n");
		}
		System.out.print("\n");
	}
}
