package week4.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUnique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String name="google";
		char[] charArray = name.toCharArray();


		Set<Character> uniqueChars = new LinkedHashSet<>();
		Set<Character> duplicate = new LinkedHashSet<>();


		for (int i=0;i<charArray.length;i++) {
			boolean b = uniqueChars.add(charArray[i]) ;
			if(!b) {
				duplicate.add(charArray[i]);
			}
		}
		// Print the unique characters
		System.out.print("Unique characters: "+ uniqueChars);
		System.out.println(duplicate);
	}
}
