
public class TestCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int headCount=0;
		int tailCount=0;
		
		Coin c=new Coin();
		
		System.out.println("Initially Side Up = " + Coin.getSideUp());
		
		for ( int value=0; value <20; value++)

		{	
		Coin.toss();
		
		if (Coin.getSideUp().equals("heads"))
		
			headCount++;
		
		else if(Coin.getSideUp().equals("tails"))
		
		tailCount++;
		
	}
	
	System.out.println("Head count:"+ headCount);
	
	System.out.println("Tail count:"+ tailCount);

	
	}

}
