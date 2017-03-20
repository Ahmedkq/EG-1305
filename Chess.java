import java.util.Scanner;

public class Chess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double noOfSquares;
		double noOfLastSquare;
		double totalWheats;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of squares: ");

		noOfSquares = sc.nextDouble();

		// formula for calculating total grains of wheat on chess board.
		totalWheats = (Math.pow(2, noOfSquares) - 1);

		noOfLastSquare = (Math.pow(2, noOfSquares - 1));
		System.out.println("The total grains of wheat to cover whole board are: " + totalWheats);
		System.out.println("The number of grains on last square are: " + noOfLastSquare);
	}

}
