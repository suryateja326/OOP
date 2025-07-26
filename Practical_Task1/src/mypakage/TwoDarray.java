package mypakage;

public class TwoDarray {

	public static void main(String[] args) 
	{
		int[][]matrix = {
				{2,3},
				{8,6},
				{8,9},
				};
		for(int i = 0;i < matrix.length;i++) {
			for (int j = 0;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		

	}

}
