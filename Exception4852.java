package javabasicprograms;

public class Exception4852 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello java exception codes");
		/*public class arryindexoutofbound49{
	 public static void main(String[] args) {
	        int[] numbers = {1, 2, 3};
	        try {
	            System.out.println(numbers[5]); // Attempting to access an invalid index
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Error: Array index out of bounds");
	        }
	    }
	 }

}

public class Dividebyzero48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num1 = 10, num2 = 0;
	        try {
	            int result = num1 / num2;
	            System.out.println("Result:  "+ result);
	        } 
	        catch (ArithmeticException e) {
	            System.out.println("Error: Division by zero");
	        }

	}

}
 public class ArrayIndexOutOfBounds {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        try {
            System.out.println(numbers[5]); // Attempting to access an invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(“Error: Array index out of bounds”);
        }
    }
 }
 **Output:**
 Error: Array index out of 



public class NullPointerExample50 {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length()); // Attempting to access a null object
        } catch (NullPointerException e) {
            System.out.println(“Error: Null pointer exception”);
        }
    }
 }
 
 
 public class MultipleCatches51 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        int num1 = 10, num2 = 0;
        try {
            System.out.println(numbers[5]);
            int result = num1 / num2;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(“Array index out of bounds”);
        } catch (ArithmeticException e) {
            System.out.println(“Division by zero”);
        } nally {
            System.out.println(“This block always executes”);
        }
    }
 }
**Output:**
 Array index out of bounds
 This block always execute
 
 
 class NegativeAgeException extends Exception 52{
    public NegativeAgeException(String message) {
        super(message);
    }
 }
 public class CustomException {
    public static void main(String[] args) {
        int age = -25;
        try {
            if (age < 0) {
                throw new NegativeAgeException(“Age cannot be negative”);
            }
            System.out.println(“Age is valid”);
        } catch (NegativeAgeException e) {
            System.out.println(e.getMessage());
        }
    }
 }
 **Output:**
 Age cannot be negative
 */

	}

}
