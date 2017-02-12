/*Please format your code using Ctrl+Shift+F in Eclipse
It is not readable, every line starts at a different level
*/

import java.util.Scanner;
public class CountMoney{

public static void main(String []args){
             int amount;
           int pennies = 1;
        		   int dime = 10;
        		   int nickel = 5;
        		   int quarter =25;
           
             Scanner scanner = new Scanner(System.in);
             
             System.out.println("Enter your amount");
                   amount = scanner.nextInt();
                   
                int endDigit = (amount%100);
                  int totalDollar = (amount/100);
             int totalQuarter = (endDigit)/quarter;
                 endDigit = (endDigit%quarter);
           int totalDime = (endDigit)/dime;
             endDigit = (endDigit%dime);
            int totalNickel = (endDigit)/nickel;
                 endDigit = (endDigit%nickel);
              int totalPennies = (endDigit)/pennies;
                endDigit = (endDigit%pennies);
                
System.out.println( "Your amount " + amount + " consists of " +

"Dollor:"+totalDollar+"\nQuarter: "+totalQuarter+
		"\nDime: "+totalDime+"\nNickel: "+totalNickel+"\nPennies: "+totalPennies);

}
}
