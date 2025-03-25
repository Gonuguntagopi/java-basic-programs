package javabasicprograms;

public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int first = 0, second = 1;
		System.out.println("Fibonacci series upto" + n  +":");
		for(int i=1; i<n;++i) {
			System.out.println(first + " ");
			int next = first+second;
			first =second;
			second=next;
			
		}
		

	}

}
