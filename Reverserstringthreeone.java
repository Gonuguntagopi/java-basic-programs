package javabasicprograms;

public class Reverserstringthreeone {
	public static String reverseStringIterative(String input) {
		char[] charArray= input.toCharArray();
		int start =0;
		int end = charArray.length-1;
		while(start<end) {
			char temp = charArray[start];
			charArray[start] = charArray[end];
			charArray[end]= temp;
			start++;
			end--;
			}
		return new String(charArray);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Hello, world";
		String reversedString =reverseStringIterative(input);
		System.out.println("Origional String"+input);
		System.out.println("Reversed Sting"+reversedString);

	}

}
