import java.util.Scanner;

public class TestPet {

	public static void main(String[] args) {
		String name;
		String type;
		int age;
		Scanner sc = new Scanner(System.in);

		System.out.print("Please Enter your pet's name : ");
		name = sc.next();

		System.out.print("Please Enter your pet's type : ");
		type = sc.next();

		System.out.print("Please Enter your pet's age : ");
		age = sc.nextInt();

		Pet p = new Pet(name, type, age);

		System.out.println("Your pet name is " + p.getName());
		System.out.println("Your pet type is " + p.getType());
		System.out.println("Your pet age is " + p.getAge());

	}

}