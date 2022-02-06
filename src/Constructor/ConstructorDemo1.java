package Constructor;

public class ConstructorDemo1 {

	int firstParam;
	int secondParam;
	public ConstructorDemo1(int i, int j) {
		this.firstParam = i;
		this.secondParam = j;
	}
	
	public void printData() {
		System.out.println(firstParam);
		System.out.println(secondParam);
	}

}
