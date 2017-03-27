import java.util.Date;

public class Account {

    int id;
    double balance;
    double annualInterestRate;
    Date dateCreated;
	  

	    public Account(int id,double balance,double rate,Date dateCreated)
	    {
	        this.id=id;
	        this.balance=balance;
	        this.annualInterestRate=rate;
	        this.dateCreated=dateCreated;
	    }
	  

	    public int get_id()
	    {
	   
	    return id;
	    
	    }
	  
	    public double get_balance()
	    {
	    	
	        return balance;
	    }
	    
	  	    public double get_annualInterestRate()
	    {
	        return annualInterestRate;
	    }
	  
	    public void set_id(int id)
	    {
	        this.id=id;
	    }

	    public void set_balance(double balance)
	    {
	        this.balance=balance;
	    }
	  
	    public void set_annualInterestRate(double rate)
	    {
	        this.annualInterestRate=rate;
	    }

	    public Date get_dateCreated()
	    {
	        return dateCreated;
	    }
	  
	    public double getMonthlyInterestRate()
	    {
	        return (annualInterestRate)/12;
	    }
	  
	    public void withdraw(double amount)
	    {
	        balance-=amount;
	    }
	  
	    public void deposit(double amount)
	    {
	        balance+=amount;
	  
	}
}
