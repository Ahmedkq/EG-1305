import java.util.Scanner;

import javax.swing.JOptionPane;

public class MilesPerGallon {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner ( System.in );

           double Miles;
           double Gallons;
           double MilePerGallons;
           String userStringOutput;
           
           String userStringOutput11 = JOptionPane.showInputDialog(" Enter The Miles Driven ");
           Miles = Double.parseDouble(userStringOutput11);
           
           String userStringOutput1 = JOptionPane.showInputDialog(" Enter The Gallons of fuel used ");
            Gallons = Double.parseDouble(userStringOutput1);
           
            MilePerGallons = Miles / Gallons;
           

 		   JOptionPane.showMessageDialog(null, "The miles-per-gallons is" + MilePerGallons );
 		   
 		   System.exit(0);

	}

}
