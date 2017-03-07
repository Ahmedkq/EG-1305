import java.util.Random;
import java.util.Scanner;

public class GeneratePassword {
	
	public static int randomGenerator() {
		
		Random rand = new Random();
		
		int digit = rand.nextInt(9);
		
		return digit; // re value
	}

	// main
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("How many digits you want your password to be?");// input
		int digits = keyboard.nextInt();
		
		System.out.print("Your password is: ");
		
		for (int i = 0; i < digits; i++) { // generator method
			System.out.print(randomGenerator() + " ");
		}

	}

}
