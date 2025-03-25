package javabasicprograms;

public class CheckdigitinString46 {
	public static boolean containsOnlyDigits(String input){
		return input.matches("\\d+");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "123";
		String str2 = "12A3";
		System.out.println(str1+"Contins Only Digits"+containsOnlyDigits(str1));
		System.out.println(str2+"Contins Only Digits"+containsOnlyDigits(str2));

	}

}
