import java.util.Scanner;

public class Circle {

	double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}

	public double getDiamater() {
		return radius * 2;
	}

	public double getCircumference() {
		return 2 * Math.PI * radius;
	}
}