package javabasicprograms;

public class Factorialnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		long factorial = 1 ;
		for(int i =1; i<=n;i++) {
			factorial*=i;
	
		}
		System.out.println("Factorial of"+ n + "is"+ factorial);

	}

}
