package SuperKeyword;

public class ChildClassDemo extends ParentClassDemo{

	String name = "Jammi";
	public ChildClassDemo() {
		super(); //This invokes parent class constructor and in this case super should be in first line
		System.out.println("This is child class constructor");
	}
	
	public void getData() {
		super.getData();
	}
	
	public void getParentData() {
		System.out.println(super.name);
	}
	
	public static void main(String[] args) {
		ChildClassDemo CCD = new ChildClassDemo();
		CCD.getParentData();
		CCD.getData();
	}

}
