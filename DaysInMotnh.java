import java.util.*;

public class DaysInMotnh {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int month, year, days = 0;
		String name = null;
		System.out.print("Enter year: ");
		year = in.nextInt();
		System.out.print("Enter month");
		month = in.nextInt();
		
		if (month < 1 || month > 12)
			System.out.println("InValid date");
		else {
			if (month == 1) {
				days = 31;
				name = "January";
			} else if (month == 2) {
				days = 28;
				name = "February";
				if (year % 4 == 0)
					if (year % 100 == 0) {
						if (year % 400 == 0)
							days++;
					} else
						days++;
			} else if (month == 3) {
				days = 31;
				name = "March";
			} else if (month == 4) {
				days = 30;
				name = "April";
			} else if (month == 5) {
				days = 31;
				name = "May";
			} else if (month == 6) {
				days = 30;
				name = "June";
			} else if (month == 7) {
				days = 31;
				name = "July";
			}

			else if (month == 8) {
				days = 31;
				name = "August";
			} else if (month == 9) {
				days = 30;
				name = "September";
			} else if (month == 10) {
				days = 31;
				name = "October";
			} else if (month == 11) {
				days = 30;
				name = "November";
			} else if (month == 12) {
				days = 31;
				name = "December";
			}

		}
		System.out.println(name + " " + year + " has " + days + " days");
	}
}