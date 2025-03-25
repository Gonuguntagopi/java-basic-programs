package javabasicprograms;
class Car{
	String brand;
	String model;
	int year;
	public void displayDetials() {
		System.out.println("Brand"+brand);
		System.out.println("Model"+model);
		System.out.println("Year"+year);
	}
	
	
}

public class Classandobj20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car  mycar = new Car();
		mycar.brand ="java";
		mycar.model="java21";
		mycar.year=1991;
		mycar.displayDetials();

	}

}
