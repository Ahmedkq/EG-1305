
import java.util.*;

public class CompareNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number1 = 0;
		int number2 = 0;
		int number3 = 0;
		int value, largest, smallest;

		Scanner num = new Scanner(System.in);
		System.out.print("ENTER the first integer value: ");
		number1 = num.nextInt();
		largest = number1;
		smallest = number1;

		System.out.print("ENTER the second integer value: ");
		number2 = num.nextInt();
		if (number2 < smallest)
			smallest = number2;
		else if (number2 > largest)
			largest = number2;

		System.out.print("ENTER the third integer value: ");
		number3 = num.nextInt();
		if (number3 < smallest)
			smallest = number2;
		else if (number3 > largest)
			largest = number3;
		System.out.println();
		System.out.println("________________________");

		System.out.println("Sum = " + (number1 + number2 + number3));

		System.out.println("Product = " + (number1) * (number2) * (number3));

		System.out.printf("Average= %.2f\n", (number1 + number2 + number3) / 3.);

		System.out.println("The Smallest is: " + smallest);

		System.out.println("The Largest is: " + largest);

	}
}
