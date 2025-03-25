package javabasicprograms;
import java.util.Scanner;

public class Factorialofuserintput {

	public static void main(String[] args) {
		// TODO Auto-generated method  
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number of factorial");
		int number = scan.nextInt();
		long factorial =1;
		if(number<0) {
			System.out.println("not defined --ve number");
		}
		else {
			for(int i = 1; i<=number;i++) {
				factorial*=i;
				//System.out.println("Factorial number is:"+factorial);
			}
			
			System.out.println("Factorial number is:"+factorial);
		}
		
		
		

	}

}
