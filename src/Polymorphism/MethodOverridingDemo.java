package Polymorphism;

import Inheritance.ChildClass;

public class MethodOverridingDemo extends ChildClass{
	
	public void audio() {
		System.out.println("Child Audio");
	}

	public static void main(String[] args) {
		MethodOverridingDemo mo = new MethodOverridingDemo();
		mo.audio();
	}

}
