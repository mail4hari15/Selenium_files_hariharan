package week3.day1;

public class Reverse_a_String {
	public static void main(String[] args) {
		String rev="HARIHARAN RAJA";//index starts 0
		char[] charArray = rev.toCharArray();
		for (int i =charArray.length-1 ; i>=0; i--) 
		{
			System.out.println("Reversed String:"+charArray[i]);

		}
	}
}
