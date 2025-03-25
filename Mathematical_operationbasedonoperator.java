package javabasicprograms;

public class Mathematical_operationbasedonoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=10;
		int n2=5;
		char operator = '*';
		switch(operator) {
		case '+':
			System.out.println("Sum:"+(n1+n2));
			break;
		case '-':
			System.out.println("Sum:"+(n1-n2));
			break;
	    case '*':
			System.out.println("Sum:"+(n1*n2));
			break;
	    case '/':
			if(n2!=0) {
				System.out.println("Quatient:(n1/n2)");
			}
			else {
				System.out.println("Can not divide by zero");
			}
			default:
				System.out.println("Invalid operator");
				
			
		}

	}

}
