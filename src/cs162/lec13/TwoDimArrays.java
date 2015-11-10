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
	}
	public static void printArr(int[][] arr){
		for(int i = 0; i < (arr[0].length * 5) - 2; i++)
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
