package PyramidTriangleProgram;

public class PyramidTriangleCode {

	public static void main(String[] args) {
		for(int i = 1; i <= 4; i++) {
			if(i == 1) {
				for(int j = 1; j <= 4; j++) {
					System.out.print(j+" ");
				}
			} else if(i == 2) {
				System.out.println("\n");
				for(int j = 5; j <=7; j++) {
					System.out.print(j+" ");
				}
			} else if(i == 3) {
				System.out.println("\n");
				for(int j = 8; j <=9; j++) {
					System.out.print(j+" ");
				}
			} else {
				System.out.println("\n");
				for(int j = 10; j == 10; j++) {
					System.out.print(j);
					System.out.println("\n");
				}
			}
		}
		System.out.println("===================");
		int k = 1;
		for(int i = 0; i < 4; i++) {
			for(int j = 1; j <= 1+i; j++) {
				System.out.print(k+" ");
				k++;
			}
			System.out.println("\n");
		}
		System.out.println("===================");
		for(int i = 0; i < 4; i++) {
			int L = 1;
			for(int j = 1; j <= 1+i; j++) {
				System.out.print(L+" ");
				L++;
			}
			System.out.println("\n");
		}
		System.out.println("===================");
		int M = 3;
		for(int i = 0; i < 3; i++) {
			for(int j = 1; j <= i+1; j++) {
				System.out.print(M+" ");
				M = M+3;
			}
			System.out.println("\n");
		}
	}

}
