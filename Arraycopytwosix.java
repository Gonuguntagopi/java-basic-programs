package javabasicprograms;


public class Arraycopytwosix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sourseArray = {1,2,3,4,5};
		int[] destinationArray = new int[sourseArray.length];
		//copying elements
		for(int i = 0;i<sourseArray.length;i++) {
			destinationArray[i]=sourseArray[i];
		}
		System.out.println("Copied Array");
		for(int num:destinationArray) {
			System.out.println(num+"");
		}
	}

}
