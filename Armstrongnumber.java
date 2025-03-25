package javabasicprograms;

public class Armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 123;
		int originalNum = num;
		int sum = 0;
		while(num>0) {
			int digit = num %10;
			sum+=Math.pow(digit,3);
			num/=10;
			
		}
		boolean isArmstrong =originalNum==sum;
		System.out.println(originalNum + "is an armstrong number:"+isArmstrong );
	}

}
