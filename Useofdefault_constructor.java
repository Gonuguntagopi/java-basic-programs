package javabasicprograms;
class Myclass{
	//default constructor
public Myclass() {
System.out.println("Default constructer");
}public void displaymassage() {
		System.out.println("Hello from Myclass");
	}
}

public class Useofdefault_constructor {
	
public static void main(String[] args) {
	Myclass obj = new Myclass();
	obj.displaymassage();
}
}
//class Myclass{
//			//default constructor
//	public Myclass() {
//		System.out.println("Default constructer");
//	}public void displaymassage() {
//				System.out.println("Hello from Myclass");
//			}
//}