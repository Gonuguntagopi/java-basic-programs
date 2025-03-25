package javabasicprograms;

public class MissingNumberinarraythreezero {
	public static int findMissingNumber(int[] nums){
		int n = nums.length+1;
		int expectedSum = n*(n+1)/2;
		int actualSum=0;
		for(int num : nums) {
			actualSum +=num;
		}
		return expectedSum - actualSum;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {3,0,1};
		int missingNumbers =findMissingNumber(nums);
		System.out.println(missingNumbers);
		

	}

}
