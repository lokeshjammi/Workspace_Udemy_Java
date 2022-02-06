package Arrays;

public class MaxNumber {

	public static void main(String[] args) {
		int a[][] = new int[2][2];
		a[0][0] = 2;
		a[0][1] = 5;
		a[1][0] = 0;
		a[1][1] = 9;
		int max = a[0][0];
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length; j++) {
				if(a[i][j] > max) {
					max = a[i][j];
				}
			}
		}
		System.out.println(max);
	}

}
