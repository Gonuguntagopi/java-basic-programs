package javabasicprograms;
import java.util.Arrays;
public class Duplicatesthreetwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {2, 4, 6, 8, 2, 4, 10, 12, 6};
		int length = numbers.length;
		// Removing duplicates
		for (int i = 0; i < length; i++) {
		for (int j = i + 1; j < length; j++) {
		if (numbers[i] == numbers[j]) {
		// Shift elements to the left
		for (int k = j; k < length -1; k++) {
		numbers[k] = numbers[k + 1];
		}
		length--;
		j--;
		}
		}
		}
		// Displaying the array without duplicates
		System.out.println("arrayeithoutduplicates" + Arrays.toString(Arrays.copyOf(numbers,
		length)));
		}
		}
		
