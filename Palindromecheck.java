package javabasicprograms;

public class Palindromecheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "mom";
		String reversed = " ";
		for(int i = str.length()-1; i>=0;i--) {
			reversed += str.charAt(i);	
		}
		boolean isPalindrome = str.equalsIgnoreCase(reversed);
		System.out.println(str + "is a palindrome:" + isPalindrome );
		 
		

	}

}
