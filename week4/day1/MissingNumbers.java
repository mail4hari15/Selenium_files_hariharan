package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class MissingNumbers {
	public static void main(String[] args) 
	{
		// Array Declaration
		int[] arr = {1, 2, 3, 4, 10, 6, 8};

		// Convert array to List
		List<Integer> list = new ArrayList<>();
		for (int num : arr) 
		{
			list.add(num);
		}

		// Sort the list -  in ascending order
		Collections.sort(list);
		System.out.println("Sorted List: " + list);

		// Checking The  missing numbers
		System.out.println("Missing numbers:");
		for (int i = 0; i < list.size() - 1; i++) 
		{
			int current = list.get(i);
			int next = list.get(i + 1);

			// If there is a gap, print the missing numbers
			if (current + 1 != next) {
				for (int missing = current + 1; missing < next; missing++)
				{
					System.out.println(missing);
				}
			}
		}
	}
}
