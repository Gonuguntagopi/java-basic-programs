//import java.util.Arrays;
package javabasicprograms;

import java.util.Arrays;

public class DuplicteNumberinarraytwonime {
	public static int findDuplicate(int[] nums) {
		Arrays.sort(nums);
		for(int i =1;i<nums.length;i++) {
			if(nums[i]==nums[i-1]) {
			return nums[i];
		}
	}
	return-1;
	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,4,7,8,3,9,4,1,3,2};
		int duplicate = findDuplicate(nums);
		System.out.println("the duplicate"+duplicate);

	}

}
