import java.util.Scanner;
public class PrimeJavaMersenne {

	public static void main(String[] args) {

		// call method that prints prime numbers
		printPrimes();

		printMersennePrimes();
	}

	public static void printPrimes() {
		Scanner input = new Scanner(System.in);

		int n, countOfPrimes = 0;

		System.out.println("\nEnter a number. The program will print all the prime numbers smaller than this number: ");
		n = input.nextInt();

		System.out.println();

		// run a loop from 2 up to the specified number

		for (int i = 2; i < n; i++) {
			boolean isPrime = true;

			// run a loop from 2 to i

			for (int j = 2; j < i; j++) {

				// if i is divisible by any other number
				if (i % j == 0) {

					// if divisible its not prime
					isPrime = false;
					break;
				}
			}

			if (isPrime) {

				if (countOfPrimes != 0 && countOfPrimes % 10 == 0)
					System.out.println();

				// the prime number

				System.out.print(i + " ");

				countOfPrimes++; // increment
			}
		}

		System.out.println("\n\nThere are a total of " + countOfPrimes + " prime numbers");
	}

	public static void printMersennePrimes() {
		Scanner input = new Scanner(System.in);

		int n, count = 0;

		System.out.println(
				"\nEnter a number. The program will print all Mersenne prime numbers smaller than this number: ");

		n = input.nextInt();
		System.out.println();

		for (int i = 2; i < n; i++) {

			int Mersenneval = (int) Math.pow(2, i) - 1;

			if (Mersenneval < n) {

				boolean isPrime = true;

				for (int j = 2; j <= Mersenneval / 2; j++) {

					if (Mersenneval % j == 0) {

						isPrime = false;
					}
				}

				if (isPrime) {
					System.out.print(Mersenneval + " ");
					count++;
				}
			}
		}

		System.out.println("\n\nThere are a total of " + count + " Mersenne prime numbers");
	}
}
