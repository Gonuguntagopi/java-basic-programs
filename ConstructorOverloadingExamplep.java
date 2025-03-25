package javabasicprograms;
class Student {
	String name;
	int age;
	// Default Constructor//20pending
	public Student() {
	name = "unknowen";
	age = 0;
	}
	// Parameterized Constructor with one parameter
	public Student(String n) {
	name = n;
	age = 0;
	}
	// Parameterized Constructor with two parameters
	public Student(String n, int a) {
	name = n;
	age = a;
	}
	public void displayDetails() {
	System.out.println("Name" + name);
	System.out.println("Age"+ age);
	//System.out.println(“————“);
	}
	}

public class ConstructorOverloadingExamplep {
	public static void main(String[] args) {
		// Creating objects with different constructors
		Student student1 = new Student();
		Student student2 = new Student("java");
		Student student3 = new Student("java", 20);
		student1.displayDetails();
		student2.displayDetails();
		student3.displayDetails();
		}
		}
		 


