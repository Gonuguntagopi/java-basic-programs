package javabasicprograms;

public class Binarysearchthreeseven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        int[] sortedArray = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
		        int target = 12;
		        int result = binarySearch(sortedArray, target);
		        if (result != -1) {
		            System.out.println("Element "+ target + "found at index " + result);
		        } else {
		            System.out.println("Element"+ target +"not found in the array"+result);
		        }
		    }
		    static int binarySearch(int[] arr, int target) {
		        int left = 0;
		        int right = arr.length-1;
		        while (left <= right) {
		            int mid = left + (right - left) / 2;
		            if (arr[mid] == target) {
		                return mid;
		            } else if (arr[mid] < target) {
		                left = mid + 1;
		            } else {
		                right = mid - 1;
		            }
		        }
		        return -1;
		    }
		}
		 
		  