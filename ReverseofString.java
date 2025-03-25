package javabasicprograms;

public class ReverseofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Original ="Hello";
		String reversed = " ";
		for(int i = Original.length()-1; i>=0;--i) {
			reversed +=Original.charAt(i);
		}
		System.out.println(Original);
		System.out.println(reversed);

	}

}
