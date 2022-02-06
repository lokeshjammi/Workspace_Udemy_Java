package Arrays;

public class MinNumberRowAndMaxNumber {

	public static void main(String[] args) {
		int a[][] = new int[2][2];
		a[0][0] = 0;
		a[0][1] = 5;
		a[1][0] = 4;
		a[1][1] = 9;
		/**
		 * Printing Array
		 */
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println("\n");
		}
		/**
		 * Finding min number
		 * 
		 */
		int min = a[0][0];
		int l = 0;
		int minColumn = l;
		for(int k = 0; k < a.length; k++) {
			for(l = 0; l < a.length; l++) {
				int temp1 = a[k][l];
				if(temp1 <= min) {
					min = a[k][l];
					minColumn = l;
					System.out.println("Min number is in "+minColumn+"th Column and min value is "+min);
				}
			}
		}
		/**
		 * Find the max from the min number column
		 * 
		 */
		int k = 0;
		int max = a[0][0];
		while(k < a.length) {
			if(a[k][minColumn] > max) {
				max = a[k][minColumn];
				System.out.println("Max number is: "+max);
			}
			k++;
		}
	}

}
