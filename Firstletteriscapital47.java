package javabasicprograms;

public class Firstletteriscapital47 {
	 public static String capitalizeFirstLetter(String input) {
	        // Split the string into words
	        String[] words = input.split( "\\s+ "); // “\\s+” matches one or more whitespace characters
	        // Capitalize the rst letter of each word
	        for (int i = 0; i < words.length; i++) {
	            if (!words[i].isEmpty()) { // Check if the word is not empty
	                words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
	            }
	        }
	        // Join the words back into a single string
	        return String.join(" ", words);
	    }
	    public static void main(String[] args) {
	        // Example usage
	        String input = "hello world";
	        String capitalizedString = capitalizeFirstLetter(input);
	        System.out.println("Original string:"+ input);
	        System.out.println("Capitalized string: " + capitalizedString);
	    }
	 }
	//upto50complite

