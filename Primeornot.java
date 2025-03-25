package javabasicprograms;
public class Primeornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 6;
		boolean isprime = true;
		for(int i = 2; i<= Math.sqrt(number); ++i) {
			if(number %i ==0) {
				isprime = false;
				break;
			}
		}
		System.out.println(number + "is" + (isprime? "prime" : "not prime"));
	}

}
