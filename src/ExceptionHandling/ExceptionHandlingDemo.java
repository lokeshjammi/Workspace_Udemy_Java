package ExceptionHandling;

public class ExceptionHandlingDemo {

	int a = 5;
	int b = 0;
	
	int d[] = {1,2,3};
	
	public void getData(){
		try {
			int c = a/b;
			System.out.println(c);
			System.out.println(d[5]);
		} catch (Exception e) {
			System.out.println("Catched the exception");
		} finally {
			System.out.println("This is final block and it executes everytime");
		}
	}
	
	public static void main(String[] args) {
		ExceptionHandlingDemo EHD = new ExceptionHandlingDemo();
		EHD.getData();
	}
}
