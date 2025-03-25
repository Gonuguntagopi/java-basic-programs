package javabasicprograms;

public class Stringequalityfourzero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 ="Hello";
		String str2 ="Hello";
		String str3 = new String("Hello");
		boolean eq1=str1==str2;
		boolean eq2=str1==str3;
		boolean eq3=str1.equals(str3);
		System.out.println("eq1:"+eq1);
		System.out.println("eq2:"+eq2);
        System.out.println("eq3:"+eq3);
	}

}
