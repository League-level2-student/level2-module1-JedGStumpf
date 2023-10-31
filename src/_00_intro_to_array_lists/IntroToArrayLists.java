package _00_intro_to_array_lists;
import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class
		ArrayList<String> randoStrings = new ArrayList<String>();

		//2. Add five Strings to your list
		for (int i = 0; i<5; i++ ) {
			randoStrings.add(Integer.toString(i));
			System.out.println(randoStrings.get(i));
		}
		
		//3. Print all the Strings using a standard for-loop
		
		//4. Print all the Strings using a for-each loop
		for (String something : randoStrings) {
			System.out.println(something);
		}
		
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i<5; i++ ) {
			if (i % 2 == 0) {
				System.out.println(randoStrings.get(i));
			}
			
		}
		//6. Print all the Strings in reverse order.
		for (int i = randoStrings.size()-1; i>=0; i-- ) {
			System.out.println(randoStrings.get(i));
		}
		
		//7. Print only the Strings that have the letter 'e' in them.
	}
}
