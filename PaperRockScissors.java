import java.util.Scanner;

public class PaperRockScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = true;
		int userChoice = -1;
		Scanner scanner = new Scanner(System.in);
		while (flag) {

			System.out.print("scissor(0), rock(1), paper(2):");
			userChoice = scanner.nextInt();
			if (userChoice > 2 || userChoice < 0) {
				System.out.println("Enter a valid number!!");
				continue;
			}
			flag = false;
		}
		int computerChoice = (int) (Math.random() * 10) % 3;

		if (userChoice == 0 && computerChoice == 1) {
			System.out.println("You lost: Rock beats scissors");
		} else if (userChoice == 1 && computerChoice == 2) {
			System.out.println("You lost: Paper beats rock");
		} else if (userChoice == 2 && computerChoice == 0) {
			System.out.println("You lost: Scissors beats paper");
		} else if (userChoice == 1 && computerChoice == 0) {
			System.out.println("You won: Rock beats scissors");
		} else if (userChoice == 2 && computerChoice == 1) {
			System.out.println("You won: Paper beats rock");
		} else if (userChoice == 0 && computerChoice == 2) {
			System.out.println("You won: Scissors beat paper");
		} else
			System.out.println("It's a tie");

	}

}