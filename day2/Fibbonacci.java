package week1.day2;

public class Fibbonacci {
	public static void main(String[] args) {
        int range = 8; // input (number of terms)

        int first = 0, second = 1;

        System.out.print("Fibonacci Series up to " + range + " terms: ");

        for (int i = 1; i <= range; i++) {
            System.out.print(first + " ");

            // calculate next term
            int next = first + second;
            first = second;
            second = next;
        }
    }

}
