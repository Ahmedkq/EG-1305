import java.lang.Math; 
import java.util.*; 

public class Distance {
	public static double getDistance(double x1, double y1, double x2, double y2) {
		double distance = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
		return distance; 
	}

	// Main method
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first point of X : ");
		double x1 = input.nextDouble();
		
		System.out.println("Enter the first point of Y : ");
		double y1 = input.nextDouble();
		
		System.out.println("Enter the second point of X : ");
		double x2 = input.nextDouble();
		
		System.out.println("Enter the second point of Y : ");
		double y2 = input.nextDouble();
		
		double distance = getDistance(x1, y1, x2, y2);
		System.out.println("Distance between two points : " + distance);

	}
}