package week3.day1;

public class OddIndexUppercase {

	public static void main(String[] args) 
	{
		//Declaration
		String test = "changeme";

		// Convert string to character array
		char[] ch = test.toCharArray();

		// Loop through characters from end to start
		for (int i = ch.length - 1; i >= 0; i--) 
		{
			
			// If index is odd, convert to uppercase
			if (i % 2 != 0) 
			{
				ch[i] = Character.toUpperCase(ch[i]);
			}
		}

		// Result
		System.out.println(new String(ch));

	}

}
