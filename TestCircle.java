import java.text.DecimalFormat;
import java.util.Scanner;

public class TestCircle {

   public static void main(String[] args) {
       // TODO Auto-generated method stub
       double r;
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the radius of Circle: ");
       r = sc.nextDouble();
       Circle c = new Circle(r);
       DecimalFormat df = new DecimalFormat("#.0000");
       System.out.printf("\nThe circle's radius is:" + df.format(c.getRadius()));
       System.out.printf("\nThe circle's diameter is: " + df.format(c.getDiamater()));
       System.out.printf("\nThe circle's area is: " + df.format(c.getArea()));
       System.out.printf("\nThe circle's circumference is: " + df.format(c.getCircumference()));
      

   }
}