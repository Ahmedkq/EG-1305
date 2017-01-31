
public class StockTransaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int NofS=1000;
		double Stock= 32.87;
		double HePaid= NofS * Stock;
		double commission= 0.02 * HePaid;
		
		int NofSs=1000;
		double Stocks= 33.92;
		double HeSold= NofSs * Stocks;
		double commissions= 0.02 * HeSold;
		
		double AofF= HeSold-HePaid-commissions-commission;
		
		System.out.println("Joe paid the stock for $"+ HePaid);
		System.out.println("Joe paid for the Commission of the stock for $"+ commission);
		
		System.out.println("Joe Sold the stock for $"+ HeSold);
		System.out.println("Joe Sold for the Commission of the stock for $"+ commissions);
		
		System.out.println("The amount of profit that Joe made after selling and paying stock $"+ AofF);


		
				
	}
}
