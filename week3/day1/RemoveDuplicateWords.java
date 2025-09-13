package week3.day1;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String text = "We learn Java basics as part of java sessions in java week1";

		// Split the string into words
		String[] words = text.split(" ");

		int count = 0;

		// Nested loop to find duplicates
		for (int i = 0; i < words.length; i++) {
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equalsIgnoreCase(words[j])) {
					words[j] = "";  // replace duplicate with empty string
					count++;
				}
			}
		}

		// Print result ( non-empty words only)
		if (count > 0) {
			for (int i = 0; i < words.length; i++) {
				if (!words[i].isEmpty()) {
					System.out.print(words[i] + " ");
				}
			}
		}

	}

}
