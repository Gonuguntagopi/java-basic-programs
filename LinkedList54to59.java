package javabasicprograms;
import java.util.LinkedList;

public class LinkedList54to59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer>numbers=new LinkedList<>();
		numbers.add(10);
  		numbers.addFirst(5);
	    numbers.addLast(15);
	    System.out.println("Numbrs :"+numbers);
	    int first=numbers.getFirst();
	    int last=numbers.getLast();
	    System.out.println("first:"+first);
	    System.out.println("Last:"+last);
	}

}/* /*import java.util.HashSet;
 public class Main{
   public static void main(String[] args){
     HashSet<String>names=new HashSet<>();
     names.add("java");
     names.add("java go");
     names.add("java");
     System.out.println("Names: "+names);
     boolean contains=names.contains("java2");
     System.out.println("Contains :"+contains);
   }
 }*/
/*import java.util.TreeSet;
public class Main{
  public static void main(String[] args){
    TreeSet<Integer>numbers=new TreeSet<>();
    numbers.add(4);
    numbers.add(5);
    numbers.add(6);
    System.out.println(numbers);
      int rst = numbers. rst();
        int last = numbers.last();
        System.out.println(“First: ” + rst + “, Last: ” + last);
  }
}*/
/* import java.util.HashMap;
 public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put(“Alice”, 95);
        scores.put(“Bob”, 80);
        System.out.println(“Scores: ” + scores);
        // Retrieving a value
        int aliceScore = scores.get(“Alice”);
        System.out.println(“Alice’s score: ” + aliceScore);
    }
 }
 Output:
 Scores: {Alice=95, Bob=80}
 Alice’s score: 95
 58. Java program to use TreeMap
 import java.util.TreeMap;
 public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, String> countries = new TreeMap<>();
        countries.put(“US”, “United States”);
        countries.put(“UK”, “United Kingdom”);
        System.out.println(“Sorted countries: ” + countries);
        // Getting the rst key-value pair
        String rstEntry = countries. rstEntry().toString();
        System.out.println(“First entry: ” + rstEntry);
    }
 }
 Output:
 Sorted countries: {UK=United Kingdom, US=United States}
First entry: UK=United Kingdom
 Multiple Threading Programs:
 59. Write a Java program demonstrates the synchronization of two threads (EvenThread and
 OddThread) to print even and odd numbers alternative
 */
