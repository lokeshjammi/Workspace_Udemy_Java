package Polymorphism;

public class MethodOverloading {
	
	public void getData(int a) {
		System.out.println(a);
	}
	
	public void getData(String a) {
		System.out.println(a);
	}
	
	public void getData(String a, String b) {
		System.out.println(b);
	}

	public static void main(String[] args) {
		MethodOverloading MO = new MethodOverloading();
		MO.getData(1);
		MO.getData("123");
		MO.getData("Lokesh", "Jammi");
	}

}
