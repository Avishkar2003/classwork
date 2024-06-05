package avishkar;
import java.util.*;

public class setexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> set1 = new HashSet<>();
		
		
		//adding element in set1
		set1.add(1);
		set1.add(2);
		set1.add(3);
		System.out.println("elements in set1 are" +set1);
		
		//creating a new set
	
		Set<Integer> set2 = new HashSet<>();
		
		//adding element in set2
		set2.add(4);
		set2.add(5);
		set2.add(2);
		set2.add(6);
		System.out.println("elements in set2 are "+set2);
		
		
		
		//union of sets
		set1.addAll(set2);
		System.out.println("the union of set 1 and set2 is " +set1);
		
	}

}
