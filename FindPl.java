
public class FindPl {
	public static void main(String[] args) {

		double piValue = 0;

		int lowerTerm = 1;

		long start = System.nanoTime();

		for (int i = 1; i <= 2500000; i++) { // iterating 1 to 2500000

			if (i % 2 == 1) // then = to add

				piValue = piValue + 4.0 / lowerTerm;

			else

				piValue = piValue - 4.0 / lowerTerm;

			lowerTerm = lowerTerm + 2;

		}

		long end = System.nanoTime();

		double time = (end - start) / 1000000000.0;

		System.out.println("PI = " + piValue + " after 2500000 iterations");

		System.out.println("It took " + time + " seconds to complete this operation");

	}

}
