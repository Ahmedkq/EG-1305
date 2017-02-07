		import javax.swing.JOptionPane;

public class ComputeBMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


 
		   
	    String inputWeight = JOptionPane.showInputDialog ("Enter the weight in pounds");
	    String inputHeight = JOptionPane.showInputDialog ("Enter the height in inches");

	    double weight = Double.valueOf(inputWeight);
        System.out.println(weight);
	    double height = Double.valueOf(inputHeight);
	    System.out.println(height);

	   final double KILOGRAMS_PER_POUND = 0.45359237;
	    final double METERS_PER_INCH = 0.0254; 
	    double weightInKilograms = weight * KILOGRAMS_PER_POUND;
	    double heightInMeters    = height * METERS_PER_INCH;
	    double denominator = heightInMeters * heightInMeters;
	    double bmi = weightInKilograms / denominator;


	 

	    String output = "Your Body Mass Index is :" + bmi + "\n";

	    JOptionPane.showMessageDialog(null, output);
	    }
	  }

