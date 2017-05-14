import java.util.Scanner;
public class TestFan {

   public static void main(String[] args) {

       // Declaring variables
       int speed;
       boolean fanStatus;
       double radius;
       String color;

       // Scanner object is used to get the inputs entered by the user
       Scanner scanner = new Scanner(System.in);

       // Getting the inputs entered by the user
       System.out.print("Enter the speed of the fan :");
       speed = scanner.nextInt();

       System.out.print("Enter the Fan Status  'On= True, off = False'  :");
       fanStatus = scanner.nextBoolean();

       System.out.print("Enter the radius of the fan :");
       radius = scanner.nextDouble();

       System.out.print("Enter the color of the fan :");
       color = scanner.next();

       Fan f = new Fan(speed, fanStatus, radius, color);

       System.out.println(f.toString());

   }

}
