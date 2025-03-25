package javabasicprograms;
import java.util.Scanner;
public class Userinput{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the a value");
		 int a = scan.nextInt();
		 System.out.println("Enter  the b value");
		 int b = scan.nextInt();
		  int c = a+b;
		 System.out.println(c);
	}

}
