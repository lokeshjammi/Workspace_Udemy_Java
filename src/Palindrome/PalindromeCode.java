package Palindrome;

public class PalindromeCode {

	public static void main(String[] args) {
		int sum = 0;
		int number = 454;
		int temp = number;
		while(number > 0) {
			int r = number % 10;
			sum = (sum * 10) + r;
			number = number/10;
		}
		if(temp == sum) {
			System.out.println("The given number is palindrome");
		} else {
			System.out.println("The given number is not palindrome");
		}
	}

}
