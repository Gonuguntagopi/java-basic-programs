package javabasicprograms;


class Car1{
	public void display() {
		System.out.println("My method is car");
	}
}
class bus2 extends Car1{
	public void display() {
		System.out.println("This is bus Method ");
	}
}
class bike3 extends Car1{
	public void display() {
		System.out.println("My method is bike");
	}
}


public class Poly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car1 myobj = new Car1();
		Car1 mybus = new bus2();
		Car1 mybike = new bike3();
		myobj.display();
		mybus.display();
		mybike.display();
	

	}

}
