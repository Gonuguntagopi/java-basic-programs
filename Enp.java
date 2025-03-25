package javabasicprograms;


class Studentname{
	private String name;
	private int age;
	
//private access of public field
public String getName() {
	return name;
	
} 
public void setName(String n) {
	name = n;
}
public int getAge() {
	return age;
}
public void setAge(int a) {
	if(a>0) {
		age =a;
	}
}
}


public class Enp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studentname obj = new Studentname();
		obj.setName("java");
		obj.setAge(20);
	System.out.println("Name:"+obj.getName());
	System.out.println("Age:"+ obj.getAge());


	}

}




//class and obj and also inheritance

