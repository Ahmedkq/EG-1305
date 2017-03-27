import java.util.Date;

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d=new Date();
        Account s=new Account(1122,20000,0.045,d);
        s.withdraw(2500);
        s.deposit(3000);
        System.out.println("Balance $"+s.get_balance());
        System.out.println("Monthly Interest Rate $"+s.getMonthlyInterestRate());
        System.out.println( s.get_dateCreated());
	}

}
