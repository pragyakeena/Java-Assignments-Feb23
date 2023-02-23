package com.ericsson.oops;

class ParentClass {
	public void method1(){
	System.out.println("This is the parent class");
} 
}

class ChildClass extends ParentClass{
	public void method() {
		System.out.println("This is child class 1");
	}
}
public class Inheritance extends ChildClass {
	public void method2() {
		System.out.println("This is child class 2");
	}
public static void main() {
	Inheritance inh =new Inheritance();
	inh.method2();
	inh.method1();
	inh.method();
}
}

	
