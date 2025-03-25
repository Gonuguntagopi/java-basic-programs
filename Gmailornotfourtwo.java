package javabasicprograms;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Gmailornotfourtwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email = "java@gmail.com";
		Pattern pattern = Pattern.compile(".+@.+\\..+"); // Pattern for email
		 Matcher matcher = pattern.matcher(email);
		  if (matcher.matches()) {
		        System.out.println("Valid email");
		        } 
		 else {
		       System.out.println("Invalid email");
		        }
		    }
		 }




