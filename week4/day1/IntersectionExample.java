package week4.day1;

import java.util.ArrayList;
import java.util.List;

public class IntersectionExample 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		// Declare arrays
		int[] arr1 = {3, 2, 11, 4, 6, 7};
		int[] arr2 = {1, 2, 8, 4, 9, 7};

		// Convert array1 into List
		List<Integer> list1 = new ArrayList<>();
		for (int num : arr1) 
		{
			list1.add(num);
		}

		// Convert array2 into List
		List<Integer> list2 = new ArrayList<>();
		for (int num : arr2) 
		{
			list2.add(num);
		}

		// Compare values and print intersection
		System.out.println("Intersection values:");
		for (int i = 0; i < list1.size(); i++) 
		{
			for (int j = 0; j < list2.size(); j++) 
			{
				if (list1.get(i).equals(list2.get(j))) 
				{
					System.out.println(list1.get(i));
				}
			}
		}
	}

}
