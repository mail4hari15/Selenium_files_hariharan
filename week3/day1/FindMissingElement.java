package week3.day1;

import java.util.Arrays;

public class FindMissingElement 
{

	public static void main(String[] args) 
	{
		int array[]= {1,4,3,2,8,6,7};

		//Sort the Array values
		Arrays.sort(array);			

		//Loop the Array numbers

		for (int i = array[0]; i <= array[array.length - 1]; i++)
		{
			if (i != array[i - array[0]]) 
			{
				System.out.println("Missing Number is: " + i);
				break;
			}
		}
	}
}
