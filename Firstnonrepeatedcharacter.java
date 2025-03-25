package javabasicprograms;
import java.util.LinkedHashMap;
import java.util.Map;
public class Firstnonrepeatedcharacter {
// TODO Auto-generated method stub
	public static char ndFirstNonRepeatedChar(String input) {
		        // Create a LinkedHashMap to store character frequencies in insertion order
    Map<Character, Integer> charFrequencyMap = new LinkedHashMap<>();
		        // Iterate through the string to calculate character frequencies
		for (char c : input.toCharArray()) {
		charFrequencyMap.put(c, charFrequencyMap.getOrDefault(c, 0) + 1);
		        }
		        // Iterate through the map to nd the rst non-repeated character
		for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
		        if (entry.getValue() == 1) {
		              return entry.getKey();
		            }
		        }
		        // If no non-repeated character is found, return a special character or throw an exception
		       return '\0';
		    }
	public static void main(String[] args) {
		        // Example usage
		        String input = "aabccdeef";
		        char rstNonRepeatedChar = ndFirstNonRepeatedChar(input);
		        if ( rstNonRepeatedChar != '\0') {
		            System.out.println("First non-repeated character: " + rstNonRepeatedChar);
		        } else {
		            System.out.println("No non-repeated character found.");
		        }
		    }
		 }
		 
