package week3.day1;

public class ReverseOddWords {

	public static void main(String[] args) 
	{
		String test = "I am a software tester";

		// Split words into array
		String[] words = test.split(" ");

		// Loop through words
		for (int i = 0; i < words.length; i++) 
		{
			// If index is odd -> reverse the word
			if (i % 2 != 0) 
			{
				char[] ch = words[i].toCharArray();
				for (int j = ch.length - 1; j >= 0; j--) 
				{
					System.out.print(ch[j]);
				}
				System.out.print(" "); // add space 
			} else 
			{
				System.out.print(words[i] + " ");
			}
		}

	}

}
