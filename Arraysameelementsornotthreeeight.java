package javabasicprograms;
import java.util.Arrays;

public class Arraysameelementsornotthreeeight {
	public static boolean areArraysEqual(int[] arr1,int[]arr2) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		return Arrays.equals(arr1, arr2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {5,4,3,2,1};
		boolean result = areArraysEqual(arr1,arr2);
		if(result) {
			System.out.println("the aarray element is same");
		}
		else {
			System.out.println("the array elements is not same");
		}
		
	}
	}