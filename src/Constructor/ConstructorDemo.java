package Constructor;

public class ConstructorDemo {

	public ConstructorDemo() {
		System.out.println("I belog to constructor");
	}
	
	public ConstructorDemo(int a) {
		System.out.println(a);
	}
	
	public void getData() {
		System.out.println("I belong to normal method");
	}
	
	public static void main(String[] args) {
		ConstructorDemo CD = new ConstructorDemo();
		ConstructorDemo1 CD1 = new ConstructorDemo1(5, 4);
		CD1.printData();
	}

}
