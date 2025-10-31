package day3.remoteControll;

public class Main {
	public static void main(String[] args) {
		MyClass myClass = new MyClass(new Audio());
		myClass.methodB();
		myClass.methodC();	
		
		System.out.println("==================================");
		
		myClass = new MyClass(new Television());
		myClass.methodB();
		myClass.methodC();
	}
}
