package Collection;

import java.util.ArrayList;

public class FindUniqueNumber {

	public static void main(String[] args) {
		int a[] = {4, 5, 4, 5, 5, 9, 6};
		ArrayList<Integer> AL = new ArrayList<Integer>();
		System.out.println(a.length);
		for(int i = 0; i < a.length; i++) {
			int count = 0;
			if(!AL.contains(a[i])) {
				AL.add(a[i]);
				count++;
				for(int j = i+1; j < a.length; j++) {
					if(a[i] == a[j]) {
						count++;
					}
				}
				System.out.println(a[i]+" is repeated for "+count+" times in the array");
				if(count == 1) {
					System.out.println(a[i]+" is the unique number in the array");
				}
			}
		}
	}

}
