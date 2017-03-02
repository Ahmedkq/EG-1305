import java.util.Scanner;

public class NumberGuess {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		int number = (int) (Math.random() * 101);

		Scanner input = new Scanner(System.in);

		System.out.print("\nEnter a number between 1 and 100 ");

		int guess = -1;

		while (guess != number) {

			guess = input.nextInt();

			if (guess == number)

				System.out.println("You guessed it right");

			else if (guess > number)

				System.out.println("Guess lower");

			else

				System.out.println("Guess higher");
		}
	}

}
