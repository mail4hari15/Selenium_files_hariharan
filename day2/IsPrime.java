package week1.day2;

public class IsPrime {
	public static void main(String[] args) {
        int n = 29;  // change the number to test
        boolean isPrime = true;  // assume prime

        // iterate from 2 to n-1
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {   // check divisor
                isPrime = false;
                break;  // no need to check further
            }
        }

        // handle case for numbers <= 1
        if (n <= 1) {
            isPrime = false;
        }

        // print result
        if (isPrime) {
            System.out.println(n + " is a Prime Number.");
        } else {
            System.out.println(n + " is NOT a Prime Number.");
        }
    }
}
