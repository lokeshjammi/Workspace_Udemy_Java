package Arrays;

public class ArraySortDemo {

	public static void main(String[] args) {
		int a[] = {1, 6, 3, 9};
		int temp;
		for(int i = 0; i < a.length; i++) {
			for(int j = i+1; j < a.length; j++) {
				if(a[j] < a[i]) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		for(int k = 0; k < a.length; k++) {
			System.out.println(a[k]);
		}
	}

}
