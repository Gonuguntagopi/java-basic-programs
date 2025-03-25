package javabasicprograms;

public class Splitstringfour1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "This is a sentence with multiple words.";
		String[] words = sentence.split("" );
		        for (String word : words) {
		            System.out.println(word);
		            }
	}
}
