package javabasicprograms;

public class Averageofnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int [] number = {10,20,30,40,40};
		int sum = 0;
		for(int num:number) {
			sum+=num;
			
		}
		double average = (double)sum/number.length;
		System.out.println(average);
		
		

	}

}
