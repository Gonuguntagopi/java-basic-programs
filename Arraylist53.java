package javabasicprograms; 
import java.util.ArrayList;

public class Arraylist53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>colors=new ArrayList<>();
		colors.add("red");
		colors.add("white");
		colors.add("blue");
		System.out.println("colors"+colors);
		String firstColor = colors.get(0);
		System.out.println("First color:  "+firstColor);
		colors.remove(1);
		System.out.println("list after removing:"+colors);
		

	}

}
