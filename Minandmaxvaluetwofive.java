package javabasicprograms;

public class Minandmaxvaluetwofive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {10,1,4,3,6,7,8,9,5};
		int max  = numbers[0];
		int min = numbers[0];
		for(int num : numbers) {
			if(num>max) {
				max=num;
			}
			if(num<min) {
				min=num;
			}
			
		}
		System.out.println("Maximum"+max);
		System.out.println("Minimum"+min);

	}

}
