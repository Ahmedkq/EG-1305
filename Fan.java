public class Fan {

	private int speed;
	private boolean fanStatus = false;
	private double radius = 5;
	String color = "blue";

	public Fan() {
	}

	public Fan(int speed, boolean fanStatus, double radius, String color) {
		this.speed = speed;
		this.fanStatus = fanStatus;
		this.radius = radius;
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isFanStatus() {
		return fanStatus;
	}

	public void setFanStatus(boolean fanStatus) {
		this.fanStatus = fanStatus;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		String onOrOff;
		if (isFanStatus())
			onOrOff = "on";
		else
			onOrOff = "off";

		if (isFanStatus()) {
			return + this.getRadius() + " inch " + this.getColor() +
					" fan ,at a speed of " + this.getSpeed();
			
		} else {
			return  + this.radius + " inch " + this.getColor() + 
					" fan is " + onOrOff;
		}
	}

}
